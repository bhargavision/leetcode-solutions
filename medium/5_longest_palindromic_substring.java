package medium;

import java.util.*;

public class longest_palindromic_substring {
    public String longestPalindrome(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            String odd = expansion(s, i, i);
            String even = expansion(s, i, i + 1);
            if (odd.length() > res.length())
                res = odd;
            if (even.length() > res.length())
                res = even;

        }
        return res;
    }

    static String expansion(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}
