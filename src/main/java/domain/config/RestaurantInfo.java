package domain.config;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name = "Restaurant")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestaurantInfo {


    private String restaurantName;

    @Embedded
    private List<Item> items = new ArrayList<>();

    @JsonCreator
    public RestaurantInfo(@JsonProperty("restaurantName") String restaurantName,
                      @JsonProperty("Item") List<Item> items) {
        this.restaurantName = restaurantName;
        this.items = items;
    }

    public RestaurantInfo(){
    }

}
