package com.milvik.question;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class QuestionService {

	private static int balance = 200;
	private static String question1 ="What would you like to do?";
	private static String optionA ="a. Press 1 to check balance";
	private static String optionB ="b. Press 2 to recharge";
	
	private static String answerA ="Your balance is Rs. ";
	private static String answerB ="We have following bundles you can use, choose one";
	
	private static String answerA_A ="Would you like to recharge?";
	private static String exit ="Press OK to Exit";
	
	private static String answerB_A ="Recharge Successfull. Thank you";
	private static String answerB_B ="You can not recharge with a specific amount. Please re-enter the amount.";
	
	private static String YES = "Y";
	private static String NO = "N";
	
	private static String recharge1 ="1. 50p for 1 minute call. 400 Rs per month";
	private static String recharge2 ="2. 25p for 1 minute call. 600 Rs per month";
	private static String recharge3 ="3. 1Rs for 1 minute call. Recharge arbitrary money";
	
	public void askQuestion(){
		
		System.out.println(""+question1);
		System.out.println(""+optionA);
		System.out.println(""+optionB);
		
	}

	public static void main(String args[]){
		QuestionService questionService = new QuestionService();
		
		questionService.newUser();
		//existingUser();
	}

	private void newUser(){
		System.out.println("Enter mobile number");
		Scanner scan = new Scanner(System.in);
		
		String mobileNo = scan.nextLine();
		
		while(mobileNo.length() != 10){
			System.err.println("Enter valid mobile number");
			
			mobileNo =  scan.nextLine();
			continue;
		}
		
		System.out.println("Enter OTP Sent to you");
		
		String otp =scan.nextLine();
		
		while(!otp.equals("1234")){
			System.out.println("Your OTP is invalid! Press 1 to re-enter, Press 2 to re-generate");
			
			String answer = scan.nextLine();
			if(answer.equals("1")){
				System.out.println("Please enter OTP Sent to you");
			}else{
				//re-generate OTP
				System.out.println("Re-generating OTP");
				System.out.println("Enter OTP Sent to you");
			}
			continue;	
		}
		

		existingUser();
		
		//send customer the OTP
		//validate the OTP
		//Register Customer
	}
	
	private void existingUser() {
		QuestionService questionService = new QuestionService();
		
		questionService.askQuestion();
		
		Scanner scanner = new Scanner(System.in);
		
		Integer input = Integer.parseInt(scanner.nextLine());
		
		
		if(input != null){
			if(input == 1){
				System.out.println("You Selected:: "+optionA);
				System.out.println(answerA+balance);
				if(balance < 200){
					System.out.println(answerA_A);
					String answer = scanner.nextLine();
					
					if(answer.toUpperCase().equals(YES)){
						//Repeat the recharge option
						
						rechargeMenu(scanner);
					}else{
						System.out.println("Bye");
						System.exit(0);
					}
				}else{
					
					System.out.println(exit);
					String answer = scanner.nextLine();
					while(!answer.toUpperCase().equals("OK")){
						//System.out.println("Bye");
						//System.exit(0);
						System.out.println(exit);	
						answer = scanner.nextLine();
						continue;
					}
					System.out.println("Thank you. Bye");
					System.exit(0);
				}
			}else{
				rechargeMenu(scanner);
			}
		}
	}


	private static void rechargeMenu(Scanner scanner) {
		System.out.println(answerB);
		System.out.println(recharge1);
		System.out.println(recharge2);
		System.out.println(recharge3);
		
		Integer answer = Integer.parseInt(scanner.nextLine());
		
		if(answer > 0 && answer < 10000){
			System.out.println(answerB_A);
			return;
		}else{
			System.err.println(answerB_B);
			rechargeMenu(scanner);
			return;
		}
		
	}
}
