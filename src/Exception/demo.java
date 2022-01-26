package Exception;

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
    static int area (int l, int b) throws Exception {
        if(l<0 || b<0)
            throw new Exception();
        return l*b;
    }
    static void meth4() throws Exception{
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
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
