package com.example.lab2.askisi4;

import com.example.lab2.askisi3.Student;
import gr.ihu.iee.oop.lab.UserInput;

public class StudentLab {
    private int diastasi;
    private int top;
    private Student[] pinakas;

    StudentLab(int diastasi) {
        this.diastasi = diastasi;
        this.pinakas = new Student[diastasi];
        this.top = 0;
    }

    public void passed() {
        int count = 0;

        for (int i = 0; i < pinakas.length; i++) {
            if (pinakas[i].computeFinal() >= 5) count++;
        }

        System.out.println("Plithos: " + count);
    }

    public void avgStudents() {
        double sum = 0;

        for (int i = 0; i < pinakas.length; i++) {
            sum += pinakas[i].computeFinal();
        }

        System.out.println("Mesos oros tmimatos: " + (double) (sum / pinakas.length));
    }

    public int bestStudent() {
        double max = pinakas[0].computeFinal();
        int maxThesi = 0;

        for (int i = 0; i < pinakas.length; i++) {
            if (pinakas[i].computeFinal() > max) {
                max = pinakas[i].computeFinal();
                maxThesi = i;
            }
        }

        return maxThesi;
    }

    public void insertStudent(Student st) {
        int pos = top++;

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

        pinakas[pos] = st;
    }

    public void displayLab() {
        for (int i = 0; i < pinakas.length; i++) {
            System.out.println("<--- MATHITIS[" + i + "]  --->\n");
            System.out.println("Onoma mathiti[" + i + "] = " + pinakas[i].getOnoma());
            System.out.println("Eponymo mathiti[" + i + "] = " + pinakas[i].getEponymo());
            System.out.println("AM mathiti[" + i + "] = " + pinakas[i].getAM());
            System.out.println("Apousies mathiti[" + i + "] = " + pinakas[i].getApousies());
            System.out.println("Vathmos ergastiriou mathiti[" + i + "] = " + pinakas[i].getVathmosErg());
            System.out.println("Vathmos theorias mathiti[" + i + "] = " + pinakas[i].getVathmosTheor());
            System.out.println("Telikos vathmos mathiti[" + i + "] = " + pinakas[i].computeFinal());
            System.out.print("\n");
        }
    }

    public Student[] getPinakas() {
        // .clone() giati einai private
        // kai den theloume na epexergastei ekswterika
        return pinakas.clone();
    }
}
