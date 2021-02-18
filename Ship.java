import java.util.ArrayList;

public class Ship 
{
	protected Point p;
	protected int length;
	protected boolean vertical;
	private ArrayList<Point> yourpoints=new ArrayList<Point>();
	private ArrayList<Point> yourhits=new ArrayList<Point>();
	
	public Ship(Point orgin, boolean isVertical, int islength)
	{
		isVertical=vertical;
		islength=length;
		yourpoints.add(orgin);
		
		for (int i=1;i<length;i++)
		{
			if (vertical)
			{
				Point temp=new Point(orgin.getX(), orgin.getY()+i);
				yourpoints.add(temp);
			}
			else
			{
				Point temp=new Point(orgin.getX()+i, orgin.getY());
				yourpoints.add(temp);
			}
		}
	}
	
	public boolean containsPoint(Point orgin)
	{
		for (int i=0; i<yourpoints.size();i++)
		{
			if (p.equals(yourpoints.get(i)))
			{
				vertical= true;
			}
			else
				vertical= false;
		}
		return vertical;
	}
	
	public boolean collidesWith(Ship ship)
	{
		boolean collide = false;
		for (int i=0; i<yourpoints.size();i++) 
		{
			if (ship.containsPoint(yourpoints.get(i)))
			{
				collide=true;
			}
		}
		return collide;
	}
	
	public void shotFiredAtPoint(Point p)
	{
		for (int i=0; i<yourpoints.size();i++) 
		{
			if (p.equals(yourpoints.get(i)))
			{
				yourhits.add(p);
			}
		}
	}
	
	public boolean isHitAtPoint(Point p)
	{
		boolean hit=false;
		for (int i=0;i<yourhits.size();i++)
		{
			if (p.equals(yourhits.get(i)))
			{
				hit=true;
			}
		}
		return hit;
	}
	
	public int hitCount()
	{
		return yourhits.size();
	}
	
	public boolean sunk()
	{
		return length==hitCount();
	}
}
