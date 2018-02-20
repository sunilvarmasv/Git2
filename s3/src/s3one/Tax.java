package s3one;

class Taxrate{  
int gettaxrate()
{
	return 0;
	}  
}  
  

class Texas extends Taxrate{
 
}  

class California extends Taxrate{
	
int gettaxrate(){
	return 17;
	}  
}

class Tenesse extends Taxrate{  
int gettaxrate1(){
	return 9;
	}  
}  
  


class Tax{  

	public static void main(String args[]){  
Texas t = new Texas();
California c = new California();
Tenesse te = new Tenesse();

 //int te1 = t.gettaxrate();

System.out.println(" Tax in texas is : "+t.gettaxrate());  
System.out.println("Tax in California is : "+c.gettaxrate());  
System.out.println("Tax in Tenesse "+ te.gettaxrate());  
}  
}