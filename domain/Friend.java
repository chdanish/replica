package so.pickme.replica.domain;

import java.util.List;

import org.neo4j.ogm.annotation.RelationshipEntity;

@RelationshipEntity(type = "FRIEND")
public class Friend extends BaseRelationship {
	private String remark;
	private String remarkName;
	private boolean privateFlag;
	private List<String> friendGroups;

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemarkName() {
		return remarkName;
	}

	public void setRemarkName(String remarkName) {
		this.remarkName = remarkName;
	}

	public boolean getPrivateFlag() {
		return privateFlag;
	}

	public void setPrivateFlag(boolean privateFlag) {
		this.privateFlag = privateFlag;
	}

	public List<String> getFriendGroups() {
		return friendGroups;
	}

	public void setFriendGroups(List<String> friendGroups) {
		this.friendGroups = friendGroups;
	}

}