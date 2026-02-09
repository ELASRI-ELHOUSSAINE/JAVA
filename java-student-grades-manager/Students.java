public class Students {
    String fullName;
    int[] grades;

    public Students(String name, int[] notes){
        fullName = name;
        grades = notes;
    }

    public void showInfo() {
        System.out.println("le nom de l'etudiant : " + fullName);
        System.out.println("--------------- ses notes -----------");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("la note " + (i+1) + " est : " + grades[i]);
        }
    }

    public void Calcule() {
        int max = grades[0];
        int min = grades[0];
        int somme = 0;
        for(int i = 0; i < grades.length; i++){
            if (max < grades[i]) max = grades[i];
            if (min > grades[i]) min = grades[i];
            somme += grades[i];
        }
        System.out.println(" ----------- les statistiques ----------------------");
        System.out.println("le max est : " + max);
        System.out.println("le min est : " + min);
        System.out.println("la moyenne : " + (double)somme / grades.length);
    }
}
