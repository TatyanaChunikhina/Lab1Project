
public class ClassMain {
    public static void main(String[] args){
        long x=MathLib.sqr(4);
        System.out.println("x*x="+x);
        x=MathLib.factorial(3);
        System.out.println("x*x="+x);
        x=MathLib.power(3,5);
        System.out.println("pow(3,5)="+x);
        x=MathLib.log(2,1024);
        System.out.println("log2(1024)="+x);
        x=MathLib.log(3,9);
        System.out.println("log3(9)="+x);
        x=MathLib.log(3,133);
        System.out.println("log3(133)="+x);

    }
}
