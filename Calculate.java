public class Calculate{
	public static void main(String[] args) {
        System.out.println("Calculate ...");

        double first = Double.valueOf(args[0]);
        double second = Double.valueOf(args[1]);
        double result = 0;

        result = first + second;
        System.out.println(first + " + " + second + " = " + result);

        result = first - second;
        System.out.println(first + " - " + second + " = " + result);

        result = first * second;
        System.out.println(first + " * " + second + " = " + result);

        result = first / second;
        System.out.println(first + " / " + second + " = " + result);

        result = power(first,second);
        System.out.println(first + " ^ " + second + " = " + result);
    }

    private static double power(double x, double y){

        double result=1;
        int i=1;
        while(i <= y)
        {
            result *= x;
            i++;
        }
        return result;
    }
}