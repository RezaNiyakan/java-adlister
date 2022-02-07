import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album twentyFourKMagic = new Album(1, "Bruno Mars", "24K Magic", 2016, 3, "Pop, Funk, R&B");
        Author hDT = new Author(1, "Henry David", "Thoreau");
        Quote quoteOfTheDay = new Quote(1, "The question is not what you look at but what you see.",hDT );

        System.out.println(quoteOfTheDay.getContent());
        System.out.println(quoteOfTheDay.getAuthor().getFirstName());
        System.out.println(twentyFourKMagic.getGenre());

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quoteOfTheDay);
        quotes.add(new Quote(2, "Better out than in, I always say.", new Author(2, "Shrek", "The Ogre")));
        quotes.add(new Quote(3, "Success usually comes to those who are to busy too be looking for it.", hDT));

        for(Quote quote : quotes) {
            System.out.println("Heres a quote for yuh'! ********************");
            System.out.printf("\"%s\"%n   - %s %s%n", quote.getContent(), quote.getAuthor().getFirstName(), quote.getAuthor().getLastName());
        }
    }
}
