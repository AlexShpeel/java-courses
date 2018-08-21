public class ArgRunner {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String exit = "no";
        calc.add(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
        System.out.println("Summ = " + calc.getResult());
        calc.cleanResult();
    }
}
