package com.wolken.monumnet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="monumententity")
@ToString
@NamedQueries({
	@NamedQuery(name="getAll" ,query = "from MonumentEntity")
})
public class MonumentEntity {
	@Id
	@GenericGenerator(name="id",strategy = "increment")
	@GeneratedValue(generator = "id",strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private short year;
	@Column
	private short height;
	@Column
	private String location;
	@Column
	private float entryFee; 
}
