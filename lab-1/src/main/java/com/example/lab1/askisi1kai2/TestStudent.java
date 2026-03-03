package com.example.lab1.askisi1kai2;

public class TestStudent {
    public static void main(String[] args) {
        // Statika dedomena xwris xrisi tou UserInput.
        Student st1 = new Student("Onoma1", "Epitheto1", 1, 1, 10, 9);
        Student st2 = new Student("Onoma2", "Epitheto2", 2, 2, 5, 5);
        Student st3 = new Student("Onoma3", "Epitheto3", 3, 1, 8, 6);

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());

        String lista = TestStudent.compareThreeStudentMarks(st1, st2, st3);
        System.out.println(lista);
    }

    // ΑΣΚΗΣΗ 2 (Επαύξηση της άσκησης 1)
    public static String compareThreeStudentMarks(Student s1, Student s2, Student s3) {
        double vathmos1 = s1.computeFinal();
        double vathmos2 = s2.computeFinal();
        double vathmos3 = s3.computeFinal();

        double max = -1;
        double min = 11;

        if (vathmos1 > max) max = vathmos1;
        if (vathmos2 > max) max = vathmos2;
        if (vathmos3 > max) max = vathmos3;

        if (vathmos1 < min) min = vathmos1;
        if (vathmos2 < min) min = vathmos2;
        if (vathmos3 < min) min = vathmos3;

        double mesaios = vathmos1 + vathmos2 + vathmos3 - max - min;

        return (
                "1. " + max +
                        "\n2. " + mesaios +
                        "\n3. " + min
        );
    }
}
