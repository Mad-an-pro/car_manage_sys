@Service // Marks this class as a Spring component
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) { 
        this.carRepository = carRepository; 
    }

    public Car addCar(Car car) {
        // Validate car details (e.g., check for null values, invalid inputs)
        return carRepository.save(car); 
    }

    public List<Car> getAllCars() {
        return carRepository.findAll(); 
    }

    // Implement update, delete, search methods here 
}
