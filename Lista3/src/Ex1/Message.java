package Ex1;

public class Message {
    private int ID;
    private String text;
    Person person;

    public Message(int ID, String text, Person person) {
        this.setID(ID);
        this.setText(text);
        this.setPerson(person);
    }

    public Message() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Message{" +
                "ID=" + ID +
                ", text='" + text + '\'' +
                ", person=" + person +
                '}';
    }
}
