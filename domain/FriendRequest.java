package so.pickme.replica.domain;

import org.neo4j.ogm.annotation.RelationshipEntity;

@RelationshipEntity(type = "FRIEND_REQUEST")
public class FriendRequest extends BaseRelationship {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
