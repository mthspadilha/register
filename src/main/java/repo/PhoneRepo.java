package repo;

import model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepo extends JpaRepository<Phone, Long> {

}
