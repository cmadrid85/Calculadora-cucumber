package testRunner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
	// Ruta del archivo Feature
	features="C:\\Users\\cmadridg\\eclipse-workspace\\Calculatorcucumber\\src\\test\\resources\\features\\calculator.feature",
			// Ruta del archivo de definición de pasos
			glue= {"stepDefinitionDivision","stepDefinitionSuma","stepDefinitionMultiplicacion","stepDefinitionResta"},
			//PRETTY es para reportes HTML
			//JSON-OUTPUT/CUCUMBER.JSON para reportes en JSON
			//JUNIT:JUNIT_XML/CUCUMBER.XML para reportes en XML
			// Carpeta de salida y archivo HTML
			plugin = {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
			// Muestra la salida de la consola en un formato legible adecuado. Soportes y todo se habrá ido
			monochrome = true,
			// Solo muestra el mapeo. No se ejecutará. Podemos identificar si algunos pasos no están definidos
			dryRun = true,
			// TAGS se puede escoger que pruebas correr
			tags = "@TestSuma"
			)

public class TestRunner_Calculator {

}
