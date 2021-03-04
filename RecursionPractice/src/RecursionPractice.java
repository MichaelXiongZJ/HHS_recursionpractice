public class RecursionPractice {


	public static int factorial (int n) {
		if(n == 1) {
			return n;
		}else if(n == 0) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}


	public static int squareNumber(int n) {
		return 0;
	}


	public static int logBase2(int n) {
		return 0;
	}


	public static int pow(int n) {
		return 0;
	}


	public static int pentagonalNumber(int n) {
		return 0;
	}





	public static void main(String[] args) {
		int n = 5;
		int test = factorial(n);
		System.out.println(n + " factorial is " + test);
	}


}