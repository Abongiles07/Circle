package za.ac.wsu.s216260558;

public class Circle {

	private float radius;
	private int x;
	private int y;
	 
	public Circle (float radius,int x,int y) {
		this.radius=radius;
		this.x=x;
		this.y=y;
	}
	
	public void setRadius(float radius) {
		this.radius=radius;
		if(radius<0) {
			System.out.println("Radius Must be Greater Than 0"); 	
		}
	
	else	
	{
		this.radius=radius;		
	}
	
}
	public void setX(int x) {
		this.x=x;
		}
		public void setY(int y) {
		this.y=y;
		}
	public float getRadius() {
		return radius;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

void calculateArea() {
	System.out.println("Area: " +(22/7)*getRadius()*getRadius());
}
void calculateDiameter() {
	System.out.println("Diameter: " +(22/7)*getRadius());
}	
void calculateCircumference() {
	System.out.println("Circumference: " +2*getRadius());
}
}