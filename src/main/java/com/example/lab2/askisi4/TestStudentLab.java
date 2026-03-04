package com.example.lab2.askisi4;

import com.example.lab2.askisi3.Student;
import gr.ihu.iee.oop.lab.UserInput;

public class TestStudentLab {
    public static void main(String[] args) {
        System.out.print("Dwse diastasi pinaka: ");
        int n = UserInput.getInteger();
        StudentLab lab = new StudentLab(n);

        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            Student st = new Student();
            lab.insertStudent(st);
        }

        lab.displayLab();
        lab.passed();
        lab.avgStudents();

        Student bestStudent = lab.getPinakas()[lab.bestStudent()];
        System.out.println("\n<--- KALYTEROS MATHITIS  --->");
        System.out.println("Onoma = " + bestStudent.getOnoma());
        System.out.println("Eponymo = " + bestStudent.getEponymo());
        System.out.println("AM = " + bestStudent.getAM());
        System.out.println("Apousies = " + bestStudent.getApousies());
        System.out.println("Vathmos ergastiriou = " + bestStudent.getVathmosErg());
        System.out.println("Vathmos theorias = " + bestStudent.getVathmosTheor());
        System.out.println("Telikos vathmos = " + bestStudent.computeFinal());
        System.out.print("\n");
    }
}
