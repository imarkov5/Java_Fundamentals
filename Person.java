public class Person {
    private int age;
    private int cmHeight;
    private String name;
    //Empty constructor with default values. It has to be first statement to call the other constructor
    public Person(){
        this(20, "John Doe", 171);
    }
    public Person(int ageParam, String nameParam, int cmHeight){
        this.age = ageParam;
        this.name = nameParam;
        this.cmHeight = cmHeight;
    }
    public void objectMethods(Person anotherObject){
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("toString: " + this.toString());
        System.out.println("Equals: " + this.equals(anotherObject));
    }
}
