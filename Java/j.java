package Java;

public class j {
    public static void main(String[]args){
        int a = 30;
        int b = 45;
        System.out.println("SWAP adalah Tempat Pentimpanan Memori Sementara ");
        System.out.println("Sebelum swapping, a = " + a + " b =" + b);
        ProsedurSwap(a,b);
    }
    
    public static void ProsedurSwap(int a, int b){
        int c = a;
        a = b;
        b = c;
        System.out.println("Setelah swapping, a = " + a + "b = " + b);
    }
}
