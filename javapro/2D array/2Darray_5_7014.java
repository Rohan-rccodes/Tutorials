class MatrixEqualOrNot {
         public static void main(String[] args) {
                            int[][] x = {{1, 2}, {3, 4}};
	int[][] y = {{1, 2}, {3, 4}};
	int i, j, isEqual = 1;
	for(i = 0; i < x.length; i++)
	{
	for(j = 0; j < x[0].length; j++)
	{
	if(x[i][j] != y[i][j]) {
	isEqual = 0;
	break;
	}
	}
	}
	if(isEqual == 1) {
	System.out.println("\nMatrix x is Equal to Matrix y");
	}
	else {
	System.out.println("\nMatrix x is Not Equal to Matrix y");
	}
	}
}