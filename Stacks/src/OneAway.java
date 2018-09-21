import java.util.Stack;

public class OneAway {

    public static void main(String[] args) {
        System.out.println(oneAway("pale", "ple"));
        System.out.println(oneAway("lepl", "pl"));
        System.out.println(oneAway("come", "emo"));
    }

    public static boolean oneAway(String s1, String s2) {

        if (Math.abs(s1.length() - s2.length()) != 1) return false;

        Stack<Character> characterStack = new Stack<>();

        String biggerString, smallerString;
        if (s1.length() > s2.length()) {
            biggerString = s1;
            smallerString = s2;
        } else {
            biggerString = s2;
            smallerString = s1;
        }

        for (Character c : biggerString.toCharArray()) {
            characterStack.push(c);
        }

        int i = smallerString.length() - 1;
        int checkCount = 0;
        boolean flag = true;

        while (!characterStack.isEmpty()) {
            if (characterStack.pop() == smallerString.charAt(i)) {
                i--;
            } else {
                checkCount += 1;
                if (checkCount > 1) {
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }
}
