package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  5"[LaunchCode]", 7"Launch[Code]", 6"[]LaunchCode", 4"", 1"[]", 12"[]LaunchCode[]"
     *
     * While these do not:
     *   8"[LaunchCode", 10"Launch]Code[", 2"[", 9"][", 3"]", 11"[]LaunchCode]", 13"[LaunchCode[]"
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                brackets--;
            }
            if (brackets < 0) {
                return false;
            }
        }
        return brackets == 0;
    }
}
