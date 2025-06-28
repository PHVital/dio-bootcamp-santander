package src.SintaxeBaseJava.DebuggingTratamentoExceptions.validator;

import src.SintaxeBaseJava.DebuggingTratamentoExceptions.Exception.ValidatorException;

public class UserValidator {
    private UserValidator() {

    }

    /*public static void verifyModel() throws ValidatorException {
        if (stringIsBlank(model.getName())) throw new ValidatorException("Informe um nome válido");
        if (model.getName().length <= 1) throw new ValidatorException("O nome deve ter mais que um caracter");
        if (stringIsBlank(model.getEmail())) throw new ValidatorException("Informe um email válido");
        if ((!model.getEmail().contains("@")) && (!models.getEmail.contains("."))) throw new ValidatorException("Informe um email válido");
    }*/

    private static boolean stringIsBlank(final String value) {
        return value == null || value.isBlank();
    }
}
