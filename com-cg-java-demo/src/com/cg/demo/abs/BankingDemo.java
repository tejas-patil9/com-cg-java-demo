package com.cg.demo.abs;


//}
//
//class Class4 implements INT1, Int2{
//	
//}
//
//class Class5 extends Class4 implements INT1, Int2{
//	
//	
//}
interface CentralGovtRules{
	public abstract void payInterest();
	
}
interface StateGovtRules{
	public abstract void giveLoan();
}

abstract class RBI{
	
	public abstract void doKyc();

	public void m1(){
		
	}// what ? - yes how ? - no, abstract method 
	
}


class HDFC extends RBI implements CentralGovtRules, StateGovtRules { // concrete class
	public void doKyc(){   // what? - yes How? - Yes, concrete method
		System.out.println("Aadhar");
	}	
	public void giveLoan(){
		System.out.println("HDFC is giving loan....");
	}
	public void payInterest() {
		System.out.println("HDFC is paying interest....");
	}
		}

class ICICI {
	
	
}

class SBI {
	
	
}
public class BankingDemo {
	public static void main(String[] args) {
		
		
	}

}
