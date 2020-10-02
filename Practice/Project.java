public class Project {
    private String name;
    private String description;
    private double initialCost;

    public double getInitialCost(){
        return this.initialCost;
    }
    public void setInitialCost(double initialCost){
        this.initialCost = initialCost;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    
    public Project(){

    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String elevatorPitch(Project project){
        String pitch = "";
        System.out.println(pitch.concat(project.name + "(" + project.initialCost + ")" + " : " + project.description));
        return pitch;
    } 
}
