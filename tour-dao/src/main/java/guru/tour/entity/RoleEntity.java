package guru.tour.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@Table(name="role")
@NamedQuery(name="RoleEntity.findAll", query="SELECT r FROM RoleEntity r")
public class RoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	private String role;

	//bi-directional many-to-one association to User_RoleEntity
	@OneToMany(mappedBy="role")
	private List<User_RoleEntity> userRoles;

	public RoleEntity() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<User_RoleEntity> getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(List<User_RoleEntity> userRoles) {
		this.userRoles = userRoles;
	}

	public User_RoleEntity addUserRole(User_RoleEntity userRole) {
		getUserRoles().add(userRole);
		userRole.setRole(this);

		return userRole;
	}

	public User_RoleEntity removeUserRole(User_RoleEntity userRole) {
		getUserRoles().remove(userRole);
		userRole.setRole(null);

		return userRole;
	}

}