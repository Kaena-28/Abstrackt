public class Sheep extends Farm {
    private String weight;
    private int age;
    private String gender;
    private String nickName;

    public Sheep() {
    }

    public Sheep(String adress, String cows, String horses, String sheeps, String ownerName) {
        super(adress, cows, horses, sheeps, ownerName);
    }

    public Sheep(String weight, int age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    public Sheep(String adress, String cows, String horses, String sheeps, String ownerName, String weight, int age, String gender, String nickName) {
        super(adress, cows, horses, sheeps, ownerName);
        this.weight = weight;
        this.age = age;
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
        return "Sheep{" +
                "weight='" + weight + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
