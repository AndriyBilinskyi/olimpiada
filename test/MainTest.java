public class MainTest{

    public static void main (String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        int[] bb = new int[n];
        int[] kk = new int[n];
        int[] ss = new int[n];
        for (int i=0; i<=n-1;i++){
            int b = in.nextInt();
            int k = in.nextInt();
            int s = in.nextInt();
            bb[i] = b;
            kk[i] = k;
            ss[i] = s;

        }
        long r = calculate(bb,kk,ss, n );
        java.lang.System.out.print(r);
    }

    private static int calculateCheatSheet(int n){
        int r;
        if( (n==100) || n<400 && n>50){
            r = 5;
        } else {
            r = 17;
        }

        if( (n==100) || n<400 && n>50){
            r = 5;
        }

        while(n>0){
            System.out.println(n);
            n = n - 1;
        }

        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }

        int i = 1;
        while(i <= 10){
            print(i);
            i=i+1;//i++
        }

        double x = 12.0/5;
        print(x);
        r = 12 % 5;

        int[] money = {500,200,100,50,20,10,5,2,1};
        for(int m: money){

            r = r + n/m;
            n = n % m;
            if (n % m == 0){
                return r ;
            }


        }

        return r;
    }

    public static void print(Object x){System.out.println(x);}

    public static long calculate (int[] bb,int[] kk,int[] ss,int n) {
        long r = 0;

        long bsum = 0;
        long ksum = 0;
        long ssum = 0;
        long br = 0;
        long kr = 0;
        long sr = 0;

        for (int i = 0;i<=n-1;i++){

            bsum = bsum+bb[i];
            ksum = ksum+kk[i];
            ssum = ssum+ss[i];

        };
        long ba = Math.round((bsum+0.0)/n);
        long ka = Math.round((ksum+0.0)/n);
        long sa = Math.round((ssum+0.0)/n);
        for (int i = 0;i<=n-1;i++){
            br = br + Math.abs(bb[i]-ba);
            kr = kr + Math.abs(kk[i]-ka);
            sr = sr + Math.abs(ss[i] -sa);
        }
        r = br + kr + sr;
        return r;
    }

}
