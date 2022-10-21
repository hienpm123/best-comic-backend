package comic.one.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "episode")
public class Episode {
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "title", nullable = false, length = 150)
	private String title;

	@ManyToOne
	@JoinColumn(name = "chapter_id")
	private Chapter chapter;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Chapter getChapter() {
		return chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
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
