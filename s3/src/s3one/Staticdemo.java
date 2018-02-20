package s3one;

public class Staticdemo {
	
	       
	      //static 
	      int a = 10;
	       
	       public static void main(String[] args) {
	              // TODO Auto-generated method stub
	              Staticdemo s= new Staticdemo(); // instance 1 of class static demo
	              s.add();
	              Staticdemo s1= new Staticdemo(); // instance 1 of class static demo
	              s1.add1();

	       }
	       
	       void add(){
	              
	              ++a;
	              System.out.println(a);
	              
	       }
	       
	       void add1(){
	              ++a;
	              System.out.println(a);
	       }
	              
	}




