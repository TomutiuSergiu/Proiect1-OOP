public class Jucator {//este clasa ce incapsuleaza conceptul de jucator, ce contine
    //numele jucatorului, postul pe care joaca, numarul de pe tricou si varsta acestuia
    //alaturi de niste metode get/set si o metoda pentru a numara cati jucatori sunt pe fiecare post

    private String nume="";
    private String post="";
    private int nrTricou=0;
    private int varsta=0;
    private static int nrJucatori=0;
    public static int atacanti=0, mijlocasi=0 , fundasi=0 ;
    public Jucator(String nume,String post,int nrTricou,int varsta)
    {
        this.nume=nume;
        this.post=post;
        this.nrTricou=nrTricou;
        this.varsta=varsta;
        nrJucatori++;
    }

    public static int getNumarJucatori()
    {
        return nrJucatori;
    }

    public String getNume()
    {
        return nume;
    }

    public String getPost()
    {
        return post;
    }

    public int getVarsta()
    {
        return varsta;
    }

    public int getNumar()
    {
        return nrTricou;
    }

    public void setNume(String nume)
    {
        this.nume=nume;
    }

    public void setPost(String post)
    {
        this.post=post;
    }

    public void setVarsta (int varsta)
    {
        this.varsta=varsta;
    }
    //numara cati jucatori sunt pe fiecare post;
    public void posturiJucatori(){
            if(post.equals("atacant"))
                atacanti++;
            else
                if(post.equals("mijlocas"))
                    mijlocasi++;
                else
                    if(post.equals("fundas"))
                        fundasi++;
    }
    public String toString()
    {
        return nume + " cu numarul " + nrTricou + " pe postul " + post +
        " in varsta de " + varsta + " de ani.";
    }
}

