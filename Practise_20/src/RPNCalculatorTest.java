public class RPNCalculatorTest {

	public static void testAddition() {
		double result = RPNCalculator.calculateRPN("5 3 +");
		System.out.println(result == 8);
	}

	public static void testSubtraction() {
		double result = RPNCalculator.calculateRPN("7 4 -");
		System.out.println(result == 3);
	}

	public static void testMultiplication() {
		double result = RPNCalculator.calculateRPN("2 6 *");
		System.out.println(result == 12);
	}

	public static void testDivision() {
		double result = RPNCalculator.calculateRPN("8 2 /");
		System.out.println(result == 4);
	}

	public static void testComplexExpression() {
		double result = RPNCalculator.calculateRPN("3 5 + 7 * 2 /");
		System.out.println(result == 28);
	}

	public static void main(String[] args) {
		RPNCalculatorTest.testAddition();
		RPNCalculatorTest.testSubtraction();
		RPNCalculatorTest.testMultiplication();
		RPNCalculatorTest.testDivision();
		RPNCalculatorTest.testComplexExpression();
	}
}
