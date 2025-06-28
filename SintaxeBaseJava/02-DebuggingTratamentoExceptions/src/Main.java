package src.SintaxeBaseJava.DebuggingTratamentoExceptions;

import src.SintaxeBaseJava.DebuggingTratamentoExceptions.Exception.EmptyStorageException;
import src.SintaxeBaseJava.DebuggingTratamentoExceptions.Exception.UserNotFoundException;
import src.SintaxeBaseJava.DebuggingTratamentoExceptions.Exception.ValidatorException;
import src.SintaxeBaseJava.DebuggingTratamentoExceptions.dao.UserDAO;
import src.SintaxeBaseJava.DebuggingTratamentoExceptions.model.MenuOption;
import src.SintaxeBaseJava.DebuggingTratamentoExceptions.model.UserModel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static src.SintaxeBaseJava.DebuggingTratamentoExceptions.validator.UserValidator.verifyModel;

public class Main {
    private final static UserDAO dao = new UserDAO();

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("Bem vindo ao cadastro de usuários, selecione a opção desejada: ");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Buscar por ID");
            System.out.println("5 - Listar");
            System.out.println("6 - Sair");
            var userInput = scanner.nextInt();
            var selectedOption = MenuOption.values()[userInput -1];
            switch (selectedOption) {
                case SAVE -> {
                    var user = dao.save(requestToSave());
                    System.out.printf("Usuário cadastrado %s", user);
                }
                case UPDATE -> {
                    try {
                        var user = dao.update(requestToUpdate());
                        System.out.printf("Usuário atualizado %s", user);
                    } catch (UserNotFoundException | EmptyStorageException ex) {
                        System.out.println(ex.getMessage());
                    } finally {
                        System.out.println("==========================");
                    }
                }
                case DELETE -> {
                    try {
                        dao.delete(requestId());
                        System.out.println("Usuário Excluido com sucesso");
                    } catch (UserNotFoundException | EmptyStorageException ex) {
                        System.out.println(ex.getMessage());
                    } finally {
                        System.out.println("==========================");
                    }
                }
                case FIND_BY_ID -> {
                    try {
                        var id = requestId();
                        var user = dao.findById(id);
                        System.out.printf("Usuário com id %s:", id);
                        System.out.println(user);
                    } catch (UserNotFoundException | EmptyStorageException ex) {
                        System.out.println(ex.getMessage());
                    } finally {
                        System.out.println("==========================");
                    }
                }
                case FIND_ALL -> {
                    var users = dao.findAll();
                    System.out.println("Usuários cadastrados: ");
                    System.out.println("==============");
                    users.forEach(System.out::println);
                    System.out.println("===== FIM ====");
                }
                case EXIT -> System.exit(0);
            }
        }
    }

    private static long requestId(){
        System.out.println("Digite um id: ");
        return scanner.nextLong();
    }

    private static UserModel requestToSave(){
        System.out.println("Informe o nome do usuário: ");
        var name = scanner.nextLine();
        System.out.println("Informe o e-mail do usuário: ");
        var email = scanner.nextLine();
        System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy): ");
        var birthdayString = scanner.nextLine();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);
        UserModel model = new UserModel();
        try {
            model =  validateInputs(0, name, email, birthday);
        } catch (ValidatorException ex) {

        }
        return model;
    }

    private UserModel validateInputs(final long id, final String name, final String email, final LocalDate birthday) throws ValidatorException {
        var user = new UserModel(0, name, email, birthday);
        verifyModel(user);
        return user;
    }

    private static UserModel requestToUpdate(){
        System.out.println("Informe o id do usuário: ");
        var id = scanner.nextInt();
        System.out.println("Informe o nome do usuário: ");
        var name = scanner.nextLine();
        System.out.println("Informe o e-mail do usuário: ");
        var email = scanner.nextLine();
        System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy): ");
        var birthdayString = scanner.nextLine();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);
        UserModel model = new UserModel();
        try {
            model =  validateInputs(0, name, email, birthday);
        } catch (ValidatorException ex) {

        }
        return model;
    }
}
