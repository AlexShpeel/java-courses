public class Calculator{

    /**
     * class defines operations
     * uses in InteractRunner and ArgRunner
     */

    private double result = 0.0;

//    addition method
    public void add(int ... vars){
        for (Integer i: vars) {
            this.result += i;
        }
    }

//    subtraction method
    public void sub(int a, int b){
        this.result = a - b;
    }

//    multiplication method
    public void multi(int a, int b){
        this.result = a * b;
    }

//    division method
    public void div( double a, double b){
        this.result = a / b;
    }

    public double getResult(){
        return this.result;
    }

    public void cleanResult(){
        this.result = 0;
    }
}