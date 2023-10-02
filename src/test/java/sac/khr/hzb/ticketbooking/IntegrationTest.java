package sac.khr.hzb.ticketbooking;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class IntegrationTest {

	@Autowired
	  private MockMvc mockMvc;

	  @Test
	  void testGetInfo() throws Exception {

	    mockMvc.perform(get("/api/v1/metro/info?fromStnId=stn-1&toStnId=stn-20&numberOfTickets=5")
	            .contentType("application/json")
	            .param("fromStnId", "stn-1")
			    .param("toStnId", "stn-20")
			    .param("numberOfTickets", "5"))
	            .andExpect(status().isOk());

	    
	  }
}
