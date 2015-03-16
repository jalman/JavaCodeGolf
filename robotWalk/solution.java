//solution by ouchxp (80 chrs)

boolean robotWalk(int[] a) {
	int i = a.length;
	for (;i > 3;)
		i = a[--i] < a[i - 2] ? i : 0;
	return i < 1;
}