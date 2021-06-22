package com.cg.demo.exception;

public class UserDefinedException {
	public static class myException extends Exception{
	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	int balance=0; 		//current account balance

	public String toString(){
		return "Low Balance.";
	}
	public void withdraw(int debitMoney) throws myException{
		if(balance>1000) {  
			balance = balance - debitMoney;
		}
		else 	
			throw new myException();
		}


	public static void main(String[] args) {
		
		myException obj= new myException();
		try{
			obj.withdraw(100);
		}
		catch(myException e){
			System.out.println("Exception handled - "+ e);
		}
	}



	}
	
	
	

}
