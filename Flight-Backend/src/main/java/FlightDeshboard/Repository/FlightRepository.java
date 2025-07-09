package FlightDeshboard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import FlightDeshboard.Model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Integer> {

}
