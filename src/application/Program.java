package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();	
		System.out.println("================== find by id ==================");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n============== find by Department ==================");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}
		
		System.out.println("\n============== find by Department ==================");
		//Department department2 = new Department(2, null);
		List<Seller> list2 = sellerDao.findAll();
		for (Seller seller2 : list2) {
			System.out.println(seller2);
		}
		
		System.out.println("\n============== insert ==================");
		//Department department2 = new Department(2, null);
		//Seller newSeller = new Seller(null, "Daiane", "dai.rdg@gmail.com", new Date(), 4000.00, department2);
		//sellerDao.insert(newSeller);
		//System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n============== update ==================");
		seller = sellerDao.findById(1);
		seller.setName("João");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		
		
	}
}
