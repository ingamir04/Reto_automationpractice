package automationpractice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Seleccionarprendas {
    public static final Target BOTON_CAMISETAS = Target.the("ver").located(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a"));
    public static final Target MOUSE_PRENDA = Target.the("ver").located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li"));
    public static final Target VER_PRENDA = Target.the("agg").located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[2]/span"));
    public static final Target AGREGAR_PRENDA = Target.the("agg").located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span"));
    public static final Target CONTUNIAR = Target.the("actions").located(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span"));
    public static final Target BOTON_VESTIDOS = Target.the("actions").located(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a"));

    public static final Target MOUSE_PRENDA2 = Target.the("ver").located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[1]"));
    public static final Target VER_PRENDA2 = Target.the("agg").located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[2]/span"));
    public static final Target AGREGAR_PRENDA2 = Target.the("agg").located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span"));
    public static final Target HOME_PAGINA = Target.the("agg").located(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[1]/a/img"));









}
