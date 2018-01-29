import static org.junit.Assert.assertTrue;

import org.junit.Test;

import es.curso.maven.Funciones;

public class TestProyectoFuncionalidades {

	@Test
	public void test() {
		Funciones f = new Funciones ();
		String valor = f.funcion();
		
		org.junit.Assert.assertEquals(valor,"Devolviendo valor2");
	}

}
