package guru.springframework;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object object){
        return this.amount == ((Money) object).amount &&
                getClass().equals(object.getClass());
    }
}
