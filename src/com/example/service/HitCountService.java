package com.example.service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.bean.ResponseBean;
/**
 * 
 * @author Aniket
 *
 */
@Path("/hitCounterService")
public class HitCountService {
	
	private static int count;

	/**
	 * Returns the number of calls and timestamp in ResponseBean
	 * @return ResponseBean
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/hitCountAndTimestamp")
	public ResponseBean getCounterAndTimestamp() {
		
		ResponseBean responseBean = new ResponseBean();
		responseBean.setCalls(++count);
		responseBean.setTimestamp(ZonedDateTime.now().format(DateTimeFormatter.ISO_INSTANT));
		
		return responseBean;
	}
}
