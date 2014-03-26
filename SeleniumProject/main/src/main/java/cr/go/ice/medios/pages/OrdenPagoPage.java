package cr.go.ice.medios.pages;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class OrdenPagoPage {
	private final WebDriver driver;
	private final Wait<WebDriver> wait;

	public OrdenPagoPage(WebDriver driver) {
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
	
	
	public void openFormPagOrdenPago() throws InterruptedException{		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	    
	    driver.findElement(By.xpath("//span[text()='Orden de pago']")).click();
		driver.findElement(By.xpath("//span[text()='Orden de pago' and contains(@id,'pagRoot:pagOrdenPago:out')]")).click();
			
	    //btnInsertarOrdenPago
	    
		driver.findElement(By.id("formPagOrdenPago:btnInsertarOrdenPago")).click();

		Thread.sleep(500);
	    fluentWait(By.id("formPagOrdenPago:cmbCentroFuncional"), "PagCentroFuncional[id=50350]");
	    Thread.sleep(500);
	    driver.findElement(By.id("formPagOrdenPago:txtConceptoPago")).clear();
	    driver.findElement(By.id("formPagOrdenPago:txtConceptoPago")).sendKeys("Pago Ordenes Testing");
	    driver.findElement(By.id("formPagOrdenPago:btnBuscarOrden")).click();
	    driver.findElement(By.id("popupListSerOrdenServicio:txtNumeroOrden")).clear();
	    driver.findElement(By.id("popupListSerOrdenServicio:txtNumeroOrden")).sendKeys("375199");
	    driver.findElement(By.id("popupListSerOrdenServicio:btnConsultar")).click();
	    driver.findElement(By.xpath("//input[@src='/ice-medios-web/imagenes/botones/addList.png']")).click();
	    ///ice-medios-web/imagenes/botones/addList.png
	    driver.findElement(By.id("formPagOrdenPago:btnBuscarRazon")).click();
	    driver.findElement(By.id("popupListMedRazonSocial:dtMedRazonSocial:0:btnSelect")).click();

	    driver.findElement(By.id("formPagOrdenPago:dtPauOrdenPauta:btnSelectAllPautas")).click();
	    driver.findElement(By.id("formPagOrdenPago:btnInsertar")).click();	    
	    

	}
}
