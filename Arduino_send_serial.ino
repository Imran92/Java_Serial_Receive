#include<stdio.h>
#include<string.h>
String readString;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  Serial.print("abc");
  //delay(3);


    
  

}

void loop() {

  double height , weight;
  int h,w,t;
  char *c;
  String str[8];
  
  // put your main code here, to run repeatedly:
  if(Serial.available()) 
  {
    if(Serial.readString()=="givedata")
    {
      height = getheight();
      weight=getweight();
      Serial.print(height);
      Serial.print(weight);
      //delay(1000);
    }
  }
     
  /*h=(int) height;//get the integer part of the height
  t=(int)h/10+48;
  //c=(char)t;
  c[0]=t;
  str[0]= c;//get the first digit of the height from the integer and convert that to character 
  t=(int)h%10+48;
  c =(char) t;//get the second digit*/

  /*height = height-h; // get the fraction part of the height
  str[2]=height*10+48; // get the first digit of fraction as character
  h=((int)height*10)*10;
  str[3]= height*100-h;*/
  
  

}

double getheight()
{
  return 67.25;  
}

double getweight()
{
  return 70.43;
}
