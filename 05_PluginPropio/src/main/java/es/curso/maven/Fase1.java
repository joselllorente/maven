package es.curso.maven;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name="fase1")
public class Fase1 extends AbstractMojo {

	@Parameter(defaultValue="false")
	private boolean activo;
	
	@Parameter
	private String texto;
	
	@Parameter (required=true)
	private File fichero;
	
	public void execute() throws MojoExecutionException, MojoFailureException {
		
		if (activo){
			getLog().info("Texto: ");
			getLog().info("Ruta fichero: "+fichero.getAbsolutePath());
		}else{
			getLog().warn("======== No esta activo");
		}

	}

}
