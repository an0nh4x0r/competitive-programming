import java.util.Stack;

public class BalancedBrackets {

    private static Stack<Character> characterStack = new Stack<>();

    public static void main(String[] args) {
        String tokens = "[}}}";
//        {[()]}
//        {[(])}
//        {{[[(())]]}}
        if (processItem(tokens))
            System.out.println("OK");
        else
            System.out.println("Not OK");
    }

    public static boolean processItem(String tokens) {
        if (checkCloseBracketInitially(tokens.charAt(0))) {
            return false;
        }
        for (int i = 0; i < tokens.length(); ++i) {
            if (isOpenItem(tokens.charAt(i)))
                characterStack.push(tokens.charAt(i));
            else {
                // pop stack and check if it's actually the opening bracket corresponding to the closing bracket
                if (!popAndCheck(tokens.charAt(i))) {
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }

    public static boolean isOpenItem(Character character) {
        return (character == '{' || character == '[' || character == '(');
    }

    public static boolean popAndCheck(Character closingBracket) {
        if (characterStack.size() > 0) {
            char poppedCharacter = characterStack.pop();
            return ((poppedCharacter == '{' && closingBracket == '}')
                    || (poppedCharacter == '[' && closingBracket == ']')
                    || (poppedCharacter == '(' && closingBracket == ')'));
        }
        return false;
    }

    public static boolean checkCloseBracketInitially(Character character) {
        return (character == '}' || character == ']' || character == ')');
    }

}
