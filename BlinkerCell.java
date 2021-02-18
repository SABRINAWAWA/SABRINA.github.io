
public class BlinkerCell extends AbstractCell{

	public BlinkerCell(int r, int c, ConwayWorld w) {
		super(r, c, w);
	}
	
	public AbstractCell cellForNextGeneration() {
		BlinkerCell nextlife=new BlinkerCell(getRow(), getColumn(), world);
		nextlife.setIsAlive(willBeAliveInNextGeneration());
		return nextlife;
	}
	
	public boolean willBeAliveInNextGeneration() {
		if (getIsAlive())
			return false;
		else
			return true;
	}
}
