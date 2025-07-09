package FlightDeshboard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import FlightDeshboard.Model.Flight;
import FlightDeshboard.Service.FlightService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/flight")
public class FlightController {
	
	@Autowired
	 private FlightService flightservice;
	@GetMapping("/getflights")
	public ResponseEntity<List<Flight>>getFlight(){
		List<Flight> flight=flightservice.getFlight();
		return new  ResponseEntity<List<Flight>>(flight,HttpStatus.OK);
	}
	@PostMapping("/addflights")
	public ResponseEntity<Flight> addFlight(@RequestBody Flight flight){
		Flight flight1=flightservice.addFlight(flight);
		return new  ResponseEntity<Flight>( flight1,HttpStatus.OK);
	}
}