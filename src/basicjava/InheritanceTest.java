package basicjava;

// import basicjava.Fp_men.Fp_women;

class Fp_men{

	public void login(){
		System.out.println("login()");
	}
	public void clothes(){
		System.out.println("clothes()");
	}
	public void logout(){
		System.out.println("logout()");
	}

}

class Fp_women extends Fp_men{

	public void goldjewellery(){
		System.out.println("goldjewellery()");
	}

}

class Fp_kids extends Fp_men{

	public void toys (){
		System.out.println("toys()");
	}

}

public class InheritanceTest {
	public static void main(String[]args){
		//1.creating  parent class object
		Fp_men fp_men = new Fp_men();
		fp_men.login();
		fp_men.clothes();
		fp_men.logout();

		//2.creating child class object
		Fp_women fp_women=new Fp_women();
		fp_women.login();
		fp_women.clothes();
		fp_women.goldjewellery();
		fp_women.logout();

		//3.creating child class object by using parent class reference

		Fp_men fp_men1=new Fp_women();
		fp_men1.login();
		fp_men1.clothes();
		fp_men1.logout();

	}
}
	

	
	
		

	


