public class Kniha
{
    private String nazev;
    private String autor;
    private static volatile Kniha instance;
    private Kniha()
    {
       this.nazev = "Harry Potter";
       this.autor = "Rowlingová";
    }
    public static Kniha getInstance(){
        if(instance == null) instance = new Kniha();
        return instance;
    }
    public void setNazev(String nazev){
        this.nazev = nazev;
    }public String getNazev(){
        return nazev;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }
}
