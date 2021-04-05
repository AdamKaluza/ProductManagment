package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Food extends Product {
    private LocalDate bestBefore;

    public Food(int id, String name, BigDecimal price, Raiting raiting, LocalDate bestBefore) {
        super(id, name, price, raiting);
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }
}
