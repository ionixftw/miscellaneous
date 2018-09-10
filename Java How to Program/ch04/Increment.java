public class Increment {
    public static void main (String[] args) {
        int x = 5;
        System.out.println("Before preincrement: " + x);
        System.out.println("Preincrementing: " + ++x);
        System.out.println("After preincrement: " + x);
        System.out.println();
        System.out.println("Before postincrement: " + x);
        System.out.println("Postincrementing: " + x++ );
        System.out.println("After postincrement: " + x);
        // note:
        // ++(x+1); // gives a compilation error!!
        ++(x); // doesn't
        System.out.println("Now x is: " + x);
        // let's get mad here
        int y = (++x == 9 ? 9 : 777) + (++x==10 ? 100 : 200) * (++x == 11 ? 11 : 1234);
        System.out.println("After mad experiment: " + x);
        System.out.println("Now y is: " + y);
        boolean red = true == 6 <= 7;
        System.out.println(red);  
    }
}