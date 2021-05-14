import java.util.Scanner;

class Phone{
	private String name, tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}
public class Exercise1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
		String name1 = scanner.next();
		String tel1 = scanner.next();
		
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
		String name2 = scanner.next();
		String tel2 = scanner.next();
		
		Phone p1 = new Phone(name1,tel1);
		Phone p2 = new Phone(name2, tel2);
		
		System.out.println(p1.getName()+"�� ��ȣ "+ p1.getTel());
		System.out.println(p2.getName()+"�� ��ȣ "+ p2.getTel());
	}
}
