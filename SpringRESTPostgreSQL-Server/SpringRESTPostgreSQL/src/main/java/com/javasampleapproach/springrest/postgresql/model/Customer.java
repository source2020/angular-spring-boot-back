package com.javasampleapproach.springrest.postgresql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "mail")
	private String mail;

	@Column(name = "preferencia")
	private String preferencia;

	@Column(name = "age")
	private int age;

	@Column(name = "active")
	private boolean active;

	public Customer() {
	}

	public Customer(String mail,String preferencia, int age) {
		this.mail = mail;
		this.preferencia = preferencia;
		this.age = age;
		this.active = false;
	}

	public long getId() {
		return id;
	}

	public void setPreferencia(String preferencia) {
		this.preferencia = preferencia;
	}

	public String getPreferencia() {
		return this.preferencia;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMail() {
		return this.mail;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", mail=" + mail + ", preferencia=" + preferencia + ", age=" + age + ", active=" + active + "]";
	}
}
