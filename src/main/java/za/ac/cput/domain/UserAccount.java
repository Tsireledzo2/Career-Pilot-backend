package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserAccount {
    @Id
    private String accountID;
    private String userTypeName;
    private String email;
    private String password;

    public UserAccount(){}
    public UserAccount(Builder builder){
        this.accountID = builder.accountID;
        this.userTypeName = builder.userTypeName;
        this.email = builder.email;
        this.password = builder.password;
    }
    public String getAccountID() {
        return accountID;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "accountID='" + accountID + '\'' +
                ", userTypeName='" + userTypeName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder{
        private String accountID;
        private String userTypeName;
        private String email;
        private String password;

        public Builder setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }

        public Builder setUserTypeName(String userTypeName) {
            this.userTypeName = userTypeName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }
        public Builder copy(UserAccount userAccount){
            this.accountID = userAccount.accountID;
            this.userTypeName = userAccount.userTypeName;
            this.email = userAccount.email;
            this.password = userAccount.password;
            return this;
        }
        public UserAccount build(){return new UserAccount(this);}
    }
}
