package Ex1;
import java.util.ArrayList;
import java.util.List;
public class Forum {
    private int ID;
    private String name, url;
    private List<Message> message;

    public Forum(int ID, String name, String url) {
        this.setID(ID);
        this.setName(name);
        this.setUrl(url);
        this.message = new ArrayList<Message>();
    }

    public Forum() {
        this.message = new ArrayList<Message>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Ex1.Message> getMessage() {
        return message;
    }

    public void setMessage(List<Ex1.Message> message) {
        this.message = message;
    }

    public void addMessage(int ID, String text, Person person) {
        this.message.add(new Message(ID, text, person));
    }

    public String cadMessage(){
        return "Message = " + message;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", message=" + message +
                '}';
    }
}
