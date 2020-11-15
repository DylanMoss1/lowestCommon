public class Main {
    public static void main(String[] args) {
        System.out.println(lowestCommonFun(14,25));
        System.out.println(lowestCommonFun(1096,47));
    }

    public static long lowestCommonFun(long a, long b){
        String bita = Long.toBinaryString(a);
        String bitb = Long.toBinaryString(b);

        long lowest = -1;

        if(bita.length() <= bitb.length()){
            bita = bita;
            bitb = bitb.substring(bitb.length()-bita.length(),bitb.length());
        } else {
            bita = bita.substring(bita.length()-bitb.length(),bita.length());
            bitb = bitb;
        }

        for(int i=0;i<bita.length();i++){
            if(bita.charAt(i) == bitb.charAt(i)){
                lowest = bita.length() - 1 - i;
                break;
            }
        }

        return lowest;

     }

}
