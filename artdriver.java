public class artdriver
{
    public static void main(String args[])
    {
        artist artist1 = new artist();
        artist artist2 = new artist();
        artist1.setname("Husnain");

        art art1 = new art("The Alchemist", 2024, artist1);
        art1.settitle("The Alchemist");
        art1.setyear(2024);

        art art2 = new art("Boy Tales of Childhood", 1995, artist2);

        String artist = artist1.getname();
        String title = art1.gettitle();
        int year = art1.getyear();

        System.out.println("Name : " +artist+ " Title : " +title+ " Year : " +year);
    }
}