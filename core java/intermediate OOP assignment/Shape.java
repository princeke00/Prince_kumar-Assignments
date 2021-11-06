public abstract class Shape {
	abstract void draw();
	
	public static void main(String[] args) {
		Shape l=new Line();
		l.draw();
		Shape r=new Rectangle();
		r.draw();
		Shape c=new Cube();
		c.draw();
	}
}

class Line extends Shape{
	@Override
	void draw() {
		System.out.println("The shape is LINE");
	}
}

class Rectangle  extends Shape{
	@Override
	void draw() {
		System.out.println("The shape is RECTANGLE");
	}
}

class Cube  extends Shape{
	@Override
	void draw() {
		System.out.println("The shape is CUBE");	
	}

}

