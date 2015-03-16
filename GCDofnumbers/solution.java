//solution by Islam_A (100 chrs)

int i, x;
int GCDofnumbers(int N, int[] A) {
 x = A[0];
 for (; ++i < A.length;)
   while(A[i] > 0)
     A[i] = x % (x = A[i]);
 return x;
}
