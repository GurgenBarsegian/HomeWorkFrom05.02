import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в наш ресторан 'Ресторан', выберите когда желаете к нам: ");
        String dayOfWeek = scanner.nextLine();
        switch (dayOfWeek) {
            case "понедельник":
                System.out.println("В " + dayOfWeek + " подают горячие пирожки.");
                break;

            case "вторник":
                System.out.println("В " + dayOfWeek + " вкусный борщ.");
                break;

            case "среда":
                System.out.println("В " + dayOfWeek + " вкуснейшие пельмени.");
                break;
            case "четверг":
                System.out.println("В " + dayOfWeek + " рыбный день!");
                break;
            case "пятница":
                System.out.println("В " + dayOfWeek + " шашлык!");
                break;
            case "суббота":
                System.out.println("В " + dayOfWeek + " у нас Шаббат");
                break;
            case "воскресенье":
                System.out.println("В " + dayOfWeek + " у нас разгрузочный день");
                break;
            default:
                System.out.println("Введите правильно день недели");
                break;
        }
        showTheDay (scanner);

    }

    public static void showTheDay ( Scanner scanner){

        System.out.println("Добро пожаловать в наш ресторан 'Ресторан', выберите когда желаете к нам: ");

        String dayOfWeek2 = scanner.nextLine();
        boolean monday = "понедельник".equals(dayOfWeek2);
        boolean tuesday = "вторник".equals(dayOfWeek2);
        boolean wednesday = "среда".equals(dayOfWeek2);
        boolean thursday = "четверг".equals(dayOfWeek2);
        boolean friday = "пятница".equals(dayOfWeek2);
        boolean saturday = "суббота".equals(dayOfWeek2);
        boolean sunday = "воскресенье".equals(dayOfWeek2);

        if (monday) {
            System.out.println("В " + dayOfWeek2 + " подают горячие пирожки.");
        } else if (tuesday) {
            System.out.println("В " + dayOfWeek2 + " вкусный борщ.");
        } else if (wednesday) {
            System.out.println("В " + dayOfWeek2 + " вкуснейшие пельмени.");
        } else if (thursday) {
            System.out.println("В " + dayOfWeek2 + " рыбный день!");
        } else if (friday) {
            System.out.println("В " + dayOfWeek2 + " шашлык!");
        } else if (saturday) {
            System.out.println("В " + dayOfWeek2 + " у нас Шаббат");
        } else if (sunday) {
            System.out.println("В " + dayOfWeek2 + " у нас разгрузочный день");
        }else {
            System.out.println("Введите правильно день недели");
        }
    }
}