public class DecimalSplitter {
	static boolean isOdd(int num) {
		return num%2==1;
	}
	static int getWhole(double num) {
		return (int)num;
	}
	
	static double getFraction(double num) {
		return num%1;
	}
}

