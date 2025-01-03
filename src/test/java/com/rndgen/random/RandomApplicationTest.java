package com.rndgen.random;

import com.rndgen.random.model.RandomNumber;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
		useMainMethod = SpringBootTest.UseMainMethod.ALWAYS)
class RandomApplicationTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void testRandomNumberEndpoint() {
		var entity = restTemplate.getForEntity("/random", RandomNumber.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(entity.getBody().number()).isPositive();
	}

}
