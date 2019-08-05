package FFHS;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;


public class Program implements ITest {

    static int x = 11;
    private int y = 33;

    static int i = 1;

    public static void main(String[] args) {

        Timestamp timestamp = Timestamp.from(Instant.now());
        System.out.println(timestamp);

        int[]a = {2,3,5};

        double array[][] = new double[10][];

        System.out.println();

        ITest let = new ITest() {};

        System.out.println(LocalDate.now());

        Integer i1 = 160;
        Integer i2 = 160;
        System.out.println(i1 == i2);
        Integer i3 = 10;
        Integer i4 = 10;
        System.out.println(i3 == i4);

        Double pixi = new Double(5.5);
        int leint = pixi.intValue();
        System.out.println(leint);

        int _xx = 5;
        int _5 = 10;
        int x = _5;
        System.out.println(_5/x);

        StringBuilder sb = new StringBuilder("hello");
        StringBuilder sb1 = new StringBuilder("hello");
        String s = new String("hello");

        System.out.println(sb.toString().equals(s));


        int c = Integer.valueOf(8);
        System.out.println(c);

        Integer f = 7;
        int t = f.valueOf(4);
        System.out.println(t);

        Integer p = Integer.valueOf(3);
        System.out.println(p);

        System.out.println();

        int y = 10;
        short z = 5;

        int i,j = 2; // this inits only the j variable
//        System.out.println(i); you need to init i first
        System.out.println(Program.i); // but this is valid

        Program pro = new Program();
        pro.method(5);
        System.out.println(Program.x);
        System.out.println(pro.x);
        System.out.println(pro.y);  // same class, has access to private var, even if the method is static.


        OtherClass otherClass = new OtherClass();
        System.out.println(otherClass.z);
//        System.out.println(otherClass.i);  // other class

//        System.out.println(otherClass.myMeth());

        System.out.print("yo");

        System.out.println(s);
        System.out.println(ITest.value);

        StringBuilder sb8 = new StringBuilder("hello");
//        sb.concat(" yo ");


    }

    private void method(int x) {
        x = 10;
        y = 12;
    }

    // also compiles
//    public static void main(String args[]) {
//
//    }
}