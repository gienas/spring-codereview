package pl.ene.springbootrestjpa.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 
 * @author neugeeug
 *
 */
@AllArgsConstructor
@Data
public  class Greeting {
	
	private long id;
	private String content;
	
}
