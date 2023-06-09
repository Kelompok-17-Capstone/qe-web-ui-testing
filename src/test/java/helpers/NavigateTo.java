package helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theAltaTechHomePage() {
        return Task.where("{0} opens the AltaTech home page",
                Open.browserOn().the(AltaTechPage.class));
    }
}
