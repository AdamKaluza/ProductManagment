package ProductMenagment.data;

import java.math.BigDecimal;

import static ProductMenagment.data.Raiting.*;

public class Product {
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    private int id;
    private String name;
    private BigDecimal price;
    private Raiting raiting;

    public Product() {
        this(0,"no name",BigDecimal.ZERO);
    }

    public Product(int id, String name, BigDecimal price,Raiting raiting) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.raiting = raiting;
    }
    public Product(int id, String name, BigDecimal price) {
        this(id,name,price,NOT_RATED);
    }
}
