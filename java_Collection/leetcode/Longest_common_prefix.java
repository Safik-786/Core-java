package leetcode;

import java.util.*;
public class Longest_common_prefix
{
    public String longestCommonPrefix(String[] str)
    {
        Arrays.sort(str);
        String s1= str[0];
        String s2= str[str.length - 1];
        int i=0;
        while (i<s1.length() && i<s2.length())
        {
            if (s1.charAt(i) == s2.charAt(i))
            {
                i++;
            }
            else {
                break;
            }
        }
        return s1.substring(0,i);
    }

    public static void main(String[] args) {
        Longest_common_prefix lcp = new Longest_common_prefix();
        String [] str= new String[]{"flow","flower","float","floght"};
        System.out.println(lcp.longestCommonPrefix(str));
    }

}
