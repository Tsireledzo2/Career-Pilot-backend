package za.ac.cput.factory;

import za.ac.cput.domain.UserAccount;

public class UserAccountFactory {
    public static UserAccount buildUserAccount(String accountID,
                                               String userTypeName,String email,
                                               String password)
    {
        UserAccount userAccount = new UserAccount.Builder()
                .setAccountID(accountID)
                .setUserTypeName(userTypeName)
                .setEmail(email)
                .setPassword(password)
                .build();
        return userAccount;
    }
}
