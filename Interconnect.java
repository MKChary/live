package Interface;

abstract class Interconnect implements Gmail {

	public boolean login(String email, String pwd) {
		if (email.equals("priya@gmail.com") && pwd.equals("12345")) {
			System.out.println("Login Successful");
			return true;

		}
		return false;
	}

	public abstract void dashboard();

	public void logout() {
		System.out.println("Logout Success");

	}

}
