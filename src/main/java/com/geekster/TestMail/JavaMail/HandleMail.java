package com.geekster.TestMail.JavaMail;

import com.geekster.TestMail.GetData;
import org.geekster.MailAuthenticator;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;
public class HandleMail {

     public void sendMail(){

        //host : gmail is smtp
        String host = "smtp.gmail.com";

        Properties props = System.getProperties();
//        System.out.println(props);

        //Set Properties:
        props.put("mail.smtp.host",host); //SMTP Host
        props.put("mail.smtp.port","465"); //SMTP Port
        props.put("mail.smtp.ssl.enable","true"); //requires TLS or SSL: smtp.gmail.com (use authentication)
        props.put("mail.smtp.auth","true"); //Enabling SMTP Authentication

        //Session
        Session mailSession = Session.getInstance(props,new MailAuthenticator());

        //Create the message object
        MimeMessage mimeMessage = new MimeMessage(mailSession);

        try {
            //Sender
            mimeMessage.setFrom(org.geekster.MailConstants.SENDER);

            //Receiver
            mimeMessage.setRecipients(MimeMessage.RecipientType.TO, InternetAddress.parse(org.geekster.MailConstants.RECEIVER));

            //Subject
            mimeMessage.setSubject(org.geekster.MailConstants.SUBJECT);

            //Sent Date
            mimeMessage.setSentDate(new Date());

            GetData obj = new GetData();
            // Fill the message
            mimeMessage.setText(obj.sendData());

            // Send message
            Transport.send(mimeMessage);

            System.out.println("Email Sent Successfully !!");

        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


     }
}
