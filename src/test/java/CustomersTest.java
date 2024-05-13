import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomersTest {

    Customers customer;


    @BeforeEach

    public void setUp(){
        customer = new Customers("John",5);


    }


    @Test

    public void checkGetName(){
        String actualName = customer.getName();
        assertThat("John").isEqualTo(actualName);



    }

    @Test

    public void checkGetMoney(){
        assertThat(customer.getMoney()).isEqualTo(5);

    }

    @Test

    public void canSetWallet(){
        customer.setMoney(6);
        assertThat(customer.getMoney()).isEqualTo(6);
    }






}
