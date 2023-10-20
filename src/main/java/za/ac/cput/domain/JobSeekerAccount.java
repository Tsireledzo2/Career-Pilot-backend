package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class JobSeekerAccount {
    @Id
    private String email;
    private String firstName;
    private String lastName;
    private String Address;
    private String password;
    private String userType;

    public JobSeekerAccount(){}
    public JobSeekerAccount(Builder builder){
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.Address = builder.Address;
        this.password = builder.password;
        this.userType = builder.userType;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return Address;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }

    @Override
    public String toString() {
        return "JobSeekerAccount{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Address='" + Address + '\'' +
                ", password='" + password + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }

    public static class Builder{
        private String email;
        private String firstName;
        private String lastName;
        private String Address;
        private String password;
        private String userType;

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAddress(String address) {
            Address = address;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setUserType(String userType) {
            this.userType = userType;
            return this;
        }

        public Builder copy(JobSeekerAccount jobSeekerAccount){
            this.email = jobSeekerAccount.email;
            this.firstName = jobSeekerAccount.firstName;
            this.lastName = jobSeekerAccount.lastName;
            this.Address = jobSeekerAccount.Address;
            this.password = jobSeekerAccount.password;
            this.userType = jobSeekerAccount.userType;
            return this;
        }
        public JobSeekerAccount build(){return new JobSeekerAccount(this);}
    }
}
