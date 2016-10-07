

import java.util.ArrayList;

public class Person {
	private String Login = "";
	private String Password = "";
	private String name = "";
	private String surName = "";
        private Role role = new Role();
        private Adress adress = new Adress ();


	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}

	public void createRoleList (){
		role.setRoleList("Jakieś role");
		role.addPermision();
		
	}
	public void createAdressList(){
		adress.setAdress("Warszawa");
	}
        public String showRoleList (){
            return role.getRoleList();
        }
        public String showPermision (){
           return role.getPermision();
        }
        public String showAdress (){
           return  adress.getAdress();
        }

}
