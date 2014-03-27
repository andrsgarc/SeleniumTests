package cr.go.ice.medios.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IniciativaPage extends MainPage {

	
	
	public IniciativaPage(WebDriver driver) {
		super(driver);
	}


	public void openFormIniciativa() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Iniciativas']")).click();
		driver.findElement(By.xpath("//span[text()='Iniciativas']")).click();		
		driver.findElement(By.id("listCampCampana:btnInsertar")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:txt_nombreCampana")).clear();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:txt_nombreCampana")).sendKeys(INICIATIVA_NAME);
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:fechaInicio_cb")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='formIniIniciativa:tabSetIniIniciativa:0:fechaInicio_ct']//span[text()=1]")));
	    driver.findElement(By.xpath("//table[@id='formIniIniciativa:tabSetIniIniciativa:0:fechaInicio_ct']//span[text()=1]")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:fechaFin_cb")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='formIniIniciativa:tabSetIniIniciativa:0:fechaFin_ct']//span[text()=28]")));
	    driver.findElement(By.xpath("//table[@id='formIniIniciativa:tabSetIniIniciativa:0:fechaFin_ct']//span[text()=28]")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='formIniIniciativa:tabSetIniIniciativa:0:fechaFin' and contains(@value, '28')]")));

	    driver.findElement(By.id("formIniIniciativa:btnContinuar")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:fechaInicio_cb")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='formIniIniciativa:tabSetIniIniciativa:0:fechaInicio' and contains(@value, '1')]")));

	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.id("formIniIniciativa:tabSetIniIniciativa:0:cambiarSector"))); 
	    	    
	    Thread.sleep(1000);
	    fluentWait(By.id("formIniIniciativa:tabSetIniIniciativa:0:orgSector"), "OrgSector[id=50050]");
	    Thread.sleep(1000);
	    fluentWait(By.id("formIniIniciativa:tabSetIniIniciativa:0:orgDireccion"), "OrgDireccion[id=52152]");
	    Thread.sleep(1000);
	    fluentWait(By.id("formIniIniciativa:tabSetIniIniciativa:0:somNegocio"), "NegNegocio[id=5]");
	    Thread.sleep(1000);
	    fluentWait(By.id("formIniIniciativa:tabSetIniIniciativa:0:orgProceso"), "OrgProceso[id=51353]");
	    
	    
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:inputTextCampCampanaPresupuestoEstimado")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:inputTextCampCampanaPresupuestoEstimado")).clear();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:inputTextCampCampanaPresupuestoEstimado")).sendKeys("100000000");
	    driver.findElement(By.id("formIniIniciativa:btnInsertarIniciativa")).click();
	    driver.findElement(By.id("popupFormAudit:txt_observacion")).clear();
	    driver.findElement(By.id("popupFormAudit:txt_observacion")).sendKeys("Iniciativa nueva Selenium IDE testing");
	    driver.findElement(By.id("popupFormAudit:btnAcepptConfirmation")).click();

	}
	
	
	public void crearCampannia() throws InterruptedException
	{	

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Iniciativas']")).click();
		driver.findElement(By.xpath("//span[text()='Iniciativas']")).click();		
		driver.findElement(By.id("listCampCampana:txtNombreIniciativa")).clear();
	    driver.findElement(By.id("listCampCampana:txtNombreIniciativa")).sendKeys(INICIATIVA_NAME);
	    driver.findElement(By.id("listCampCampana:btnConsultarIniciativa")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@src='/ice-medios-web/imagenes/botones/editar_campana.gif']")));
	    driver.findElement(By.xpath("//input[@src='/ice-medios-web/imagenes/botones/editar_campana.gif']")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.id("formIniIniciativa:tabSetIniIniciativa:0:txt_nombreCampana")));
	    driver.findElement(By.id("formIniIniciativa:btnCrearCampanna")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='formIniIniciativa:tabSetIniIniciativa:0.2']")));
	    driver.findElement(By.xpath("//a[@id='formIniIniciativa:tabSetIniIniciativa:0.2']")).click();
	    
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:fechaInicio_cb")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:fechaInicio_ct']")));
	    driver.findElement(By.xpath("//table[@id='formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:fechaInicio_ct']//span[text()=1]")).click();	    
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:fechaFin_cb")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:fechaFin_ct']")));
	    driver.findElement(By.xpath("//table[@id='formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:fechaFin_ct']//span[text()=28]")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:fechaFin_cb")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:fechaInicio_cb")).click();
	    
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_alcance")).clear();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_alcance")).sendKeys("Alcance descripcion");
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_descripcion")).clear();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_descripcion")).sendKeys("Descripcion de campannia de prueba");
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_descripcionRiesgo")).clear();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_descripcionRiesgo")).sendKeys("10");
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_objetivoEstrategico")).clear();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_objetivoEstrategico")).sendKeys("Objetivo estrategico1");
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_descripcionIndicador")).clear();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_descripcionIndicador")).sendKeys("IndicadorA");
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_porcentajeIndicador")).clear();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_porcentajeIndicador")).sendKeys("10");
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_descripcionMeta")).clear();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_descripcionMeta")).sendKeys("Metas cuantitativas1");
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_porcentajeMeta")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_porcentajeMeta")).clear();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_porcentajeMeta")).sendKeys("10");
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:btnInsertarIA")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:btnInsertarRiesgo")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:btnInsertarOE")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:btnInsertarMeta")).click();
	    
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:scbPorcentaje")).click();
	    
	    Thread.sleep(2000);
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:4') and not(@disabled)]")));

	    driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:0') and not(@disabled)]")).click();
	    
	    driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:0') and not(@disabled)]")).clear();
	    
	    driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:0') and not(@disabled)]")).sendKeys("20.00");
	    driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:0') and not(@disabled)]")).click();
	    driver.findElement(By.xpath("//span[text()='Total']")).click();
	    driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:0') and not(@disabled)]")).sendKeys("20.00");

driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:1') and not(@disabled)]")).click();
	    
	    driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:1') and not(@disabled)]")).clear();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Total']")).click();
	    driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:1') and not(@disabled)]")).sendKeys("20.00");
	    driver.findElement(By.xpath("//span[text()='Total']")).click();
	    
driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:2') and not(@disabled)]")).click();
	    
	    driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:2') and not(@disabled)]")).clear();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Total']")).click();
	    driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:2') and not(@disabled)]")).sendKeys("20.00");
	    driver.findElement(By.xpath("//span[text()='Total']")).click();
	    
driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:3') and not(@disabled)]")).click();
	    
	    driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:3') and not(@disabled)]")).clear();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Total']")).click();
	    driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:3') and not(@disabled)]")).sendKeys("20.00");
	    driver.findElement(By.xpath("//span[text()='Total']")).click();
	
driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:4') and not(@disabled)]")).click();
	    
	    driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:4') and not(@disabled)]")).clear();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Total']")).click();
	    driver.findElement(By.xpath("//input[starts-with(@id,'formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:4') and not(@disabled)]")).sendKeys("20.00");
	    driver.findElement(By.xpath("//span[text()='Total']")).click();

	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:btnGuardarCampannia")).click();
	    driver.findElement(By.id("popupFormAudit:txt_observacion")).clear();
	    driver.findElement(By.id("popupFormAudit:txt_observacion")).sendKeys("campannia inicial test Andres");
	    driver.findElement(By.id("popupFormAudit:btnAcepptConfirmation")).click();		
		
	}
	
	public void ingresarCampannia()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Iniciativas']")).click();
		driver.findElement(By.xpath("//span[text()='Iniciativas']")).click();		
		driver.findElement(By.id("listCampCampana:txtNombreIniciativa")).clear();
		driver.findElement(By.id("listCampCampana:txtNombreIniciativa")).sendKeys(INICIATIVA_NAME);
		driver.findElement(By.id("listCampCampana:btnConsultarIniciativa")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@src='/ice-medios-web/imagenes/botones/editar_campana.gif']")));
	    driver.findElement(By.xpath("//input[@src='/ice-medios-web/imagenes/botones/editar_campana.gif']")).click();
	    
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='formIniIniciativa:tabSetIniIniciativa:0.2']")));
	    driver.findElement(By.xpath("//a[@id='formIniIniciativa:tabSetIniIniciativa:0.2']")).click();
		
		
	}
	
	public void crearCampanniaTarget() throws InterruptedException
	{
		ingresarCampannia();
	    Thread.sleep(1000);
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0.1']")));	    
	    driver.findElement(By.xpath("//a[@id='formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0.1']")).click();
	    
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txtMetaEdadMin")).clear();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txtMetaEdadMin")).sendKeys("10");
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txtMetaEdadMax")).clear();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txtMetaEdadMax")).sendKeys("20");
	    
	    fluentWait(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:cmbOcupacion"), "MedMetaOcupacion[id=51012]");
	    
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:checkMetaMujeres")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:btnRegion")).click();
	    
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Criterio de selecci\u00f3n']")));	    
	    fluentWait(By.id("popupFormOrgProvincia:cmbCriterioSeleccion"), "2");
	   
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Todo el pa\u00EDs']")));
	    
	   // driver.findElement(By.xpath("//input[starts-with(@id,'popupFormOrgProvincia:dtOrgRegion:0') and @type='image']")).click();
	    //driver.findElement(By.xpath("//input[starts-with(@id,'popupFormOrgProvincia:dtOrgRegion:0') and starts-with(@src,'/ice-medios-web/imagenes/botones/CheckBox_Normal.png')]")).click();
	    
	    driver.findElement(By.xpath("//input[@src='/ice-medios-web/imagenes/botones/aceptar.gif']")).click();

	    
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:btnGuardarTarget")).click();

	    driver.findElement(By.id("formIniIniciativa:btnInsertarIniciativa")).click();
	    driver.findElement(By.id("popupFormAudit:txt_observacion")).clear();
	    driver.findElement(By.id("popupFormAudit:txt_observacion")).sendKeys("Guardar target de campannia");
	    driver.findElement(By.id("popupFormAudit:btnAcepptConfirmation")).click();		
		
	}
	
	
	public void ejecutarCampannia()
	{
		ingresarCampannia();
	    
		driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:btnPorAprobarFwd")).click();
	    driver.findElement(By.id("confirmationPopup:btnAcepptConfirmation")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:btnAprobadoFwd")).click();
	    driver.findElement(By.id("confirmationPopup:btnAcepptConfirmation")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:btnEjecutarFwd")).click();
	    driver.findElement(By.id("confirmationPopup:btnAcepptConfirmation")).click();
	    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:btnGuardarCampannia")).click();
	    driver.findElement(By.id("popupFormAudit:txt_observacion")).clear();
	    driver.findElement(By.id("popupFormAudit:txt_observacion")).sendKeys("Guardar campaña ejecucion");
	    driver.findElement(By.id("popupFormAudit:btnAcepptConfirmation")).click();
		
		
	}
	
	
}
