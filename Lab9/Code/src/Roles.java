public class Roles {

	// Declare necessary data members
	private String roleDescription;
	private int roleId;
	
	public Roles(int roleId) {
		this.roleId = roleId;
		this.roleDescription = RoleBuilder.getRoleDescription(roleId);
	}
	
	public String getRoleDescription() {
		return roleDescription;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
		this.roleDescription = RoleBuilder.getRoleDescription(roleId);
	}
	
}