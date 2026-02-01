package guru.springframework;

public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public static Dollar dollar(int amount){
        return new Dollar(amount, "USD");
    }

    public static Franc franc(int amount){
        return new Franc(amount, "CHF");
    }

    public String currency(){
        return currency;
    }

    public Money times(int multiplier){
        return new Money(amount * multiplier, this.currency);
    }

    @Override
    public boolean equals(Object object){
        return this.amount == ((Money) object).amount &&
                this.currency.equals(((Money) object).currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
