package day4;

public class costamer {
    int id;
    String name;
    char gender;


    public void  costamer(int id, String name,char gender){


    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender(char gender) {
        try {
           if((gender=="f") || (gender="m"));
           return gender;
        }
        catch (Exception e){
            System.out.println("error");
    }

    @Override
    public String toString() {
        return "costamer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
