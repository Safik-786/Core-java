package leetcode;

import java.util.HashMap;

class RomanToInt1
{
    public int getValue(char ch)
    {
        switch (ch)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default: return 0;
        }
    }
    public int Roman_to_int(String str)
    {
        int sum =0;
        int n= str.length();
        for (int i=0;i<n;i++)
        {
            char ch1= str.charAt(i);

//  ch1 ka value nikal ne ke liye hame next character chahiye isiliye hum next character ko statement me khojte hain


            if (  (i+1)<n &&  (   getValue(ch1) < getValue(str.charAt(i+1)))   )
            {
                sum= sum-getValue(ch1);
            }
            else{
                sum= sum+getValue(ch1);
            }
        }
        return sum;
    }
}
class RomanToInt2                   //   HASH MAP
{
    public int Roman_to_Int2(String s)
    {
        HashMap<Character,Integer> hm= new HashMap<Character, Integer>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int sum =0;
        int n= s.length();
        for (int i=0;i<n;i++)
        {
//            char ch1 = s.charAt(i);
            if (i+1 < n  && (hm.get(s.charAt(i)) < hm.get(s.charAt(i+1) )))
            {
                sum=sum-hm.get(s.charAt(i));
            }
            else
            {
                sum= sum+hm.get(s.charAt(i));
            }
        }
        return sum;
    }
}


class test{
    public static void main(String[] args)
    {
        RomanToInt1 r = new RomanToInt1();
        System.out.println(r.Roman_to_int("MCMXCIV"));


        RomanToInt2 r2 = new RomanToInt2();
        System.out.println(r2.Roman_to_Int2("MCMXCIV"));
    }
}
