package so.pickme.replica.domain;

import java.util.Date;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.StartNode;

public class BaseRelationship {
	@GraphId
	private Long relId;
	@EndNode
	private User endNode;
	@StartNode
	private User startNode;
	private Date createdAt;
	private Date updatedAt;

	public Long getRelId() {
		return relId;
	}

	public void setRelId(Long relId) {
		this.relId = relId;
	}

	public User getEndNode() {
		return endNode;
	}

	public void setEndNode(User endNode) {
		this.endNode = endNode;
	}

	public User getStartNode() {
		return startNode;
	}

	public void setStartNode(User startNode) {
		this.startNode = startNode;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
