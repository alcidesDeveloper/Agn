/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
package teste_excel;
import java.io.File;
import java.io.IOException;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
*/
/**
 *
 * @author alcides.elneto1
 */
/*
public class Teste_excel {
*/
    /**
     * @param args the command line arguments
     */
/*
    public static void main(String[] args) throws IOException, WriteException {
        
        Label lbl = new Label(0, 0, "teste");
        
        
        // TODO code application logic here
        File arquivo = new File("C:\\Users\\alcides.elneto1\\Pictures\\teste.xls");
        WritableWorkbook exc = Workbook.createWorkbook(arquivo);
        WritableSheet shet = exc.createSheet("TESTE_CHEET", 0);

        for (int i = 0; i < 30; i++) {
            if (i < 15) {
                adicionaElementoCelula(lbl, 0, i, "daniel " + i, shet, exc);
            } else {
                adicionaElementoCelula(lbl, 1, i-15, "Alexandre " + i, shet, exc);
            }
        }
        exc.write();
        exc.close();

    }

    static void adicionaElementoCelula(Label lbl, int posi1, int posi2, String txt, WritableSheet shet, WritableWorkbook exc) throws WriteException, IOException {
        lbl = new Label(posi1, posi2, txt);
        shet.addCell(lbl);

    }
    
}
*/