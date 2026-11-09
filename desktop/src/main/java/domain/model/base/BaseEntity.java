package domain.model.base;

import java.time.LocalDateTime;

public abstract class BaseEntity {

	private Long id;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt;

	public BaseEntity() {
	}
	
	public BaseEntity(Long id, LocalDateTime createdAt, LocalDateTime updatedAt) {
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;

	    if (obj == null || getClass() != obj.getClass())
	        return false;

	    BaseEntity other = (BaseEntity) obj;

	    return id != null && id.equals(other.id);
	}

	@Override
	public int hashCode() {
	    return getClass().hashCode();
	}

}
