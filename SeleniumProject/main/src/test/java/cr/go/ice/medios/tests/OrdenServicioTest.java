package cr.go.ice.medios.tests;

import org.junit.Test;

import cr.go.ice.medios.pages.OrdenServicioPage;

public class OrdenServicioTest extends TestSicome{

	@Test
	public void crearOrdenServicioTest() throws Exception {
		OrdenServicioPage tmpOrdenServicioPage = new OrdenServicioPage(driver);
		tmpOrdenServicioPage.login();
		tmpOrdenServicioPage.openFormSerOrdenServicio();
	}
}
