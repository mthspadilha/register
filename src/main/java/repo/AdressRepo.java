package repo;

import model.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepo extends JpaRepository<Adress, Long> {

}
