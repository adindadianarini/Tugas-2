public class Latihan6 {    
    public static void main(String[] args) {
        // deklrasi dan inisialisasi
        int[] number = new int[5];
        // inisialisasi
        number[0]=1;
        number[1]=2;
        number[2]=3;
        number[3]=4;
        number[4]=5;
    // Soal no 6
    System.out.println("\nSoal no 6");
    for (int i = 0; i < number.length; i++) {
        if (i == 1) {
            System.out.print(number[0] + ","); 
        } else if (i == 3) {
            System.out.print(number[1] + ",");
        } else {
            System.out.print(number[i]);
            if (i < number.length - 1) {
                System.out.print(",");
            }
        }
    }

}

}