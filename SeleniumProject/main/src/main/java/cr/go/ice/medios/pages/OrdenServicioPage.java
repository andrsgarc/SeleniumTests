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

public class OrdenServicioPage {
	private final WebDriver driver;
	private final Wait<WebDriver> wait;

	public OrdenServicioPage(WebDriver driver) {
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
	
	
	public void openFormSerOrdenServicio() throws InterruptedException{		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[text()='Orden de servicio']")).click();
		driver.findElement(By.xpath("//span[text()='Orden de servicio']")).click();
		driver.findElement(By.id("listSerOrdenServicio:btnInsertarSerOrdenServicio")).click();
	    driver.findElement(By.id("formSerOrdenServicio:txt_numeroOrden")).clear();
	    driver.findElement(By.id("formSerOrdenServicio:txt_numeroOrden")).sendKeys("345198");
	    driver.findElement(By.id("formSerOrdenServicio:txt_contratacion")).clear();
	    driver.findElement(By.id("formSerOrdenServicio:txt_contratacion")).sendKeys("45936801");
	    driver.findElement(By.id("formSerOrdenServicio:txt_compromiso")).clear();
	    driver.findElement(By.id("formSerOrdenServicio:txt_compromiso")).sendKeys("2109-8477-5999");
	    driver.findElement(By.id("formSerOrdenServicio:btnInsertarRazonSocial")).click();
	    
	    driver.findElement(By.id("popupListMedRazonSocial:dtMedRazonSocial:0:btnSelect")).click();
	    Thread.sleep(500);
	    fluentWait(By.id("formSerOrdenServicio:cmbSector"), "OrgSector[id=50050]");
	    Thread.sleep(500);
	    fluentWait(By.id("formSerOrdenServicio:cmbDireccion"), "OrgDireccion[id=52152]");
	    Thread.sleep(500);
	    fluentWait(By.id("formSerOrdenServicio:cmbNegocio"), "NegNegocio[id=5]");
	    Thread.sleep(500);
	    fluentWait(By.id("formSerOrdenServicio:cmbProceso"), "OrgProceso[id=51353]");

	    driver.findElement(By.id("formSerOrdenServicio:txt_montoTotal")).click();
	    driver.findElement(By.id("formSerOrdenServicio:txt_montoTotal")).clear();
	    driver.findElement(By.id("formSerOrdenServicio:txt_montoTotal")).sendKeys("1000000");
	    driver.findElement(By.id("formSerOrdenServicio:txt_montoSaldo")).click();
	    driver.findElement(By.id("formSerOrdenServicio:txt_montoSaldo")).clear();
	    driver.findElement(By.id("formSerOrdenServicio:txt_montoSaldo")).sendKeys("1000000");
	    driver.findElement(By.id("formSerOrdenServicio:btnGuardarSerOrdenServicio")).click();		
	}
}
