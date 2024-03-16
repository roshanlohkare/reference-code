import javax.persistence.*;

@Entity
@Table(name = "your_entity")
public class YourEntity extends AuditableEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // Other entity fields
    
    // Constructor, Getters and Setters
    
    // Override setter for createdBy
    @Override
    public void setCreatedBy(String createdBy) {
        super.setCreatedByIfNotProvided(createdBy);
    }
}
