//solution by kryptosx (202 chrs)

boolean SubsetSum(int[] L) {
	int s,x,Q = 3000, f[][] = new int [31][2*Q];
	  for (x=0;x<L.length; ++x){
	    f[x+1][L[x]+Q] = 1;
	    for (s=2*Q; --s!=0;)
	      if (f[x][s]==1)
	      	f[x+1][s] = f[x+1][s+L[x]] = 1;
	    if (f[x+1][Q]==1) return true;
	  }
	  return false;
}