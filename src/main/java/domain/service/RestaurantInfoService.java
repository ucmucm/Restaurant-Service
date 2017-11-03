package domain.service;

import domain.config.RestaurantInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RestaurantInfoService {

    List<RestaurantInfo> saveRestaurantInfos(List<RestaurantInfo> restaurantInfos);
    Page<RestaurantInfo> findByRestaurantName(String restaurantName, Pageable pageable);

}
