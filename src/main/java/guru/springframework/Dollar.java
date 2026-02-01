package guru.springframework;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dollar extends Money {

    public Dollar(int amount, String currency){
        super(amount, currency);
    }
}
