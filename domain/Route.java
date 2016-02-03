package so.pickme.replica.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.codehaus.jackson.annotate.JsonBackReference;
@Entity
public class Route {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true)
	private long id;
	
	@JsonBackReference
	@ManyToOne
    @JoinColumn(name="user", nullable=false)
	private User user;
	
	
	private long routegroupid;
	private String startpointLAT;
	private String startpointLONG;
	private String destpointLAT;
	private String destpointLONG;	
	private String routename;	
	private String shareType;


	@Temporal(TemporalType.DATE)
	@Column(name = "createdOn", updatable = false)
	protected Date createdOn;

	@Column(name = "last_updated")
	protected Date lastUpdatedOn;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the routegroupid
	 */
	public long getRoutegroupid() {
		return routegroupid;
	}

	/**
	 * @param routegroupid the routegroupid to set
	 */
	public void setRoutegroupid(long routegroupid) {
		this.routegroupid = routegroupid;
	}

	/**
	 * @return the startpointLAT
	 */
	public String getStartpointLAT() {
		return startpointLAT;
	}

	/**
	 * @param startpointLAT the startpointLAT to set
	 */
	public void setStartpointLAT(String startpointLAT) {
		this.startpointLAT = startpointLAT;
	}

	/**
	 * @return the startpointLONG
	 */
	public String getStartpointLONG() {
		return startpointLONG;
	}

	/**
	 * @param startpointLONG the startpointLONG to set
	 */
	public void setStartpointLONG(String startpointLONG) {
		this.startpointLONG = startpointLONG;
	}

	/**
	 * @return the destpointLAT
	 */
	public String getDestpointLAT() {
		return destpointLAT;
	}

	/**
	 * @param destpointLAT the destpointLAT to set
	 */
	public void setDestpointLAT(String destpointLAT) {
		this.destpointLAT = destpointLAT;
	}

	/**
	 * @return the destpointLONG
	 */
	public String getDestpointLONG() {
		return destpointLONG;
	}

	/**
	 * @param destpointLONG the destpointLONG to set
	 */
	public void setDestpointLONG(String destpointLONG) {
		this.destpointLONG = destpointLONG;
	}

	/**
	 * @return the routename
	 */
	public String getRoutename() {
		return routename;
	}

	/**
	 * @param routename the routename to set
	 */
	public void setRoutename(String routename) {
		this.routename = routename;
	}

	/**
	 * @return the shareType
	 */
	public String getShareType() {
		return shareType;
	}

	/**
	 * @param shareType the shareType to set
	 */
	public void setShareType(String shareType) {
		this.shareType = shareType;
	}

	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * @return the lastUpdatedOn
	 */
	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	/**
	 * @param lastUpdatedOn the lastUpdatedOn to set
	 */
	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
	
	
	
	
	
	




}
