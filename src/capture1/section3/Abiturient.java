package capture1.section3;

public class Abiturient {
    private static long i;
    private long id;
    private String surname;
    private String name;
    private String patronimic;
    private String address;
    private String phone;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public void setPatronimic(String patronimic) {
        this.patronimic = patronimic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public long getId() {
        return id;
    }

    private int mark;
    /**{
        marks = new ArrayList<>(3);
    }**/
    public Abiturient() {
        this.id = ++i;
        this.surname = "Surname"+id;
        this.name = "Name"+id;
        this.patronimic = "Patronimic"+id;
        this.mark = 2;
    }

    public Abiturient(String surname, String name, String patronimic, int mark) {
        this.id = ++i;
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.mark = mark;
    }

    public Abiturient(String surname, String name, String patronimic, String address, String phone, int mark) {
        this.id = ++i;
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.address = address;
        this.phone = phone;
        this.mark = mark;
    }

    public Abiturient(String surname, String name, int mark ){
        this.id = ++i;
        this.surname = surname;
        this.name = name;
        this.mark = mark;
    }

    public String toString(){
        StringBuilder str = new StringBuilder(name+" " + surname+" "+patronimic+" "+id+"\n");
        str.append("Mark: "+mark+"\n");
        str.append("Addres:"+address+"\n"+"Phone:"+phone+"\n");
        str.append("_______");
        return str.toString();
    }



}
