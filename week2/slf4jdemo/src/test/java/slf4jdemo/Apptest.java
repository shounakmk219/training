package slf4jdemo;

import static org.junit.Assert.*;

import org.junit.Test;


public class Apptest {
	@Test
	public void Test() {
		CarServices carServices=new CarServices();
		carServices.process("hey");
	}

}
