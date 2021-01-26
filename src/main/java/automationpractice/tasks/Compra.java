package automationpractice.tasks;

import automationpractice.userinterfaces.FlujoCompraAutomation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

public class Compra implements Task {
    public static Compra pagina() {
        return Tasks.instrumented(Compra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(FlujoCompraAutomation.TOTAL),
                Click.on(FlujoCompraAutomation.BOTON_PROCESO_CHECKOUT),
                Click.on(FlujoCompraAutomation.BOTON_PROCESO_CHECKOUT2),
                Click.on(FlujoCompraAutomation.TERMINOS),
                Click.on(FlujoCompraAutomation.BOTON_PROCESO_CHECKOUT3),
                Click.on(FlujoCompraAutomation.PAGO_BANK),
                Click.on(FlujoCompraAutomation.CONFIRMAR_ORDEN)

        );
    }
}
