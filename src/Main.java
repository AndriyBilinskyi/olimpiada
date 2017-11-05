import java.util.Scanner;

class Main{
    public static void main (String[]  args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        String commandStr = in.next();
        int n = commandStr.length();
        int [] xx = new int [n];
        int [] yy = new int [n];
        boolean fail = false;
        int i ;
        for( i = 0 ; i<=n-1 && !fail ; i++){

            xx[i] = x;
            yy[i] = y;


            char c = commandStr.charAt(i);
            if (c == 'L'){
                x = x-1;
            } else if(c == 'R'){
                x = x + 1;
            } else if(c == 'U'){
                y = y + 1;
            } else if(c == 'D'){
                y = y - 1;
            }


            for(int j = 0; j <= i-1;j++){
                if(x==xx[j] && y == yy[j]){
                    fail = true;
                    break;
                }
            }

        }

        String r;
        if(fail){
            r = "Fail";
        } else {
            r = "Success";
        }
        System.out.print(r);
        if(fail){
            System.out.println();
            System.out.print(i);
        }
    }
}