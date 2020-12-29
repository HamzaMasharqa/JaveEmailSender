import java.io.File;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public void Sendemail(String n, String e) {
		String Path = System.getProperty("user.dir","/email.txt");
		String curpath = Path+(File.separator + "email.txt");
		
		String imgpath = System.getProperty("user.dir","/cotede-logo.png");
		String curimagepath = imgpath+(File.separator + "cotede-logo.png");
		
		
		
		String from = "cotede158@gmail.com";
		String to = e.toString();
		String subject = "Test";

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.port", "587");
		Session session = Session.getDefaultInstance(props);

		try {
			InternetAddress fromAddress = new InternetAddress(from);
			InternetAddress toAddress = new InternetAddress(to);

			Message message = new MimeMessage(session);
			message.setFrom(fromAddress);
			message.setRecipient(Message.RecipientType.TO, toAddress);
			message.setSubject(subject);

			String sb = "<div>\r\n" + 
					"   <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"font-family:Avenir,Helvetica,sans-serif;background-color:#8EB533;margin:0;padding:0;width:100%\">\r\n" + 
					"      <tbody>\r\n" + 
					"         <tr>\r\n" + 
					"            <td align=\"center\" style=\"font-family:Avenir,Helvetica,sans-serif\">\r\n" + 
					"               <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"font-family:Avenir,Helvetica,sans-serif;margin:0;padding:0;width:100%\">\r\n" + 
					"                  <tbody>\r\n" + 
					"                     <tr>\r\n" + 
					"                        <td style=\"font-family:Avenir,Helvetica,sans-serif;padding:25px 0;text-align:center\">\r\n" + 
					"                           <a href=\"https://cotede.co\" style=\"font-family:Avenir,Helvetica,sans-serif;color:rgb(198, 255, 99  );font-size:19px;font-weight:bold;text-decoration:none\" rel=\"noreferrer noopener\" target=\"_blank\" data-saferedirecturl=\"\">\r\n" + 
					"                           <img src=\""+"https://i.postimg.cc/JnTFC2Hd/cotede-logo.png" + "\""
							+ " style=\"font-family:Avenir,Helvetica,sans-serif;max-width:100%;border:none\" class=\"CoTeDe\"></a>\r\n" + 
					"                        </td>\r\n" + 
					"                     </tr>\r\n" + 
					"                     <tr>\r\n" + 
					"                        <td width=\"100%\" style=\"font-family:Avenir,Helvetica,sans-serif;background-color:#8EB533;margin:0;padding:0;width:100%\">\r\n" + 
					"                           <table align=\"center\" width=\"570\" cellpadding=\"0\" cellspacing=\"0\" style=\"font-family:Avenir,Helvetica,sans-serif;background-color:#ffffff;margin:0 auto;padding:0;width:570px\">\r\n" + 
					"                              <tbody>\r\n" + 
					"                                 <tr>\r\n" + 
					"                                     <td style=\"font-family:Avenir,Helvetica,sans-serif;padding:35px\">\r\n" + 
					"                                       <h1 style=\"font-family:Avenir,Helvetica,sans-serif;color:#2f3133;font-size:19px;font-weight:bold;margin-top:0;text-align:center\">Welcome To CoTeDe</h1>\r\n" + 
					"                                       <p style=\"font-family:Avenir,Helvetica,sans-serif;color:#74787e;font-size:16px;line-height:1.5em;margin-top:0;text-align:left\">Hi "+n.toString() +",</p>\r\n" + 
					"                                       <p style=\"font-family:Avenir,Helvetica,sans-serif;color:#74787e;font-size:16px;line-height:1.5em;margin-top:0;text-align:left\">Welcome to the cotede website <br><br> Contact our team for any information<br><br>Thank you </p>\r\n" + 
					"                                    \r\n" + 
					"                                       <p style=\"font-family:Avenir,Helvetica,sans-serif;color:#74787e;font-size:16px;line-height:1.5em;margin-top:0;text-align:left\">\r\n" + 
					"                                         <br>\r\n" + 
					"                                          \r\n" + 
					"                                       </p>\r\n" + 
					"                                    </td>\r\n" + 
					"                                 </tr>\r\n" + 
					"                              </tbody>\r\n" + 
					"                           </table>\r\n" + 
					"                        </td>\r\n" + 
					"                     </tr>\r\n" + 
					"                     <tr>\r\n" + 
					"                        <td style=\"font-family:Avenir,Helvetica,sans-serif\">\r\n" + 
					"                           <table align=\"center\" width=\"570\" cellpadding=\"0\" cellspacing=\"0\" style=\"font-family:Avenir,Helvetica,sans-serif;margin:0 auto;padding:0;text-align:center;width:570px;font-size:12px;color:#888888\">\r\n" + 
					"                              <tbody>\r\n" + 
					"                                 <tr>\r\n" + 
					"                                    <td align=\"center\" style=\"font-family:Avenir,Helvetica,sans-serif;padding:15px 0 0 0\">\r\n" + 
					"                                       <a href=\"https://www.facebook.com/Cotede.pal\" style=\"color:#499df3;font-family:'Open Sans',Helvetica,Arial,sans-serif;font-size:13px;font-weight:normal;line-height:100%;text-decoration:none\" rel=\"noreferrer noopener\" target=\"_blank\" data-saferedirecturl=\"https://www.google.com/url?q=https://www.facebook.com/SMSto-Bulk-SMS-SMS-Marketing-1909869432637539&amp;source=gmail&amp;ust=1609249710276000&amp;usg=AFQjCNEAM_J3XB6LXsBWo4wx8Pl5ImxFKg\">\r\n" + 
					"                                       <img src=\"https://i.postimg.cc/ydSL28BW/unnamed-1.png\" alt=\"Facebook\" width=\"32\" style=\"font-family:Avenir,Helvetica,sans-serif;max-width:100%;height:auto;border:none\" class=\"CToWUd\"></a>\r\n" + 
					"                                        <a href=\"https://www.instagram.com/cotede_center\" style=\"color:#499df3;font-family:'Open Sans',Helvetica,Arial,sans-serif;font-size:13px;font-weight:normal;line-height:100%;text-decoration:none\" rel=\"noreferrer noopener\" target=\"_blank\" data-saferedirecturl=\"https://www.google.com/url?q=https://www.linkedin.com/company/sms-to&amp;source=gmail&amp;ust=1609249710276000&amp;usg=AFQjCNES4APkskJc62iFakeavlpItwbxYQ\">\r\n" + 
					"                                       <img src=\"https://i.postimg.cc/tJQBbGCk/unnamed.png\" alt=\"LinkedIn\" width=\"32\" style=\"font-family:Avenir,Helvetica,sans-serif;max-width:100%;height:auto;border:none\" class=\"CToWUd\"></a>\r\n" + 
					"                                    </td>\r\n" + 
					"                                 </tr>\r\n" + 
					"                                 <tr>\r\n" + 
					"                                    <td align=\"center\" style=\"font-family:Avenir,Helvetica,sans-serif;padding:20px;color:#000000;font-weight: bold; \">\r\n" + 
					"                                       <br>\r\n" + 
					"                                       Address: City Center Complex (2nd Floor), Dura, Palestine<br>\r\n" + 
					"                                       Email: admin@cotede.co<br>\r\n" + 
					"                                     Telephone:  +972-2-2289152<br>\r\n" + 
					"									  Phone: +970-569-296-501<br>\r\n" + 
					"                                    </td>\r\n" + 
					"                                 </tr>\r\n" + 
					"                                 <tr>\r\n" + 
					"                                    <td align=\"center\" style=\"font-family:Avenir,Helvetica,sans-serif;padding:15px 0 0 0\">\r\n" + 
					"                                       <p style=\"font-family:Avenir,Helvetica,sans-serif;line-height:1.5em;margin-top:0;color:#aeaeae;font-size:12px;text-align:center;padding:20px;color:#000000;font-weight: bold;\">© 2020 CoTeDe. All rights reserved.</p>\r\n" + 
					"                                    </td>\r\n" + 
					"                                 </tr>\r\n" + 
					"                              </tbody>\r\n" + 
					"                           </table>\r\n" + 
					"                        </td>\r\n" + 
					"                     </tr>\r\n" + 
					"                  </tbody>\r\n" + 
					"               </table>\r\n" + 
					"            </td>\r\n" + 
					"         </tr>\r\n" + 
					"      </tbody>\r\n" + 
					"   </table>\r\n" + 
					"   <div class=\"yj6qo\"></div>\r\n" + 
					"   <div class=\"adL\"></div>\r\n" ;
					
		
			message.setContent(sb, "text/html; charset=utf-8");
			message.saveChanges();

			Transport.send(message, "cotede158@gmail.com", "cotede11223344");
		} catch (MessagingException e1) {
			e1.printStackTrace();
		}
	}
}
