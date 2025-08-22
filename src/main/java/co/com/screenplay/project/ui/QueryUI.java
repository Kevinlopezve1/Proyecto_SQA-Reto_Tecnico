package co.com.screenplay.project.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class QueryUI {

    public static final Target IFRAME_CALENDAR = Target.the("iframe del calendario")
            .locatedBy("//iframe[contains(@src,'/resources/demos/datepicker/default.html')]");

    public static final Target DATA_PICKER = Target.the("Campo seleccionador de fecha")
            .located(By.id("datepicker"));

    public static final Target DAY_DATA_PICKER = Target.the("Seleccionador dia calendario")
            .locatedBy("//table[@class='ui-datepicker-calendar']//a[text()='{0}']");

    public static final Target NEXT_MONTH = Target.the("Fecha siguiente mes")
            .locatedBy("//*[@id=\"ui-datepicker-div\"]/div/a[2]");
}
