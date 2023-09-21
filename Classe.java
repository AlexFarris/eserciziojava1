
import java.time.LocalDate;
//import java.time.Period;
import java.util.ArrayList;


public class Classe {
    int anno;
    char sezione;
    String indirizzo;
    ArrayList<Studente> elencoStudenti;//minore di trenta


    public Classe(){
        elencoStudenti=new ArrayList<>();
    }
// costruttori
    public Classe(int anno,char sezione,String indirizzo){
        elencoStudenti=new ArrayList<>();
        this.anno=anno;
        this.sezione=sezione;
        this.indirizzo=indirizzo;
    }
//aggiunge uno studente
    public String newStud(Studente s){
        if(elencoStudenti.size()<30){
            this.elencoStudenti.add(s);
        return "Studente aggiunto\n";
        }else{
            return "La classe e' al completo";
        }
        
    }

    public String modStud(Studente stud,String nome, String cognome){
        for (Studente s : elencoStudenti) {
            if(s.nome.toUpperCase().equals(nome.toUpperCase())&&s.cognome.toUpperCase().equals(cognome.toUpperCase())){
                s.modStudente(stud);
                return "Lo studente "+nome.toUpperCase()+ " "+cognome.toUpperCase()+" e' stato modificato";
            }
        }
        return "Studente non trovato";
    }

    //ritorna una stringa che contiene il numero di studenti
    public String numStud(){
        return "Classe "+anno+sezione+" "+indirizzo+": "+elencoStudenti.size()+" studenti";  
    }

//funzioni riguardanti il numero di maschi e femmine in una o due classi
    public String studMascFemm2Classe(Classe c){ 
        return "CLASSE "+anno+sezione+" "+indirizzo+": "+studMascFemm1Classe()+"CLASSE"+c.anno+c.sezione+" "+c.indirizzo+": "+c.studMascFemm1Classe();
    }

    public String studMascFemm1Classe(){ 
        return "Nella classe ci sono "+numStudF()+" ragazze e "+numStudM()+" ragazzi\n";
    }
    //tornano un int cocnfrontando il sesso dello studente
    public int numStudM(){
        int m=0;
        for (Studente s : elencoStudenti) {
            if(Character.toUpperCase(s.sesso)=='M'){m++;}
        }
        return m;
    }
    public int numStudF(){
        int f=0;
        for (Studente s : elencoStudenti) {
            if(Character.toUpperCase(s.sesso)=='F'){f++;}
        }
        return f;
    }
//----------------------------------------------------
//funzioni riguardanti il numero di studenti provenienti da un comune

    //funzioni che cercano qual e' il coune piu' diffuso nella classe
    public String comunStudComune(){
        return "gli studenti della"+anno+sezione+" "+indirizzo+" vengono prevalentemente da "+ cercaComun();
    }
    //ho letto male le richieste ed ho buttato 40 minuti di vita 🥲, almeno funzionano...
    private String cercaComun(){
        int max=0;
        String sMax="";
        String comune;
        for(int x=0;x<elencoStudenti.size();x++){
            comune=elencoStudenti.get(x).residenza;
            if(contaStudPerComune(comune)>max){
                max=contaStudPerComune(comune);
                sMax=comune;
            }
        }
        return sMax; 
    }
    //----------------------------------------------------
    public String studDelComun(String s){
        return "Dal comune di "+s.toUpperCase()+" provengono "+contaStudPerComune(s)+" studenti della classe\n";
    }

    //conta il numero di studenti provenienti da un determinato comune
    public int contaStudPerComune(String s){
        int i=0;
        for(int y=0;y<elencoStudenti.size();y++){
            if(elencoStudenti.get(y).residenza.toUpperCase().equals(s.toUpperCase())){
                i++;
            }
        }
        return i;
    }

//----------------------------------------------------
//funzioni riguardanti la data di nascita

    public String intervalloNascitaStud(LocalDate a,LocalDate b){
        return "Gli studenti nati tra il "+a+" e il "+b+" sono "+intervalloNascita(a, b);
    }
    //restituisce il numero di studenti nati in un intervallo
    private int intervalloNascita(LocalDate a,LocalDate b){
        int i=0;
        for (Studente s : elencoStudenti) {
            if(s.dataNascita.isAfter(a)&&s.dataNascita.isBefore(b)){
                i++;
            }
            
        }
        return i;
    }

    //restituisce l'intervallo tra due date, non utilizzata
    /* private Period calcInter(LocalDate a,LocalDate b){
        Period p=Period.between(a, b);
        return p;
    } */
//----------------------------------------------------

    public String toStringClasse(){
        String f="LA CLASSE "+anno+sezione+" "+indirizzo+" e' composta da:\n";
        for (Studente s : elencoStudenti) {
            f+=s.toStringStud()+"\n";  
        }
        
        return f;
    }

}

