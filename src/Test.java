import java.text.NumberFormat;
import java.util.Locale;

public class Test {
	static int apple = 60, orange = 25;
	static int[] list= {apple, apple, orange, apple, orange, orange};
	static int total=0;
	static NumberFormat n = NumberFormat.getCurrencyInstance(Locale.UK);
	static int oranges = 0;
	
	public static void main(String[] args) {
		//Step 2.1
		boolean freeApple = false;
		
		for (int i=0; i<list.length; i++) {
			//Step 2.1
			if (list[i] == apple) {
				checkout(i, freeApple, false);
				freeApple = !freeApple;
			}
			else {
				//Step 2.2 - Orange
				if (oranges == 2) {
					// Third orange free
					checkout(i, false, true);
					oranges = 0;
				}
				else
					checkout(i, false, false);
				
				oranges++;
			}
		}
	}
	
	// Step 2
	public static void checkout(int i, boolean freeApple, boolean freeOrange) {
		if (freeApple)
			System.out.println("Free apple");
		else if (freeOrange)
			System.out.println("Free orange");
		else {
			total+=list[i];
			String price = n.format(total / 100.0);
			System.out.println("Price: " + price);
		}
	}
}
