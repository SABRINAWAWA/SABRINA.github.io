import java.text.DecimalFormat;

public class MyCircle 
{
	private double radius;
	private double x;
	private double y;
	
	/**
	 * The setRadius method stores a value in the radius field.
	 * @param rad The value to store in radius. 
	 */
	public void setRadius(double rad)
	{
		radius=rad;
	}
	
	/**
	 * The setX method stores a value in the x field.
	 * @param xaxis The value to store in x;
	 */
	public void setX(double xaxis)
	{
		x=xaxis;
	}
	
	/**
	 * The setY method stores a value in the y field.
	 * @param yaxis The value to store in y;
	 */
	public void setY(double yaxis)
	{
		y=yaxis;
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
	 * The getX method returns a MyCircle object's x.
	 * @return The value in the x field.
	 */
	public double getX()
	{
		return x;
	}
	
	/**
	 * The getY method returns a MyCircle object's y.
	 * @return The value in the y field.
	 */
	public double getY()
	{
		return y;
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
	 * @param otherCircle Another Circle that contains x, y, and radius. 
	 * @return true if two circle overlap, false if two circle does not overlap. 
	 */
	public boolean doesOverlap(MyCircle otherCircle)
	{
		double sum_of_radius=radius+otherCircle.radius;
	    double distance = Math.sqrt((x - otherCircle.x) * (x - otherCircle.x) + (y - otherCircle.y) * (y - otherCircle.y));
	    if (sum_of_radius >= distance) 
	    {
	    	System.out.print("This circle is overlapping with another circle.\n");
	        return true;
	    } else {
	    	System.out.print("This circle does not overlap with another circle.\n");
	        return false;
	    }
	}
}
