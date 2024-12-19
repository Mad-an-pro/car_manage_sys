@Repository // Marks this interface as a Spring component
public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findByNameContainingIgnoreCase(String name); // Custom method for searching by name
    List<Car> findByModelContainingIgnoreCase(String model); // Custom method for searching by model
    List<Car> findByYear(int year); // Custom method for searching by year
}