package cr.go.ice.medios.tests;

import org.junit.Test;

import cr.go.ice.medios.pages.IniciativaPage;


public class IniciativaTest extends TestSicome{
	
	
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
