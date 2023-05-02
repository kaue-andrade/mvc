public class UserController {
    private UserModel model;
    private UserView view;

    public UserController(UserModel model, UserView view){
        this.model = model;
        this.view = view;
    }

    public void setUserName(String name){
        model.setName(name);
    }

    public String getUserName(){
        return model.getName();
    }

    public void setUserAge(int age){
        model.setAge(age);
    }

    public int getUserAge(){
        return model.getAge();
    }

    public void updateView(){
        view.printUserDetails(model.getName(), model.getAge());
    }
}
