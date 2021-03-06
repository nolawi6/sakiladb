package com.cap.sakila.sakiladatabase.hib;
// Generated Apr 22, 2019 8:26:00 AM by Hibernate Tools 5.2.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Proxy;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * Country generated by hbm2java
 */
@Entity
@Table(name = "country", catalog = "sakila")
@Proxy(lazy=false)
public class Country implements java.io.Serializable {

	private Short countryId;
	private String country;
	private Date lastUpdate;
	@JsonBackReference
	private Set<City> cities = new HashSet<City>(0);

	public Country() {
	}

	public Country(String country, Date lastUpdate) {
		this.country = country;
		this.lastUpdate = lastUpdate;
	}

	public Country(String country, Date lastUpdate, Set<City> cities) {
		this.country = country;
		this.lastUpdate = lastUpdate;
		this.cities = cities;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "country_id", unique = true, nullable = false)
	public Short getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Short countryId) {
		this.countryId = countryId;
	}

	@Column(name = "country", nullable = false, length = 50)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update", nullable = false, length = 26)
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
	public Set<City> getCities() {
		return this.cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

}
