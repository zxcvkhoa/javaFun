
public class ProjectTest {
    public static void main(String[] args) {
        Project a = new Project();
        a.setName("Jacky");
        a.setDescription("Does not like Flask");
        String aName = a.getName();
        String aDesc = a.getDescription();
        System.out.println(aName + " : " + aDesc);
        
    }
}