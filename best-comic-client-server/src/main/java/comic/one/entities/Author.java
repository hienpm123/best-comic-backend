package comic.one.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfDeath() {
		return dateOfDeath;
	}

	public void setDateOfDeath(Date dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isDelFlg() {
		return delFlg;
	}

	public void setDelFlg(boolean delFlg) {
		this.delFlg = delFlg;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public Long getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(Long deletedBy) {
		this.deletedBy = deletedBy;
	}

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "first_name", nullable = true, length = 150)
	private String firstName;
	
	@Column(name = "last_name", nullable = true, length = 150)
	private String lastName;
	
	@Column(name = "date_of_birth", nullable = true)
	private Date dateOfBirth;
	
	@Column(name = "date_of_death", nullable = true)
	private Date dateOfDeath;
	
	@Column(name = "nation", nullable = true, length = 250)
	private String nation;
	
	@Column(name = "story", nullable = true, length = 1050)
	private String story;
	
	@Column(name = "note", nullable = true, length = 2050)
	private String note;
	
	@Column(name = "del_flg", nullable = false, columnDefinition = "boolean default 0")
	private boolean delFlg;

	@Column(name = "created_at", nullable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
	private Date createdAt;

	@Column(name = "created_by", nullable = false)
	private Long createdBy;

	@Column(name = "updated_at", nullable = true)
	private Date updatedAt;

	@Column(name = "updated_by", nullable = true)
	private Long updatedBy;

	@Column(name = "deleted_at", nullable = true)
	private Date deletedAt;

	@Column(name = "deleted_by", nullable = true)
	private Long deletedBy;
}
