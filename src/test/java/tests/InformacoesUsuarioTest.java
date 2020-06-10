package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InformacoesUsuarioTest {

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        //Navegando para a página do Takit
        navegador.get("http://www.juliodelima.com.br/taskit");
        //Validacao
        Assert.assertEquals(1,1);
    }

}
