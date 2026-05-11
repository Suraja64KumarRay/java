public class bnry_to_deci {
    public static void bintodec(int bnum)
    {
        int mynum=bnum;
        int pow=0;
        int decnum=0;

        while (bnum>0) {
            int lastdig=bnum%10;
            decnum=decnum+(lastdig*(int)Math.pow(2, pow));
            pow++;
            bnum=bnum/10;
        }
        System.out.println("Decimal of "+mynum+" = "+decnum);;
    }
    public static void main(String[] args) {
        bintodec(1010);
    }
}
