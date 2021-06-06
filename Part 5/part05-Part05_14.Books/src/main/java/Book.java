
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared){
        // Comparing the objects
        if(this == compared){
            return true;
        } 
        // Comparing object type
        if(!(compared instanceof Book)){
            return false;
        }
        // COnverting object type
        Book comparedBook = (Book) compared;
        // Comparing each variables
        if(this.name.equals(comparedBook.name) &&
                this.publicationYear == comparedBook.publicationYear){
            return true;
        } else {
            return false;
        }
    }
}

