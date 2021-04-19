package testcase;

public class mob_no  {
	int numb ;
	String email ;
	String name ;
	String adress;
	mob_no(int numb, String name, String email, String adress)
	{
		this.numb=numb;
		this.name=name;
		this.email=email;
		this.adress=adress;
	}
	void setnumb(int numb)
	{
		this.numb=numb;
	}
	int getnumb()
	{
		return numb;
	}
	void setname(String name)
	{
		this.name=name;
	}
	String getname()
	{
		return name;
	}
	void setemail(String email)
	{
		this.email=email;
	}
	String getemail()
	{
		return email;
	}
	void setadress(String adress)
	{
		this.adress=adress;
	}
	String getadress()
	{
		return adress;
	}
	public String toString() {
        return "CONTACT : " + numb + " - " + name + " - " + email + " - " + adress + "\n";
    }
}
