import java.util.ArrayList;

public class Scuola {
    ArrayList<Classe> elencoClassi;
    String nome,comune;
    
    public Scuola(){
        elencoClassi=new ArrayList<>();
    }
    public Scuola(String nome, String comune){
        this.nome=nome;
        this.comune=comune;
        elencoClassi=new ArrayList<>();
    }
    public String newClass(Classe c){
        elencoClassi.add(c);
        return "Classe Aggiunta\n";
    }
   
    private int contaStudPerComuneScuola(String s){
        int i=0;
        for (Classe c : elencoClassi) {
            i+=c.contaStudPerComune(s);
        }
        return i;
    }

    public String stringStudComune(String s){
        return "Dal comune di "+s.toUpperCase()+" provengono "+contaStudPerComuneScuola(s)+" studenti della scuola\n";
    }

    public int numStudMScuola(){
        int i=0;
        for (Classe c : elencoClassi) {
            i+=c.numStudM();
        }
        return i;
    }
    public int numStudFScuola(){
        int i=0;
        for (Classe c : elencoClassi) {
            i+=c.numStudF();
        }
        return i;
    }
    public String studMascFemmScuola(){
        return "Nella Scuola "+nome+" sono presenti "+this.numStudMScuola()+" ragazzi e "+this.numStudFScuola()+" ragazze, per un totale di "+ (numStudFScuola()+numStudMScuola())+" studenti\n";
    }

     public String toStringScuola(){
        String f="La scuola "+nome+" e' formata da:\n";
        for (Classe c : elencoClassi) {
            f+=c.toStringClasse()+"\n";
        }
       return f;
    } 
}
