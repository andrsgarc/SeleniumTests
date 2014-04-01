package cr.go.ice.medios.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrdenPagoPage extends MainPage {

	public OrdenPagoPage(WebDriver driver) {
		super(driver);
	}
	
	
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
	    driver.findElement(By.id("popupListSerOrdenServicio:txtNumeroOrden")).sendKeys(ORDEN_SERVICIO_PAUTA_NUMERO);
	    driver.findElement(By.id("popupListSerOrdenServicio:btnConsultar")).click();
	    driver.findElement(By.xpath("//input[@src='/ice-medios-web/imagenes/botones/addList.png']")).click();
	    ///ice-medios-web/imagenes/botones/addList.png
	    driver.findElement(By.id("formPagOrdenPago:btnBuscarRazon")).click();
	    driver.findElement(By.id("popupListMedRazonSocial:dtMedRazonSocial:0:btnSelect")).click();

	    driver.findElement(By.id("formPagOrdenPago:dtPauOrdenPauta:btnSelectAllPautas")).click();
	    driver.findElement(By.id("formPagOrdenPago:btnInsertar")).click();	    
	    

	}
}
