public class RectangleComparer {
	
	public RectangleComparer(String[] args) throws Exception {
		try {
			String[] rect1Args = args[0].replaceAll("\\s", "").split(",", -1);
			String[] rect2Args = args[1].replaceAll("\\s", "").split(",", -1);
			runApplication(rect1Args, rect2Args);
		} catch(Exception e) {
    		System.out.println("The input format is: \"1,2,3,4 4,3,2,1\"");
		}
	}
	
    public void runApplication(String[] rect1Args, String[] rect2Args) throws Exception {
    	RectangleExt r1;
    	RectangleExt r2;
		try {
    		r1 = new RectangleExt(Integer.parseInt(rect1Args[0]), Integer.parseInt(rect1Args[1]), Integer.parseInt(rect1Args[2]), Integer.parseInt(rect1Args[3]));
    		System.out.println("First: " + r1.toString());
            
    		r2 = new RectangleExt(Integer.parseInt(rect2Args[0]), Integer.parseInt(rect2Args[1]), Integer.parseInt(rect2Args[2]), Integer.parseInt(rect2Args[3]));
    		System.out.println("Second: " + r2.toString());
    		
    		boolean r1Contains = r1.contains(r2);
    		boolean r2Contains = r2.contains(r1);
    		boolean intersects = r1.intersects(r2);
    		
    		if(r1.equals(r2)) {
    			System.out.println("These Rectangles are the exact same");
    			return;
    		}
    		
    		if(r1Contains) {
    			System.out.println("Rectangle 1 contains Rectangle 2");
    		} else if(r2Contains) {
    			System.out.println("Rectangle 2 contains Rectangle 1");
    		}
    		if(!r1Contains && !r2Contains && intersects) {
    			System.out.println("The Rectangles intersect");
    		}
    		if(!r1Contains && !r2Contains && !intersects) {
	    		String adjacent = r1.adjacent(r2);
	    		if(!adjacent.equalsIgnoreCase("none")) {
	    			System.out.println("These Rectangles are adjacent " + adjacent);
	    		} else {
	    			System.out.println("These Rectangles are non adjacent");
	    		}
    		}

		} catch(NumberFormatException e) {
			System.out.println("The input format is: \"1,2,3,4 4,3,2,1\"");
		} catch(Exception e) {
    		System.out.println("Error: " + e.getMessage());
		}
    }
}
