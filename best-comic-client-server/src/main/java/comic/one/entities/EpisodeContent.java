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
@Table(name = "episode_content")
public class EpisodeContent {
	@Id
	@GeneratedValue
	private Long id;
	
	public Episode getEpisode() {
		return episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public String getContentUrl1() {
		return contentUrl1;
	}

	public void setContentUrl1(String contentUrl1) {
		this.contentUrl1 = contentUrl1;
	}

	public String getContentUrl2() {
		return contentUrl2;
	}

	public void setContentUrl2(String contentUrl2) {
		this.contentUrl2 = contentUrl2;
	}

	public String getContentUrl3() {
		return contentUrl3;
	}

	public void setContentUrl3(String contentUrl3) {
		this.contentUrl3 = contentUrl3;
	}

	public String getContentUrl4() {
		return contentUrl4;
	}

	public void setContentUrl4(String contentUrl4) {
		this.contentUrl4 = contentUrl4;
	}

	public String getContentUrl5() {
		return contentUrl5;
	}

	public void setContentUrl5(String contentUrl5) {
		this.contentUrl5 = contentUrl5;
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

	@ManyToOne
	@JoinColumn(name = "episode_id")
	private Episode episode;
	
	@Column(name = "content_url1", length = 200)
	private String contentUrl1;
	
	@Column(name = "content_url2", length = 200)
	private String contentUrl2;
	
	@Column(name = "content_url3", length = 200)
	private String contentUrl3;
	
	@Column(name = "content_url4", length = 200)
	private String contentUrl4;
	
	@Column(name = "content_url5", length = 200)
	private String contentUrl5;
	
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
