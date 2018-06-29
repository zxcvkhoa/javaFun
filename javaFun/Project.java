

public class Project {
    private String name;
    private String description;

    public void elevatorPitch() {
        System.out.println(this.name + " : " + this.description);
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Project() {
        this.name = "Project Name";
        this.description = "Project Description";
    }
    
    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
