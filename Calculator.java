public class Calculator{

    private double result = 0.0;

    public void add(int ... vars){
        for (Integer i: vars) {
            this.result += i;
        }
    }
    public void sub(int a, int b){
            this.result = a - b;
    }
    public void multi(int a, int b){
        result = a * b;
    }
    public void div( double a, double b){
        result = a / b;
    }

    public double getResult(){
        return this.result;
    }

    public void cleanResult(){
        this.result = 0;
    }
}