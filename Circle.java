import java.text.DecimalFormat;

public class Circle 
{
	private double radius;
	private Point center;
	
	/**
	 * The Circle constructor initializes center with point o, and radius with r. 
	 * @param o The value to store point.
	 * @param r The value to store radius.
	 */
	public Circle(Point o, double r) {
		center=new Point(o);
		radius=r;
	}
	
	/**
	 * The Circle constructor initializes center with xValue and yValue, and radius with r. 
	 * @param xValue The value to store x.
	 * @param yValue The value to store y.
	 * @param r The value to store radius.
	 */
	public Circle(double xValue, double yValue, double r) {
		center=new Point(xValue, yValue);
		r=radius;
	}
	
	/**
	 * The Circle constructor initializes center with (0,0), and radius with 1. 
	 */
	public Circle(){
		radius=1;
		center=new Point(0,0);
	}
	
	/**
	 * The Circle constructor initializes center to be same with another center c.
	 * @param c The value to store center and radius. 
	 */
	public Circle(Circle c) {
		center=c.center;
		radius=c.radius;
	}
	
	/**
	 * The setRadius method stores a value in the radius field.
	 * @param rad The value to store in radius. 
	 */
	public void setRadius(double rad)
	{
		radius=rad;
	}
	
/**
 * The setX method stores a value in the center field.
 * @param value The value to store in center. 
 */
	public void setX(double value)
	{
		center.setX(value);
	}
	
	/**
	 * The setY method stores a value in the center field.
	 * @param value The value to store in center;
	 */
	public void setY(double value)
	{
		center.setY(value);
	}
	
	/**
	 * The getRadius method returns a MyCircle object's radius.
	 * @return The value in the radius field.
	 */
	public double getRadius()
	{
		return radius;
	}
	
	/**
	 * The getX method returns a Point object's x.
	 * @return The value in the center field.
	 */
	public double getX()
	{
		return center.getX();
	}
	
	/**
	 * The getY method returns a Point object's y.
	 * @return The value in the center field.
	 */
	public double getY()
	{
		return center.getY();
	}
	
	/**
	 * The getArea method returns a MyCircle object's area. 
	 * @return The product of radius times 3.14159.
	 */
	public double getArea()
	{
		double area=Math.PI*radius*radius;
		area=Double.parseDouble(new DecimalFormat("##.##").format(area));
		return area;
	}
	
	/**
	 * The doesOverlap method returns true if two circle overlap, returns false if two circle does 
	 * not overlap.
	 * @param c Another Circle that contains center and radius. 
	 * @return true if two circle overlap, false if two circle does not overlap. 
	 */
	public boolean doesOverlap(Circle c)
	{
		double sum_of_radius=radius+c.radius;
		double distance = Math.sqrt((center.getX() - c.getX()) * (center.getX() - c.getX()) + (center.getY() - c.getY()) * center.getY() - c.getY());
	    if (sum_of_radius >= distance) 
	    {
	    	System.out.print("This circle is overlapping with another circle.\n");
	        return true;
	    } else {
	    	System.out.print("This circle does not overlap with another circle.\n");
	        return false;
	    }
	}
	
	/**
	 * The toString method return a string that includes information of center and radius. 
	 */
	public String toString() {
		String str="The position of this circle is "+getCenter()+". The radius is "+radius;
		return str;
	}
	
	/**
	 * The setCenter method stores a value in the center field.
	 * @param p The value stores in the center field.
	 */
	public void setCenter(Point p) {
		center.setX(p.getX());
		center.setY(p.getY());
	}
	
	/**
	 * The getCenter method returns a center. 
	 * @return The value in the center field. 
	 */
	public Point getCenter() {
		return new Point(center); 
	}

	/**
	 * The equals method checks if the two circles are same. 
	 * @param c The value to store center and radius. 
	 * @return true if two circles are equal, false if two circles are different. 
	 */
	public boolean equals(Circle c) {
		boolean status;
		if ((center.getX())==c.getX()&&(center.getY()==c.getY())&&(radius==c.getRadius())) {
			System.out.println("Two circles are equal to each other.");
			status= true;}
		else {
			System.out.println("Two circles are different.");
			status=false;}
		return status;
	}
}

