package s3one;

public class accessspecifiers {
		       
	       int a ; //Global variable , because declared at class level
	       int b;  //Global variable , because declared at class level

	       public static void main(String[] args) {
	              // TODO Auto-generated method stub
	              int d; // local variable for method , cannot be user outside main method

	       }

	       int add(){ // method 1 of class
	              
	              int local; // local bcoz var is declared inside add method
	              a++; // wont throw error as method add is inside the class
	              return a;
	                     }
	       
	       int sub(){
	              b++;
	             //d++; // error beacuse local is local variable of method 'main' and cannot be accessed outside
	              //local++; // error beacuse local is local variable of method add and cannot be accessed outside
	              return b++;
	       }
	       
	       
	       
	}




