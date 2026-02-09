package graphique.tp3graphique.models;

public class Test
{
    private String nom;
    private String type;

    public Test(String nom, String type)
    {
        this.nom = nom;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getType()
    {
        return type;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
}

