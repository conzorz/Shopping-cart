
public class Test {
	private int
	apple = 60, orange = 25;
	private int[] list;
	
	public void add(int[] Array) {
		int total=0;
		for (int i=1; i<list.length; i++) {
			total+=Array[i];
			System.out.println("Price: " + total);
		}
	}
}
