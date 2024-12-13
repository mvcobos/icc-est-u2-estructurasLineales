package Ejercicio_01_sign;
import Materia.Stacks.StackGeneric;

public class SignValidator {
    public static boolean isValid(String caracter) {
        StackGeneric<Character> stack = new StackGeneric<>();

        for (char c : caracter.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
