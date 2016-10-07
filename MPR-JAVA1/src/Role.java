

public class Role {
	private String roleList = "";
	private Permision permision = new Permision();

        public Role() {
        }

    Role(String jest_tu_jakaś_rola_ale_w_sumie_nie_wiem_j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	
	public String getRoleList() {
		return roleList;
	}

	public void setRoleList(String roleList) {
		this.roleList = roleList;
	}
        
        public String getPermision (){
            return permision.getPermision();
        }


	public void addPermision (){
		permision.setPermision("MASTER");
	}
	

}

