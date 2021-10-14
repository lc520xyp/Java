import java.util.Scanner;

public class HuiXing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] ans = new int[n][n];
        int s = 0, e = n-1, l = 0, r = n-1;
        int nums = n*n;
        int xv = 0, yv = 1;
        int x = 0, y = 0;
        int num = 1;

        while (num != nums+1){
            ans[x][y] = num++;
            x += xv;
            y += yv;

            if(y == r){
                if(x == s && xv !=1){
                    xv = 1;
                    yv = 0;
                    s++;
                }else if (x == e &&yv != -1 ){
                    xv = 0;
                    yv = -1;
                    r--;
                }

            } else if(y == l){
                if(x == s && yv != 1){
                    xv = 0;
                    yv = 1;
                    l++;
                }else if (x == e && xv != -1){
                    xv = -1;
                    yv = 0;
                    e--;
                }
            }
        }
        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(ans[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
