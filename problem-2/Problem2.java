/* Problem2.java */
//Daniel Grant
//Java solution to problem 2 of Project Euler

class Problem2 {
    public static long fib(int n) {
	if (n == 0) {
	    return 1;
	}
	if (n == 1) {
	    return 1;
	}
	return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
	int i = 0;
	long total = 0;
	while (true) {
	    long term = fib(i);
	    if (term > 4000000) {
		break;
	    }
	    if (term % 2 == 0) {
		total += term;
	    }
	    i++;
	}
	System.out.println(total);
    }
}
