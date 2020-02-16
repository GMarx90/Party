package users;

import java.util.Arrays;
import java.util.List;

public class AccountRepositoryStub implements AccountRepository {
    @Override
    public List<Account> getAllAccounts() {
        Address address = new Address("Katowicka","321/1");
        Address address1 = new Address("Gliwicka","214/3");
        Account account= new Account(address);
        Account account1=new Account(address1);
        Account account2=new Account();
        return Arrays.asList(account,account1,account2);
    }
}
