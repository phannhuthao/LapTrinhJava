package Session22.bt7;

public class Country {
    public int id;
    public String code;
    public String name;

    public Country(int id, String code, String name) {
        this.name = name;
        this.id = id;
        this.code = code;
    }

    void showInfo() {
        System.out.print("[" + "ID: " + id + "|" + "CODE: " + code + "|" + "NAME: " + name +"]");
    }
}
