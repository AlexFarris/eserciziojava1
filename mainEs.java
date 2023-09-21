import java.time.LocalDate;

public class mainEs{
    public static void main(String[] args) {
        Scuola itis=new Scuola("itis","Parma");
        Classe eeee=new Classe(2,'A',"informatica");
        Classe dddd=new Classe(4,'C',"Meccanica");
        Studente a=new Studente("Luca","Rossi","Parma",'M',LocalDate.of(2006, 8, 12));
        Studente b=new Studente("Giovanni","Verdi","feLino",'M',LocalDate.of(2006, 8, 12));
        Studente c=new Studente("Giulia","Bianchi","Felino",'F',LocalDate.of(2002, 8, 12));
        Studente d=new Studente("Federica","Bezof","Parma",'F',LocalDate.of(2012, 8, 12));
        Studente e=new Studente("Matteo","Pirelli","Parma",'M',LocalDate.of(2006, 2, 12));
        Studente f=new Studente("Mario","Rossi","felino",'M',LocalDate.of(2005,4,2));
        Studente g=new Studente("Sofia","Piaggi","Parma",'F',LocalDate.of(2005,9, 22));
        Studente h=new Studente("Francesa","Pacelli","Parma",'f',LocalDate.of(2005,1,1));
        LocalDate d1=LocalDate.of(2005, 1, 1);
        LocalDate d2=LocalDate.of(2010, 1, 1);
          System.out.println( eeee.newStud(a));
          System.out.println( eeee.newStud(b));
          System.out.println( eeee.newStud(c));
          System.out.println( eeee.newStud(d));
          System.out.println( eeee.newStud(e));
          System.out.println(dddd.newStud(f));
          System.out.println(dddd.newStud(g));
          System.out.println(dddd.newStud(h));
          System.out.println(itis.newClass(dddd));
          System.out.println(itis.newClass(eeee));
          System.out.println(itis.toStringScuola());
          /* System.out.println(itis.numStudFScuola());
           System.out.println(itis.stringStudComune("felino"));
        System.out.println(itis.studMascFemmScuola());
        System.out.println(eeee.comunStudComune());
         System.out.println(eeee.numStud());
         System.out.println(eeee.studDelComun("pARma"));
         System.out.println(eeee.studMascFemm1Classe()); 
         System.out.println(a.calcDataStud());
         System.out.println(c.calcDataStud());
        System.out.println(eeee.intervalloNascitaStud(d1, d2));  */
        System.out.println(eeee.toStringClasse());
        System.out.println(eeee.modStud(d,"luca", "rossi"));
        System.out.println(eeee.toStringClasse());

    }
}