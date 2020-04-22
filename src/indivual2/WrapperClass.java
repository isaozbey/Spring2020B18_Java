package indivual2;

public class WrapperClass {
    public static void main(String[] args) {

        Integer num=20;
        System.out.println(num.MAX_VALUE);

       byte byteValue=Byte.MAX_VALUE-1;
        System.out.println(byteValue);

        int num1=Byte.parseByte("25");
        System.out.println(num1);



        Integer v1=(int)20.0;
        int k=v1;
        long s1=v1;

        Double d1=(double)v1;

        byte b3=(byte)Short.parseShort("123");

       int i2=Integer.valueOf("123");

       int max=Byte.MAX_VALUE;
       System.out.println(max);

       int max1=(int) Double.MAX_VALUE;
        System.out.println(max1);

        Integer min=(Integer)Integer.MIN_VALUE;
    System.out.println(min);
System.out.println("\"");
    }
}
