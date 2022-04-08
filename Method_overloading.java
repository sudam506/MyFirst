package constructor;

public class Method_overloading {
	int id; 
	String name;
	
	public Method_overloading() { //zero param constructer
		System.out.println("this is default constroctor");
	
	}
public Method_overloading(int i, String n) {//constructer with param
	id=i;
	name=n;
}
	public static void main(String[] args) {
	    Method_overloading obj1=new Method_overloading();       // object creation
		Method_overloading obj=new Method_overloading(50," sudam" );
		System.out.println("\n defult constroctor value"); 
		System.out.println("Student id:"+obj.id+"\nStudent name :"+obj.name);
		System.out.println("\nParameterized Constructer Value:\n");
	    Method_overloading obj2= new Method_overloading(10, "david");
	    System.out.println("Student id:"+obj2.id +"\nstudent name:"+obj2.name );
	
	
	}

}
