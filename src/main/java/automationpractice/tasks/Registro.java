package automationpractice.tasks;

import automationpractice.userinterfaces.AutomationRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class Registro implements Task {

    private String stremail;
    private String srtname;
    private String srtlast;
    private String strcontrasena;
    private String strcompania;
    private String strdireccion;
    private String strdireccion2;
    private String strcity;
    private String strpostal;
    private String strtelefono;

    public Registro(String stremail, String srtname, String srtlast, String strcontrasena, String strcompania, String strdireccion, String strdireccion2, String strcity, String strpostal, String strtelefono) {
        this.stremail = stremail;
        this.srtname = srtname;
        this.srtlast = srtlast;
        this.strcontrasena = strcontrasena;
        this.strcompania = strcompania;
        this.strdireccion = strdireccion;
        this.strdireccion2 = strdireccion2;
        this.strcity = strcity;
        this.strpostal = strpostal;
        this.strtelefono = strtelefono;
    }

    public static Registro pagina(String stremail, String srtname, String srtlast, String strcontrasena, String strcompania, String strdireccion, String strdireccion2, String strcity, String strpostal, String strtelefono) {
        return Tasks.instrumented(Registro.class,stremail,srtname,srtlast,strcontrasena,strcompania,strdireccion,strdireccion2,strcity,strpostal,strtelefono);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AutomationRegistroPage.BOTON_REGISTRO),
                Enter.theValue(stremail).into(AutomationRegistroPage.EMAIL),
                Click.on(AutomationRegistroPage.BOTON_CREAR),
                Click.on(AutomationRegistroPage.OPCION),
                Enter.theValue(srtname).into(AutomationRegistroPage.PRIMER_NOMBRE),
                Enter.theValue(srtlast).into(AutomationRegistroPage.SEGUNDO_NOMBRE),
                Enter.theValue(strcontrasena).into(AutomationRegistroPage.CONTRASENA),
                //SelectFromOptions.byVisibleText("5").from(AutomationRegistroPage.DIA),
                Click.on(AutomationRegistroPage.DIA),
                Hit.the(Keys.DOWN).into(AutomationRegistroPage.DIA),
                Hit.the(Keys.ENTER).into(AutomationRegistroPage.DIA),
                Click.on(AutomationRegistroPage.MES),
                Hit.the(Keys.DOWN).into(AutomationRegistroPage.MES),
                Hit.the(Keys.ENTER).into(AutomationRegistroPage.MES),
                Click.on(AutomationRegistroPage.ANNO),
                Hit.the(Keys.DOWN).into(AutomationRegistroPage.ANNO),
                Hit.the(Keys.ENTER).into(AutomationRegistroPage.ANNO),
                Enter.theValue(strcompania).into(AutomationRegistroPage.COMPANIA),
                Enter.theValue(strdireccion).into(AutomationRegistroPage.DIRECCION),
                Enter.theValue(strdireccion2).into(AutomationRegistroPage.DIRECCION2),
                Enter.theValue(strcity).into(AutomationRegistroPage.CIUDAD),
                SelectFromOptions.byVisibleText("New York").from(AutomationRegistroPage.ESTADO),
                Enter.theValue(strpostal).into(AutomationRegistroPage.POSTAL),
                Enter.theValue(strtelefono).into(AutomationRegistroPage.TELEFONO),
                Click.on(AutomationRegistroPage.BOTON_REGISTRO2)






                // SelectFromOptions.byVisibleText("December").from(AutomationRegistroPage.MES),
               // SelectFromOptions.byVisibleText("1993").from(AutomationRegistroPage.ANNO)


        );
    }
}
