import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bingo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("숫자");
        StringTokenizer st=new StringTokenizer(br.readLine());
        final int SIZE=5;
        int x=0,y=0,num=0;

        int [] [] bingo=new int[SIZE][SIZE];
        //Bingo 1~25 숫자 채우기
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                bingo[i][j]=i*SIZE+j+1;
            }
        }
        do{
            for(int i=0;i<SIZE;i++){
                for(int j=0;j<SIZE;j++){
                    System.out.printf("%2d",bingo[i][j]);
                    System.out.println();
                }
            }
            System.out.println();
            System.out.printf("1~25 사이의 숫자를 입력하시오");
            st=new StringTokenizer(br.readLine());
            num=Integer.parseInt(st.nextToken());
            for(int i=0;i<SIZE;i++){
                for(int j=0;j<SIZE;j++){
                    if(bingo[i][j]==num){
                        bingo[i][j]=0;
                        break;
                    }
                }
            }

        }while (num!=0);


    }
}
