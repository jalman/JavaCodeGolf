//solution by Justin_K (117 chrs)

int PrimeSum(int K) {
  int s, j, p = 2;
  z:
  for (s = 0; K>0; p++) {
    for (j = 1; j*++j < p; )
      if (p % j < 1)
        continue z;
    s = (s+p)%1000000007;K--;
  }
  return s;
}