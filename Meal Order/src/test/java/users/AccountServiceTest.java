package users;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;

class AccountServiceTest {

    @Test
    void getAllActiveAccounts() {
        AccountRepository accountRepositoryStub=new AccountRepositoryStub();
    AccountService accountService= new AccountService(accountRepositoryStub);
        List<Account> activeAccount=accountService.getAllActiveAccounts();
assertThat(accountService.getAllActiveAccounts(),hasSize(2));
assertThat(activeAccount.size(),equalTo(2));


    }
}