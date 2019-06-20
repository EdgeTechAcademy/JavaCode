public class Calculator {
    public static void main(String[] args) {
        double num1 = 0, num2 = 0, result = 0;
        int opCnt;
done:
        do {
            String operator = Utils.getInput("Operator ");

            switch (operator) {
                case "+":   case "-":   case "*":   case "/":   case "^":   case "%":   case "x":
                    num1 = Utils.getDouble("#1 ");
                    num2 = Utils.getDouble("#2 ");
                    opCnt = 2;
                    break;
                case "sq":  case "2":  case "c":  case "r":
                    num1 = Utils.getDouble("#1 ");
                    opCnt = 1;
                    break;
                case    "." :
                    break done;
                default:
                    opCnt = 0;
            }
            switch (operator) {
                case    "+"     : result = num1 + num2; break;
                case    "-"     : result = num1 - num2; break;
                case    "*"     : result = num1 * num2; break;
                case    "/"     : result = num1 / num2; break;
                case    "%"     : result = num1 % num2; break;
                case    "x"     : result = Math.max(num1,num2); break;
                case    "^"     : result = Math.pow(num1, num2); break;
                case    "sq"    : result = Math.sqrt(num1); break;
                case    "2"     : result = Math.pow(num1,2); break;
                case    "pi"    : result = Math.PI; break;
                case    "r"    : result = (int)(Math.random() * num1); break;
                case    "c"     : result = Math.PI * Math.pow(num1,2); break;
            }
            switch (opCnt) {
                case 0: System.out.println(result + " = " + operator );                             break;
                case 1: System.out.println(result + " = " + operator + " " + num1 );                break;
                case 2: System.out.println(result + " = " + num1 + " " + operator + " " + num2);    break;
            }
        } while (true);
    }

    public static double getMax(double[] aDbl) {
        double max = aDbl[0];
        for (int i = 0; i < aDbl.length; i++) {
            max = Math.max(max, aDbl[i]);
        }
        return max;
    }
}
