package Steps;


import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java_awt.JavaUploudPictures_Achives;
import metodos.Metodos;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Steps {
Metodos metodos = new Metodos();
Elementos el = new Elementos();
JavaUploudPictures_Achives jup = new JavaUploudPictures_Achives();
    @Given("que eu esteja no site da tricentis")
    public void queEuEstejaNoSiteDaTricentis() {

    }
    @When("eu preecher os dados requeridos")
    public void euPreecherOsDadosRequeridos() throws AWTException, InterruptedException {
        metodos.selecionaMarca("Audi");
        metodos.SelecionarModelo("Scooter");
        metodos.escrever("2000",el.capacity);
        metodos.escrever("234",el.kmPeformance);
        metodos.escrever("02/02/2000",el.datamanufature);
        metodos.SelecionaQtoAcentos("3");
        metodos.click(el.YesOrNot);
        metodos.SelecionaQtoAcentos2("2");
        metodos.tipocobustivel("Gas");
        metodos.escrever("120",el.Payload);
        metodos.escrever("2000",el.totalWeight);
        metodos.escrever("23000",el.ListaPreco);
        metodos.escrever("34",el.licenseplatenumber);
        metodos.escrever("120.000",el.anualmilleager);

        metodos.click(el.nextClick);

        metodos.escrever("fulano",el.firtName);
        metodos.escrever("beltrano",el.lastname);
        metodos.escrever("02/02/1998",el.dataaniversario);
        metodos.click(el.genero);
        metodos.escrever("rua abc",el.endereco);
        metodos.selecionarPais("Brazil");
        metodos.escrever("08490543",el.cep);
        metodos.escrever("são paulo",el.cidade);
        metodos.Ocupacao("Employee");
        metodos.click(el.hobies);
        metodos.escrever("www.gooo.com",el.website);
        metodos.click(el.botao_open);

        jup.uploadArquivo();

        metodos.click(el.Procimo);

        metodos.escrever("10/11/2023",el.startData);
        metodos.isuraceSun("3000000");
        metodos.meritRating("Bonus 2");
        metodos.DamagerIsurance("Full Coverage");
        metodos.click(el.opcionalProducts);
        metodos.courcestcar("No");
        metodos.click(el.Butaonest3);

        metodos.click(el.selectPrideOption);

        //metodos.aguardarMethod(el.arquivo);
        metodos.Scroll(0,700);
       metodos.aguardarMethod(el.buttonNext4);

       // metodos.aguardaDominhoco();

        metodos.escrever("teste@google.com",el.Email);
        metodos.escrever("444444444",el.phone4);
        metodos.escrever("decio",el.username4);

        metodos.escrever(" Q1q2q3q4 ",el.password);

        metodos.escrever(" Q1q2q3q4 ",el.confirPassword);

        metodos.escrever(" Olá eu sou o jarvis e estou controlando este site para teste do meu senho nobraik ",el.comentarios);

    }
    @When("clico em proximo")
    public void clicoEmProximo() {
        metodos.click(el.buttonSendFinal);
    }
    @Then("sou direcionado para preecher dados pessoais")
    public void souDirecionadoParaPreecherDadosPessoais() {

    }


}
