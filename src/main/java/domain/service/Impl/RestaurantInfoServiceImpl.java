package domain.service.Impl;

import domain.config.RestaurantInfo;
import domain.config.RestaurantRepository;
import domain.service.RestaurantInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantInfoServiceImpl implements RestaurantInfoService {

    private RestaurantRepository repository;

    @Autowired
    public RestaurantInfoServiceImpl(RestaurantRepository repository){
        this.repository = repository;
    }

    @Override
    public List<RestaurantInfo> saveRestaurantInfos(List<RestaurantInfo> restaurantInfos){
        return this.repository.save(restaurantInfos);
    }

    @Override
    public Page<RestaurantInfo> findByRestaurantName(String restaurantName, Pageable pageable){
        return repository.findByRestaurantName(restaurantName,pageable);
    }

}
