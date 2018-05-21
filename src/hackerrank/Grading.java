package hackerrank;

public class Grading {

    public static void main(String[] args) {
        int[] test = {73, 67, 38, 33};
        System.out.println(gradingStudents(test));
    }

    static int[] gradingStudents(int[] grades) {

        int nextMult;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 38) {
                continue;
            }

            nextMult = (int)(Math.ceil(grades[i] / 5.0) * 5);

            if (nextMult - grades[i] < 3) {
                grades[i] = nextMult;
            }
        }

        return grades;
    }
}
