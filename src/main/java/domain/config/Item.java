package domain.config;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Embeddable
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {

    @Id
    @GeneratedValue
    private int itemId;

    private String itemName;
    private Double price;
    private String category;

    public Item(int itemId){
        this.itemId = itemId;
    }

    public Item(String itemName, Double price, String category) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
    }
}
