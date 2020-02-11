package com.zcode.InterfaceDeserialization;

public class Lexus implements Car, Cylinder {

    private int maxSpeed;
    private String type;
    private int rankingAmongSedans;
    private String model;
    private int cylinder;

    public Lexus(String model, int maxSpeed, String type, int rankingAmongSedans) {
      this.model = model;
      this.maxSpeed = maxSpeed;
      this.type = type;
      this.rankingAmongSedans = rankingAmongSedans;
      this.cylinder = 4;
    }
    public String model() {
        return model;
    }
    public int maxSpeed() {
        return maxSpeed;
    }
    public String type() {
        return type;
    }
    public int getRankingAmongSedans() {
        return rankingAmongSedans;
    }
	public int cylinder() {
		return cylinder;
	}
    @Override
    public String toString(){
        return "Model: " + model + ", Max speed: " + maxSpeed + " km/h, Type: "
        		+ type + ", Ranking: " + rankingAmongSedans
        		+ " Cylinder: " + Integer.toString(cylinder);
    }

}