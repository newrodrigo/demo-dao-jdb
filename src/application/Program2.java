package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		/*SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);*/
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("==== TEST 1: findById ====");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		

	}

}
