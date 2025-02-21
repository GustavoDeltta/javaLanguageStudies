package conditionalsStructures;

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
    
    public static void main(String[] args) {
        


    }

}
