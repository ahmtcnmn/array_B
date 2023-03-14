public class Main {
    public static void main(String[] args) {
        String[][] latter=new String[7][4];

        for (int i=0;i<latter.length;i++){
            for (int k=0;k<latter[i].length;k++){
                if (i==0 || i==3 || i==6){
                    latter[i][k]=" * ";
                } else if (k==0 || k==3) {
                    latter[i][k]=" * ";
                }else {
                    latter[i][k]="   ";
                }
            }
        }
        for (String[] row : latter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}