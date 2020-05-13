import java.io.Serializable;

public class  Fudbaler implements Serializable {
    
    private String imePrezime;

    public Fudbaler() {
    }
    
    
    
    private int ukupnoGolova;

    public String getImePrezime() {
        return imePrezime;
    }
    public int getUkupnoGolova() {
        return ukupnoGolova;
    }

    
    public void setImePrezime(String imePrezime) throws SportException{
        if(imePrezime.equals("") && imePrezime.isEmpty() && imePrezime==null){
            throw new SportException("Uneli ste nedozvoljene vrednosti");
        }
        this.imePrezime = imePrezime;
    }
        
        
    public void setUkupnoGolova(int ukupnoGolova) throws SportException {
        if(ukupnoGolova<0){
            throw new SportException("Uneli ste nedozvoljene vrednosti");
        }
        this.ukupnoGolova = ukupnoGolova;
    }

    
    @Override
    public String toString() {
        return imePrezime + " ukupnoGolova = " + ukupnoGolova;
    }
    
}
