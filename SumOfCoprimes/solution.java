//solution by Islam_A (109 chrs)

int t, r = -1, i, s;
int SumOfCoprimes(int M) {
  for (; (t = i++) <= M; r = s < 2 ? (r + i - 1) % 201201 : r, s = M)
    while (t > 0)
      t = s % (s = t);
  return r;
}