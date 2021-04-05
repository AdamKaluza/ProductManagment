package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductManager {
    public Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate localDate) {
        return new Food(id, name, price, rating, localDate);
    }
    public Product createProduct(int id, String name, BigDecimal price, Rating rating) {
        return new Drink(id, name, price, rating);
    }
}
