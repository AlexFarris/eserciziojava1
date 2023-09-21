import java.time.LocalDate;
import java.time.Period;

public class Studente {
    LocalDate dataNascita;
    String nome,cognome,residenza;
    char sesso;
    

    public Studente(){}

    public Studente(String nome,String cognome,String residenza, char sesso,LocalDate nascita){
        this.nome=nome;
        this.cognome=cognome;
        this.residenza=residenza;
        this.dataNascita=nascita;
        this.sesso=sesso;
    }
    public String calcDataStud(){
        Period dif=Period.between(dataNascita, LocalDate.now());
        return "Lo studente "+nome+" ha "+dif.getYears()+" anni,"+dif.getMonths()+" mesi ed "+dif.getDays()+" giorni\n";
    }
    public String toStringStud(){
        String f="";
        f+="\tNOME: "+nome+"\n";
        f+="\tCOGNOME: "+cognome+"\n";
        f+="\tSESSO: "+sesso+"\n";
        f+="\tRESIDENZA: "+residenza+"\n";
        f+="\tDATA DI NASCITA: "+dataNascita+"\n";
        return f;
    }
    
    public String modStudente(Studente s){
        this.nome=s.nome;
        this.cognome=s.cognome;
        this.sesso=s.sesso;
        this.residenza=s.residenza;
        this.dataNascita=s.dataNascita;
        return "Studente modificato\n";
    }
    
}
