package automationpractice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class FlujoCompraAutomation {
    public static final Target TOTAL = Target.the("ver").located(By.id("total_price"));
    public static final Target BOTON_PROCESO_CHECKOUT = Target.the("ver").located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span"));
    public static final Target BOTON_PROCESO_CHECKOUT2 = Target.the("ver").located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span"));
    public static final Target TERMINOS = Target.the("ver").located(By.xpath("//*[@id=\"cgv\"]"));
    public static final Target BOTON_PROCESO_CHECKOUT3 = Target.the("ver").located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span"));
    public static final Target PAGO_BANK = Target.the("ver").located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a"));
    public static final Target CONFIRMAR_ORDEN = Target.the("ver").located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span"));
    public static final Target CONFIRMAR_VERIFICACION = Target.the("ver").located(By.xpath("/html/body/div[1]/div[2]/div/div[1]/span[2]"));






}
