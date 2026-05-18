package com.example.ergastiria.lab9;

public class Stathero extends Tilefono {
    public Stathero(String arithmosTilefonou) {
        super(arithmosTilefonou);
    }

    @Override
    public void dial(String arithmosIncoming) {
        String typosTilefonouIncoming = "";
        if(arithmosIncoming.charAt(0) == '2') typosTilefonouIncoming = "σταθερό";
        else if(arithmosIncoming.charAt(0) == '6') typosTilefonouIncoming = "κινητό";

        System.out.println("Κλήση από το σταθερό τηλέφωνο (" + this.getArithmosTilefonou() + ") προς το " + typosTilefonouIncoming + " με αριθμό " + arithmosIncoming);
    }

    @Override
    public double calculateCost() {
        return Tilefono.kosthKlisewn[0]*this.getDeuteroleptaProsStathera()
                + Tilefono.kosthKlisewn[1]*this.getDeuteroleptaProsKinita();
    }
}
