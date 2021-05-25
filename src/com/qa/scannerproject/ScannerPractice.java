package com.qa.scannerproject;


import java.util.Scanner;


public class ScannerPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What operation would you like? Choose from add, subtract, multiply, or divide. ");

     
        String user = scan.nextLine(); 
        System.out.println(user); 
        
        switch(user){
        case "add": 
        	int num1 = scan.nextInt(); 
        	int num2 = scan.nextInt();
        	System.out.println(Calculator.operatorPlus(num1, num2));
        	break; 
        	
        case "subtract": 
        	int num01 = scan.nextInt(); 
        	int num02 = scan.nextInt();
        	System.out.println(Calculator.operatorMinus(num01, num02));
        	break;
        	
        case "multiply": 
        	int input1 = scan.nextInt(); 
        	int input2 = scan.nextInt();
        	System.out.println(Calculator.operatorMultiple(input1, input2));
        	break;
      	
        case "divide": 
        	double entry1 = scan.nextDouble(); 
        	double entry2 = scan.nextDouble();
        	Calculator.operatorDivide(entry1, entry2);
        	break;
        	
    
        default :
        	System.out.println("Incorrct Entry");   
        	
        	
        }
        
    }
}