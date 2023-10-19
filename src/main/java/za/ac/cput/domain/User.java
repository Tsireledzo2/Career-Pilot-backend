package za.ac.cput.domain;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    public Long userID;
    private String userName;
    private String location;
    private String jobSpec;
    private int experience;
    private String description;
    private  String profilePath;
}
