package com.example.demo.model;


import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class CustomerDao {

		HibernateTemplate template;
	
		public void setTemplate(HibernateTemplate template) {
			this.template = template;
		}

		// method to save employee
		public void saveCustomer(Customer c) {
			template.save(c);
		}

		// method to update employee
		public void updateEmployee(Customer c) {
			template.update(c);
		}

		// method to delete employee
		public void deleteEmployee(Customer c) {
			template.delete(c);
		}

		// method to return one employee of given id
		public Customer getById(int id) {
			Customer e = (Customer) template.get(Customer.class, id);
			return e;
		}

		// method to return all employees
		public List<Customer> getEmployees() {
			List<Customer> list = new ArrayList<Customer>();
			list = template.loadAll(Customer.class);
			return list;
		}
}
