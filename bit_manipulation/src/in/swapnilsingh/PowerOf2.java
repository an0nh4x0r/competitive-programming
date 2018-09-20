package in.swapnilsingh;

public class PowerOf2 {

    public static void main(String[] args) {
        System.out.println(isPowerOf2(1024));
    }

    public static boolean isPowerOf2(int x) {
        if (x == 0) return false;

        return ((x & (x-1)) == 0);
    }
}
