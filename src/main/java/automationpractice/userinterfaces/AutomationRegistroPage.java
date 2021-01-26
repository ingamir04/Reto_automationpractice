package automationpractice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationRegistroPage {
    public static final Target BOTON_REGISTRO = Target.the("ver").located(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a"));
    public static final Target EMAIL = Target.the("ver").located(By.id("email_create"));
    public static final Target BOTON_CREAR = Target.the("ver").located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button/span"));
    public static final Target OPCION = Target.the("ver").located(By.id("id_gender1"));

    public static final Target PRIMER_NOMBRE = Target.the("ver").located(By.id("customer_firstname"));
    public static final Target SEGUNDO_NOMBRE = Target.the("ver").located(By.id("customer_lastname"));
    public static final Target CONTRASENA = Target.the("ver").located(By.id("passwd"));

    public static final Target DIA = Target.the("ver").located(By.id("days"));
    public static final Target MES = Target.the("ver").located(By.id("months"));
    public static final Target ANNO = Target.the("ver").located(By.id("years"));


    public static final Target COMPANIA = Target.the("ver").located(By.id("company"));
    public static final Target DIRECCION = Target.the("ver").located(By.id("address1"));
    public static final Target DIRECCION2 = Target.the("ver").located(By.id("address2"));
    public static final Target CIUDAD = Target.the("ver").located(By.id("city"));
    public static final Target ESTADO = Target.the("ver").located(By.id("id_state"));
    public static final Target POSTAL = Target.the("ver").located(By.id("postcode"));
    public static final Target TELEFONO = Target.the("ver").located(By.id("phone_mobile"));

    public static final Target BOTON_REGISTRO2 = Target.the("ver").located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[4]/button/span"));



}
