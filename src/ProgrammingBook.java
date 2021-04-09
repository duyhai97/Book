public class ProgrammingBook  extends Book {
    private String language;
    private String famework;
    public ProgrammingBook(String bookCode, String name, int price, String author, String language, String famework) {
        super(bookCode, name, price, author);
        this.famework = famework;
        this.language = language;

    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFamework() {
        return famework;
    }

    public void setFamework(String famework) {
        this.famework = famework;
    }

}
