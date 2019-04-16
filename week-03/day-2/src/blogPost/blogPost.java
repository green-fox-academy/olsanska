package blogPost;

public class blogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public blogPost(String authorName, String title, String text, String publicationDate){
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public String postSth(){
        String sth = "Author is: " + authorName + "\nThe title is: " + title + "\nexample: " + text + "\nDate: " + publicationDate;
        return sth;
    }


}

/*
public String introduceYourself(){
        String introduction = "Ahoj. My name is " + myName + ". I am in "
                +  getPhase() + " phase. My codemaster points are: " + codeMasterPoints;

        return introduction;
    }
 */

