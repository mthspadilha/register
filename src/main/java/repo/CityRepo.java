package repo;

import model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface
CityRepo extends JpaRepository<City, Long> {

}
