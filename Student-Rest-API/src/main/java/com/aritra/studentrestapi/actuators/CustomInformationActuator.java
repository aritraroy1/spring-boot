/**
 * 
 */
package com.aritra.studentrestapi.actuators;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * @author Aritra
 *
 */
@Component
public class CustomInformationActuator implements InfoContributor {

	@Override
	public void contribute(Builder builder) {

		builder.withDetail("NoOFUsers", 1).build();
		
	}
	
	

}
