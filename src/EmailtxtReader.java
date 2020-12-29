

import java.io.FileNotFoundException;

public class EmailtxtReader {

	public static void main(String[] args) throws FileNotFoundException {

		int cnt = 0;

		Information i = new Information();
		for (EmailsNames en : i.info()) {
			System.out.println(en.getName() + "\t " + en.getEmail());
			cnt++;
		}

		SendEmail s = new SendEmail();
		for (int j = 0; j < cnt; j++) {
			s.Sendemail(i.info().get(j).getName(), i.info().get(j).getEmail());

		}

		

		
		
	}

}
