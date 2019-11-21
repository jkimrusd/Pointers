
/**
 * A Class to hold Movie Facts
 *
 * @author (Mr. Kim)
 * @version (2019-11-16)
 * 
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private String title;
    private String studio;
    private double rating;
    private int    year;

    /**
     * Constructor for objects of class Movie
     */
    public Movie(String title, String studio, double rating, int year)
    {
        this.title    = title;
        this.studio   = studio;
        this.rating   = rating;
        this.year     = year;
    } // Movie
    
    public String getTitle()    { return this.title;};
    public String getStudio()   { return this.studio;};
    public double getRating()   { return this.rating;};
    public int    getYear()     { return this.year; };
    
    public void   setTitle( String title)
    {
        this.title = title;
    }
    
    public void   setStudio(String studio)
    {
        this.studio = studio;
    }
    
    public String toString()
    {
        String s = " * Movie: "+this.title+"  Studio: :" +this.studio + " IMDB rating :"+this.rating;
        return s;
        
    } // end toString();

}
