package interface_p;
class Shape {
    void draw() {
        System.out.println("shape");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Circle");
    }
}
class Square extends Shape {
    void draw() {
        System.out.println("Square");
    }
}

public class Shape_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c = new Circle();  
        Shape s = new Square();
        c.draw();  
        s.draw();

	}

}

