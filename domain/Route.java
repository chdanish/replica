package so.pickme.replica.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import so.pickme.replica.domain.Entity;

@NodeEntity
public class Route extends Entity {
	

	
	@Relationship(type="OWNEDBY", direction=Relationship.UNDIRECTED)
	private User ownby;
	
	private String title;
	
	private String discription;
	
	private String startpointaddress;
	private String destinationpointaddress;
	private String startpointLAT;
	private String startpointLONG;
	private String destpointLAT;
	private String destpointLONG;	
	private String routename;	
	private String shareType;
	
	private long routegroupid;
	private long distance; //mills
	private long duration;


	@Temporal(TemporalType.DATE)
	@Column(name = "createdOn", updatable = false)
	protected Date createdOn;

	@Column(name = "last_updated")
	protected Date lastUpdatedOn;

	/**
	 * @return the ownby
	 */
	public User getOwnby() {
		return ownby;
	}

	/**
	 * @param ownby the ownby to set
	 */
	public void setOwnby(User ownby) {
		this.ownby = ownby;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the discription
	 */
	public String getDiscription() {
		return discription;
	}

	/**
	 * @param discription the discription to set
	 */
	public void setDiscription(String discription) {
		this.discription = discription;
	}

	/**
	 * @return the startpointaddress
	 */
	public String getStartpointaddress() {
		return startpointaddress;
	}

	/**
	 * @param startpointaddress the startpointaddress to set
	 */
	public void setStartpointaddress(String startpointaddress) {
		this.startpointaddress = startpointaddress;
	}

	/**
	 * @return the destinationpointaddress
	 */
	public String getDestinationpointaddress() {
		return destinationpointaddress;
	}

	/**
	 * @param destinationpointaddress the destinationpointaddress to set
	 */
	public void setDestinationpointaddress(String destinationpointaddress) {
		this.destinationpointaddress = destinationpointaddress;
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
	 * @return the distance
	 */
	public long getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(long distance) {
		this.distance = distance;
	}

	/**
	 * @return the duration
	 */
	public long getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(long duration) {
		this.duration = duration;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Route [ownby=" + ownby + ", title=" + title + ", discription=" + discription + ", startpointaddress="
				+ startpointaddress + ", destinationpointaddress=" + destinationpointaddress + ", routegroupid="
				+ routegroupid + ", distance=" + distance + ", duration=" + duration + ", startpointLAT="
				+ startpointLAT + ", startpointLONG=" + startpointLONG + ", destpointLAT=" + destpointLAT
				+ ", destpointLONG=" + destpointLONG + ", routename=" + routename + ", shareType=" + shareType
				+ ", createdOn=" + createdOn + ", lastUpdatedOn=" + lastUpdatedOn + "]";
	}

	


}
