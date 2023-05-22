package timus;

import java.util.Scanner;

public class task_1292 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Input T:");
        int T = in.nextInt();

        for(int j = 1; j <= T; j++) {
            System.out.println("Input N K L:");
            int n = in.nextInt();
            int k = in.nextInt();
            int L = in.nextInt();

            for(int i=1; i<n; i++)
            {
                k = f(k);
                if(k==153) break;
            }
            System.out.println(k-L);
        }
    }
    public static int f(int k)
    {
        int ans = 0;
        while(k>0) {
            int d = k%10;
            ans += d*d*d;
            k/=10;
        }
        return ans;
    }
}
