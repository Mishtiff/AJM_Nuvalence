import java.awt.Rectangle;

@SuppressWarnings("serial")
public class RectangleExt extends Rectangle {
    public RectangleExt(int x, int y, int width, int height) throws Exception {
    	super(x, y, width, height);
    	if(width < 1 || height < 1) {
    		throw new Exception("Width and Height must be greater than zero!");
    	}
    }
    
    private int getLeftSide() {
    	return x;
    }
    
    private int getTopSide() {
    	return y;
    }
    
    private int getRightSide() {
    	return x+width;
    }
    
    private int getBottomSide() {
    	return y+height;
    }
    
    public String adjacent(RectangleExt otherRectangle) {
    	boolean rightInTolerence = Math.abs(getRightSide()-otherRectangle.getLeftSide()) <= 0;
    	boolean leftInTolerence = Math.abs(getLeftSide()-otherRectangle.getRightSide()) <= 0;
    	boolean topInTolerence = Math.abs(getTopSide()-otherRectangle.getBottomSide()) <= 0;
    	boolean bottomInTolerence = Math.abs(getBottomSide()-otherRectangle.getTopSide()) <= 0;
    	
    	if(rightInTolerence || leftInTolerence) {
    		if(getTopSide() == otherRectangle.getTopSide() && getBottomSide() == otherRectangle.getBottomSide()) {
            	return "Proper";
            } else if ((getTopSide() >= otherRectangle.getTopSide() && getBottomSide() <= otherRectangle.getBottomSide()) ||
            		(otherRectangle.getTopSide() >= getTopSide() && otherRectangle.getBottomSide() <= getBottomSide())) {
            	return "Sub-Line";
            } else {
            	return "Partial";
            }
    	}
    	if(topInTolerence || bottomInTolerence) {
    		if(getLeftSide() == otherRectangle.getLeftSide() && getRightSide() == otherRectangle.getRightSide()) {
            	return "Proper";
            } else if ((getLeftSide() >= otherRectangle.getLeftSide() && getRightSide() <= otherRectangle.getRightSide()) ||
            		(otherRectangle.getLeftSide() >= getLeftSide() && otherRectangle.getRightSide() <= getRightSide())) {
            	return "Sub-Line";
            } else {
            	return "Partial";
            }
    	}
    	
        return "none";
    }
    
    public String toString() {
    	return "[ x=" + x + ", y=" + y + ", w=" + width + ", h=" + height + " ]";
    }
}
