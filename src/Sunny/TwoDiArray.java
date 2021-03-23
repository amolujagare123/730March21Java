package Sunny;

public class TwoDiArray {

    public static void main(String[] args) {

        int[][] a = new int[4][3];

        a[0][0] = 11;
        a[0][1] = 21;
        a[0][2] = 18; // 1st row

        a[1][0] = 21;
        a[1][1] = 31;
        a[1][2] = 28;// 2nd row

        a[2][0] = 31;
        a[2][1] = 41;
        a[2][2] = 38;// 3rd row

        a[3][0] = 41;
        a[3][1] = 51;
        a[3][2] = 48;// 4th row

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for(int i = 0; i<row ;i++) // rows
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }
}
