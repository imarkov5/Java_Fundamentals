public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project("Great Project");
        Project project2 = new Project("The Best Project", "This is our best project ever");
        Project project3 = new Project();
        project1.elevatorPitch();
        project2.elevatorPitch();
        project3.elevatorPitch();
        project3.setName("Third Project");
        project3.setDescription("Description for the third project");
        project3.elevatorPitch();
        project1.setDescription("Great description for the great project");
        project1.elevatorPitch();
        System.out.println("My last project: " + project3.getName());

        Project project4 = new Project("Fourth Project", "Description of the Fourth Project", 999.00);
        project4.elevatorPitch();

        project1.setInitialCost(1000.00);
        project2.setInitialCost(2000.00);
        project1.elevatorPitch();
        project2.elevatorPitch();

    }
}
