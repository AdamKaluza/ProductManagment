package labs.pm.app;

import labs.pm.data.*;

import java.math.BigDecimal;
import java.util.Locale;

public class Shop {
    public static void main(String[] args) {

        ProductManager pm = new ProductManager(Locale.UK);

        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99),Rating.NOT_RATED);
        pm.printProductReport(p1);
        pm.reviewProduct(p1, Rating.FOUR_STAR,"Nice Hot cup of tea");
        pm.reviewProduct(p1, Rating.TWO_STAR,"Rather weak tea");
        pm.reviewProduct(p1, Rating.FOUR_STAR,"Fine tea");
        pm.reviewProduct(p1, Rating.FOUR_STAR,"Goood tea");
        pm.reviewProduct(p1, Rating.FIVE_STAR,"Perfect");
        pm.reviewProduct(p1, Rating.THREE_STAR,"Add some lemon");
        pm.printProductReport(p1);

        Product p2 = pm.createProduct(102,"Coffee",BigDecimal.valueOf(1.99),Rating.NOT_RATED);
        p2 = pm.reviewProduct(p2,Rating.THREE_STAR,"coffee was ok");
        p2 = pm.reviewProduct(p2,Rating.ONE_STAR,"coffee was terrible");
        p2 = pm.reviewProduct(p2,Rating.FIVE_STAR,"Perfect with spoons of sugar");
        pm.printProductReport(p2);
//        Product p2 = pm.createProduct(102, "Coffe", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
//        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p4 = pm.createProduct(105,"Cookie",BigDecimal.valueOf(3.99),Rating.TWO_STAR,LocalDate.now());
//        Product p5 = p3.applyRating(Rating.THREE_STAR);
//        Product p6 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
//        Product p7 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p8 = p4.applyRating(Rating.FIVE_STAR);
//        Product p9 = p1.applyRating(Rating.ONE_STAR);
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//        System.out.println(p6);
//        System.out.println(p7);
//        System.out.println(p8);
//        System.out.println(p9);


    }
}
