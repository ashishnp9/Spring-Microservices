/**
 * 
 */
package com.example.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Ashish.Patel
 *
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ExchangeValue {

	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private int port;
	
}
