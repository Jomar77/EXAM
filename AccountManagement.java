import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class AccountManagement {
	private String name, gender, age;
	private String username, password;
	private FileWriter fWriter;
	private FileReader fRead;
	private int key;
	private Random rnd;
	private CaesarCipher caesar;
	private Scanner read;
	
	public AccountManagement() {
		name=username=password="";
		fRead=null;
		fWriter=null;
		read=null;
		key=0;
		rnd=new Random();
		caesar=new CaesarCipher();
	}
	
	public void setInfo(String name, String gender, String age) throws IOException { //throws any error- you can use try an catch
		this.name=name;
		this.gender=gender;
		this.age=age;
		
		fWriter=new FileWriter("Account.txt",true); //true means it appends the information stored to a textfile
		fWriter.write(name+" "+gender+" "+age+" "); //stores data to a text file
		fWriter.close(); //storing to file will not work without closing statement
	}
	public void setAccount(String username, String password) throws IOException{
		String cipher="";
		this.username=username;
		this.password=password;
		this.key=rnd.nextInt(20)+3;// randomize 3 to 20 as the key for each password, unique to each record stored
		
		cipher=caesar.encrypt(password, key);
		fWriter=new FileWriter("Account.txt",true);
		fWriter.write(username+" "+cipher+" "+key+"\n");
		fWriter.close();
	}
	
	public String login(String username, String password) throws IOException{
		String hold="";
		fRead=new FileReader("Account.txt");
		read=new Scanner(fRead);
		while(read.hasNext()) {
			//reads data every after space from a textfile, store it to a certain variable
			
			String original=caesar.decrypt(this.password, key); // decryption process to take back the original form of password with the key 
			
			//if the entered username is the same to username from the file and when the password entered is also the same to the file upon decryption
			if(username.equals(this.username) && password.equals(original)) {
				hold="Login successful.";
			}else {
				hold="Login failed.";
			}
			
			name=read.next();
			gender=read.next();
			age=read.next();
			this.username=read.next();
			this.password=read.next();
			key=read.nextInt();
		}
		return hold;
	}
}

