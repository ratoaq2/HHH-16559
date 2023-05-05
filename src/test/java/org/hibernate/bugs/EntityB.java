package org.hibernate.bugs;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ENTITY_B")
public class EntityB {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	Integer id;

	@Column(name = "FOO")
	Integer foo;

	@OneToMany(mappedBy = "entityB")
	@Fetch(FetchMode.SUBSELECT)
	List<EntityA> listOfEntitiesA = new ArrayList<>();
}