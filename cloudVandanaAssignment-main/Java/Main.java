
import java.util.*;

public class Main {
    public static void main(String args[]) {
        RomanToInteger obj = new RomanToInteger();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println("Roman Number to Integer:-  " + obj.romanToDecimal(s));
    }

}

class RomanToInteger {
    int value(char ch) {
        if (ch == 'I' || ch == 'i')
            return 1;
        if (ch == 'V' || ch == 'v')
            return 5;
        if (ch == 'X' || ch == 'x')
            return 10;
        if (ch == 'L' || ch == 'l')
            return 50;
        if (ch == 'C' || ch == 'c')
            return 100;
        if (ch == 'D' || ch == 'd')
            return 500;
        if (ch == 'M' || ch == 'm')
            return 1000;
        return -1;
    }

    int romanToDecimal(String s) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            int s1 = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));

                if (s1 >= s2) {
                    res = res + s1;
                } else {

                    res = res + s2 - s1;
                    i++;
                }
            } else {
                res = res + s1;
            }
        }

        return res;
    }
}


    

