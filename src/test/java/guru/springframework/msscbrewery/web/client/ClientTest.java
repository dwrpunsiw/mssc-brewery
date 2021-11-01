package guru.springframework.msscbrewery.web.client;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ClientTest {

    @Autowired
    CustomerClient customerClient;

    @Autowired
    BreweryClient brewerClient;

    @Test
    void getBeerById() {

        BeerDto dto = brewerClient.getBeerById(UUID.randomUUID());

        assertNotNull(dto);

    }

    @Test
    void testSavedNewBeer() {
        BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();

        URI uri = brewerClient.saveNewBeer(beerDto);

        assertNotNull(uri);

        System.out.println(uri.toString());

    }

    @Test
    void testUpdateBeer() {
        BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();
        brewerClient.updateBeer(UUID.randomUUID(), beerDto);
    }

    @Test
    void testDeleteBeer() {
        brewerClient.deleteBeer(UUID.randomUUID());
    }

    @Test
    void getCustomerById() {

        CustomerDto dto = customerClient.getCustomerById(UUID.randomUUID());

        assertNotNull(dto);

    }

    @Test
    void saveNewCustomer() {

        CustomerDto newCustomer = CustomerDto.builder().customerName("Wisnu Prasojo Widianto").build();

        URI uri = customerClient.saveNewCustomer(newCustomer);

        System.out.println(uri.toString());

    }

    @Test
    void updateCustomer() {

        CustomerDto customerDto = CustomerDto.builder().customerName("Wisnu Prasojo Widianto").build();

        customerClient.updateCustomer(UUID.randomUUID(), customerDto);

    }

    @Test
    void deleteCustomer() {

        customerClient.deleteCustomer(UUID.randomUUID());

    }


}
