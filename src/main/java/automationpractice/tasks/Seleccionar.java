package automationpractice.tasks;

import automationpractice.userinterfaces.Automationpractice;
import automationpractice.userinterfaces.Seleccionarprendas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.MoveMouseToWebElement;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.remote.server.handler.interactions.MouseMoveToLocation;
import org.openqa.selenium.remote.server.handler.interactions.touch.Move;

public class Seleccionar implements Task {


    public static Seleccionar prendas() {
        return Tasks.instrumented(Seleccionar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Seleccionarprendas.BOTON_CAMISETAS),
                MoveMouse.to(Seleccionarprendas.MOUSE_PRENDA),
                Click.on(Seleccionarprendas.VER_PRENDA),
                Click.on(Seleccionarprendas.AGREGAR_PRENDA),
                Click.on(Seleccionarprendas.CONTUNIAR),
                Click.on(Seleccionarprendas.BOTON_VESTIDOS),
                MoveMouse.to(Seleccionarprendas.MOUSE_PRENDA2),
                Click.on(Seleccionarprendas.VER_PRENDA2),
                Click.on(Seleccionarprendas.AGREGAR_PRENDA2),
                Click.on(Seleccionarprendas.CONTUNIAR),
                Click.on(Seleccionarprendas.HOME_PAGINA)

        );
    }
}
