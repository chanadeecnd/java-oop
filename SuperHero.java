abstract class SuperHero {
    private String name;
    private int age;
    private String job;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void skill(String skill);

    public void displayHero() {
        System.out.printf("Hero name : %s, age : %d%n", this.name, this.age);
    }
}
