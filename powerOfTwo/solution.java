//solution by Islam_A (95 chrs)

int i,  r[];
int[] powerOfTwo(int N) {
  r = new int[Long.bitCount(N)];
  for (; N > 0;)
    r[i++] = N - (N &= N - 1);
  return r;
}