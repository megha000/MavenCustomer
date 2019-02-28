package com.lti.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/captcha.png")
public class CapchaServlet extends HttpServlet {
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String str ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	String cap ="";
	for(int i=0;i<4;i++) {
		int rno=(int) Math.floor(Math.random()*str.length());
		cap += str.charAt(rno);
	}
	response.setContentType("image/jpeg");
	ServletOutputStream out= response.getOutputStream();
	BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
	
	// For the font
	Graphics g = img.getGraphics();
	g.setColor(Color.BLACK);
	g.fillRect(0,0,100, 100);
	g.setColor(Color.PINK);
	g.setFont(new Font("Harrington", Font.BOLD,28));
	g.drawString(cap,3,30);
	ImageIO.write(img, "jpeg", out);
	}
//		Random randomm =new Random();
//		StringBuilder buffer = new StringBuilder(targetStringLength);
//		System.out.println(ran.nextInt(5));
	}

	
