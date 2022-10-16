package lk.himash.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Monitor {
	
	private String id;
	private String brand;
	private String model;
	private double cost;

}
