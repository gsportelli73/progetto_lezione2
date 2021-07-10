import java.util.InputMismatchException;
import java.util.Scanner;
public class Registro
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private String nome;
    private String cognome;
    private String data_nascita;
    private String classe;
    private String sezione;
    private double media_voti;
    private int n_studenti;

    /**
     * Costruttore degli oggetti di classe  Registro
     */
    public Registro(String n,String c, String d,String cl, String sz, double m)
    {
        this.nome=n;
        this.cognome=c;
        this.data_nascita=d;
        this.classe=cl;
        this.sezione=sz;
        this.media_voti=m;
    }
    public Registro(int ns)
    {
        n_studenti=ns;
    }

    void Stampa ()
    {
        System.out.println("Dati Studente:");
        System.out.println("Cognome: "+cognome);
        System.out.println("Nome: "+nome);
        System.out.println("Data di Nascita: "+data_nascita);
        System.out.println("Classe: "+classe);
        System.out.println("Sezione: "+sezione);
        System.out.println("Media dei voti: "+media_voti);
    }
    public void Esito()
    {
        if (media_voti<6)
            {
                System.out.println("Alunno: "+cognome+" "+nome);
                System.out.println("Non ammesso all'anno successivo");
            }
        else
            {
                System.out.println("Alunno: "+cognome+" "+nome);
                System.out.println("Ammesso all'anno successivo");
            }
    }
public static void main (String args[])
{
    int n_studenti=0;
    int k=0;
    String c,n,d,cl,sz;
    double m=0.0;
    Scanner tastiera = new Scanner(System.in);
    System.out.println("Inserisci numero studenti");
    try 
    {
        n_studenti= tastiera.nextInt();
    }
    catch (InputMismatchException e)
    {
        System.out.println("Errore nell'inserimento dati");
    }
    finally {
        Registro reg[]=new Registro[n_studenti];
        for (k=0;k<n_studenti;k++)
        {
                System.out.println("Inserisci nell'ordine cognome,nome,data nascita, classe,sezione, e media voti");
                c=tastiera.next();
                n=tastiera.next();
                d=tastiera.next(); 
                cl=tastiera.next();
                sz=tastiera.next();
                try {
                m=tastiera.nextDouble();}
                catch (InputMismatchException e)
                { System.out.println("Errore di inserimento numero ");}
                Registro r= new Registro(c,n,d,cl,sz,m);  
                reg[k]=r;
            }
                 System.out.println("Stampa Elenco ed Esiti Individuali");
                for (k=0;k<n_studenti;k++)
                {
                    reg[k].Stampa();
                    reg[k].Esito();
                }
            }
    tastiera.close();   
    }
}
