package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws Exception {
		System.out.println("=== Test 1: seller findById ====");
		SellerDao sellerDao = DaoFactory.creatSellerDao();

		Seller seller = sellerDao.fingById(5);
		System.out.println(seller);

		System.out.println("\n=== Test 2: seller findByDepartment ====");
		Department department = new Department(2, null);
		sellerDao.findByDepartment(department).forEach(System.out::println);

	}

}
