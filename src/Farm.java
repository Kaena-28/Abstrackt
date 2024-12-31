public abstract class Farm {
    private String adress;
    private String cows;
    private String horses;
    private String sheeps;
    private String ownerName;

    public Farm() {
    }

    public Farm(String adress, String cows, String horses, String sheeps, String ownerName) {
        this.adress = adress;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
        this.ownerName = ownerName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCows() {
        return cows;
    }

    public void setCows(String cows) {
        this.cows = cows;
    }

    public String getHorses() {
        return horses;
    }

    public void setHorses(String horses) {
        this.horses = horses;
    }

    public String getSheeps() {
        return sheeps;
    }

    public void setSheeps(String sheeps) {
        this.sheeps = sheeps;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "adress='" + adress + '\'' +
                ", cows='" + cows + '\'' +
                ", horses='" + horses + '\'' +
                ", sheeps='" + sheeps + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
