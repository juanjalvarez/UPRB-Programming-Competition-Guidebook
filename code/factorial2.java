public static BigInteger fac(BigInteger n) {
	BigInteger one = BigInteger.ONE;
	BigInteger total = one;
	BigInteger x;
	for (x = n; x.compareTo(one) == 1; x = x.subtract(one))
		total = total.multiply(x);
	return total;
}
