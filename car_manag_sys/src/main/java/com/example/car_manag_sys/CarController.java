@RestController 
@RequestMapping("/api/cars") 
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService; 
    }

    @PostMapping 
    public ResponseEntity<Car> createCar(@RequestBody Car car) { 
        return ResponseEntity.ok(carService.addCar(car)); 
    }

    @GetMapping
    public ResponseEntity<List<Car>> getAllCars() { 
        return ResponseEntity.ok(carService.getAllCars()); 
    }

    // Implement API endpoints for update, delete, search 
}