package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Jo�o", "joao@gmail.com", new Date(), 3200.0, obj);
		
		System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();

	}

}
