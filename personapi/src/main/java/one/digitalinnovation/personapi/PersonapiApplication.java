package one.digitalinnovation.personapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonapiApplication.class, args);
	}

}

//java: java.lang.IllegalAccessError: class lombok.javac.apt.LombokProcessor
// (in unnamed module @0x2ab8421c) cannot access class com.sun.tools.javac.processing.JavacProcessingEnvironment (in module jdk.compiler)
// because module jdk.compiler does not export com.sun.tools.javac.processing to unnamed module @0x2ab8421c