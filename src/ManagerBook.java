public class ManagerBook {
    private static ProgrammingBook books[];

    public static ProgrammingBook[] getBooks() {
        return books;
    }

    public static void setBooks(ProgrammingBook[] books) {
        ManagerBook.books = books;
    }


    public ManagerBook() {
    }

    public static void setBooks() {
    }


    public int total(Book[] books ){
        int totall = 0;
        for (int i = 0; i <books.length ; i++) {
            totall = totall + books[i].getPrice();
        }
        return totall;
    }
    public Book[] sapxep(Book[] books ){
        boolean swapped = false;

        for (int i = 0; i < books.length - 1; i++) {
            swapped = false;


            for ( int j = 0; j < books.length - 1 - i; j++) {


                if (books[j].getPrice() > books[j + 1].getPrice()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp ;

                    swapped = true;

                }
            }

            if (!swapped) {
                break;
            }

        }
   return books;

    }


    public int countBookByLanguage(Book[] language) {
        int count = 0;
        for (Book o : books
        ) {
            if (o instanceof Book) {
                if (((ProgrammingBook) o).getLanguage() == "java") count++;
            }
        }
        return count;
    }


}