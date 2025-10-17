package projects;

public class Girlfriend {
    // Attributes (fields)
    private String name;
    private int age;
    private String[] hobbies;

    // Constructor
    public Girlfriend(String name, int age, String[] hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    // Method to display girlfriend info
    public void introduce() {
        System.out.println("Hi, my name is " + name + "!");
        System.out.println("I'm " + age + " years old.");
        System.out.print("My hobbies are: ");
        for (int i = 0; i < hobbies.length; i++) {
            System.out.print(hobbies[i]);
            if (i < hobbies.length - 1) System.out.print(", ");
        }
        System.out.println(".");
    }


    // Main
    public static void main(String[] args) {
        String[] hobbies = {"reading", "traveling", "cooking"};
        Girlfriend gf = new Girlfriend("Anna", 25, hobbies);
        gf.introduce();
    }
}