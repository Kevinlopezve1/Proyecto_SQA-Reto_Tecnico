package co.com.screenplay.project.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class QueryUI {

    //****************************************** DateQuery ************************************//

    public static final Target IFRAME_CALENDAR = Target.the("iframe del calendario")
            .locatedBy("//iframe[contains(@src,'/resources/demos/datepicker/default.html')]");

    public static final Target DATA_PICKER = Target.the("Campo seleccionador de fecha")
            .located(By.id("datepicker"));

    public static final Target DAY_DATA_PICKER = Target.the("Seleccionador dia calendario")
            .locatedBy("//table[@class='ui-datepicker-calendar']//a[text()='{0}']");

    public static final Target NEXT_MONTH = Target.the("Fecha siguiente mes")
            .locatedBy("//*[@id=\"ui-datepicker-div\"]/div/a[2]");

    //****************************************** SauceDemo ************************************//

    public static final Target USER_NAME = Target.the("Campo de usuario en logueo")
            .located(By.id("user-name"));

    public static final Target PASSWORD = Target.the("Campo de contraseña en logueo")
            .located(By.id("password"));

    public static final Target LOGIN_BUTTON = Target.the("Botón para logueo")
            .located(By.id("login-button"));

    public static final Target OPTION_BIKE_LIGHT = Target.the("Opcion Sauce Labs Bike Light")
            .locatedBy("//*[@id=\"item_0_title_link\"]/div");

    public static final Target OPTION_FLEECE_LIGHT = Target.the("Opcion Labs Fleece Jacket")
            .located(By.id("item_5_title_link"));

    public static final Target ADD_CAR_BUTTON = Target.the("Botón añadir a carrito")
            .located(By.id("add-to-cart"));

    public static final Target PAY_CAR_BUTTON = Target.the("Botón carrito a pagar")
            .located(By.id("shopping_cart_container"));

    public static final Target CHECKOUT_BUTTON = Target.the("Botón pagar")
            .located(By.id("checkout"));

    public static final Target FIRST_NAME = Target.the("Campo Primer nombre")
            .located(By.id("first-name"));

    public static final Target LAST_NAME = Target.the("Campo Apellidos")
            .located(By.id("last-name"));

    public static final Target POSTAL_CODE = Target.the("Campo Codigo postal")
            .located(By.id("postal-code"));

    public static final Target CONTINUE_BUTTON = Target.the("Botón continuar")
            .located(By.id("continue"));

    public static final Target FINISH_BUTTON = Target.the("Botón finalizar compra")
            .located(By.id("finish"));

    public static final Target CONFIRM_BUY_TITTLE = Target.the("Titulo de confirmacion de compra")
            .locatedBy("//*[@id=\"checkout_complete_container\"]/h2");

}
