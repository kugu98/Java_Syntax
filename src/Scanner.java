import java.util.Date;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner=new java.util.Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input=scanner.nextLine();
        int num=Integer.parseInt(input);
        
        System.out.println("입력내용:"+input);
        System.out.printf("num=%d",num);
    }
}
