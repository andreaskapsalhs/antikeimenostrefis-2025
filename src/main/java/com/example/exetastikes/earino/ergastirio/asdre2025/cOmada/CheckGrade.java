package com.example.exetastikes.earino.ergastirio.asdre2025.cOmada;

import gr.ihu.iee.oop.lab.UserInput;

public class CheckGrade {
    public static void main(String[] args) throws LathosEisodou {
        Student[] pinakas = new Student[3];

        for (int i = 0; i < pinakas.length; i++) {
            double chance = Math.random();

            if(chance > 0.7) {
                System.out.println("Give pososto: ");
                double pososto = UserInput.getDouble();

                // vazw to finalGrade=0 ston domiti giati alliws den vgazei noima h ekfwnisi
                SecondYear deuteroEtis = new SecondYear(0, pososto);

                System.out.println("Give final grade: ");
                double finalGrade = UserInput.getDouble();

                try {
                    deuteroEtis.setFinalGrade(finalGrade);
                } catch (LathosEisodou e) {
                    System.out.println(e.getMessage());
                    deuteroEtis.setFinalGrade(0);
                }

                pinakas[i] = deuteroEtis;
            }
            else {
                System.out.println("Give theory grade: ");
                double theoryGrade = UserInput.getDouble();

                System.out.println("Give subject id: ");
                int id = UserInput.getInteger();

                Subject subject = new Subject(id);

                // vazw to labgrade=0 ston domiti giati alliws den vgazei noima h ekfwnisi
                FirstYear prwtoEtis = new FirstYear(0d, theoryGrade, subject);

                System.out.println("Give lab grade: ");
                double labGrade = UserInput.getDouble();

                try {
                    prwtoEtis.setLabGrade(labGrade);
                } catch (LathosEisodou e) {
                    System.out.println(e.getMessage());
                    prwtoEtis.setLabGrade(0);
                }

                pinakas[i] = prwtoEtis;
            }
        }

        for (int i = 0; i < pinakas.length; i++) {
            System.out.println(pinakas[i].toString());
            if(pinakas[i] instanceof FirstYear) {
                System.out.println("Subject id: " + ((FirstYear) pinakas[i]).getSubject().getId());
                ((FirstYear) pinakas[i]).getSubject().study();
            }
        }

        System.out.println("Max theory grade of first year students: " + maxFirst(pinakas));
    }

    public static double maxFirst(Student[] pinakas) {
        double max = -1;

        for (int i = 0; i < pinakas.length; i++) {
            if (pinakas[i] instanceof FirstYear && ((FirstYear) pinakas[i]).getTheoryGrade() > max) {
                max = ((FirstYear) pinakas[i]).getTheoryGrade();
            }
        }

        return max;
    }
}
