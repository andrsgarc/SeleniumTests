package cr.go.ice.medios.tests;

import org.junit.Test;

import cr.go.ice.medios.pages.OrdenPagoPage;

public class OrdenPagoTest extends TestSicome{

	@Test
	public void crearOrdenPagoTest() throws Exception {
		OrdenPagoPage mainPage = new OrdenPagoPage(driver);
		mainPage.login();
		mainPage.openFormPagOrdenPago();
	}
	
	

}
