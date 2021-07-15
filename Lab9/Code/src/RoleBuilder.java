public class RoleBuilder {
	private static String roles[] = { "UNDEFINED", "DEVELOPER", "TEST_ENGINEER", "SR_DEVELOPER", "DESIGNER" };

	public static String getRoleDescription(int roleId) {
		
		if(roleId>4 || roleId<1)
			return roles[0];
		return roles[roleId];
		
	}
}
