package com.unique.main;

public class MessageUtil {

	   private String message;

	   //Constructor
	   //@param message to be printed
		
	   public MessageUtil(String message){
	      this.message = message;
	   }
	      
	   // prints the message
	   public String printMessage(){
	      System.out.println(message);
	      return message;
	   }   
	   
	   public static void main(String[] args) {
		MessageUtil m = new MessageUtil("Hello World");
		m.printMessage();
	}
	}  