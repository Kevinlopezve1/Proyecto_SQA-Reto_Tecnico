package co.com.screenplay.project.questions;

import co.com.screenplay.project.ui.QueryUI;
import net.serenitybdd.screenplay.Question;

public class ValidateDatesQuestions {

    public static Question<String> valueResult() {
        return actor -> QueryUI.DATA_PICKER.resolveFor(actor).getValue();
    }

    public static Question<String> validateTittleBuy() {
        return actor -> QueryUI.CONFIRM_BUY_TITTLE.resolveFor(actor).getText();
    }
}