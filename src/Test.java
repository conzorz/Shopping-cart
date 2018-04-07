import java.text.NumberFormat;
import java.util.Locale;

public class Test {
	public static void main(String[] args) {
		int apple = 60, orange = 25;
		int[] list= {apple, apple, orange, apple};
		
		int total=0;
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.UK);
		for (int i=0; i<list.length; i++) {
			total+=list[i];
			long formatPrice = total;
			String price = n.format(total / 100.0);
			System.out.println("Price: " + price);
		}
		
		
		/*void test() {
			int[] list2 = {apple, apple, orange, apple};
			add(list2);
		}
		*/
	}
}
