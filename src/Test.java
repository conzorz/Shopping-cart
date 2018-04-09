import java.text.NumberFormat;
import java.util.Locale;

public class Test {
	static int apple = 60, orange = 25;
	static int[] list= {apple, apple, orange, apple};
	static int total=0;
	static NumberFormat n = NumberFormat.getCurrencyInstance(Locale.UK);
	
	public static void main(String[] args) {
		//Step 2.1
		boolean freeApple = false;
		
		for (int i=0; i<list.length; i++) {
			//Step 2.1
			if (list[i] == apple) {
				checkout(i, freeApple);
				freeApple = !freeApple;
			}
			else
				//Orange
				checkout(i, false);
		}
	}
	
	public static void checkout(int i, boolean freeApple) {
		if (freeApple)
			System.out.println("Free apple");
		else {
			total+=list[i];
			String price = n.format(total / 100.0);
			System.out.println("Price: " + price);
		}
	}
}
