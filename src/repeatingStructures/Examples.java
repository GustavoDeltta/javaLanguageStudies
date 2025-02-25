package repeatingStructures;

public class Examples {
    public static void main(String[] args) {

        for(int sheeps = 1; sheeps <= 20; sheeps ++){
            System.out.println("Carneirinhos: " + sheeps);
        }

        String students [] = {"Bárbara", "Gustavo", "Santiago", "Pedro", "Enzo"};
        for(int x = 0; x<students.length; x++){
            System.out.println("O aluno(a) " + students[x] + " está no indice: " + x);
        }
        for(String student:students){
            System.out.println("O aluno(a) é " + student);
        }

    }
}
