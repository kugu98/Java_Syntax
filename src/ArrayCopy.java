public class ArrayCopy {
    public static void main(String[] args) {
        char abc []={'a','b','c'};
        char num []={'1','2','3'};

        char result []=new char[abc.length+ num.length];
        System.arraycopy(abc,0,result,0,abc.length);
        System.arraycopy(num,0,result,abc.length,num.length);

        System.out.println(result);
    }
}
