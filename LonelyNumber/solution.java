//solution by Josh_A (54 chrs)

int k;
int LonelyNumber(int[] n) {
  for(int i : n) k ^= i;
  return k;
}
