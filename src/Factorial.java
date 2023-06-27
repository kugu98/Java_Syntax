public class Factorial {
    public static void main(String[] args) {
        int result=Factorial.factorial(4);
        System.out.println("result = " + result);
    }
    static int factorial(int n){
        int result=0;
        if(n==1)
            result=1;
        else
            result=n*factorial(n-1);
        return result;
    }

}
