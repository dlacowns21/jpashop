package jpabook.jpashop.Controller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookForm {

    private Long id;

    private String name;
    private int price;
    private int StockQuantity;

    private String author;
    private String isbn;
}
