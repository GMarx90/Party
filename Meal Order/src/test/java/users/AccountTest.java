package users;

import org.junit.jupiter.api.Test;

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
    }
@Test
    void newCreatedAccountShouldNotHaveAddressSet(){
        //when
    Address address = account.getAddess();
    //then
    assertNull(address);

}

@Test
    void CreatedAccountShouldHaveAddressAfterSetAddress(){
        //given
        Address address =new Address("Krakowska","23/6");
        Account account = new Account();

        //when
    Address address1= account.setAddress();

    //then
    assertNotNull(address1);

}

}