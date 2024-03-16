import javax.persistence.*;

@MappedSuperclass
public class AuditableEntity {
    
    @Column(name = "created_by")
    private String createdBy;
    
    // Other auditing fields like createdDate, modifiedBy, etc. can be added here
    
    // Getters and Setters
    
    public String getCreatedBy() {
        return createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    // Override setter to automatically set createdBy if not provided
    public void setCreatedByIfNotProvided(String createdBy) {
        if (this.createdBy == null) {
            this.createdBy = createdBy;
        }
    }
}
