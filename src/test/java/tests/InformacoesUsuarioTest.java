package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InformacoesUsuarioTest {

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //Navegando para a página do Takit
        navegador.get("http://www.juliodelima.com.br/taskit");

        //Clicar no link que possui o texto "Signin"
        navegador.findElement(By.linkText("Sign in")).click();

        //Identificando o formulario de login
        WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

        //Digitar no campo com name "login" que possui o texto "login" que está dentro do formulario de id siginbox o texto "estela001"
        formularioSignInBox.findElement(By.name("login")).sendKeys("maga");

        //Digitar no campo com name "login" que possui o texto "password" que está dentro do formulario de id siginbox o texto "123456"
        formularioSignInBox.findElement(By.name("password")).sendKeys("123456");

        //Clicar no link que possui o texto "SIGN IN"
        navegador.findElement(By.linkText("SIGN IN")).click();

        //Validar que dentro do elemento com class "me está o texto "Hi, Estela"
        WebElement me = navegador.findElement(By.className("me"));
        String textoNoElementoMe = me.getText();
        Assert.assertEquals("Hi, estela", textoNoElementoMe);

        //Fechar o navegador
        navegador.quit();

    }

}
