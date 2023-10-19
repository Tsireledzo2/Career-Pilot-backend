package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobPost {
    @Id
    @GeneratedValue
    public Long companyID;
    private String location;
    private String jobOffering;
    private String establishedIn;
    private int employees;
}
