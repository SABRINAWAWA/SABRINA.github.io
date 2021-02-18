
public class Point 
{
	protected int x;
	protected int y;
	public Point(int xValue, int yValue) 
	{
		x=xValue;
		y=yValue;
	}
	public void setX(int xValue)
	{
		x=xValue;
	}
	public void setY(int yValue)
	{
		y=yValue;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public boolean equals(Point p)
	{
		return x==p.x&&y==p.y;
	}
}
