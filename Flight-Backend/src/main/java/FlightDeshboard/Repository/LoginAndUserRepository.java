package FlightDeshboard.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import FlightDeshboard.Model.User;

@Repository
public interface LoginAndUserRepository  extends JpaRepository<User,Long>{

	Optional<User> findByUsername(String username);


}
