package OOPS.IPA;

public class Associate {
    private int id;
    private String name;
    private Double scores;
    private int experience;
    public Associate(int id, String name, Double scores, int experience) {
        this.id = id;
        this.name = name;
        this.scores = scores;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScores() {
        return scores;
    }

    public void setScores(Double scores) {
        this.scores = scores;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
