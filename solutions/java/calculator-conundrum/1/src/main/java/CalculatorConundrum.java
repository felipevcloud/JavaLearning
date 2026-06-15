class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int total = 0;
        if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if(operation == ""){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        switch(operation){
            case "+":
                total = operand1 + operand2;
                return String.format("%d + %d = %d", operand1, operand2, total);
            case "*":
                total = operand1 * operand2;
                return String.format("%d * %d = %d", operand1, operand2, total);
            case "/":
                if(operand2 == 0){
                    throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
                }
                total = operand1 / operand2;
                return String.format("%d / %d = %d", operand1, operand2, total);
            default:
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
    }
}