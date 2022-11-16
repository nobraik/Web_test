package elementos;

import org.openqa.selenium.By;

public class Elementos {

    //no used public By clicarAutomobile = By.id("nav_automobile");
    public By capacity = By.id("cylindercapacity");
    public By kmPeformance = By.id("engineperformance");
    public By datamanufature = By.id("dateofmanufacture");
    public By Payload = By.id("payload");
    public By licenseplatenumber = By.id("licenseplatenumber");
    public By ListaPreco = By.id("listprice");
    public By YesOrNot = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1)");
    public By anualmilleager = By.id("annualmileage");
    public By nextClick = By.id("enterinsurantdata");
    public By totalWeight = By.id("totalweight");


    public By firtName = By.id("firstname");
    public By lastname = By.id("lastname");
    public By startData = By.xpath("(//div//input[@placeholder='MM/DD/YYYY'])[3]");

    public By genero = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");
    public By endereco = By.xpath("//input[@id='streetaddress']");
    public By dataaniversario = By.xpath("//input[@name='Date of Birth']");
    public By opcionalProducts = By.xpath("//label[text()='Euro Protection']");
    public By cep = By.xpath("//input[@id='zipcode']");
    public By hobies = By.xpath("(//label[@class='ideal-radiocheck-label'])[5]");

    public By cidade = By.id("city");


    public By website = By.id("website");
    public By botao_open = By.id("open");

    public By Procimo = By.id("nextenterproductdata");

    public By Butaonest3 = By.id("nextselectpriceoption");

  public  By selectPrideOption =  By.xpath("//th[@colspan='4']//label[4]");
  public By arquivo = By.xpath("//a[@id='downloadquote']");
  public By buttonNext4 = By.xpath("//button[@name='Next (Send Quote)']");
    public By Email = By.xpath("//input[@name='E-Mail']");
    public By phone4= By.xpath("//input[@name='Phone']");
    public By username4 = By.xpath("//input[@name='Username']");
    public By password = By.xpath("//input[@name='Password']");
    public By confirPassword = By.xpath("//input[@id='confirmpassword']");
    public By comentarios= By.xpath("//textarea[@id='Comments']");
    public By buttonSendFinal = By.xpath("//button[@id='sendemail']");



}



