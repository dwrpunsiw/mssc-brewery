package guru.springframework.msscbrewery.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.msscbrewery.services.BeerService;
import guru.springframework.msscbrewery.web.model.BeerDto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

@RunWith(SpringRunner.class)
@WebMvcTest(BeerController.class)
public class BeerControllerTest {

//    @MockBean
//    BeerService beerService;
//
//    @Autowired
//    MockMvc mockMvc;
//
//    @Autowired
//    ObjectMapper objectMapper;
//
//    BeerDto validBeer;
//
//    @Before
//    public void setUp() {
//        validBeer = BeerDto.builder().id(UUID.randomUUID())
//                .beerName("Beer1")
//                .beerStyle("PALE_ALE")
//                .upc(123456789012L)
//                .build();
//    }
//
//    @Test
//    public void getBeer() throws Exception {
//        given(beerService.getBeerById(any(UUID.class))).willReturn(validBeer);
//
//        mockMvc.perform(get("/api/v1/beer/" + validBeer.getId().toString()).acc)
//
//    }


}
