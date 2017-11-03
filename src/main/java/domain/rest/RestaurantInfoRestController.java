package domain.rest;

import domain.config.RestaurantInfo;
import domain.service.RestaurantInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantInfoRestController {

    private RestaurantInfoService service;

    @Autowired
    public RestaurantInfoRestController(RestaurantInfoService service){
        this.service = service;
    }

    @RequestMapping(value = "/restaurant", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void upload(@RequestBody List<RestaurantInfo> restaurantInfos){
        this.service.saveRestaurantInfos(restaurantInfos);
    }



    @RequestMapping(value = "/restaurant", method = RequestMethod.GET)
    public Page<RestaurantInfo> findByRestaurantName(@PathVariable String restaruantName, @RequestParam(name = "page") int page, @RequestParam(name = "size") int size){
        return this.service.findByRestaurantName(restaruantName, new PageRequest(page,size));
    }

}
