//solution by Alex2015 (64 chrs)

int Combination(int n, int k) {
	 return k < 1 ? 1 : n * Combination( n - 1, k - 1 ) / k;
}