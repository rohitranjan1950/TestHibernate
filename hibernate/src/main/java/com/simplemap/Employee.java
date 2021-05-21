package com.simplemap;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="simplemap_tab")
public class Employee {

	@Id
	@GeneratedValue
	private int id;

//	private boolean bol;
//	private byte by;
//	private short sh;
//	private char ch;

	private long phone;
	private float ft;
	private double salary;
	
	@Column(name="NAME_New" , length =5, nullable=false, unique = true )
	private String name;
	
	private LocalDate date;
	private LocalTime time;
	private LocalDateTime dt_time;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Employee(int id, boolean bol, byte by, short sh, char ch, long phone, float ft, double salary, String name,
//			LocalDate date, LocalTime time, LocalDateTime dt_time) {
//		super();
//		this.id = id;
//		this.bol = bol;
//		this.by = by;
//		this.sh = sh;
//		this.ch = ch;
//		this.phone = phone;
//		this.ft = ft;
//		this.salary = salary;
//		this.name = name;
//		this.date = date;
//		this.time = time;
//		this.dt_time = dt_time;
//	}

	

	public int getId() {
		return id;
	}

	public Employee(long phone, float ft, double salary, String name, LocalDate date, LocalTime time,
		LocalDateTime dt_time) {
	super();
	this.phone = phone;
	this.ft = ft;
	this.salary = salary;
	this.name = name;
	this.date = date;
	this.time = time;
	this.dt_time = dt_time;
}

	public void setId(int id) {
		this.id = id;
	}

//	public boolean isBol() {
//		return bol;
//	}
//
//	public void setBol(boolean bol) {
//		this.bol = bol;
//	}
//
//	public byte getBy() {
//		return by;
//	}
//
//	public void setBy(byte by) {
//		this.by = by;
//	}
//
//	public short getSh() {
//		return sh;
//	}
//
//	public void setSh(short sh) {
//		this.sh = sh;
//	}
//
//	public char getCh() {
//		return ch;
//	}
//
//	public void setCh(char ch) {
//		this.ch = ch;
//	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public float getFt() {
		return ft;
	}

	public void setFt(float ft) {
		this.ft = ft;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public LocalDateTime getDt_time() {
		return dt_time;
	}

	public void setDt_time(LocalDateTime dt_time) {
		this.dt_time = dt_time;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", phone=" + phone + ", ft=" + ft + ", salary=" + salary + ", name=" + name
				+ ", date=" + date + ", time=" + time + ", dt_time=" + dt_time + "]";
	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", bol=" + bol + ", by=" + by + ", sh=" + sh + ", ch=" + ch + ", phone=" + phone
//				+ ", ft=" + ft + ", salary=" + salary + ", name=" + name + ", date=" + date + ", time=" + time
//				+ ", dt_time=" + dt_time + "]";
//	}

}
