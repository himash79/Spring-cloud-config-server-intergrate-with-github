package lk.himash.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.himash.entity.Monitor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1/partsApi")
@Slf4j
public class PartsController {
	
	@GetMapping("/getAllDetails")
	public List<Monitor> getAllDetails() {
		List<Monitor> monitors = new ArrayList<>();
		for(int i=0; i<5; i++) {
			monitors.add(new Monitor("MO_" + i,"Brand_" + i,"Model_" + i, i * 2500));
		}
		log.info(monitors.toString());
		return monitors;
	}

}
