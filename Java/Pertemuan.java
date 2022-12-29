package Java;

public class Pertemuan {
    public static void main(String[]args){
        '''System.out.println("\nLATIHAN EKPRESI ARITMATIK & OPERATOR ARITMATIKA");

        System.out.println("\n ===== LUAS BANGUN DATAR ===== ");

        System.out.println("\n1.Luas Persegi");
        int s1 = 2;
        int s2 = 4;
        int Lpersegi = s1 * s2;
        System.out.println("Lpersegi : s1 * s2 = " + Lpersegi);

        System.out.println("\n2.Luas Persegi Panjang");
        int p = 3;
        int l = 9;
        int LPPanjang = p * l;
        System.out.println("LPPanjang : p * l = " + LPPanjang);

        System.out.println("\n3.Luas Jajar Genjang");
        int a1 = 4;
        int t1 = 3;
        int LJajarGenjang = a1 * t1;
        System.out.println("LJajarGenjang : a1 * t1 = " + LJajarGenjang); 

        System.out.println("\n4.Luas Segitiga");
        int a2 = 2;
        int t2 = 12;
        double LSegitiga = 1.0 / 2.0 * a2 * t2;
        System.out.println("LSegitiga : 1.2 / 2.0 * a2 * t2 = " + LSegitiga);
        
        System.out.println("\n5.Luas Belah Ketupat");
        int d1 = 4;
        int d2 = 8;
        double LBelahKetupat = 1.0 / 2.0 * d1 * d2;
        System.out.println("LBelahKetupat : 1.0 / 2.0 * d1 * d2 = " + LBelahKetupat);

        System.out.println("\n6.Luas Trapesium");
        int a3 = 4;
        boolean b = 6;
        int t3 = 3;
        int LTrapesium = (a3 + b ) / 2 * t3;
        System.out.println("LTrapesium : (a3 * b) / 2 * t3 = " + LTrapesium);

        System.out.println("\n7.Luas Lingkaran");
        int r1 = 7;
        int r2 = 7;
        double LLingkaran = 22.0 / 7.0 * r1 * r2;
        System.out.println("LLingkaran : 22.0 / 7.0 * r1 * r2 = " + LLingkaran);

        System.out.println("=== VOLUME BANGUN RUANG ===");

        System.out.println("\n1.Volume Kubus");
        int S1 = 2;
        int S2 = 4;
        int S3 = 6;
        int VKubus = S1 * S2 * S3;
        System.out.println("VKubus : s1 * s2 * s3 = " + VKubus);

        System.out.println("2.Volume Balok");
        int p2 = 3;
        int l2 = 5;
        int t = 7;
        int VBalok = p2 * l2 * t;
        System.out.println("VBalok : p2 * l2 * t = " + VBalok);

        System.out.println("\n3.Volume Prisma Segitiga");
        int LAlas = 8;
        int t4 = 8;
        int VPSegitiga = LAlas * t4;
        System.out.println("VPSegitiga : LAlas * t4 = " + VPSegitiga);

        System.out.println("\n4.Volume tabung");
        int r3 = 7;
        int r4 = 4;
        int t5 = 5;
        double VTabung = 22.0 / 7.0 * r3 * r4 * t5;
        System.out.println("VTabung : 22.0 / 7.0 * r3 * r4 * t5 = " + VTabung);
        
        System.out.println("\n5.Volume Bola");
        int r5 = 3;
        int r6 = 4;
        int r7 = 7;
        double VBola = 4.0 / 3.0 * r5 * 22.0 / 7.0 * r6 * r7;
        System.out.println("VBola : 4.0 / 3.0 * r5 * 22.0 / 7.0 * r5 * r6 = " + VBola);

        System.out.println("\n5.Volume Limas");
        int LAlas1 = 6;
        int t6 = 6;
        double VLimas = 1.0 / 3.0 * LAlas1 * t6;
        System.out.println("VLimas : 1.0 /* 3.0 * LAlas * t6 = " + VLimas);

        System.out.println("== METODE MATEMATIKA DI JAVA ==");
        
        System.out.println("\n1.Absolute = Mutlak");
        int nomor = -6;
        System.out.println("Absolute = " + Math.abs(nomor));

        System.out.println("\n2.Pow = Pangkat");
        int nomor1 = 3;
        System.out.println("Pow = " + Math.pow(nomor1,3));

        System.out.println("\n3.Sqrt = Kuadrat");
        int nomor2 = 64;
        System.out.println("Sqrt = " + Math.sqrt(nomor2));

        System.out.print("\n4.Min = Minimal");
        int angka1 = 2;
        int angka2 = 10;
        System.out.print("Min = " + Math.min(angka1, angka2));

        System.out.print("\n5.Max = Maximal");
        int angka3 = 15;
        int angka4 = 25;
        System.out.println("Max = " + Math.max(angka3, angka4));

        System.out.print("\n6. b.Round = Pembulan ke Atas");
        double angka5 = 5.4;
        System.out.print(" - Pembulatan ke Atas= " + Math.round(angka5));

        System.out.println("\nb.Round Pembulatan ke Bawah");
        double angka6 = 5.8;
        System.out.println(" - Pembulatan ke Bawah = " + Math.round(angka6));

        System.out.println("\n==LATIHAN EKSPRESI DAN OPERASI==\n");

        boolean True = true;
        boolean False  = false;

        boolean b1 = (2 == 1);
        System.out.print("\n 1 == 1 : " + b1);

        boolean b2 = (2 != 3);
        System.out.print("\n 2 != 2 = " + b2);
        
        boolean b3 = (5 > 3);
        System.out.print("\n 5 > 3 = " + b3);
        
        boolean b4 = (5 >= 5);
        System.out.print("\n 5 >= 5 = " + b4);

        boolean b5 = (5 >= 8);
        System.out.print("\n5 >= 8 = " + b5);

        boolean b6 = (7 < 8);
        System.out.print("\n 2 != 2 = " + b6);
        
        boolean b7 = (9 <= 10);
        System.out.print("\n 2 != 2 = " + b7);
        
        boolean b8 = (20 <= 15);
        System.out.print("\n 2 != 2 = " + b8);
       
        
        System.out.println("\nLATIHAN EKPRESI STRING\n");

        String kelas = "Reguler Pagi";

        System.out.println("Huruf Besar = " + kelas.toUpperCase());
        System.out.println("Huruf Kecil = " + kelas.toLowerCase());
        System.out.println("Panjang Kalimat = " + kelas.length());
        System.out.println("Berisi Nilai = " + kelas.contains("Pagi"));
        System.out.println("tidak Berisi Nilai = " + kelas.contains("Hai"));
       

        System.out.print("OPERATOR UNARY\n");

        System.out.println("Unary + dan -");
        int nomor6 = 1;
        System.out.println("- = " + (-nomor6));
        System.out.println("+ = " + (+nomor6));

        System.out.println("\nUnary decrement dan increment");
        int angka8 = 5;
        angka8 ++;
        System.out.println("Increment = " + angka8);

        int angka9 = 15;
        angka9--;
        System.out.println("Decrement = " + angka9);

        System.out.print("\nUnary prefix dan postfix");
        boolean a2a = 3;
        System.out.println("prefix = " + a2a++);

        int ba = 3;
        System.out.println("Postfix = " + ba++);
        System.out.print("Hasil setelah dieksekusi = " + ba);

        




        System.out.println("\nOPERATOR ASSIGNMENT\n");

        int a10 = 1;
        a10 += 5;
        System.out.println("Perkalian Nilai a = " + a10);

        int b10 = 5;
        b10 -= 10;
        System.out.println("Perkalian Nilai b = " + b10);
            //belum selesai
        



        System.out.println("\n==OPERATOR LOGIKAA==\n");

        boolean a11,b11,c;

        System.out.println("=== OR (||) ===");
        a = true;
        b = true;
        c = (a||b);
        System.out.println("a +" || "+ b +");'''

        

    }
}


