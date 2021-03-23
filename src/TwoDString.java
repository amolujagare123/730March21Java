public class TwoDString {
    public static void main(String[] args) {

        String[][] stArr = {
                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
                {"abc4","pqr4","xyz4"}
        };

        for(int i =0 ; i<stArr.length;i++)
        {
            for(int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+" ");
            }
            System.out.println();
        }


    }

}
