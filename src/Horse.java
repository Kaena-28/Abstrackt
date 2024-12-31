public class Horse extends Farm {
    private String weight;
    private int age;
    private String color;
    private String gender;
    private String nickName;

    public Horse() {
    }

    public Horse(String adress, String cows, String horses, String sheeps, String ownerName) {
        super(adress, cows, horses, sheeps, ownerName);
    }

    public Horse(String weight, int age, String color, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.nickName = nickName;
    }

    public Horse(String adress, String cows, String horses, String sheeps, String ownerName, String weight, int age, String color, String gender, String nickName) {
        super(adress, cows, horses, sheeps, ownerName);
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.nickName = nickName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight='" + weight + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
