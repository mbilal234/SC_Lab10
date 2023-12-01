package expressivo;

/**
 * Represents a constant expression.
 */
public class ConstantExpression implements Expression {
    private final double value;

    /**
     * Constructs a constant expression with the given value.
     *
     * @param value The constant value.
     */
    public ConstantExpression(double value) {
        this.value = value;

        // Rep invariant: None for a constant expression.
        checkRep();
    }

    /**
     * Checks the representation invariants of the ConstantExpression.
     * This method should be called after each constructor call.
     * It helps ensure that the class remains in a valid state.
     *
     * Rep invariant: None for a constant expression.
     */
    private void checkRep() {
        // No specific rep invariants for a constant expression.
        // This method is included for consistency and possible future extensions.
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        ConstantExpression that = (ConstantExpression) obj;

        return Double.compare(that.value, value) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }

    // TODO: Implement more instance methods if needed
    // Additional instance methods can be added here if needed

}
