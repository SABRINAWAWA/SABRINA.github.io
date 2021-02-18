import java.util.Random;
public class DeadafterthreeCell extends AbstractCell{
	public DeadafterthreeCell(int r, int c, ConwayWorld w) {
		super(r, c, w);
	}
	
	public AbstractCell cellForNextGeneration() {
		DeadafterthreeCell nextlife=new DeadafterthreeCell(getRow(), getColumn(), world);
		nextlife.setIsAlive(willBeAliveInNextGeneration());
		return nextlife;
	}
	
	public boolean willBeAliveInNextGeneration() {
		int nc=rowneighborCount();
		if (nc==3)
			return false;
		else
			return true;
	}
	
	public int rowneighborCount() {
		int count = 0;
		
		int row = getRow();
		int column = getColumn();
		
		for (int dc =1; dc <= column; dc++) {
			if (world.isAlive(row, dc)) {
				count++;
			}
		}
		
		return count;
	}
}
