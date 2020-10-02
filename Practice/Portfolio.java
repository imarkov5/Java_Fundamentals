import java.util.ArrayList;
public class Portfolio {
    
    ArrayList<Object> projects = new ArrayList<Object>();

    public ArrayList getProjects(){
        return this.projects;
    }
    public void setProjects(ArrayList<Object> projects){
        this.projects = projects;
    }
    public ArrayList<Object> addProjectToPortfolio(Project project){
        projects.add(project);
        return projects;
    }
    public Portfolio(){

    }
    public Portfolio(ArrayList<Object> projects){
        this.projects = projects;
    }
    // public ArrayList showPortfolio(){
    //     System.out.println(projects);
    //     return projects;
    // }
    public void showPortfolio(){
        ArrayList projects = getProjects();
        for(int counter = 0; counter < projects.size(); counter++){
            System.out.println(projects.get(counter));
        }
    }
    public void getPortfolioCost(){
        ArrayList projects = getProjects();
        int PortfolioCost = 0;
        for(int counter = 0; counter < projects.size(); counter++){
            projects.get(counter).
        }
    }
    // public String showPortfolio(ArrayList projects){
    //     for(int counter = 0; counter < projects.size(); counter++){
    //         return projects.get(counter).toString();
    //     }
    // }

}
