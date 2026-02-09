import java.util.Scanner;
public class StudentsGradesManagerPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Classroom classes = new Classroom();

        System.out.print("Combien d'etudiants doit etre ajoutés : ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            sc.nextLine();
            System.out.print("Entre le nom de l'etudiant : ");
            String nom = sc.nextLine();

            System.out.print("Combien de notes pour " + nom + " : ");
            int nbNote = sc.nextInt();
            int[] notes = new int[nbNote];

            for (int j = 0; j < nbNote; j++) {
                System.out.print("Entrez la note " + (j+1) + " de " + nom + " : ");
                notes[j] = sc.nextInt();
            }

            Students e = new Students(nom, notes);
            classes.addStudents(e);
        }

        System.out.println("\n------ Meilleure note par étudiant ------");
        classes.showBestGradePerStudent();

        Students best = classes.getStudentWithHighestGrade();
        Students worst = classes.getStudentWithLowestGrade();

        System.out.println("\nEtudiant avec la meilleure note : " + best.fullName);
        System.out.println("Etudiant avec la plus faible note : " + worst.fullName);
        System.out.println("Moyenne générale de la classe : " + classes.getAverageGrade());
        System.out.println("Nombre total d'étudiants : " + classes.countStudent());
    }
}
