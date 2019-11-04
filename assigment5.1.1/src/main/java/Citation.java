import java.util.List;

public class Citation {
    private String name;
    private String id;
    private String title;
    private List<Authors> authors;
    private int nCitation;
    private List<FOS> fos;
    private List<Venue> venue;
    private int pageStart;
    private int pageEnd;
    private String Publisher;
    private String Volume;
    private String issue;
    private String doi;
    public Citation(){}

    public List<FOS> getFos() {
        return fos;
    }

    public void setFos(List<FOS> fos) {
        this.fos = fos;
    }

    public int getnCitation() {
        return nCitation;
    }

    public void setnCitation(int nCitation) {
        this.nCitation = nCitation;
    }

    public void setAuthors(List<Authors> authors) {
        this.authors = authors;
    }

    public List<Authors> getAuthors() {
        return authors;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Venue> getVenue() {
        return venue;
    }

    public void setVenue(List<Venue> venue) {
        this.venue = venue;
    }

    public int getPageEnd() {
        return pageEnd;
    }

    public int getPageStart() {
        return pageStart;
    }

    public void setPageEnd(int pageEnd) {
        this.pageEnd = pageEnd;
    }

    public void setPageStart(int pageStart) {
        this.pageStart = pageStart;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public String getDoi() {
        return doi;
    }

    public String getIssue() {
        return issue;
    }

    public String getVolume() {
        return Volume;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public void setVolume(String volume) {
        Volume = volume;
    }
}