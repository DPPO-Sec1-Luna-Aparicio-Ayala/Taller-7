/**
 * 
 */
package uniandes.cupi2.almacen.mundo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Usuario
 *
 */



class AlmacenTest {

	/**
	 * @throws java.lang.Exception
	 */
	private Almacen almacen;
	@BeforeAll
	static void setUpBeforeClass() throws AlmacenException {
	
		try {
			Almacen almacen = new Almacen( new File( "./data/datos.txt" ));	
			
		}
		catch (AlmacenException e){
			fail( "No debería generar excepción" );
		}
	}
	

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link uniandes.cupi2.almacen.mundo.Almacen#Almacen(java.io.File)}.
	 * @throws AlmacenException 
	 */
	@Test
	final void testAlmacen() throws AlmacenException {
		setUpBeforeClass();	}

	/**
	 * Test method for {@link uniandes.cupi2.almacen.mundo.Almacen#darCategoriaRaiz()}.
	 * @throws AlmacenException 
	 */
	@Test
	final void testDarCategoriaRaiz() throws AlmacenException {
		setUpBeforeClass();	
		assertNotNull( almacen.darCategoriaRaiz(),"La raíz debería existir");
		
	}

	/**
	 * Test method for {@link uniandes.cupi2.almacen.mundo.Almacen#agregarNodo(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	final void testAgregarNodo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link uniandes.cupi2.almacen.mundo.Almacen#eliminarNodo(java.lang.String)}.
	 */
	@Test
	final void testEliminarNodo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link uniandes.cupi2.almacen.mundo.Almacen#venderProducto(java.lang.String, int)}.
	 */
	@Test
	final void testVenderProducto() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link uniandes.cupi2.almacen.mundo.Almacen#buscarNodo(java.lang.String)}.
	 */
	@Test
	final void testBuscarNodo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link uniandes.cupi2.almacen.mundo.Almacen#agregarProducto(java.lang.String, java.lang.String, java.lang.String, java.lang.String, double)}.
	 */
	@Test
	final void testAgregarProducto() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link uniandes.cupi2.almacen.mundo.Almacen#eliminarProducto(java.lang.String)}.
	 */
	@Test
	final void testEliminarProducto() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link uniandes.cupi2.almacen.mundo.Almacen#metodo1()}.
	 */
	@Test
	final void testMetodo1() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link uniandes.cupi2.almacen.mundo.Almacen#metodo2()}.
	 */
	@Test
	final void testMetodo2() {
		fail("Not yet implemented"); // TODO
	}

}
