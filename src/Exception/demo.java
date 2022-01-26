package Exception;
class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimension of a Rectangle cannot be Negative ";
    }
}
public class demo {
    static int meth1(){
        return 10/5;
    }
    static void meth2(){
        meth1();
    }
    static void meth3(){
        meth2();
    }
    static int area (int l, int b) throws NegativeDimensionException {
        if(l<0 || b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
    static void meth4() throws NegativeDimensionException{
        System.out.println("Area of rectangle "+ area(-10,5));
    }
    public static void main(String[] args) {
        try {
            meth3();
            meth4();
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (NegativeDimensionException e) {
            System.out.println(e);
        }
    }
}
