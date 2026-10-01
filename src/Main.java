public class Main {
    public static void main(String[] args) {
        ExpressionEvaluator evaluator = new ExpressionEvaluator();

        System.out.println(evaluator.isBalanced("(a + b) * [c - d]"));
        System.out.println(evaluator.isBalanced("{[()()]}"));
        System.out.println(evaluator.isBalanced("([)]"));
        System.out.println(evaluator.isBalanced("((a + b)"));
        System.out.println(evaluator.isBalanced(""));

        System.out.println(evaluator.evaluate("3 + 4 * 2"));
        System.out.println(evaluator.evaluate("(3 + 4) * 2"));
        System.out.println(evaluator.evaluate("10 / 2 - 3"));
        System.out.println(evaluator.evaluate("2 * (3 + (4 - 1))"));

        try {
            evaluator.evaluate("5 / 0");
        } catch (ArithmeticException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}