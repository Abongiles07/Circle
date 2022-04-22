package za.ac.wsu.s216260558;

public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle Circle1=new Circle(6,8,9);

Circle1.getRadius();
Circle1.getX();
Circle1.getY();

System.out.println("Radius :"+Circle1.getRadius());
System.out.println("x : "+Circle1.getX());
System.out.println("x : "+Circle1.getY());
Circle1.calculateArea();
Circle1.calculateCircumference();
Circle1.calculateDiameter();
	}

}
