package metodos;

import drivers_web.DriversFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Metodos extends DriversFactory {

    public void escrever(String texto, By elemento) {
        driver.findElement(elemento).sendKeys(texto);

    }

    public void click(By elemento) {
        driver.findElement(elemento).click();
    }

    public void selecionaMarca(String texto) {
        driver.findElement(By.xpath("//select/option[@value='" + texto + "']")).click();
    }

    public void SelecionarModelo(String text) {
        driver.findElement(By.xpath("//select//option[@value='" + text + "']")).click();

    }

    public void SelecionaQtoAcentos(String Texto) {
        driver.findElement(By.xpath("//select/option[@value='" + Texto + "']")).click();
    }


    public void tipocobustivel(String texto) {
        driver.findElement(By.xpath("//select/option[@value='" + texto + "']")).click();

    }

    public void selecionarPais(String texto) {
        driver.findElement(By.xpath("//select//option[@value='" + texto + "']")).click();

    }

    public void SelecionaQtoAcentos2(String texto) {
        driver.findElement(By.xpath("(//select//option[@value='" + texto + "'])[2]")).click();
    }

    public void Ocupacao(String texto) {

        driver.findElement(By.xpath("//select//option[@value='" + texto + "']")).click();


    }

    public void isuraceSun(String texto) {
        driver.findElement(By.xpath("//select//option[@value='" + texto + "']")).click();

    }

    public void meritRating(String texto) {
        driver.findElement(By.xpath("//select//option[@value='" + texto + "']")).click();

    }

    public void DamagerIsurance(String texto) {
        driver.findElement(By.xpath("//select//option[@value='" + texto + "']")).click();
    }

    public void courcestcar(String texto) {
        driver.findElement(By.xpath("//select//option[@value='" + texto + "']")).click();
    }

    public void aguardarMethod(By elemento) {
        WebElement waitElement = new WebDriverWait(driver, Duration.ofSeconds(50000))
                .until(ExpectedConditions.elementToBeClickable(elemento));
        waitElement.click();

    }

    public void aguardaDominhoco() throws InterruptedException {
        Thread.sleep(50000);


    }

    //metodo para descer a tela
    public void Scroll(int n1, int n2) {
        JavascriptExecutor jsScroll = (JavascriptExecutor) driver;
        jsScroll.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");


    }

    public void validar() throws InterruptedException {
        TimeUnit.SECONDS.sleep(6);
        driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2")).getText();
        System.out.println("texto capturado");



    }


    public void Encerrar() {
        try {
            TimeUnit.SECONDS.sleep(9);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();


   }
}