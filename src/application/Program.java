package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static LocalDate date = LocalDate.parse("20/02/2010", dtf);

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Department obj = new Department(1, "TI");

		Seller seller = new Seller(20, "Raimundo Brito", "raimundo@gmail.com", date, 2214.0, obj);
		System.out.println(seller);
	}

}
