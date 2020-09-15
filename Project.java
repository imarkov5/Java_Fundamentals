public class Project {
    private String name;
    private String description;
    private double initialCost;

    public Project(){

    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public Project(String name, String description, double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }
    public void elevatorPitch(){
        System.out.println(name + " (" + initialCost + "): " + description);
    }

    //getter
    public String getName(){
        return this.name;
    }
    //setter
    public void setName(String name){
        this.name = name;
    }
    //getter
    public String getDescription(){
        return this.description;
    }
    //setter
    public void setDescription(String description){
        this.description = description;
    }
    //getter
    public double getInitialCost(){
        return this.initialCost;
    }
    //setter
    public void setInitialCost(double initialCost){
        this.initialCost = initialCost;
    }
}
