package users;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account account = new Account();

    @Test
    public void IsAccountNotActiveBeforeActivation() {
        assertFalse(account.isActive());
    }


    @Test
    public void IsAccountActiveAfterActivation() {
        //when
        account.activate();
        //then
        assertTrue(account.isActive());

/*        //przy użyciu assertThat;
        assertThat(account.isActive(), equalTo(false));
        assertThat((account.isActive(),is(false));*/
    }

    @Test
    void newCreatedAccountShouldNotHaveAddressSet() {
        //when
        Address address = account.getAddress();
        //then
        assertNull(address);
        //assertThat

        assertThat(account.getAddress(), nullValue());
    }

    @Test
    void CreatedAccountShouldHaveAddressAfterSetAddress() {
        //given
        Address address = new Address("Krakowska", "23/6");
        Account account = new Account();

        //when
        account.setAddress(address);
        //then
        assertNotNull(account.getAddress());
//assertThat
        assertThat(account.getAddress(),not(nullValue()));
    }

}