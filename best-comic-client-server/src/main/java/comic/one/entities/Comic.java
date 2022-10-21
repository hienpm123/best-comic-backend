package comic.one.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "comic")
public class Comic {
	public ComicOneType getComicOneType() {
		return comicOneType;
	}

	public void setComicOneType(ComicOneType comicOneType) {
		this.comicOneType = comicOneType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCaregories() {
		return caregories;
	}

	public void setCaregories(String caregories) {
		this.caregories = caregories;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
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

	public Collection<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(Collection<Chapter> chapters) {
		this.chapters = chapters;
	}

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "comiconetype_id")
	private ComicOneType comicOneType;

	@Column(name = "name", nullable = false, length = 150)
	private String name;

	@Column(name = "caregories", length = 250)
	private String caregories;

	@Column(name = "authors", length = 250)
	private String authors;

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
	
	@OneToMany(mappedBy = "comic", cascade = CascadeType.ALL)
	private Collection<Chapter> chapters;
}
