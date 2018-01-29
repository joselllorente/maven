package es.curso.maven;

import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name="fase2")
public class Fase2 extends AbstractMojo {

	@Parameter
	private String [] colores;
	
	@Parameter
	private List<String> nombres;
	
	public void execute() throws MojoExecutionException, MojoFailureException {
		
		for (String color : colores) {
			getLog().info(color);
		}
		System.out.println("================================");
		for (String nombre : nombres) {
			getLog().info(nombre);
		}

	}

}
