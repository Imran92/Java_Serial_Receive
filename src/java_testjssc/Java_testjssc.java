package java_testjssc;
 
import com.sun.javafx.scene.layout.region.Margins;
import jssc.SerialPort;
import jssc.SerialPortException;
 
public class Java_testjssc {
 
    public static void main(String[] args) {
        SerialPort serialPort = new SerialPort("COM3");
        try {
            System.out.println("Port opened: " + serialPort.openPort());
            System.out.println("Params setted: " 
                + serialPort.setParams(9600, 8, 1, 0));
            
            //you will get why I checked abc string here http://forum.arduino.cc/index.php?topic=226727.0
            // if you don't read the buffer then it will not get the time to send 
            byte[] buffer = serialPort.readBytes(3);
            //char c= (char) buffer[0];
              System.out.println((char)buffer[0]+ "  " +(char) buffer[1] + "  " +(char) buffer[2]);                
           
            
            String result  = new String(buffer,0,3);
           
           // System.out.println(result);
                    
           if(result.equals("abc")){
            System.out.println("\"light\" successfully writen to port: " 
                + serialPort.writeBytes("light".getBytes()));
        }
            
           
            
            
            
            System.out.println("Port closed: " 
                + serialPort.closePort());
        }
        catch (SerialPortException ex){
            System.out.println(ex);
        }
    }
     
}