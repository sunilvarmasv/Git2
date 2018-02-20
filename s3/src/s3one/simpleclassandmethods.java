package s3one;

public class simpleclassandmethods {
	
	   int d; // global variable , can be used by any method within the class
       public static void main(String[] args) {
              // TODO Auto-generated method stub

              //int d; - this variable is not used 
              
     simpleclassandmethods c1 = new  simpleclassandmethods(); // instantiaton of class , new keyword is used for that
     c1.print(); // calling the method  , control passes to print , all the statements inside print are executed 
     //d = c1.add(10,20); -- not used
     c1.add(5,4); // now calling the method add with 2 arguments, the return value of add is not captured
     c1.add(); // calling add method which doesnot have any parameters, no return value
     System.out.println("This is from main method" ); 
     
     int e = c1.add(13, 12);
     System.out.println("The value returned by the method is" +e);
       }

       void print(){ // return type is Void as the method doesnot return any value
              
              System.out.println("This from prinnt method");
       }
       
       int add(int a , int b){ // return type is int as the method returns as integer , this method accepts two parameters 
              System.out.println("This if form add method");
                
              return d= a+b;
                           
       }
       
       void add(){ // 
              int c =10;
              int d = 20;
              int e = c+d;
              System.out.println("This is from add method without parameters" +e);
                           
       }
       
}




