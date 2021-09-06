package Constructor;

public class main {
	
	public static void main(String args[]) {
		
		System.out.println("Default Constructor:-");
		
		//calling a default constructor  
		Bike1 b=new Bike1();  
		
		//direct call without variable
				new Bike1();
				
		System.out.println("\ndefault values of constructor:-");
		//default values of constructor
				//creating objects  
				Student1 s1=new Student1();  
				Student1 s2=new Student1();  
		
				//displaying values of the object  
				s1.display();  
				s2.display();  		
				
				System.out.println("\ncreating a parameterized constructor:-");
				   //creating objects and passing values  
			    Student2 s3 = new Student2(111,"Karan");  
			    Student2 s4 = new Student2(222,"Aryan");  
			    //calling method to display the values of object  
			    s3.display();  
			    s4.display();  
				
				
	}

}

// If there is no constructor in a class, compiler automatically creates a default constructor.

//purpose of a default constructor - provide the default values to the object like 0, null, etc., depending on the type.