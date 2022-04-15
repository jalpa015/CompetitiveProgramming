// Problem Link - https://www.hackerrank.com/challenges/java-list/problem?h_r=next-challenge&h_v=zen&isFullScreen=true&h_r=next-challenge&h_v=zen

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        n = scan.nextInt();
        for(int i = 0; i < n ; i++) {
            String Q=scan.next();
            if( Q.compareTo("Insert") == 0)
            {
                list.add(scan.nextInt(),scan.nextInt());
            }
            else
            {
                list.remove(scan.nextInt());
            }
        }
        for(int i : list) {
            System.out.print(i + " ");
        }
    }
}
