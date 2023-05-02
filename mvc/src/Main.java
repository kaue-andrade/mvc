public class Main {
    public static void main(String[] args) {
        UserModel model = retrieveUserFromDatabase();

        UserView view = new UserView();

        UserController controller = new UserController(model, view);

        controller.updateView();

        //Atualizando o modelo
        controller.setUserName("João");
        controller.setUserAge(30);

        controller.updateView();
    }

    private static UserModel retrieveUserFromDatabase(){
        UserModel user = new UserModel();
        user.setName("Maria");
        user.setAge(25);
        return user;
    }
}
