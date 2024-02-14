public class commandLA {
    public static void main(String[] args) throws Exception {
//        int a,b,c;
//        a=Integer.parseInt(args[0]);
//        b=Integer.parseInt(args[1]);
//        c=a+b;
//        System.out.println(c);
//        System.out.println(args[5]);
        int len, i, sum=0;
        len = args.length;
        ;
        for (i = 0; i < len; i++) {
            sum = sum +Integer.parseInt( args[i]);
        }
        System.out.println(sum);
    }
}
