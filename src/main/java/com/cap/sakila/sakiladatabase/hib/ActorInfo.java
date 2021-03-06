package com.cap.sakila.sakiladatabase.hib;
// Generated Apr 22, 2019 8:26:00 AM by Hibernate Tools 5.2.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ActorInfo generated by hbm2java
 */
@Entity
@Table(name = "actor_info", catalog = "sakila")
public class ActorInfo implements java.io.Serializable {

	private ActorInfoId id;

	public ActorInfo() {
	}

	public ActorInfo(ActorInfoId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "actorId", column = @Column(name = "actor_id", nullable = false)),
			@AttributeOverride(name = "firstName", column = @Column(name = "first_name", nullable = false, length = 45)),
			@AttributeOverride(name = "lastName", column = @Column(name = "last_name", nullable = false, length = 45)),
			@AttributeOverride(name = "filmInfo", column = @Column(name = "film_info", length = 65535)) })
	public ActorInfoId getId() {
		return this.id;
	}

	public void setId(ActorInfoId id) {
		this.id = id;
	}

}
