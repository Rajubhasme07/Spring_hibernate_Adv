package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cus")
public class Customer {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@Column
		private String name;
		@Column
		private String cadd ;
		
		
		

		public int getId() {
			return id;
		}




		public void setId(int id) {
			this.id = id;
		}




		public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}




		public String getCadd() {
			return cadd;
		}




		public void setCadd(String cadd) {
			this.cadd = cadd;
		}




		@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", cadd=" + cadd + "]";
	}

}
