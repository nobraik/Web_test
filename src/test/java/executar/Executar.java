package executar;

import drivers_web.DriversFactory;

import io.cucumber.java.AfterAll;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/resources/Tricentis.feature",
    glue = "Steps",
     tags = "@Regressivo",
      dryRun = false,
      monochrome = true,
      plugin = {"pretty","html:target/cucumber-report.html"},
      snippets = CucumberOptions.SnippetType.CAMELCASE



)
public class Executar extends DriversFactory {


    @BeforeClass
    public static void iniciarTest() {

        String navegador = "chrome";
        String urlSite = "http://sampleapp.tricentis.com/101/app.php";


        if (navegador.equalsIgnoreCase("chrome")) {

            System.out.println(" voce esta abrindo o " + navegador);
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        } else if (navegador.equalsIgnoreCase("Firefox")) {
            System.out.println(" voce esta abrindo o " + navegador);
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();


        } else if (navegador.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
            driver.manage().window().maximize();
        }
        driver.get(urlSite);
            }

        }




