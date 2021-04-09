
public class Main {
    public static void main(String[] args) {
        Book[] bookss = new Book[10];
        bookss[0] = new ProgrammingBook("B01", "S1", 10, "hai0", "java", "spring");
        bookss[1] = new ProgrammingBook("B02", "S2", 11, "hai1", "java1", "spring");
        bookss[2] = new ProgrammingBook("B03", "S3", 12, "hai2", "java2", "spring");
        bookss[3] = new ProgrammingBook("B04", "S4", 13, "hai3", "java", "spring");
        bookss[4] = new ProgrammingBook("B05", "S5", 14, "hai4", "java", "spring");

        bookss[5] = new FictionBook("B06", "S6", 15, "hai5", "hddd");
        bookss[6] = new FictionBook("B07", "S7", 16, "hai6", "hddd");
        bookss[7] = new FictionBook("B08", "S8", 15, "hai7", "hddd");
        bookss[8] = new FictionBook("B09", "S9", 15, "hai8", "hddd");
        bookss[9] = new FictionBook("B10", "S10", 18, "hai9", "hddd");


        int count = 0;
        for (Book o: bookss
             ) {
            if (o instanceof ProgrammingBook) {
                if (((ProgrammingBook) o).getLanguage() == "java"){
                    count++;
                }
            }
        }
        System.out.println( " tong so sach java la: " + count);

        ManagerBook a = new ManagerBook();
        System.out.println("tong tien la: " + a.total(bookss));

        a.sapxep(bookss);
        System.out.println(a.sapxep(bookss));



    }
}
