package users;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

class AccountServiceTestMock {

    @Test
    void getAllActiveAccounts() {

        List<Account> accounts = prepareAccountData();
        AccountRepository accountRepository = mock(AccountRepository.class);
        AccountService accountService = new AccountService(accountRepository);
        given(accountRepository.getAllAccounts()).willReturn(accounts);

        List<Account> accountList = accountService.getAllActiveAccounts();

        assertThat(accountList,containsString("account2"));
//        assertThat(accountService.getAllActiveAccounts(), hasSize(2));
//        assertThat(accountList.size(), equalTo(2));


    }

    public List<Account> prepareAccountData() {
        Address address = new Address("Katowicka", "321/1");
        Address address1 = new Address("Gliwicka", "214/3");
        Account account = new Account(address);
        Account account1 = new Account(address1);
        Account account2 = new Account();
        return Arrays.asList(account, account1, account2);
    }
}