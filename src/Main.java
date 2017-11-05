import java.util.Scanner;

class Main{
    public static void main (String[]  args){
       java.util.Scanner in = new java.util.Scanner(System.in);

        long a = in.nextInt();
        long b = in.nextInt();
        long c = in.nextInt();
        long d = in.nextInt();
        int n = in.nextInt();
        long[] aa = new long[n];
        for(int i = 0; i <= n-1; i++){
           aa[i] = in.nextInt();
        }

        for (int i = 0; i <=n-1;i++){

            long p = 0;
            long q = (b-a+1)*(d-c+1);


            long ai = aa[i];


            long ax = Math.max(a, ai/d);
            long bx = Math.min(b,ai/c);


            for(long i1=ax;i1 <= bx;i1++){
                long r = ai / i1;
                if(ai%i1==0 && r>=c && r<=d){
                    p = p + 1;
                }
            }

            System.out.println(p+"/"+q);
        }
    }
}