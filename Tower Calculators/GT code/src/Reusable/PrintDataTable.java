package Reusable;
import javax.swing.*;
import java.util.*;


public class PrintDataTable {



    public static void printDT(String r1, String r2, String r3, String r4,String c1, String c2, String c3, String c4) {

        JFrame jFrame = new JFrame();

        String[][] tableData = {
                {r1},
                {r2},
                {r3},
                {r4}
        };

        String[] tablecolumn = {c1,c2,c3,c4};

        JTable jTable = new JTable(tableData, tablecolumn);

        jTable.setBounds(100,100,300,350);

        JScrollPane jScrollPane = new JScrollPane(jTable);
        jFrame.add(jScrollPane);
        jFrame.setSize(450,400);
        jFrame.setVisible(true);


    }
}