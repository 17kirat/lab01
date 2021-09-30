//jaskirat kaur
//A00219135
//This is JAV-1001 -lab 1 -logic and variables

import java.util.Scanner;

public class lab01{
  public static void main(String args[]){
    System.out.println("welcome to conversion of SIunits");
    Scanner cin =new Scanner(System.in);//reads the input from console

     System.out.println("please choose from the following units you wish to convert");//ask to choose from the given units
    System.out.println("1)km to miles \n2)cm to inches \n3)kg to pounds \n4)kb to mb \n5)joule to gram calorie \n6)pascal to torr");//prints the list of units to choose to be converted
    int choose_the_value = cin.nextInt();//reads the integer value entered by the user and stores it in int variable

    System.out.println("Enter the  numeric value: ");
    double input = cin.nextDouble();//reads the decimal value entered by the user and stores it in the double variable



    switch(choose_the_value){//reads the input by the user and match with the case value and performs the relevant action
      case 1:
      System.out.println(input +"km is equal to: " + (input*0.621371) + "miles");break;//checks if the input value matches with the case if so the following statement will be executed else move to the next case
      case 2:
      System.out.println(input +"cm is equal to: " + (input*0.393701) + "inches");break;
      case 3:
      System.out.println(input +"kg is equal to: " + (input*2.20462) + "pounds");break;
      case 4:
      System.out.println(input +"kb is equal to: " + (input*0.001) + "mb");break;
      case 5:
      System.out.println(input +"joule is equal to: " + (input*0.239006) + "gram calorie");break;
      case 6:
      System.out.println(input +"pascal is equal to: " + (input/133.0) + "torr");break;
      default:System.out.println("Please choose the value from the menu");//by default this message will be printed if the user entered the value other than 1 to 6



    }
  }
}
