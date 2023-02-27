
package aranyhal;

import java.util.List;

public class Aranyhal {

    private int KIVANSAGOKSZAMA = 3;
    private int kor;
    private List<String> kivansagok;
    private String kifogta;

    public Aranyhal(String kifogta) {
        this.kifogta = kifogta;
    }
    
    public Aranyhal(int kor, String kifogta) {
        this.kor = kor;
        this.kifogta = kifogta;
    }
    
    public int getKor() {
        return kor;
    }
    
    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }

    public int kivansagokSzama(String kifogta) {
        return 0;
    }    
    
    public String[] kikkelTalalkozott() {
        String[] tomb = new String[10];
        return tomb;
    }
    
    public boolean kivansagotTeljesit(String kivansag) {
        return true;
    }
    
    @Override
    public String toString() {
        return "Aranyhal{" + '}';
    }
    
    public static void main(String[] args) {
        
    }
}
