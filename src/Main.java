import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.time.LocalDate;

public class Main{
    public static  void main(String[] args){
        while (0 == 0){
          ex20();
        }

    }

    // №1. Напишите функцию, которая принимает два числа и возвращает максимальное из них. Если числа равны,
    // выбрасывайте исключение с сообщением об ошибке.
    static int ex1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        try{
            if (number2 == number1){
                throw new IllegalArgumentException("Ошибка, числа равны");
            }
            else{
                return number2 > number1 ? number2 : number1;
            }
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            return -1;
        }

    }

    // №2. Создайте функцию для деления двух чисел. Если делитель равен нулю, выбрасывайте ArithmeticException с
    // сообщением о недопустимости деления на ноль.
    static float ex2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел");
        float number1 = scanner.nextInt();
        float number2 = scanner.nextInt();

        try{
            if (number2 == 0){
                throw new ArithmeticException("Деление на 0 недопустимо");
            }
            else{
                return number1 / number2;
            }
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
            return -1;
        }

    }

    // №3. Напишите функцию, которая принимает строку и пытается конвертировать её в целое число. Если строка не может
    // быть конвертирована, выбрасывайте NumberFormatException.
    static int ex3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, которую нужно перевести в число");
        String str = scanner.nextLine();

        try {
            return Integer.parseInt(str);
        }
        catch (NumberFormatException ex){
            System.out.println("Строка не может быть преобразована в число");
            return -1;
        }
    }

    // №4. Создайте функцию, которая принимает возраст и выбрасывает IllegalArgumentException, если возраст меньше нуля
    // или больше 150.
    static void ex4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        try{
            if (age < 0 || age > 150){
                throw new IllegalArgumentException("Недопустимый возраст");
            }
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

    }

    // №5. Реализуйте функцию, которая находит корень из числа. Если число отрицательное, выбрасывайте
    // IllegalArgumentException.
    static double ex5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        double num = scanner.nextInt();

        try{
            if (num < 0){
                throw new IllegalArgumentException("Число не может быть отрицательным");
            }
            else{
                return Math.pow(num, 0.5);
            }
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            return -1;
        }

    }

    // №6. Напишите функцию, которая вычисляет факториал числа. Если число отрицательное, выбрасывайте исключение.
    static int ex6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        int f = 1;
        try{
            if (n < 0){
                throw new IllegalArgumentException("Число не может быть меньше нуля");
            }
            else{
                for (int i = 2; i <= n; i++){
                    f *= i;
                }
                return f;
            }
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            return -1;
        }

    }

    // №7. Создайте функцию, которая проверяет массив на наличие нулей. Если в массиве есть нули, выбрасывайте исключение.
    static void ex7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив чисел");

        String[] nums = scanner.nextLine().split(" ");

        try{
            for (String i : nums){
                if (i.equals("0")){
                    throw new IllegalArgumentException("Найден ноль");
                }
            }
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }


    }

    // №8. Реализуйте функцию, которая возводит число в степень. Если степень отрицательная, выбрасывайте исключение.
    static double ex8(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        System.out.print("Введите степень: ");
        int b = scanner.nextInt();

        try {
            if (b < 0){
                throw new IllegalArgumentException("Степень не может быть отрицательной");
            }
            return Math.pow(a, b);
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            return -1;
        }
    }

    // №9. Напишите функцию, которая принимает строку и число символов. Функция должна возвращать строку, обрезанную до
    // указанного числа символов. Если число символов больше длины строки, выбрасывайте исключение.
    static String ex9(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        StringBuilder str = new StringBuilder(scanner.nextLine());
        System.out.println("Введите количество символов");
        int n = scanner.nextInt();

        try{
            return str.substring(0, n);
        }
        catch (StringIndexOutOfBoundsException ex){
            return "Число символов больше длины строки";
        }

    }

    // №10. Напишите функцию, которая ищет элемент в массиве. Если элемент не найден, выбрасывайте исключение с
    // сообщением об ошибке.
    static void ex10(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив элементов");
        String[] arr = scanner.nextLine().split(" ");
        System.out.println("Введите элемент для поиска");
        String find = scanner.nextLine();
        boolean flag = false;
        try {
            for (int i = 0; i < arr.length; i++){
                if (arr[i].equals(find)){
                    System.out.println("Элемент \"" + find + "\" найден на позиции " + Integer.toString(i));
                    flag = true;
                }
            }
            if (!flag) throw new Exception("Элемент не найден");
            flag = false;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    // №11. Создайте функцию, которая конвертирует целое число в двоичную строку. Если число отрицательное,
    // выбрасывайте исключение.
    static String ex11(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();

        try {
            if (n < 0){
                throw new InputMismatchException("Отрицательное число недопустимо");
            }
            return Integer.toBinaryString(n);

        }
        catch (InputMismatchException ex){
            System.out.println(ex.getMessage());
            return "-1";
        }



    }

    // №12. Реализуйте функцию, которая принимает два числа и проверяет, делится ли первое число на второе. Если второе
    // число равно нулю, выбрасывайте ArithmeticException.
    static void ex12(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        try{
            System.out.println(n1 % n2 == 0 ? "Числа делятся" : "Числа не делятся");
        }
        catch (ArithmeticException ex){
            System.out.println("Деление на ноль невозможно");
        }
    }

    // №13. Напишите функцию, которая возвращает элемент списка по индексу. Если индекс выходит за пределы списка,
    // выбрасывайте IndexOutOfBoundsException.
    static String ex13(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы списка через пробел");
        String[] input = scanner.nextLine().split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(input));

        System.out.println("Введите индекс");
        int n = scanner.nextInt();

        try{
            return list.get(n);
        }
        catch (IndexOutOfBoundsException ex){
            return "Индекс выходит за границы массива";
        }

    }

    // Класс исключения для задачи #14
    static class WeakPasswordException extends Exception {
        String msg = "Слабый пароль";

        public WeakPasswordException(String message){
            msg = message;
        }
        public String getMessage(){
            return msg;
        }
    }
    // №14. Создайте функцию для проверки сложности пароля. Если пароль содержит менее 8 символов, выбрасывайте
    // исключение WeakPasswordException.
    static void ex14(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль");

        String pass = scanner.nextLine();

        try{
            if (pass.length() < 8){
                throw new WeakPasswordException("Пароль не должен быть менее 8 символов");
            }
        }
        catch (WeakPasswordException ex){
            System.out.println(ex.getMessage());
        }

    }

    // №15. Напишите функцию, которая проверяет, является ли строка корректной датой в формате "dd.MM.yyyy". Если формат
    // неверен, выбрасывайте DateTimeParseException.
    static void ex15(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату");
        String input = scanner.nextLine();

        DateTimeFormatter df = DateTimeFormatter .ofPattern("dd.MM.yyyy", Locale.ENGLISH);
        try{
            LocalDate  d = LocalDate.parse(input, df);
            System.out.println("Верный формат даты");
        }
        catch (DateTimeParseException ex){
            System.out.println("Неверный формат даты");
        }


    }

    // №16. Реализуйте функцию, которая объединяет две строки. Если одна из строк равна null, выбрасывайте
    // NullPointerException.
    static String ex16(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите две строки");

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        try {
            if ((s1 == null) || (s2 == null)){
                throw new NullPointerException("Строка не может быть пустой");
            }
                return s1 + s2;
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
            return "-1";
        }

    }

    // №17. Создайте функцию, которая возвращает остаток от деления двух чисел. Если второе число равно нулю,
    // выбрасывайте исключение.
    static void ex17(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два числа");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        try {
            System.out.println(n1 % n2);
        }
        catch (ArithmeticException ex){
            System.out.println("Деление на ноль невозможно");
        }


    }

    // №18. Реализуйте функцию, которая находит квадратный корень числа. Если число отрицательное, выбрасывайте
    // исключение.
    static void ex18(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int n = scanner.nextInt();

        try{
            if(n < 0){
                throw new ArithmeticException("Число не может быть отрицательным");
            }
            System.out.println(Math.sqrt(n));
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }

    }

    // №19. Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт. Если температура меньше абсолютного
    // нуля, выбрасывайте исключение.
    static void ex19(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру по Цельсию");

        int t = scanner.nextInt();

        try{
            if (t < 0){
                throw new IllegalArgumentException("Аргумент не должен быть меньше нуля");
            }
            System.out.println(t * 9 / 5 + 32);
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    // №20. Создайте функцию, которая проверяет, является ли строка пустой или null. Если строка пустая или равна null,
    // выбрасывайте исключение.
    static void ex20(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");

        String n = scanner.nextLine();

        try{
            if(n == null || n.isEmpty()){
                throw new IllegalArgumentException("Строка пустая или null");
            }
            else System.out.println("Строка не пустая и не null");
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

    }
}