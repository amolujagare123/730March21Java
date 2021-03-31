public class SonaliDemo {


    public static void main(String[] args) {

        String str = "java learn"; // avaj nrael

        String[] strArr = str.split(" ");


        for(int i =0; i<strArr.length ;i ++)
        {
            String strRev = "";
            for(int j=strArr[i].length()-1;j>=0;j--)
            {
                strRev = strRev + strArr[i].charAt(j);
            }

            System.out.print(strRev+" ");
        }


    }
}
