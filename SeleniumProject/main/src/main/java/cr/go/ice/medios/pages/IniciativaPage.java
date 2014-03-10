package cr.go.ice.medios.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class IniciativaPage {
	private final WebDriver driver;
	private final Wait<WebDriver> wait;

	public IniciativaPage(WebDriver driver) {
		this.driver = driver;
		
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		wait = fluentWait
					.withTimeout(60, TimeUnit.SECONDS)
					.pollingEvery(2, TimeUnit.SECONDS);
	}
	
	public void login(){
		String tmpTitle = "Sistema gesti\u00f3n de medios";
		wait.until(ExpectedConditions.titleIs(tmpTitle));
		
	}
	
	public void fluentWait(final By locator, final String argText) {
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	            .withTimeout(60, TimeUnit.SECONDS)
	            .pollingEvery(5, TimeUnit.SECONDS)
	            .ignoring(NoSuchElementException.class);

	    WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	        public WebElement apply(WebDriver driver) {
	        	
	        	WebElement tmpElement = driver.findElement(locator);
	        	new Select(tmpElement).selectByValue(argText);
	            return tmpElement;
	        }
	    });

	};
	
	public void fluentWaitInput(final By argInputSelect) {
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	            .withTimeout(60, TimeUnit.SECONDS)
	            .pollingEvery(5, TimeUnit.SECONDS)
	            .ignoring(NoSuchElementException.class);

	    WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	        public WebElement apply(WebDriver driver) {
	        	
	        	WebElement tmpElement = driver.findElement(argInputSelect);
	            return tmpElement;
	        }
	    });

	};
	
	public void openFormIniciativa(){		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Iniciativas']")).click();
		driver.findElement(By.xpath("//span[text()='Iniciativas']")).click();		
		driver.findElement(By.id("listCampCampana:btnInsertar")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:txt_nombreCampana")).clear();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:txt_nombreCampana")).sendKeys("iniciativaselenB2");
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:fechaInicio_cb")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='formIniIniciativa:tabSetIniIniciativa:0:fechaInicio_ct']")));
	    driver.findElement(By.xpath("//table[@id='formIniIniciativa:tabSetIniIniciativa:0:fechaInicio_ct']//span[text()=15]")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:fechaInicio_cb")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:fechaFin_cb")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='formIniIniciativa:tabSetIniIniciativa:0:fechaFin_ct']//span[text()='25']")));
	    driver.findElement(By.xpath("//table[@id='formIniIniciativa:tabSetIniIniciativa:0:fechaFin_ct']//span[text()=25]")).click();
	    driver.findElement(By.id("formIniIniciativa:btnContinuar")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:fechaFin_cb")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.id("formIniIniciativa:tabSetIniIniciativa:0:cambiarSector"))); 
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:orgSector")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[text()='TELECOMUNICACIONES']")));
	    fluentWait(By.id("formIniIniciativa:tabSetIniIniciativa:0:orgSector"), "OrgSector[id=50050]");
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:orgDireccion")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[text()='Negocio Comunicaci\u00f3n']")));
	    fluentWait(By.id("formIniIniciativa:tabSetIniIniciativa:0:orgDireccion"), "OrgDireccion[id=52152]");
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:somNegocio")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[text()='Comunicaci\u00f3n']")));
	    fluentWait(By.id("formIniIniciativa:tabSetIniIniciativa:0:somNegocio"), "NegNegocio[id=5]");
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[@value='OrgProceso[id=51353]' and text()='Negocio Comunicaci\u00f3n']")));
	    fluentWait(By.id("formIniIniciativa:tabSetIniIniciativa:0:orgProceso"), "OrgProceso[id=51353]");
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:inputTextCampCampanaPresupuestoEstimado")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:inputTextCampCampanaPresupuestoEstimado")).clear();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:inputTextCampCampanaPresupuestoEstimado")).sendKeys("100000000");
	    driver.findElement(By.id("formIniIniciativa:btnInsertarIniciativa")).click();
	    driver.findElement(By.id("popupFormAudit:txt_observacion")).clear();
	    driver.findElement(By.id("popupFormAudit:txt_observacion")).sendKeys("Iniciativa nueva Selenium IDE testing");
	    driver.findElement(By.id("popupFormAudit:btnAcepptConfirmation")).click();

	}
}
