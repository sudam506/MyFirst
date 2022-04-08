package constructor;

public class Cons_1 {
	int i;   //variable declaration
    int j;
    int z;
    
   
    public Cons_1() {
    i=10;  //assining value of variable within constructer
    j=20;
    z=30;
    
    }
   public Cons_1(int x, int y) {
	  i=x;
	  j=y;
   }
   public Cons_1(int x ,int y, int t) {
	   
	   i=x;
	   j=y;
	   z=t;
			   
   }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Cons_1 obj =new Cons_1();
   obj.add();
	Cons_1 obj1 =new Cons_1(200, 300);
	obj1.add();
	Cons_1 obj2=new Cons_1(500, 300, 800);
	obj2.add();
	}
	public void add() {
	int sum = i+j+z;
		System.out.println("addition "+"   " +sum);
		System.out.println("this is changed");
	}

}
