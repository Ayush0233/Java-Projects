

package com.company;
import java.util.Scanner;
public class Program1{
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Unit you want to convert \n 1.Celsius \n 2.Farhenheit \n 3.Kelvin ");
     int inp1 = sc.nextInt();
      System.out.println("Enter the Unit to be converted \n 1.Celsius \n 2.Farhenheit \n 3.Kelvin ");
     int inp2 = sc.nextInt();
     
     if(inp1==1 && inp2==2){
        
         System.out.println("Enter the value in °C");
         int cf = sc.nextInt();
     double ans = (cf* 1.8) +32;
     System.out.println(ans+"°F");
     
     }
     else if(inp1==1 && inp2==3){
     
         System.out.println("Enter the value in °C");
         int cf = sc.nextInt();
     double ans = cf +273.15;
     System.out.println(ans+"°K");
     }
     else if(inp1==2 && inp2 == 1){
           System.out.println("Enter the value in °F");
         int cf = sc.nextInt();
     double ans = (cf-32)*5/9.0f;
     System.out.println(ans+"°C");
     }
     else if(inp1==2 && inp2 == 3){
           System.out.println("Enter the value in °F");
         int cf = sc.nextInt();
     double ans =((cf-32)*5/9.0f) +273.15;
     System.out.println(ans+"°K");
     }
     else if(inp1==3 && inp2 == 1){
           System.out.println("Enter the value in °K");
         int cf = sc.nextInt();
     double ans = cf-273.15;
     System.out.println(ans+"°C");
     }
     else if(inp1==3 && inp2 == 2){
           System.out.println("Enter the value in °K");
         int cf = sc.nextInt();
     double ans = ((cf-273.15)*9/5.0f)+32;
     System.out.println(ans+"°F");
     }
 }

}