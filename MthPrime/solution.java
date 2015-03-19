//solution by Hamza_K_1 (88 chrs)

int MthPrime(int M) {
  int i=3,j;
	for(;M>1;M-=i++>=j*j?0:1)
    for(j=1;++j*j<=i&i%j>0;);
  	return i-1;
}