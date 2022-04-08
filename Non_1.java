package constructor;

public class Non_1 {
	int a;  //  variable declaration
	int b;  
    int sum;
public Non_1(int x, int y) {// constructer with parameter
	a=x;   // variable initialisation
	b=y;

System.out.println("hiii");
}

	public static void main(String[] args) {

		Non_1 obj=new Non_1(200, 500);  //parameter directly given in object
		obj.demo();  // calling non static method ...object.methodname
	}
public void demo() {
	sum=a+b;
	System.out.println(" add  \n"+ sum);  // \n is used to print on next line
	System.out.println("hiiii");
}
}