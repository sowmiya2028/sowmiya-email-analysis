
package kata4;
import java.io.FileNotFoundException;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import static view.MailHistogramBuilder.build;
import view.MailListReader;
import static view.MailListReader.read;

public class Kata4 {
    List<Mail> mailList;
    Histogram<String> histogram = new Histogram<String>();
    public static void main(String[] args) throws FileNotFoundException {
        Kata4 aplicacion = new Kata4();
        aplicacion.execute();
        }
    
    public void execute() throws FileNotFoundException {
        input();
        process();
        output();
    }
    
    public void input() throws FileNotFoundException {
        String fileName = new String("C:\\Users\\Lab-DIS\\Documents\\NetBeansProjects\\kata4\\email.txt");
        Mail email = new Mail(fileName);
        mailList = read(fileName);
    }
    
    public void process() {
        histogram = build(mailList);
    }
    
    public void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
