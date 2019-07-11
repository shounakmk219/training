package slf4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarServices {

	private Logger logger=LoggerFactory.getLogger(CarServices.class);
	public void process(String msg) {
		logger.debug("processing car in debug: {}",msg);
		logger.error("processing car in error: {}",msg);
		logger.info("processing car in info: {}",msg);
	}
}
