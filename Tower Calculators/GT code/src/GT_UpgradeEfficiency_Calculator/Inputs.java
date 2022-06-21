package GT_UpgradeEfficiency_Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.*;
import javax.swing.JOptionPane;

public class Inputs {
    Scanner scan = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Double cBonus,cDuration,cInterval,cIntervalSec;                  //current bonus duration and interval values as floats/doubles
    static int cIntervalMin;
    static String cIntervalString;
    static int cUpBonus,cUpDuration;      //current upgrade tiers in labs for bonus and duration

    static Double[] cInputs = new Double[5];        //array for current values of GT

    public static void inputCurrent (String msg1,double var) {
        JOptionPane.showMessageDialog(null, msg1);
        cBonus = Double.parseDouble(JOptionPane.showInputDialog("Current value of your bonus"));
        cUpBonus = Integer.parseInt(JOptionPane.showInputDialog("Current lab level for bonus"));

        cDuration = Double.parseDouble(JOptionPane.showInputDialog("Current value of your duration"));
        cUpDuration = Integer.parseInt(JOptionPane.showInputDialog("Current lab level for duration"));

        cInterval = Double.parseDouble(JOptionPane.showInputDialog("Current interval, written like this for 4 minutes and 30 seconds: \"4.3\" "));

        System.out.println("\n");
        System.out.println("\n"+cBonus+"\n"+cUpBonus+"\n"+cDuration+"\n"+cUpDuration+"\n"+cInterval+"\n");

        //List<Double> list =new ArrayList<>(5);

        //Collections.addAll(cInputs, cBonus, (double)cUpBonus,cDuration,(double)cUpDuration,cInterval);

        BigDecimal bigDecimal= new BigDecimal(String.valueOf(cInterval));
        cIntervalString= String.valueOf(cInterval);
        cIntervalMin = bigDecimal.intValue();
        cIntervalSec = Double.parseDouble (bigDecimal.subtract(new BigDecimal(cIntervalMin)).toPlainString());

        cInputs[0]=cBonus;
        cInputs[1]=(double)cUpBonus;
        cInputs[2]=cDuration;
        cInputs[3]=(double)cUpDuration;
        System.out.println(cIntervalSec+"\n"+cIntervalMin);
        cInputs[4]=((cIntervalSec*100)+(cIntervalMin*60));


        for (int i=1; i-1<cInputs.length;i++){
            System.out.println("Number "+i+":  "+cInputs[i-1]);
        }
    }
    public static void askDesire (){
        String desired;

    }
}
