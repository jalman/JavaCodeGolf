//solution by Xu_Xu (81 chrs)

int sumItUp(int N) {
  int a = 0, b = 1, t;
  while (N-- % 63216 > 0) {
    t = a;
    a = b;
  	b = (t + b) % 31607;
  }
  return a;
}