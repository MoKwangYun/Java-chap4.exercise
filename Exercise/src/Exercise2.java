import java.util.Scanner;

class Phonee{
	private String name, tel;
	public Phonee(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ο���>>");
		int n = scanner.nextInt();
		
		Phonee[] p = new Phonee[n];
		for(int i = 0; i < n; i++) {
			System.out.print("�̸��� ��ȭ��ȣ>>");
			String name = scanner.next();
			String tel = scanner.next();
			p[i] = new Phonee(name, tel);
			
		}
		
		System.out.println("����Ǿ����ϴ�..");
		
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String name = scanner.next();
			if(name.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			String tel = null;
			for(int i = 0; i<p.length;i++) {
				if(name.equals(p[i].getName())) {
					tel = p[i].getTel();
					break;
				}
					
			}
			if(tel == null)
				System.out.println(name + "�� �����ϴ�.");
			else
				System.out.println(name + "�� ��ȣ�� "+ tel+"�Դϴ�");
		}
		
		
	}

}
