import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {

        List<User> registUser = new ArrayList<>();

        registUser.add(new User("Veronica", "Gore", 20,"gore.veronica@ee.utm.md"
                ,Status.New,"1 8 2020"));
        registUser.add(new User("Ana", "Rusu", 19,"ana.rusu@gmail.com"
                ,Status.New,"5 2 2019"));
        registUser.add(new User("Irina", "Temciuc", 18,"temciuc_irina@gmail.com"
                ,Status.New,"2 1 2020"));
        registUser.add(new User("Marcela", "Florea", 21,"florea.mm@gmail.com"
                ,Status.New,"4 10 2019"));

        for (User user: registUser) {
            user.changeStatus();
            System.out.println(user);

        }

    }



}