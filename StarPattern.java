public class StarPattern {
    static void hollowRectangle(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i >= 2 && j >= 2 && i <= r - 1 && j <= c - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n || i == j || i + j == n + 1) {
                    System.out.print("* ");     //white space after *
                } else {
                    System.out.print("  ");          // 2 white space
                }
            }
            System.out.println();
        }
    }

    static void rightAngleHollow(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                if (j==1||i== n ||i==j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern3( int n){                       /* for (int i = 1; i <= n; i++)
                                                        {
                                                            for (int j = 1; j < 2*i ; j++)
                                                            {
                                                            }
                                                         }          */
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (2*i+1) ; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {       // V   PATTERN.. pattern odd star me formula use karna hai
        for (int i = 1; i <= n; i++)
        {
            for (int k = n-1; k >= i ; k--)
            {
                System.out.print(" ");
            }
            for (int j= 1; j< (i*2); j++)
            {

                if (j>1 &&  j < (i*2)-1) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
//        hollowRectangle(5,10);
//        System.out.println();
//        pattern2(7);
//        rightAngleHollow(6);
        pattern3(6);
        pattern4(7);
    }
}
