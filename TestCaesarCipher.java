import java.io.IOException;

import javax.swing.JOptionPane;;

public class TestCaesarCipher {
    public static void main(String[] args) throws IOException {
        AccountManagement acc=new AccountManagement();
        String menu[]= {"Create Account","Login","End"};
        String choice="";
        
        do {
            choice=JOptionPane.showInputDialog(null,"Choose","Menu",1,null,menu,menu[0]).toString();
            
            switch(choice) {
                case "Create Account":
                    String name=JOptionPane.showInputDialog("Name: ");
                    String gender=JOptionPane.showInputDialog("Gender: ");
                    String age=JOptionPane.showInputDialog("Age: ");
                    String username=JOptionPane.showInputDialog("Username: ");
                    String password=JOptionPane.showInputDialog("Password: ");
                    
                    acc.setInfo(username, gender, age);
                    acc.setAccount(username, password);
                    
                    break;
                case "Login":
                    String user=JOptionPane.showInputDialog("Username: ");
                    String pass=JOptionPane.showInputDialog("password: ");
                   JOptionPane.showMessageDialog(null, acc.login(user, pass));

                    break;
            }

        }while(!choice.equals("End"));
        
    }
	class Exam1_Nacorda{
		
	}
}
