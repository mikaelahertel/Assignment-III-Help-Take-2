package GuestBook;

public class Contact implements Comparable<Contact>{
	String firstName;
	String lastName;
	String address;
	String phoneNumber;

	public Contact (String a, String b, String c, String d) {
		firstName = a;
		lastName = b;
		address = c;
		phoneNumber = d;
	}
	
	public void toString(Contact o) {
		System.out.println("Contact:");
		System.out.printf("%s%5%s%n", "First Name:", o.firstName);
		System.out.printf("%s%5%s%n", "Last Name:", o.lastName);
		System.out.printf("%s%5%s%n", "Address:", o.address);
		System.out.printf("%s%5%s%n", "Phone Number:", o.phoneNumber);
		
	}

	@Override
	public int compareTo(Contact o) {
		if (this.firstName.compareTo(o.firstName) < 0 ) {
			return -1;
		}
		if (this.firstName.compareTo(o.firstName) == 0) {
			if(this.lastName.compareTo(o.lastName)==0) {
				if (this.address.compareTo(o.address) == 0) {
					if (this.phoneNumber.compareTo(o.phoneNumber) == 0) {
						return 0;
					} else return 1;
				} else return 1;
			} else  return 1;
		}
	
			else {
			return 1;
		}
	}



}
