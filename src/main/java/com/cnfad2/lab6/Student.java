package com.cnfad2.lab6;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		int id;
		int totalmarks;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getTotalmarks() {
			return totalmarks;
		}

		public void setTotalmarks(int totalmarks) {
			this.totalmarks = totalmarks;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		String name;

	}
