package section_8_operators_and_expressions;

public class Example1 {
    public static void main(String[] args) {

        byte lbNum = 12;
        short lsNum = 2345;
        int lnNum = 54313;
        long llNum = 54322314L;
        char lcChar = 'A';

        int lnSum = lbNum + lsNum;
        System.out.println(lnSum);

        lnSum = lsNum + lnNum;
        System.out.println(lnSum);

        lnSum = lcChar + 23476;
        System.out.println(lnSum);

        lnSum = lbNum + lnNum;
        System.out.println(lnSum);

        long llSum = llNum + lsNum;
        System.out.println(llSum);

        llSum = lbNum + 23456798;
        System.out.println(llSum);
    }
}
