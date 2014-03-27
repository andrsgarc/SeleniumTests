package cr.go.ice.medios.tests;

import org.junit.Test;

import cr.go.ice.medios.pages.IniciativaPage;


public class IniciativaTest extends TestSicome{

	@Test
	public void crearIniciativaTest() throws Exception {
		IniciativaPage tmpIniciativaPage = new IniciativaPage(driver);
		tmpIniciativaPage.login();
		tmpIniciativaPage.openFormIniciativa();
	}
	
	
	@Test
	public void crearCampanniaTest() throws Exception {
		
		IniciativaPage tmpIniciativaPage = new IniciativaPage(driver);
		tmpIniciativaPage.login();
		//tmpIniciativaPage.openFormIniciativa();
		tmpIniciativaPage.crearCampannia();
	}
	
	@Test
	public void crearCampanniaTargetTest() throws Exception {
		
		IniciativaPage tmpIniciativaPage = new IniciativaPage(driver);
		tmpIniciativaPage.login();
		tmpIniciativaPage.crearCampanniaTarget();
	}
	
	@Test
	public void ejecutarCampanniaTest() throws Exception {
		
		IniciativaPage tmpIniciativaPage = new IniciativaPage(driver);
		tmpIniciativaPage.login();
		tmpIniciativaPage.ejecutarCampannia();
	}
	
	
	@Test
	public void campanniaFullTest() throws Exception {
		
		IniciativaPage tmpIniciativaPage = new IniciativaPage(driver);
		tmpIniciativaPage.login();
		tmpIniciativaPage.openFormIniciativa();
		tmpIniciativaPage.crearCampannia();
		tmpIniciativaPage.crearCampanniaTarget();
		tmpIniciativaPage.ejecutarCampannia();
	}
}
