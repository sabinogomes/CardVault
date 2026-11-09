package domain.model.card;

import java.time.LocalDateTime;

import domain.model.base.BaseEntity;

public abstract class Card extends BaseEntity {

	private final String name;
	
	private final String passcode;
	
	private final String description;
	
	public Card(
			Long id,
			String name,
			String passcode,
			String description,
			LocalDateTime createdAt, 
			LocalDateTime updatedAt 
			) {
		super(id, createdAt, updatedAt);
		this.name = name;
		this.passcode = passcode;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getPasscode() {
		return passcode;
	}

	public String getDescription() {
		return description;
	}

}
