
public class CircleProgram 
{
	public static void main(String[] arg) 
	{
		// Testing the distance method in the Point class.
		System.out.println("Testing distance method in the Point class: ");
		Point point1=new Point(2,3);
		Point point2=new Point(2,4);
		Point point3=new Point(23,56);
		System.out.println("The distance between point 1 and point 2 is "+point1.distance(point2)+".");
		System.out.println("The distance between point 1 and point 3 is "+point1.distance(point3)+".");
		System.out.println("The distance between point 2 and point 3 is "+point2.distance(point3)+".");
		System.out.println(" ");
		
		// Testing the constructors method in the Circle class.
		System.out.println("Testing Constructors in the Circle class: ");
		Circle circle1=new Circle(point1, 15); // Testing two argument constructor. 
		Circle circle2=new Circle(5,16,8);   //Testing three argument constructor.
		Circle circle3=new Circle();  // Testing no-argument constructor.
		Circle circle4=new Circle(point2, 9);
		Circle circle5=new Circle(point3, 2);
		Circle circle6=new Circle(circle1);  // Testing copy constructor.
		Circle circle7=new Circle(circle2);
		System.out.println(" ");
		
		// Testing setter and getter of X in the Circle class.
		System.out.println("Testing setter and getter of X in the Circle class: ");
		circle1.setX(2);
		circle2.setX(5);
		circle3.setX(8);
		circle4.setX(7);
		circle5.setX(23);
		System.out.println("The x of circle1 is "+circle1.getX());
		System.out.println("The x of circle2 is "+circle2.getX());
		System.out.println("The x of circle3 is "+circle3.getX());
		System.out.println("The x of circle4 is "+circle4.getX());
		System.out.println("The x of circle5 is "+circle5.getX());
		System.out.println(" ");
		
		// Testing setter and getter of Y in the Circle class.
		System.out.println("Testing setter and getter of Y in the Circle class: ");
		circle1.setY(3);
		circle2.setY(16);
		circle3.setY(8);
		circle4.setY(9);
		circle5.setY(56);
		System.out.println("The y of circle1 is "+circle1.getY());
		System.out.println("The y of circle2 is "+circle2.getY());
		System.out.println("The y of circle3 is "+circle3.getY());
		System.out.println("The y of circle4 is "+circle4.getY());
		System.out.println("The y of circle5 is "+circle5.getY());
		System.out.println(" ");
		
		// Testing setter and getter of Center in the Circle class.
		System.out.println("Testing setter and getter of Center in the Circle class: ");
		circle1.setCenter(point1);
		circle4.setCenter(point2);
		circle5.setCenter(point3);
		System.out.println("The center of circle 1 is "+circle1.getCenter());
		System.out.println("The center of circle 4 is "+circle4.getCenter());
		System.out.println("The center of circle 5 is "+circle5.getCenter());
		System.out.println(" ");
		
		// Testing doesOverlap method in the Circle class.
		System.out.println("Testing doesOverlap method in the Circle class: ");
		circle1.doesOverlap(circle2);
		circle2.doesOverlap(circle3);
		circle3.doesOverlap(circle4);
		circle1.doesOverlap(circle5);
		System.out.println(" ");
		
		// Testing toString method in the Circle class.
		System.out.println("Testing toString method in the Circle class: ");
		System.out.println(circle1.toString());
		System.out.println(circle3.toString());
		System.out.println(circle4.toString());
		System.out.println(" ");
		
		// Testing equals method in the Circle class. 
		System.out.println("Testing equals method in the Circle class: ");
		circle1.equals(circle2);
		circle1.equals(circle3);
		circle6.equals(circle1);
		circle2.equals(circle7);
		System.out.println(" ");
	}
}
