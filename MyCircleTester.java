/**
   This program demonstrates the MyCircle class's setX, setY, setRadius, getX, getY, 
   getRadius, and doesOverlap methods. 
 */
public class MyCircleTester 
{
	public static void main(String[] arg)
	{
		System.out.println("Testing MyCircle for the first circle: ");
		// Create a MyCircle object for first circle.
		MyCircle circle1=new MyCircle();
		// Set x to 2.0, y to 3.0, radius to 4.0.
		circle1.setX(2.0);
		circle1.setY(3.0);
		circle1.setRadius(4.0);
		// Display the x, y, and radius of the first circle.
		System.out.println("The first circle's x is "+circle1.getX()+".");
		System.out.println("The first circle's y is "+circle1.getY()+".");
		System.out.println("The first circle's radius is "+circle1.getRadius()+".");
		// Display the area of first circle.
		System.out.println("The circle's area is "+circle1.getArea()+".");
		System.out.println(" ");
		
		System.out.println("Testing MyCircle for the second circle: ");
		// Create a MyCircle object for second circle.
		MyCircle circle2=new MyCircle();
		// Set x to 2.0, y to 3.0, radius to 4.0.
		circle2.setX(-2.0);
		circle2.setY(1.0);
		circle2.setRadius(25.0);
		// Display the x, y, and radius of the second circle.
		System.out.println("The second circle's x is "+circle2.getX()+".");
		System.out.println("The second circle's y is "+circle2.getY()+".");
		System.out.println("The second circle's radius is "+circle2.getRadius()+".");
		// Display the area of second circle.
		System.out.println("The circle's area is "+circle2.getArea()+".");
		System.out.println(" ");
		
		System.out.println("Testing MyCircle for the third circle: ");
		// Create a MyCircle object for third circle.
		MyCircle circle3=new MyCircle();
		// Set x to 2.0, y to 3.0, radius to 4.0.
		circle3.setX(10.0);
		circle3.setY(5.0);
		circle3.setRadius(25.0);
		// Display the x, y, and radius of the third circle.
		System.out.println("The third circle's x is "+circle3.getX()+".");
		System.out.println("The third circle's y is "+circle3.getY()+".");
		System.out.println("The third circle's radius is "+circle3.getRadius()+".");
		// Display the area of third circle.
		System.out.println("The third circle's area is "+circle3.getArea()+".");
		System.out.println(" ");
		
		System.out.println("Testing MyCircle for the fourth circle: ");
		// Create a MyCircle object for fourth circle.
		MyCircle circle4=new MyCircle();
		// Set x to 2.0, y to 3.0, radius to 4.0.
		circle4.setX(-10.0);
		circle4.setY(5.0);
		circle4.setRadius(5.0);
		// Display the x, y, and radius of the fourth circle.
		System.out.println("The fourth circle's x is "+circle4.getX()+".");
		System.out.println("The fourth circle's y is "+circle4.getY()+".");
		System.out.println("The fourth circle's radius is "+circle4.getRadius()+".");
		// Display the area of fourth circle.
		System.out.println("The fourth circle's area is "+circle4.getArea()+".");
		System.out.println(" ");
		
		System.out.println("Testing MyCircle for the fifth circle: ");
		// Create a MyCircle object for fifth circle.
		MyCircle circle5=new MyCircle();
		// Set x to 2.0, y to 3.0, radius to 4.0.
		circle5.setX(22.0);
		circle5.setY(58.0);
		circle5.setRadius(2.0);
		// Display the x, y, and radius of the fifth circle.
		System.out.println("The fifth circle's x is "+circle5.getX()+".");
		System.out.println("The fifth circle's y is "+circle5.getY()+".");
		System.out.println("The fifth circle's radius is "+circle5.getRadius()+".");
		// Display the area of fifth circle.
		System.out.println("The fifth circle's area is "+circle5.getArea()+".");
		System.out.println(" ");
		
		System.out.println("Testing MyCircle for the sixth circle: ");
		// Create a MyCircle object for sixth circle.
		MyCircle circle6=new MyCircle();
		// Set x to 2.0, y to 3.0, radius to 4.0.
		circle6.setX(2.0);
		circle6.setY(-8.0);
		circle6.setRadius(1.0);
		// Display the x, y, and radius of the sixth circle.
		System.out.println("The sixth circle's x is "+circle6.getX()+".");
		System.out.println("The sixth circle's y is "+circle6.getY()+".");
		System.out.println("The sixth circle's radius is "+circle6.getRadius()+".");
		// Display the area of sixth circle.
		System.out.println("The sixth circle's area is "+circle6.getArea()+".");
		System.out.println(" ");
		
		//Testing doesOverlap method.
		System.out.println("Now, testing doesOverlap method: \n");
		System.out.println("Checking if the first circle overlaps with the second circle: ");
		System.out.println(circle1.doesOverlap(circle2));
		System.out.println(" ");
		System.out.println("Checking if the second circle overlaps with the third circle: ");
		circle2.doesOverlap(circle3);
		System.out.println(" ");
		System.out.println("Checking if the third circle overlaps with the fourth circle: ");
		circle3.doesOverlap(circle4);
		System.out.println(" ");
		System.out.println("Checking if the fourth circle overlaps with the sixth circle: ");
		circle4.doesOverlap(circle6);
		System.out.println(" ");
		System.out.println("Checking if the fifth circle overlaps with the sixth circle: ");
		circle5.doesOverlap(circle6);
	}
}


/*Output
Testing MyCircle for the first circle: 
The first circle's x is 2.0.
The first circle's y is 3.0.
The first circle's radius is 4.0.
The circle's area is 50.27.
 
Testing MyCircle for the second circle: 
The second circle's x is -2.0.
The second circle's y is 1.0.
The second circle's radius is 25.0.
The circle's area is 1963.5.
 
Testing MyCircle for the third circle: 
The third circle's x is 10.0.
The third circle's y is 5.0.
The third circle's radius is 25.0.
The third circle's area is 1963.5.
 
Testing MyCircle for the fourth circle: 
The fourth circle's x is -10.0.
The fourth circle's y is 5.0.
The fourth circle's radius is 5.0.
The fourth circle's area is 78.54.
 
Testing MyCircle for the fifth circle: 
The fifth circle's x is 22.0.
The fifth circle's y is 58.0.
The fifth circle's radius is 2.0.
The fifth circle's area is 12.57.
 
Testing MyCircle for the sixth circle: 
The sixth circle's x is 2.0.
The sixth circle's y is -8.0.
The sixth circle's radius is 1.0.
The sixth circle's area is 3.14.
 
Now, testing doesOverlap method: 
Checking if the first circle overlaps with the second circle: 
This circle is overlapping with another circle.
 
Checking if the second circle overlaps with the third circle: 
This circle is overlapping with another circle.
 
Checking if the third circle overlaps with the fourth circle: 
This circle is overlapping with another circle.
 
Checking if the fourth circle overlaps with the sixth circle: 
This circle does not overlap with another circle.
 
Checking if the fifth circle overlaps with the sixth circle: 
This circle does not overlap with another circle.
 */