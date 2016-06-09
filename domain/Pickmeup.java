package so.pickme.replica.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import so.pickmeshare.utils.Pickupreqstatus;

@NodeEntity
public class Pickmeup extends Entity {
	
	User from;//	PICKUP-REQ-FROM
	
	@Relationship(type="PICKUP-REQ-FOR", direction=Relationship.UNDIRECTED)
	Route route; //	PICKUP-REQ-FOR
	
	@Relationship(type="PICKUP-REQ-TO", direction=Relationship.UNDIRECTED)
	Set<User> to;//	PICKUP-REQ-TO
	
	Date tripstarttime; //  (calander date ,time)	
	Date deadlinetocommit; //(calander date ,time)
	long tripstarttime_long; //  (calander date ,time)	
	long deadlinetocommit_long; //(calander date ,time)
	Pickupreqstatus status;
	TimeZone timezone;
	Boolean roaming;
	
	@Relationship(type="COMMIT-PROPOSAL", direction=Relationship.UNDIRECTED)
	Set<User>	commitreq; //COMMIT-PROPOSAL
	User  commitlock; //	COMMIT-LOCK
	
	
	public void pickmerequestto(User toUser
			){
		if(to == null) {
			to = new HashSet<User>();
		}
		to.add(toUser);
	}
	
	public void commitrequestfrom(User fromUser
			){
		if(commitreq == null) {
			commitreq = new HashSet<User>();
		}
		commitreq.add(fromUser);
	}
	
	
	/**
	 * @return the from
	 */
	public User getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(User from) {
		this.from = from;
	}
	/**
	 * @return the route
	 */
	public Route getRoute() {
		return route;
	}
	/**
	 * @param route the route to set
	 */
	public void setRoute(Route route) {
		this.route = route;
	}
	/**
	 * @return the to
	 */
	public Set<User> getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(Set<User> to) {
		this.to = to;
	}
	/**
	 * @return the tripstarttime
	 */
	public Date getTripstarttime() {
		return tripstarttime;
	}
	/**
	 * @param tripstarttime the tripstarttime to set
	 */
	public void setTripstarttime(Date tripstarttime) {
		this.tripstarttime = tripstarttime;
	}
	/**
	 * @return the deadlinetocommit
	 */
	public Date getDeadlinetocommit() {
		return deadlinetocommit;
	}
	/**
	 * @param deadlinetocommit the deadlinetocommit to set
	 */
	public void setDeadlinetocommit(Date deadlinetocommit) {
		this.deadlinetocommit = deadlinetocommit;
	}
	/**
	 * @return the tripstarttime_long
	 */
	public long getTripstarttime_long() {
		return tripstarttime_long;
	}

	/**
	 * @param tripstarttime_long the tripstarttime_long to set
	 */
	public void setTripstarttime_long(long tripstarttime_long) {
		this.tripstarttime_long = tripstarttime_long;
	}

	/**
	 * @return the deadlinetocommit_long
	 */
	public long getDeadlinetocommit_long() {
		return deadlinetocommit_long;
	}

	/**
	 * @param deadlinetocommit_long the deadlinetocommit_long to set
	 */
	public void setDeadlinetocommit_long(long deadlinetocommit_long) {
		this.deadlinetocommit_long = deadlinetocommit_long;
	}

	/**
	 * @return the timezone
	 */
	public TimeZone getTimezone() {
		return timezone;
	}
	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(TimeZone timezone) {
		this.timezone = timezone;
	}
	/**
	 * @return the roaming
	 */
	public Boolean getRoaming() {
		return roaming;
	}
	/**
	 * @param roaming the roaming to set
	 */
	public void setRoaming(Boolean roaming) {
		this.roaming = roaming;
	}
	/**
	 * @return the commitreq
	 */
	public Set<User> getCommitreq() {
		return commitreq;
	}
	/**
	 * @param commitreq the commitreq to set
	 */
	public void setCommitreq(Set<User> commitreq) {
		this.commitreq = commitreq;
	}
	/**
	 * @return the commitlock
	 */
	public User getCommitlock() {
		return commitlock;
	}
	/**
	 * @param commitlock the commitlock to set
	 */
	public void setCommitlock(User commitlock) {
		this.commitlock = commitlock;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	/**
	 * @return the status
	 */
	public Pickupreqstatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Pickupreqstatus status) {
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pickmeup [from=" + from + ", route=" + route + ", to=" + to + ", tripstarttime=" + tripstarttime
				+ ", deadlinetocommit=" + deadlinetocommit + ", tripstarttime_long=" + tripstarttime_long
				+ ", deadlinetocommit_long=" + deadlinetocommit_long + ", timezone=" + timezone + ", roaming=" + roaming
				+ ", commitreq=" + commitreq + ", commitlock=" + commitlock + "]";
	}
	
	
}
