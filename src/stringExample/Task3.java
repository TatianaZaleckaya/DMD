package stringExample;

/**
 * Написать функцию, принимающую в качестве параметров имя, фамилию, отчество и возвращающую
 * инициалы в формате Ф.И.О. Учесть регистр
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(format("Ivan", "Pertov", "Ivanovich"));

    }

    private static String format(String firstName, String lastName, String patronymicName) {

//        char firstNameChar = firstName.toUpperCase().charAt(0);
//        char lastNameChar = lastName.toUpperCase().charAt(0);
//        char patronymicNameChar = patronymicName.toUpperCase().charAt(0);

        char firstNameChar = Character.toUpperCase(firstName.charAt(0));
        char lastNameChar = Character.toUpperCase(lastName.charAt(0));
        char patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));

        // return firstNameChar + "." + lastNameChar + "." + patronymicNameChar;
        return String.format("%s.%s.%s", firstNameChar, lastNameChar, patronymicNameChar);

    }
}
