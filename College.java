package com.ty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class College {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int id;
	  @Column(nullable = false)
	   private String name;
	   private String website;
	   @Column(unique = true)
	   private long phnno;
	   private int nobranchers;
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
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public long getPhnno() {
		return phnno;
	}
	public void setPhnno(long phnno) {
		this.phnno = phnno;
	}
	public int getNobranchers() {
		return nobranchers;
	}
	public void setNobranchers(int nobranchers) {
		this.nobranchers = nobranchers;
	}
}