package so.pickme.replica.domain;

import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class FrndreqQuery {
	
	Long ReqID;
	
	String UNAme;

	/**
	 * @return the reqID
	 */
	public Long getReqID() {
		return ReqID;
	}

	/**
	 * @param reqID the reqID to set
	 */
	public void setReqID(Long reqID) {
		ReqID = reqID;
	}

	/**
	 * @return the uNAme
	 */
	public String getUNAme() {
		return UNAme;
	}

	/**
	 * @param uNAme the uNAme to set
	 */
	public void setUNAme(String uNAme) {
		UNAme = uNAme;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FrndreqQuery [ReqID=" + ReqID + ", UNAme=" + UNAme + "]";
	}	



	
}
