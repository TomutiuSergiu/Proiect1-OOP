import java.util.Scanner;
import java.util.ArrayList;
//este clasa ce contine mainul, meniul si un array de jucatori
public class Echipa
{

    public static void main(String[] args)
    {
        //se creaza arrayList-ul de jucatori.
        ArrayList<Jucator> jucator = new ArrayList<Jucator>();
        //meniul
        System.out.println("Optiuni: ");
        System.out.println("1. FC Cojeasca cumpara jucator.");
        System.out.println("2. Lista jucatorilor.");
        System.out.println("3. Jucatori U21.");
        System.out.println("4. La multi ani!");
        System.out.println("5. Posturi.");
        System.out.println("6. Iesire din program.");
        Scanner sc = new Scanner(System.in);
        int meniu = sc.nextInt();
        sc.nextLine();
        do{
            switch(meniu)
            {
                case 1:
                    {   //se introduce un nou jucator in echipa.
                        System.out.print("Nume: ");
                        String nume = sc.nextLine();
                        System.out.print("Post: ");
                        String post = sc.nextLine();
                        System.out.print("Numarul de pe tricou: ");
                        int nrTricou=sc.nextInt();
                        System.out.print("Varsta Jucatorului: ");
                        int varsta=sc.nextInt();
                        sc.nextLine();
                        Jucator j=new Jucator(nume,post,nrTricou,varsta);
                        jucator.add(j);
                        break;
                    }
                case 2:
                    {   //se afiseaza lista jucatorilor.
                        for(Jucator j : jucator)
                            System.out.println(j.toString() + "\n");
                            break;
                    }
                case 3:
                    {
                        int rez=0;
                        for (int i=0;i<Jucator.getNumarJucatori();i++)
                        {   //se cauta printre jucatori cei cu varsta <= cu 21 de ani.
                            if(jucator.get(i).getVarsta()<=21)
                                rez++;
                        }
                        System.out.println("Numarul de jucatori Under 21 este: " + rez);
                        break;
                    }
                case 4:
                    {
                        System.out.println("Este ziua de nastere a lui: \n");
                        String nume=sc.nextLine();
                        boolean ok=false;
                        for (int i=0;i<Jucator.getNumarJucatori() && ok==false;i++)
                        {   //se cauta jucatorul cu numele introdus
                            if(nume.equals(jucator.get(i).getNume()) && ok==false)
                                {
                                    System.out.println(nume + " a imbatranit!\n");
                                    int v=jucator.get(i).getVarsta();
                                    v++;    //se ia varsta jucatorului si se adauga 1 an;
                                    jucator.get(i).setVarsta(v);
                                    System.out.println("Jucatorul are acum " + jucator.get(i).getVarsta() + " de ani!");
                                    ok=true;
                                }
                        }
                        break;
                    }
                case 5:
                {   //se afiseaza cati jucatori sunt pe fiecare post
                    for (int i=0;i<Jucator.getNumarJucatori();i++)
                        jucator.get(i).posturiJucatori();
                    System.out.println("Numarul de atacanti: " + Jucator.atacanti);
                    System.out.println("Numarul de mijlocasi: " + Jucator.mijlocasi);
                    System.out.println("Numarul de fundasi: " + Jucator.fundasi);
                    break;
                }
                case 6:
                    break;
                default:
                    System.out.println("Varianta invalida.\n");
            }
            System.out.println("Optiuni: ");
            System.out.println("1. FC Cojeasca cumpara jucator.");
            System.out.println("2. Lista jucatorilor.");
            System.out.println("3. Jucatori U21.");
            System.out.println("4. La multi ani!");
            System.out.println("5. Posturi");
            System.out.println("6. Iesire din program.");
            meniu = sc.nextInt();
            sc.nextLine();
        }while(meniu != 6);
        sc.close();
    }
}

