package conditionalsStructures;

import java.util.Scanner;

public class resolution {

    public static String person(String name, int age){

        // return age <= 12 ? "Criança" : age >= 13 && age <= 17 ? "Adolescente" : age >= 18 && age <= 59 ? "Adulto" : "Idoso"; 

        if (age <= 12) {
            return "Criança";
        }else if (age >= 13 && age <= 17) {
            return "Adolescente";
        }else if(age >= 18 && age <= 59){
            return "Adulto";
        }else{
            return "Idoso";
        }
    }

    public static String bulletin(int grade){

        if (grade >= 9) {
            return "A";
        }else if (grade >= 7) {
            return "B";
        }else if (grade >= 5) {
            return "c";
        }else if (grade >= 3) {
            return "D";
        }else{
            return "F";
        }
    }

    public static String pairOrOdd(int number){
        return number%2 == 0 ? "Par" : "Impar";
    }

    // Um ano é bissexto se for múltiplo de 4, mas não múltiplo de 100, exceto se for múltiplo de 400.
    public static String leapYear(int year){
        return year%4 == 0 || year%400 == 0 && year %100 != 0 ? "É bissexto" : "Não é bissexto"; 
    }

    public static double calculator(double fisrtNumber, double secondNumber, String operator){
        double result = 0;
        switch (operator) {
            case "+": result = fisrtNumber + secondNumber;
            case "-": result = fisrtNumber - secondNumber;
            case "/": result = fisrtNumber / secondNumber;
            case "*": result = fisrtNumber * secondNumber;   
            default:
                break;
        }
        return result;
    }

    public static String login(String user, String password){

        if(user.equals("admin") && password.equals("1234")){
            return "Logim bem-sucedido!";
        }else{
            return "Credenciais inválidas";
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String name = scanner.nextLine();
        System.out.print("Insira a sua idade: ");
        int age = scanner.nextInt();
        
        System.out.println(person(name, age));

        System.out.print("Digite sua nota: ");
        int grade = scanner.nextInt();

        System.out.println(bulletin(grade));

        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        System.out.println(pairOrOdd(number));

        System.out.print("Informe um ano: ");
        int year = scanner.nextInt();

        System.out.println(leapYear(year));

        System.out.print("Diga-me um número: ");
        double number1 = scanner.nextInt();
        System.out.print("Diga-me outro número: ");
        double number2 = scanner.nextInt();

        System.out.print("Agora escolha uma operação para realizar (+, -, , /): ");
        String operator = scanner.nextLine();

        System.out.println(calculator(number1, number2, operator));

        System.out.print("Por ultimo, me informe o seu login: ");
        String user = scanner.nextLine();
        System.out.print("Insira a sua senha: ");
        String password = scanner.nextLine();

        System.out.println(login(user, password));

    }

}
