//solution by Islam_A (65 chrs)

int i, r;
int lamps(int[] a) {
  for (int x : a)
    r += x ^ i++ & 1;
  return r < i - r ?  r : i - r;
}