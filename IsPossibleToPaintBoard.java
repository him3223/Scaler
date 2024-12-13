boolean isPossibleToPaintBoard(int[] A, int time, int painter) {
	int len = A.length;
	int count =1;
	int work =0;
	for (int a=0;a< len; a++) {
		if (work+A[a]>time) {
			count++;
			work=A[a];
		}
		else {
			work=work+A[a];
		}
	}
	return (count<=painter);
}
int minTimeToPaint(int[] N,int painter) {
	int max = 0;
	int sum = 0;
	int anstime = 0;
	int mid = 0;
	int len = N.length;
	boolean canpaint = false;
	for (int a=0;a<len ;a++ ) {
		max = Math.max(max,N[a]);
		sum+=N[a];
	}
	int l=max;
	int r=sum;
	while(l<=r) {
		mid = l+(r-l)/2;
		if (isPossibleToPaintBoard(N,mid,painter)) {
			anstime = mid;
			r = mid-1;
		}
		else {
			l = mid+1;
		}
	}
	return anstime;
}