
package view;

import java.util.List;
import model.Histogram;
import model.Mail;


public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> emails){
        Histogram <String> histogram = new Histogram();
        for(int i=0;i<emails.size();i++) {
            System.out.println("as");
            histogram.increment(emails.get(i).getDomain());
        }    
        return histogram;   
    }
}
