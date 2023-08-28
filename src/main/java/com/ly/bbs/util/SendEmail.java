package com.ly.bbs.util;

import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.sun.mail.util.MailSSLSocketFactory;

public class SendEmail {
	//发送注册码
	public String send(String email){
		try {

			//设置发件人
			String from = "1920204594@qq.com";

			//设置收件人
			String to = email;

			//设置邮件发送的服务器，这里为QQ邮件服务器
			String host = "smtp.qq.com";

			//获取系统属性
			Properties properties = System.getProperties();

			//SSL加密
			MailSSLSocketFactory sf = new MailSSLSocketFactory();
			sf.setTrustAllHosts(true);
			properties.put("mail.smtp.ssl.enable", "true");
			properties.put("mail.smtp.ssl.socketFactory", sf);

			//设置系统属性
			properties.setProperty("mail.smtp.host", host);
			properties.put("mail.smtp.auth", "true");

			//获取发送邮件会话、获取第三方登录授权码
			Session session = Session.getDefaultInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, "vmufftrtjkrlcabh");
				}
			});

			Message message = new MimeMessage(session);

			//防止邮件被当然垃圾邮件处理，披上Outlook的马甲
			message.addHeader("X-Mailer","Microsoft Outlook Express 6.00.2900.2869");

			message.setFrom(new InternetAddress(from));

			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			//邮件标题
			message.setSubject("时光博客-注册码");

			BodyPart bodyPart = new MimeBodyPart();

			//获取注册码
			String code = genRandomNum();

			bodyPart.setText("博客-注册码："+code+"\r\n有效时间为120秒请尽快使用!");

			Multipart multipart = new MimeMultipart();

			multipart.addBodyPart(bodyPart);


			/*//附件
            bodyPart = new MimeBodyPart();
            String fileName = "文件路径";
            DataSource dataSource = new FileDataSource(fileName);
            bodyPart.setDataHandler(new DataHandler(dataSource));
            bodyPart.setFileName("文件显示的名称");
            multipart.addBodyPart(bodyPart);*/

			message.setContent(multipart);

			Transport.send(message);
			return code;
		} catch (Exception e) {
			return null;
		}

	}
	//生成随机码
	public String genRandomNum(){  
		int  maxNum = 36;  
		int i;  
		int count = 0;  
		char[] str = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',  
				'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',  
				'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };      
		StringBuffer pwd = new StringBuffer("");  
		Random r = new Random();  
		while(count < 8){  
			i = Math.abs(r.nextInt(maxNum));     
			if (i >= 0 && i < str.length) {  
				pwd.append(str[i]);  
				count ++;  
			}  
		}  
		return pwd.toString();  
	}


	//发送 找回密码
	public String sendUP(String email,String username,String password){
		try {

			//设置发件人
			String from = "1920204594@qq.com";

			//设置收件人
			String to = email;

			//设置邮件发送的服务器，这里为QQ邮件服务器
			String host = "smtp.qq.com";

			//获取系统属性
			Properties properties = System.getProperties();

			//SSL加密
			MailSSLSocketFactory sf = new MailSSLSocketFactory();
			sf.setTrustAllHosts(true);
			properties.put("mail.smtp.ssl.enable", "true");
			properties.put("mail.smtp.ssl.socketFactory", sf);

			//设置系统属性
			properties.setProperty("mail.smtp.host", host);
			properties.put("mail.smtp.auth", "true");

			//获取发送邮件会话、获取第三方登录授权码
			Session session = Session.getDefaultInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, "vmufftrtjkrlcabh");
				}
			});

			Message message = new MimeMessage(session);

			//防止邮件被当然垃圾邮件处理，披上Outlook的马甲
			message.addHeader("X-Mailer","Microsoft Outlook Express 6.00.2900.2869");

			message.setFrom(new InternetAddress(from));

			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			//邮件标题
			message.setSubject("博客-找回密码");

			BodyPart bodyPart = new MimeBodyPart();

			//获取注册码
			String code = genRandomNum();

			bodyPart.setText("时光博客\r\n账号："+username+" 密码："+password+"\r\n阅读后请立即销毁,避免账号密码泄露!");

			Multipart multipart = new MimeMultipart();

			multipart.addBodyPart(bodyPart);


			/*//附件
	            bodyPart = new MimeBodyPart();
	            String fileName = "文件路径";
	            DataSource dataSource = new FileDataSource(fileName);
	            bodyPart.setDataHandler(new DataHandler(dataSource));
	            bodyPart.setFileName("文件显示的名称");
	            multipart.addBodyPart(bodyPart);*/

			message.setContent(multipart);

			Transport.send(message);
			return "ok";
		} catch (Exception e) {
			return null;
		}

	}

	public static void main(String[] args) {
		String send = new SendEmail().send("1762321490@qq.com");
		System.out.println(send);
	}
}
