
class Arr2 {

    public static void main(String[] args) {

        int a[][] = {
                { 1, 2, 4, 5 },
                { 6, 7, 8, 9 },
                { 10, 11, 12, 13 }
        };

        int rows = a.length;
        int columns = a[0].length;
        int transpose[][] = new int[columns][rows];

        System.out.println("_____________Printing matrix__________________");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("   " + a[i][j]);
                transpose[j][i] = a[i][j];
            }
            System.out.println("\n");
        }

        System.out.println("_____________Printing Transpose matrix__________________");

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {

                System.out.print("  " + transpose[i][j]);

            }
            System.out.println("\n");
        }

    }

}