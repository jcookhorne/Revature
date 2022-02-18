package mavendemo;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {
	
	
	final double PI = 3.14;
	// finals make things into constants
	static final Logger LOG = LogManager.getLogger(HelloWorld.class);

	public static void main(String[] args) {
		System.out.println("Hello World!");
		// TODO Auto-generated method stub
		LOG.fatal("fatal logged");
		LOG.trace("trace logged");
		LOG.info("info Logged");
		LOG.debug("debug logged");
		LOG.error("error logged");
		LOG.warn("warn logged");
		
	}

}
