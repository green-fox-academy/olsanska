package blogPost;

public class Main {
    public static void main(String[] args) {
        blogPost firstPost = new blogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
        blogPost secondPost = new blogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
        blogPost thirdPost = new blogPost("William Turton","One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");

        System.out.println(firstPost.postSth());
        System.out.println(secondPost.postSth());
        System.out.println(thirdPost.postSth());


    }
}
