package testcase;

import java.util.Comparator;

public class contact_comparator  implements Comparator<mob_no> {

	@Override
	public int compare(mob_no a, mob_no b)
    {
        return b.numb - a.numb;
    }
	

}
