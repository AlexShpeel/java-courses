import java.util.Scanner;

public class InteractRunner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")){
                System.out.println("Type first number");
                String first = sc.next();
                System.out.println("Type second number");
                String second = sc.next();

                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Summ = " + calc.getResult());
                calc.cleanResult();
                System.out.println("Exit? yes/no...");
                exit = sc.next();
            }

        }finally {
            sc.close();
        }

    }
}