package FlightDeshboard.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FlightDeshboard.Model.Flight;
import FlightDeshboard.Repository.FlightRepository;

@Service
public class FlightService {
	@Autowired
	private FlightRepository flightrepo;

	public List<Flight> getFlight() {
		return flightrepo.findAll();
	}
	public Flight addFlight(Flight flight) {
		return flightrepo.save(flight);
	}
}