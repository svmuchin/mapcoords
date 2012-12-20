/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mapcoords;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

/**
 *
 * @author Дмитрий
 */
public class WriteToFile  {
    public void writeInFile() throws Exception {
    java.util.Date currentDate = new java.util.Date();
    String dateFile = new SimpleDateFormat("ssddMMyy").format(currentDate.getTime());
    PrintWriter wrt = new PrintWriter(
      new OutputStreamWriter(
        new FileOutputStream("C:/Documents/" + dateFile), "windows-1251")
    );
    try {
      fileWrite(wrt);
    } finally {
      wrt.close();
    }
  }

    public void fileWrite(PrintWriter os) throws Exception {
        
        os.write("dsfdgsdfgdg");
    }
}
