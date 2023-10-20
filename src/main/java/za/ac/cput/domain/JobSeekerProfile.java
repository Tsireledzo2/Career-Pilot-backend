package za.ac.cput.domain;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
public class JobSeekerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int JobSeekerProfileId;
    private String firstName;
    private String lastName;
    private String Address;
    private String Email;

    @OneToMany(mappedBy = "jobSeekerProfile", cascade = CascadeType.ALL)
    private List<Education> educations;

    @OneToMany(mappedBy = "jobSeekerProfile", cascade = CascadeType.ALL)
    private List<Experience> experiences;
    public JobSeekerProfile() {
    }

    public int getJobSeekerProfileId() {
        return JobSeekerProfileId;
    }

    public void setJobSeekerProfileId(int jobSeekerProfileId) {
        JobSeekerProfileId = jobSeekerProfileId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}

