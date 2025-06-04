package mini.project.track_mate.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String source;
    private Double amount;
    private LocalDate date;
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

   public Long getId() {
       return id;
   }

   public void setId(Long id) {
       this.id = id;
   }

   public String getSource() {
       return source;
   }

   public void setSource(String source) {
       this.source = source;
   }

   public Double getAmount() {
       return amount;
   }

   public void setAmount(Double amount) {
       this.amount = amount;
   }

   public LocalDate getDate() {
       return date;
   }

   public void setDate(LocalDate date) {
       this.date = date;
   }

}
