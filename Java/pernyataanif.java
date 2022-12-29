import java.util.Scanner;

public class pernyataanif {
    public static void main(String[]args){

        //membuat variabel belanja dan scanner
        int belanja = 0;
        try (Scanner scan = new Scanner(System.in)) {
            //mengambil input
            System.out.print("Total Belanjaan: RP ");
            belanja = scan.nextInt();
        }

        //cek apakah dia belanja diatas 100.000
        if (belanja > 100000){
            System.out.println("Selamat, anda mendapatkan hadiah!");

        }

        System.out.println("Terima kasih...");
    }

}