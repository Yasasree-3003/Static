
public class Test {
	static int a,b,c;
	int m,n,o;
	// static block can access only static variables
	static 
	{
		a=100;
		b=200;
		c=300;
	}
	//instance block can access both static and non static variable
	{
		a=1001;
		b=2001;
		c=3001;
		
		m=1000;
		n=2000;
		o=3000;
	}
  static void display()//can access only static variables
  {
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
  }
  void display1()
  {
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	    
	  System.out.println(m);
	  System.out.println(n);
	  System.out.println(o);
  }

}
