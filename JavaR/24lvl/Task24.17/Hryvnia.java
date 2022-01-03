public class Hryvnia extends Money {
    public String getCurrencyName(){
        return "UAH";
    }
    public Hryvnia(double amount){
        super(amount);
    }
}
