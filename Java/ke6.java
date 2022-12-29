package Java;

public class ke6 {
    public static void main(String[]args){
        int sisi = 15;
        int L = luaskubus(sisi);
        System.out.println(L);
    }

    static int luasPersegi(int sisi){
        return sisi * sisi;
    }

    static int luaskubus(int sisi){
        return 6 * luasPersegi(sisi);
    }
}
