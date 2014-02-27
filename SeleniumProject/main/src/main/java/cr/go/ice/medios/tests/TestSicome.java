package cr.go.ice.medios.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSicome {
	protected final static WebDriver driver = new FirefoxDriver();
	protected final static String host = "http://dizuni1:r383ki1az0@cer.infocom.ice/iceMedios/";
	
	@Before
	public void before(){
		driver.get(host);
	}
	
	@After
	public void after(){
	}
}

