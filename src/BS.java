import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("숫자 a와 b를 입력하시오");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("숫자 c와 d를 입력하시오");
        st=new StringTokenizer(br.readLine(),",");
        int c=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(st.nextToken());

        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
