package br.com.desafiobionexo.bionexo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class BionexoApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Test
	public void ShoulReturnNotNullValue() throws Exception {

		mvc.perform(get("/api/v1/ubs/location")
				.param("lat","-23.999262")
				.param("lng","-46.424647")
				.param("qtd","10")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", notNullValue()));
	}

	@Test
	public void ShoulReturnFiveLocations() throws Exception {

		mvc.perform(get("/api/v1/ubs/location")
				.param("lat","-23.999262")
				.param("lng","-46.424647")
				.param("qtd","5")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", hasSize(5)));
	}

	@Test
	public void ShoulReturnTwentyLocations() throws Exception {

		mvc.perform(get("/api/v1/ubs/location")
				.param("lat","-23.999262")
				.param("lng","-46.424647")
				.param("qtd","20")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", hasSize(20)));
	}

	@Test
	public void ShoulReturnBadRequest() throws Exception {

		mvc.perform(get("/api/v1/ubs/location")
				.param("lat","abc")
				.param("lng","-46.424647")
				.param("qtd","20")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isBadRequest());
	}

	@Test
	public void ShoulReturnAllValues() throws Exception {

		mvc.perform(get("/api/v1/ubs/all")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", notNullValue()));
	}
}
