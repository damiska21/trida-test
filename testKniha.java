public class testKniha
{
    public static void main(String[] args)
    {
        Kniha testKniha = Kniha.getInstance();
        System.out.println(testKniha.getNazev() + " od " + testKniha.getAutor());
    }
}
