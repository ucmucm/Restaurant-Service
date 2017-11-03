package domain.config;

import domain.config.RestaurantInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Locale;

//@RepositoryRestResource(path = "restaurant")
public interface RestaurantRepository extends JpaRepository<RestaurantInfo, Long>{

    Page<RestaurantInfo> findByRestaurantName(@Param("restaurantName") String restName, Pageable pageable);

}
