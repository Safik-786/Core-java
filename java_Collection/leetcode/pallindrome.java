package leetcode;
public class pallindrome
{
    public boolean isPalindrome(int num)
    {
        int a=num;
        int sum=0;
        while (num > 0) {
            int rem = num%10;
            sum = (sum*10)+rem;
            num = num/10;
        }
        if (sum==a) {
            return true;
        }
       return false;
    }

    public static void main(String[] args) {
        pallindrome p = new pallindrome();
        if(p.isPalindrome(121))
        {
            System.out.println("it is a pallindrome");
        }
        else {
            System.out.println("fuck");
        }
    }
}
