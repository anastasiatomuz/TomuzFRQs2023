public class Textbook extends Book{
    private int edition;

    public Textbook(String bookTitle, double bookPrice, int edition){
        super(bookTitle, bookPrice);
        this.edition = edition;
    }

    public String getBookInfo(){
        return super.getBookInfo() + "-" + edition;
    }

    public boolean canSubstituteFor(Textbook otherTextbook){
        if (!getTitle().equals(otherTextbook.getTitle())){
            return false;
        }
        if (edition >= otherTextbook.edition){
            return true;
        }
        return false;
    }

    public int getEdition(){
        return edition;
    }
}
