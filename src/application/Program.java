package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program { 
	public static SimpleDateFormat dtf = new  SimpleDateFormat("dd/MM/yyyy");
	

	public static void main(String[] args) throws Exception {
		Date date = dtf.parse("20/10/2014");
		Locale.setDefault(Locale.US);
		Department obj = new Department(1, "TI");
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		
		Seller seller =  sellerDao.fingById(5);
		
		System.out.println(seller);
		
		
		
		
		
	}

}
