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
		if(n == 1) {
			return n;
		}else {
			return squareNumber(n-1) + 2*n -1;
		}
	}


	public static int logBase2(int n) {
		if(n == 1) {
			return n;
		}else {
			return 1 + logBase2(n/2);
		}
	}


	public static int pow(int n) {
		if(n == 0) {
			return n;
		}else {
			return 2*pow(n-1);
		} 
	}

	public static int pentagonalNumber(int n) {
		return 0;
	}

	public static int findTriangle(int n) {
		if(n == 0) {
			return 0;
		}else {
			int prev = findTriangle(n-1);
			int current = prev + n;
			return current;
		}
		
	}

	public static int findPyramid(int n) {
		if(n == 0) {
			return 0;
		}else {
			int prev = findPyramid(n-1);
			int current = prev + n;
			return current;
		}
	}
	
	public static int findFibonacci(int n) {
		if(n == 0) {
			return 0;
		}else {
			return 
		}
	}

	public static void main(String[] args) {
		int n = 5;
		int test = factorial(n);
		System.out.println(n + " factorial is " + test);
		
		int n1 = 10;
		int test1 = squareNumber(n1);
		System.out.println(n1 + " squared is " + test1);
	}


}