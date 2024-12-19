@Entity // Tells JPA that this class represents an entity
@Table(name = "cars") // Specifies the table name in the database

public class Car {

    @Id // Marks this field as the primary key (unique identifier)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically generates the ID value
    private Long id; 

    private String name; 
    private String model;
    private int year;
    private double price;
    private String color;
    private String fuelType;

    // Getters and Setters (using Lombok)
}