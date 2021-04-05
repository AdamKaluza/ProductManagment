package labs.pm.data;

import java.math.BigDecimal;

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
        this(id,name,price, Raiting.NOT_RATED);
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    public Raiting getRaiting() {
        return raiting;
    }

    public void setRaiting(Raiting raiting) {
        this.raiting = raiting;
    }


}
