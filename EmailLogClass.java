import java.util.Properties;


import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class EmailLogClass { // EmailLogClass to send user an email with the transaction log attached.

public static void main(String[] args) { // main method

    final String username = "hammad.qc.cuny@gmail.com"; // User name of email account
    final String password = "BoBak549"; // password of email account
    
    String TO; // TO is a string variable
    TO = JOptionPane.showInputDialog(null,"Please enter your Email!"); // TO becomes the senders email address.
    

    Properties props = new Properties(); // properties
    props.put("mail.smtp.auth", true); 
    props.put("mail.smtp.starttls.enable", true);
    props.put("mail.smtp.host", "smtp.gmail.com"); // we are using gamil's SMTP server
    props.put("mail.smtp.port", "587"); // gmail's port number

    Session session = Session.getInstance(props, // sessions to authenticate user name and password
    		new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

    try {

        Message message = new MimeMessage(session); // create message
        message.setFrom(new InternetAddress("hammad.qc.cuny@gmail.com")); // from
        message.setRecipients(Message.RecipientType.TO, 
                InternetAddress.parse(TO)); // to
        message.setSubject("Transaction Log"); // subject 
        message.setText("Transaction Log Attached"); // text

        MimeBodyPart messageBodyPart = new MimeBodyPart();

        Multipart multipart = new MimeMultipart();

        messageBodyPart = new MimeBodyPart();
        String file = "WrittenDocuments/Transaction Log.txt"; // file location
        String fileName = "Transaction Log.txt"; // file name 
        DataSource source = new FileDataSource(file);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(fileName);
        multipart.addBodyPart(messageBodyPart);

        message.setContent(multipart);

        JOptionPane.showMessageDialog(null, "Processing, please wait!"); // trying to send

        Transport.send(message);

        JOptionPane.showMessageDialog(null, "Message sent!"); // Email sent

    } catch (MessagingException e) {
        e.printStackTrace();
    } // catch
  }// main
} // EmailLogClass