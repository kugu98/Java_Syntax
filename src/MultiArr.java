import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultiArr {
    public static void main(String[] args)throws IOException {
        final int  MAX=10;
        int x=0,y=0;

        char [] []board=new char[MAX][MAX];
        byte [] [] shipboard={
                {0,0,1,0,1,0,1,0,1},
                {0,0,1,0,1,0,1,0,1},
                {0,0,1,0,1,0,1,0,1},
                {0,0,1,0,1,0,1,0,1},
                {0,0,1,0,1,0,1,0,1},
                {0,0,1,0,1,0,1,0,1},
                {0,0,1,0,1,0,1,0,1},
                {0,0,1,0,1,0,1,0,1},
                {0,0,1,0,1,0,1,0,1}

        };
        //i행 i열 -> i+1행 i+1열
        for(int i=1;i<MAX;i++){
            board[0][i]=board[i][0]=(char) (i+'0');
        }
        System.out.println("x: y:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        while (true){

            x=Integer.parseInt(st.nextToken());
            y=Integer.parseInt(st.nextToken());
            if(x==0 && y==0){
                break;
            }
            board[x][y]=shipboard[x-1][y-1] ==1?'o':'x';

            for(int i=0;i<MAX;i++){
                System.out.println(board[i]);
            }
            System.out.println();
        }
    }
}
