import java.util.Scanner;

/**The programm asks to type
 * two int numbers
 * and to choose operation
 * to do with numbers.
 */

public class InteractRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

//             creates new Calculator
            Calculator calc = new Calculator();
            String exit = "no";

//             asking of exit
            while (!exit.equals("yes")) {
                System.out.println("Type first number");
                String first = sc.next();
                System.out.println("Type second number");
                String second = sc.next();
                System.out.println("Choose operation \n" +
                        "1: addition\n" +
                        "2: subtraction\n" +
                        "3: multiplication\n" +
                        "4: division");
                int choice = Integer.parseInt(sc.next());
//                choosing operation
                switch (choice) {

                    case 1: {
                        calc.add(Integer.valueOf(first), Integer.valueOf(second));
                        System.out.println("Summ = " + calc.getResult());
                        break;
                    }
                    case 2: {
                        calc.sub(Integer.valueOf(first), Integer.valueOf(second));
                        System.out.println("Subtraction = " + calc.getResult());
                        break;
                    }
                    case 3: {
                        calc.multi(Integer.valueOf(first), Integer.valueOf(second));
                        System.out.println("Multiplication = " + calc.getResult());
                        break;
                    }
                    case 4: {
                        calc.div(Integer.valueOf(first), Integer.valueOf(second));
                        System.out.println("Division = " + calc.getResult());
                        break;
                    }
                }
//                cleaning the result variable
                calc.cleanResult();
                System.out.println("Exit? yes/no...");
                exit = sc.next();
            }

        } finally {
            sc.close();
        }

    }
}