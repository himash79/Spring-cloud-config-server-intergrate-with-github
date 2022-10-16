package lk.himash.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lk.himash.dto.Monitor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1/monitorApi")
@RequiredArgsConstructor
@Slf4j
public class monitorController {

	@Lazy
	private final RestTemplate restTemplate;
	
	@Value("${service.provider.url}")
	private String url;
	
	@GetMapping("/getAllDetails")
	public List<Monitor> getPlans() throws JsonMappingException, JsonProcessingException {
		log.info("URL : " + url);
		ObjectMapper mapper = new ObjectMapper();
		ResponseEntity<String> result = null;
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		result = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		List<Monitor> todos = mapper.readValue(result.getBody(), new TypeReference<List<Monitor>>(){});
		return todos;
	}
	
}
