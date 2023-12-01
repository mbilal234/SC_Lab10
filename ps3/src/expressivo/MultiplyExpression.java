package expressivo;

/**
 * Represents a binary multiplication expression.
 */
public class MultiplyExpression implements Expression {
    private final Expression leftOperand;
    private final Expression rightOperand;

    /**
     * Constructs a binary multiplication expression with the given operands.
     *
     * @param leftOperand  The left operand.
     * @param rightOperand The right operand.
     */
    public MultiplyExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;

        // Rep invariant: Both leftOperand and rightOperand must not be null.
        checkRep();
    }

    /**
     * Checks the representation invariants of the MultiplyExpression.
     * This method should be called after each constructor call.
     * It helps ensure that the class remains in a valid state.
     *
     * Rep invariant: Both leftOperand and rightOperand must not be null.
     */
    private void checkRep() {
        if (leftOperand == null || rightOperand == null) {
            throw new IllegalArgumentException("MultiplyExpression operands cannot be null");
        }
    }

    @Override
    public String toString() {
        // Use parentheses for clarity and to maintain the correct order of operations
        return "(" + leftOperand.toString() + " + " + rightOperand.toString() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        MultiplyExpression that = (MultiplyExpression) obj;

        return leftOperand.equals(that.leftOperand) && rightOperand.equals(that.rightOperand);
    }

    @Override
    public int hashCode() {
        int result = leftOperand.hashCode();
        result = 31 * result + rightOperand.hashCode();
        return result;
    }

    // TODO: Implement more instance methods if needed
}
