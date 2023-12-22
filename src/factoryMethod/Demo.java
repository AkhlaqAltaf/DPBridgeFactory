package factoryMethod;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
                Factory factory = new Factory();
		shapes.add(factory.createShape(Shapes.SQUARE));
		shapes.add(factory.createShape(Shapes.CIRCLE));
		shapes.add(factory.createShape(Shapes.TRIANGLE));
		
		for(Shape s:shapes){
			s.draw();
		}

	}

}
