
public abstract class traveler {

    private String name;
    private String nationality;
    private int age;

    public traveler(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    public traveler() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

    @Override
    public String toString() {
        return "name=" + name + " Nationality: " + nationality + " Age: " + age;
    }

    @Override
    public boolean equals(Object obj) {

        traveler other = (traveler) obj;
        return name.equals(other.name) && nationality.equals(other.nationality);
    }

}
