//solution by Islam_A (52 chrs)

int Lights(int L, int T) {
  return Long.bitCount(T % (1 << L));
}
