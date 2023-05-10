import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }

    public double getAverageRating() {
        double sum = 0;
        int count = 0;
        for (Review review : allReviews){
            sum += review.getRating();
            count ++;
        }
        return sum / count;
    }

    public ArrayList<String> collectComments() {
        ArrayList<String> listToReturn = new ArrayList<>();
        for (int i = 0; i < allReviews.length; i ++){
            String comment = allReviews[i].getComment();
            if (comment.indexOf("!") != -1){
                if (!comment.substring(comment.length() - 1).equals("!") && !comment.substring(comment.length() - 1).equals(".")){
                    comment = comment + ".";
                }
                listToReturn.add("" + i + "-" + comment);
            }
        }
        return listToReturn;
    }
}