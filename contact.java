package testcase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class contact {

	public static void main(String[] args) {
		mob_no a = new mob_no(176678, "shri","shri@gmail.com","bangalore");
		mob_no b = new mob_no(676987, "shri","shri@gmail.com","bangal0ore");
		mob_no c = new mob_no(976098, "hari","shri@gmail.com","bangalore");
		List<mob_no> contacts = new ArrayList<mob_no>();
        contacts.add(a);
        contacts.add(b);
        contacts.add(c);
        Collections.sort(contacts, new contact_comparator ());
        for (int i = 0; i < contacts.size(); i++)
		{
			System.out.println(contacts.get(i));
		}
		
	}

}
