package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GeradorCPFTest {

    private WebDriver navegador;

    @Before
    public void setUp() {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Nicoli Pereira\\rive 2\\chromedriver.exe");
            navegador = new ChromeDriver();
            navegador.get("https://www.passagensaereas.com.br/latam");
    }

    @Test
    public void testSelecionaRadio(){

        // Selecionar RadioButton 'só ida'
        WebElement selecionaRadio = navegador.findElement(By.className("radio-options"));
        selecionaRadio.findElement(By.xpath("//input[@type='radio']")).click();

    @After
    public void fechaTela(){
        //navegador.quit();
    }


}

