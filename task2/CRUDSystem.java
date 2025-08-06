
public class CRUDSystem {

	    private int id;
	    private String name;
	    private String marks;

	    public CRUDSystem(int id, String name, String marks) {
	        this.id = id;
	        this.name = name;
	        this.marks = marks;
	    }

	    // Getters and Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getMarks() {
	        return marks;
	    }

	    public void setMarks(String marks) {
	        this.marks = marks;
	    }

	    @Override
	    public String toString() {
	        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	    }
	}
