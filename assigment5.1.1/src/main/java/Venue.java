public class Venue {
    private String raw;
    private int id;
    Venue(String raw , int id){
        this.raw = raw;
        this.id = id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }
}
