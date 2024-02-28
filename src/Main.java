//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task01");
        String firstName="Ivan";
        String middleName="Ivanovich";
        String lastName="Ivanov";
        String fullName=lastName+" "+firstName+" "+middleName;
        System.out.println("Ф. И. О. сотрудника — "+fullName);
        System.out.println("Task02");
        System.out.println(fullName.toUpperCase());
        System.out.println("Task03");
        fullName="Иванов Иван Семёнович";
        String updatedName = fullName.replace("ё","е");
        System.out.println("Данные Ф. И. О. сотрудника — "+updatedName);
        }
    }
