package com.example.lab2.askisi3;

import gr.ihu.iee.oop.lab.UserInput;

public class TestStudent {
    public static void main(String[] args) {
        System.out.print("Dwse diastasi pinaka: ");
        int n = UserInput.getInteger();
        Student[] lab = new Student[n];

        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            Student st = new Student();
            insertStudent(lab, st, i);
        }

        displayLab(lab);
        passed(lab);
        avgStudents(lab);

        Student bestStudent = lab[bestStudent(lab)];
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

    public static void insertStudent(Student[] lab, Student st, int pos) {
        System.out.print("Dwse onoma mathiti[" + pos + "]: ");
        st.setOnoma(UserInput.getString());

        System.out.print("Dwse eponymo mathiti[" + pos + "]: ");
        st.setEponymo(UserInput.getString());

        System.out.print("Dwse AM mathiti[" + pos + "]: ");
        st.setAM(UserInput.getInteger());

        System.out.print("Dwse apousies mathiti[" + pos + "]: ");
        st.setApousies(UserInput.getInteger());

        System.out.print("Dwse vathmo ergastiriou mathiti[" + pos + "]: ");
        st.setVathmoErg(UserInput.getDouble());

        System.out.print("Dwse vathmo theorias mathiti[" + pos + "]: ");
        st.setVathmoTheor(UserInput.getDouble());
        System.out.print("\n");

        lab[pos] = st;
    }

    public static void displayLab(Student[] lab) {
        for (int i = 0; i < lab.length; i++) {
            System.out.println("<--- MATHITIS[" + i + "]  --->\n");
            System.out.println("Onoma mathiti[" + i + "] = " + lab[i].getOnoma());
            System.out.println("Eponymo mathiti[" + i + "] = " + lab[i].getEponymo());
            System.out.println("AM mathiti[" + i + "] = " + lab[i].getAM());
            System.out.println("Apousies mathiti[" + i + "] = " + lab[i].getApousies());
            System.out.println("Vathmos ergastiriou mathiti[" + i + "] = " + lab[i].getVathmosErg());
            System.out.println("Vathmos theorias mathiti[" + i + "] = " + lab[i].getVathmosTheor());
            System.out.println("Telikos vathmos mathiti[" + i + "] = " + lab[i].computeFinal());
            System.out.print("\n");
        }
    }

    public static void passed(Student[] lab) {
        int count = 0;

        for (int i = 0; i < lab.length; i++) {
            if (lab[i].computeFinal() >= 5) count++;
        }

        System.out.println("Plithos: " + count);
    }

    public static void avgStudents(Student[] lab) {
        double sum = 0;

        for (int i = 0; i < lab.length; i++) {
            sum += lab[i].computeFinal();
        }

        System.out.println("Mesos oros tmimatos: " + (double) (sum / lab.length));
    }

    public static int bestStudent(Student[] lab) {
        double max = lab[0].computeFinal();
        int maxThesi = 0;

        for (int i = 0; i < lab.length; i++) {
            if (lab[i].computeFinal() > max) {
                max = lab[i].computeFinal();
                maxThesi = i;
            }
        }

        return maxThesi;
    }
}
