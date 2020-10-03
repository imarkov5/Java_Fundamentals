public class PersonStatic {
    private int age;
    private String name;
    //public static int numberOfPeople = 0;
    private static int numberOfPeople = 0;
    public PersonStatic(int ageParam, String nameParam){
        this.age = ageParam;
        this.name = nameParam;
        numberOfPeople++;
    }
    public static int peopleCount(){
        return numberOfPeople;
    }
}
