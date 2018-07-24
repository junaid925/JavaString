/*
There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());

        if(0 < A.compareTo(B))
            System.out.println("Yes");
        else
            System.out.println("No");


        String e = A.substring(0, 1).toUpperCase();
        String f = B.substring(0, 1).toUpperCase();

         System.out.println(e+A.substring(1)+" "+f+B.substring(1));


    }
}
