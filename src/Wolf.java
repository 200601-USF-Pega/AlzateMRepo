public class Wolf extends Animal{

    public Wolf(String name, int age){

        this.setName(name);
        this.setAge(age);
    }

    @Override
    public void age() {
        super.age();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "Wolf" + " " + getName() + " " + getAge();
    }
}
