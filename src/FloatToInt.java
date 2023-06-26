public class FloatToInt {
    public static void main(String[] args) {
        float f=9.1234567f;
        int i=Float.floatToIntBits(f);
        System.out.println("i = " + i);
    }
}
