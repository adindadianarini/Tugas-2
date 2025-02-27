public class Latihan4 {
    public static void main(String[] args) {
        // deklrasi dan inisialisasi
        int[] number = new int[5];
        // inisialisasi
        number[0]=1;
        number[1]=2;
        number[2]=3;
        number[3]=4;
        number[4]=5;
        // menampilkan output
        for (int i = 4; i > -1; i--) {
            if (i%2==0) {
                System.out.print(+number[i]);
                if (i>1) {
                    System.out.print(",");
                }
            }
        }
    }
}