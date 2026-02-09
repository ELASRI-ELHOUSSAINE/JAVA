public class Classroom {
    Students[] students;
    private static int studentCount;

    public Classroom() {
        students = new Students[30];
        studentCount = 0;
    }

    public void addStudents(Students s){
        students[studentCount] = s;
        studentCount++;
    }

    public void showBestGradePerStudent() {
        for (int i = 0; i < studentCount; i++) {
            int max = students[i].grades[0];
            for (int j = 1; j < students[i].grades.length; j++){
                if (max < students[i].grades[j]) max = students[i].grades[j];
            }
            System.out.println("Le max des notes de l'etudiant " + students[i].fullName + " est : " + max);
        }
    }

    public Students getStudentWithHighestGrade() {
        Students bestStudent = students[0];
        int max = students[0].grades[0];
        for (int i = 0; i < studentCount; i++) {
            for (int j = 0; j < students[i].grades.length; j++) {
                if (students[i].grades[j] > max) {
                    max = students[i].grades[j];
                    bestStudent = students[i];
                }
            }
        }
        return bestStudent;
    }

    public Students getStudentWithLowestGrade() {
        Students lowestStudent = students[0];
        int min = students[0].grades[0];
        for (int i = 0; i < studentCount; i++) {
            for (int j = 0; j < students[i].grades.length; j++) {
                if (students[i].grades[j] < min) {
                    min = students[i].grades[j];
                    lowestStudent = students[i];
                }
            }
        }
        return lowestStudent;
    }

    public double getAverageGrade(){
        int somme = 0;
        int totalNotes = 0;
        for (int i = 0; i < studentCount; i++) {
            for (int j = 0; j < students[i].grades.length; j++){
                somme += students[i].grades[j];
                totalNotes++;
            }
        }
        return totalNotes > 0 ? (double) somme / totalNotes : 0;
    }

    public int countStudent(){
        return studentCount;
    }
}
