public boolean isPossiblePlaceCows(int A[], int M, int mid, int N) {
	int count =1;
	int lastplaced = A[0];
	for (int a=1;a<M ;a++ ) {
		if (A[a]-lastplaced >= mid) {
			count++;
			lastplaced = A[a];
		}
	}
	return (count>=N);
}