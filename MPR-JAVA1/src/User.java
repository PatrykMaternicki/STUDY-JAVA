

public class User {

    private Person person = new Person();

    
    
	public void initUser (){
		
		person.setLogin("WiesławPaleta");
		person.setName("Wiesio");
		person.setSurName("Paleciarz");
		person.createRoleList();
		person.createAdressList();
	
	}
        
        public void ShowInfo (){
            System.out.println("---Info---- \n");
            showName();
            showSurName();
            showLogin();
            showAdress();
            showRoleList();
            showPermision();
            System.out.println("--------- \n");
            
        }
        public void showName(){
            System.out.print("Name: " + person.getName() + "\n");
            
        }
        public void showSurName(){
            System.out.print("SurName: " + person.getSurName() + "\n");
            
        }
        public void showLogin (){
            System.out.println("Login: " + person.getLogin() + "\n");
            
        }
           public void showRoleList(){
            System.out.print("Role: " + person.showRoleList() + "\n");
            
        }
        public void showPermision(){
            System.out.println("Permision : " + person.showPermision() + "\n" );
        }
        
        public void showAdress (){
            System.out.println ("Adress : " + person.showAdress() + "\n");
        }

}
