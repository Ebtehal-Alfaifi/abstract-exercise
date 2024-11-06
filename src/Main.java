//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Book b = new Book(" beacause you allah ", 55, " Ali jaber");
        System.out.println(" book name is "+b.getName());
        System.out.println(" the book price is "+b.getPrice());
        System.out.println(" the book auther is "+b.getAuther());
        System.out.println(" the book after discount "+"="+b.getdiscoent());

        System.out.println("________________________________________________");

        Movie m=new Movie("Rush hour ",90," jaky chan");
        System.out.println("movie name is "+m.getName());
        System.out.println("movie price  " +" =" +m.getPrice());
        System.out.println(" the movie director "+m.getDirector());
        System.out.println(" the movie after discount "+ m.getdiscoent());


    }}