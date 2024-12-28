import java.util.Scanner;

public class Circle {
static double pi;
double radius;
double Area;
static 
{
    pi=3.14;
}
void CollectData()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of circle:");
	radius=sc.nextDouble();
}
void Calculate()
{
	Area=(pi*(radius*radius));
}
void Display()
{
	System.out.println("The Area of Circle is :"+Area);
}
}

