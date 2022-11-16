package Evedencia;

import drivers_web.DriversFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Evidencias extends DriversFactory {

    public void evidencias(String evidencia) {
        TakesScreenshot srcShot = (TakesScreenshot) driver; // camera
        File srcFile = srcShot.getScreenshotAs(OutputType.FILE); //tirar o arquivo
        File srcDest = new File("./evidencia/" + evidencia + ".png"); //preparar o diretorio
        try {
            FileUtils.copyFile(srcFile, srcDest);
        } catch (IOException e) {

            e.printStackTrace();
            System.out.println("Falha ao executar o teste");
            System.out.println(e.getCause());
            System.out.println(e.getMessage());


        }

    }
}