public class ProjectTest {
    public static void main(String[] args) {
        Project proj1 = new Project();
        proj1.setName("Great Project");
        proj1.setDescription("The greatest Project of all times");
        proj1.setInitialCost(300.00);
        proj1.elevatorPitch(proj1);
        Project proj2 = new Project("Good Project");
        proj2.setDescription("It is OK project");
        proj2.setInitialCost(250.00);
        Project proj3 = new Project("Bad Project", "Needs a lot of work");
        proj3.setInitialCost(100.00);
        proj2.elevatorPitch(proj2);
        proj3.elevatorPitch(proj3);
        Portfolio portfolio = new Portfolio();
        portfolio.addProjectToPortfolio(proj1);
        portfolio.addProjectToPortfolio(proj2);
        portfolio.addProjectToPortfolio(proj3);
        
        portfolio.showPortfolio();
        System.out.println(portfolio.getProjects());

    }
}
