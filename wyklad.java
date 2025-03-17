import java.util.Scanner;

public class wyklad {
    public static void main(String[] args) {
        Student st= new Student();
        st.imie="Maks";
        st.nazwisko="Pichola";
        st.numer_indeksu=33493;
        System.out.println(st.imie+st.nazwisko+st.numer_indeksu);
        //ni
        Student st2= new Student();
        System.out.println(st2.imie); //domyślnie null
        System.out.println(st2.numer_indeksu);//domyslnie null ale mozna zmienic w klasie\


        Student st3= new Student();


    }
}
