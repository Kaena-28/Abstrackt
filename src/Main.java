import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("54 kg", 10, "female", "1007");
        Sheep sheep2 = new Sheep("34 kg", 12, "female", "1007");
        Sheep sheep3 = new Sheep("70 kg", 15, "male", "1007");
         Cow cow = new Cow("78 kg", 16, "male", "Dastan");
         Cow cow2 = new Cow("94 kg", 9, "female", "Dastan");
         Cow cow3 = new Cow("54 kg", 13, "male", "Dastan");
         Cow cow4 = new Cow("18 kg", 17, "male", "Dastan");
         Cow cow5 = new Cow("67 kg", 18, "female", "Dastan");
         Horse horse = new Horse("100 kg", 27, "white", "female", "Masha");
         Horse horse2 = new Horse("100 kg", 27, "black", "male", "Masha");
        Farm[] farm1 = {sheep, sheep2, sheep3, cow, cow2, cow3, cow4, cow5, horse, horse2};
        System.out.println(Arrays.toString(farm1));

        Sheep sheep4 = new Sheep("54 kg", 10, "female", "1007");
        Cow cow6 = new Cow("67 kg", 18, "female", "Dastan");
        Horse horse3 = new Horse("100 kg", 27, "black", "male", "Masha");
        Farm[] farm2 = {sheep4, cow6, horse3};
        System.out.println(Arrays.toString(farm2));
    }
}