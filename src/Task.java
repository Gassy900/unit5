
public class Task {

    private String name;
    private String desc;

    public Task(String n, String d) {
        name = n;
        desc = d;
    }

    public void setName(String n) {
        name = n;
    }

    public void setDesc(String d) {
        desc = d;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public boolean validate() {
        if (name == null || desc == null || name.equals("") || desc.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        return "Name: " + name + "\nDescription: " + desc + "\n==========\n";
    }
}
