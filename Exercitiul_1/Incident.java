import java.util.Vector;

public class Incident {

    private String location;
    private String name;
    private String description;
    private Enum importance;

    public Incident(String location, String name, String description, Enum importance) {
        this.location = location;
        this.name = name;
        this.description = description;
        this.importance = importance;
    }
}