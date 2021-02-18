import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.awt.Point;

public class Board{
	private static final int xlength=10;
	private static final int ylength=10;
	String[][] layout;
	private Ship[] ships;
	private ArrayList<Point> guesses=new ArrayList<Point>();
	
	public Board() 
	{
		int numship=5;
		int shipmax=10, shipmin=1;
		layout=new String[xlength][ylength];
		for (int i=0; i<layout.length;i++)
		{
			Arrays.fill(layout[i], "~");
		}
		ships=generateShips(numship, shipmin, shipmax);
	}
	
	public Ship[] generateShips(int numships, int minlength, int maxlength)
	{
		Ship[] shiplist=new Ship[numships];
		Ship ship;
		boolean collideWtihOtherShip;
		
		for (int i=0; i<numships;i++)
		{
			do {
				collideWtihOtherShip=false;
				ship=generateRansomShip(minlength, maxlength, xlength, ylength);
				for (int j=0; j<i;j++)
					if (ship.collidesWith(shiplist[j]))
						collideWtihOtherShip=true;
			}while(collideWtihOtherShip);
			shiplist[i]=ship;
		}
		return shiplist;
	}
	
	public Ship generateRansomShip(int minlength, int maxlength, int x, int y)
	{
		Random randompoint = new Random(System.currentTimeMillis());
		boolean Vertical=randompoint.nextBoolean();
		int length=randompoint.nextInt(maxlength)+1;
		int xpoint, ypoint;
		if (Vertical) {
			xpoint=randompoint.nextInt(x-1);
			ypoint=randompoint.nextInt(y+1-length);
		}
		else 
		{
			ypoint=randompoint.nextInt(y-1);
			xpoint=randompoint.nextInt(x+1-length);
		}

		Point origin=new Point(xpoint, ypoint);
		return(new Ship(origin, Vertical, length));
	}
	
	public void shoting(Point p)
	{
		if (isHitAtPoint(p))
			System.out.println("Hit!.");
		else
			System.out.println("Miss.");
	}
	
	public void display()
	{
		for (int i=0;i<10;i++) 
		{
			System.out.print(i+" ");
			for (int j=0; j<ship.get(0).size;j++)
				
		}
	}
}
