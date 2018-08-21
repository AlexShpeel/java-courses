public class Calculator{

    private int result;

    public void add(int ... vars){
        for (Integer i: vars) {
            this.result += i;
        }
    }

    public int getResult(){
        return this.result;
    }

    public void cleanResult(){
        this.result = 0;
    }
}