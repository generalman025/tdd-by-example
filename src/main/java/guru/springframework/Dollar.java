package guru.springframework;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dollar extends Money {

    public Dollar(int amount){
        this.amount = amount;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    @Override
    public int hashCode(){
        return amount;
    }
}
