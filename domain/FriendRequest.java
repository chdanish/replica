package so.pickme.replica.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "FRIEND_REQUEST")
public class FriendRequest extends Entity {
	
	@GraphId   private Long relationshipId;
    @Property  private String message;
    @StartNode private User toUser;
    @EndNode   private User fromUser;
	
    
	public FriendRequest(String message, User toUser, User fromUser) {
		super();
		this.message = message;
		this.toUser = toUser;
		this.fromUser = fromUser;
	}


	/**
	 * @return the relationshipId
	 */
	public Long getRelationshipId() {
		return relationshipId;
	}


	/**
	 * @param relationshipId the relationshipId to set
	 */
	public void setRelationshipId(Long relationshipId) {
		this.relationshipId = relationshipId;
	}


	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}


	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}


	/**
	 * @return the toUser
	 */
	public User getToUser() {
		return toUser;
	}


	/**
	 * @param toUser the toUser to set
	 */
	public void setToUser(User toUser) {
		this.toUser = toUser;
	}


	/**
	 * @return the fromUser
	 */
	public User getFromUser() {
		return fromUser;
	}


	/**
	 * @param fromUser the fromUser to set
	 */
	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}

	

}
