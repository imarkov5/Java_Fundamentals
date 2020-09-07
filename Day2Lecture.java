public class Day2Lecture{
    public static void main(String[] args) {
        /*String name = "Jeremy";
        String name2 = "Jeremy";
        System.out.println(name == name2);//true

        String name3 = new String("Jeremy");
        String name4 = new String("Jeremy");
        System.out.println(name3 == name4);//false, because they are two different instances

        String name5 = new String("Jeremy");
        String name6 = new String("Jeremy");
        System.out.println(name5.equals(name6));//true because it's comparing what's inside of the instances*/

        String[] people = {"Matthew", "Jaremy", "Edgar"};
        //you can't add new index in to the existing array
        people[3] = "Justin"; // out ob bounds error'

        //On of the ways to have more people
        String newPeople = new String();
        newPeople[0] = "Matthew";
        newPeople[1] = "Matthew";
        newPeople[2] = "Matthew";
        newPeople[3] = "Matthew";
        newPeople[4] = "Matthew";
        newPeople[5] = "Matthew";
        newPeople[6] = "Matthew";
        newPeople[7] = "Matthew";
        newPeople[8] = "Matthew";
        newPeople[9] = "Matthew";
        newPeople[10] = "Matthew";
        System.out.println(newPeople);

    }
}