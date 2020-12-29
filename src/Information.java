import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Information {

	public ArrayList<EmailsNames> info() throws FileNotFoundException {
		String Path = System.getProperty("user.dir","/email.txt");
		String curpath = Path+(File.separator + "email.txt");

		Scanner scan = new Scanner(new File(curpath));//you should change the text path file here 

		ArrayList<EmailsNames> List = new ArrayList<EmailsNames>();

		while (scan.hasNext()) {

			String curLine = scan.nextLine();
			String[] splitted = curLine.split("\t");
			String name = splitted[0].trim();
			EmailsNames n = new EmailsNames();
			n.setName(name);
			String email = splitted[1].trim();
			n.setEmail(email);
			List.add(n);

		}
		return List;

	}

}
