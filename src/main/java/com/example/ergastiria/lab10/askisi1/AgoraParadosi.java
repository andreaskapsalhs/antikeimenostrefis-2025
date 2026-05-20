package com.example.ergastiria.lab10.askisi1;

public class AgoraParadosi implements Asfalismeno {
    private ProsPolisi artworkToBeDelivered;
    private boolean isFragile;
    private double insuranceCost;
    private int volume;
    private int weight;

    public AgoraParadosi(ProsPolisi artworkToBeDelivered, boolean isFragile, int volume, int weight) {
        this.artworkToBeDelivered = artworkToBeDelivered;
        this.isFragile = isFragile;
        this.insuranceCost = getInsuranceCost();
        this.volume = volume;
        this.weight = weight;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public double getInsuranceCost() {
        return this.artworkToBeDelivered.getCataloguePrice() * 0.1;
    }

    @Override
    public boolean isFragile() {
        return this.isFragile;
    }

    @Override
    public String toString() {
        return "AgoraParadosi{" +
                "artworkToBeDelivered=" + artworkToBeDelivered +
                ", isFragile=" + isFragile +
                ", insuranceCost=" + insuranceCost +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
