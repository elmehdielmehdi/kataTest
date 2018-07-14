package com.aracovoiturage.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TravelerPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8650813407859102639L;

	@Column(name = "pathId")
	private Long pathId;

	@Column(name = "userId")
	private Long userId;

	public TravelerPK() {
		super();
	}

	public Long getPathId() {
		return pathId;
	}

	public void setPathId(Long pathId) {
		this.pathId = pathId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
