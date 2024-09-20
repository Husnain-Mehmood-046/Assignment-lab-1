public class art
{
    private String title;
    private int year;
    private artist name;

    public void settitle(String title1)
    {
        title = title1;
    }
    public void setyear(int year1)
    {
        year = year1;
    }
    
    public String gettitle()
    {
        return title;
    }
    public int getyear()
    {
        return year;
    }

    art(String title1, int year1, artist name1)
    {
        title = title1;
        year = year1;
        name = name1;

        System.out.println("Name : " +name1+ " year : " +year+ "Title : " +title);

    }
    
    
}