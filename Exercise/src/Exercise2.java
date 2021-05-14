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
		
		System.out.print("인원수>>");
		int n = scanner.nextInt();
		
		Phonee[] p = new Phonee[n];
		for(int i = 0; i < n; i++) {
			System.out.print("이름과 전화번호>>");
			String name = scanner.next();
			String tel = scanner.next();
			p[i] = new Phonee(name, tel);
			
		}
		
		System.out.println("저장되었습니다..");
		
		while(true) {
			System.out.print("검색할 이름>>");
			String name = scanner.next();
			if(name.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
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
				System.out.println(name + "가 없습니다.");
			else
				System.out.println(name + "의 번호는 "+ tel+"입니다");
		}
		
		
	}

}
