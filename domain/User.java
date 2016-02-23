package so.pickme.replica.domain;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
/*import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;*/



@NodeEntity
public class User extends Entity {
	
	
	
	/*@GraphId
	Long  id;*/
	
	private Date createdAt;

	@NotEmpty(message = "Last name is required.")
	private String firstName;
	
	@NotEmpty(message = "Last name is required.")
	private String lastName;
	
	/*@Index(unique=true)*/
	private String username;
	
	@Email(message = "Please provide a valid email address.")
	@NotEmpty(message = "Email is required.")
	@Column(nullable = false)
	/*@Index(unique=true)*/
	private String email;
	
	@NotEmpty(message = "Password is required.")
	private String password;
	
	
	@NotEmpty(message = "Role is must required.")
	@Column(nullable = false)
    private Set<String> role = new HashSet<String>();
	
	/*@RelatedTo(type="FRIEND", direction=Direction.BOTH)*/
	@Relationship(type="FRIEND", direction=Relationship.UNDIRECTED)
	public Set<User> friends;

	
	@Relationship(type="MYROUTES", direction=Relationship.UNDIRECTED)
	public Set<Route> myroutes;
	
	
	
	public User() {
	}
	

	//@com.fasterxml.jackson.annotation.JsonIgnore //need to be tested
	public void myFriends(User friend
			){
		if(friends == null) {
			friends = new HashSet<User>();
		}
		friends.add(friend);
	}
	
	public User(User user) {
		/*this.id = user.id;*/
		this.firstName = user.firstName;
		this.lastName = user.lastName;
		this.email = user.email;
		this.password = user.password;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	public User(String username, String password, String firstName, String lastName, Set<String> role) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}
	
	public User(String username, String firstName, String lastName, Set<String> role) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}

	public User(String username) {
		this.username = username;
	}
	
/*	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}*/

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		
		this.email = email;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Set<String> getRole() {
		return role;
	}


	public void setRole(String role) {
		
		this.role.add(role);
	}
	
	
	
	
}
