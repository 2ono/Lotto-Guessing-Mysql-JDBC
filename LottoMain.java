import java.sql.SQLException;
import java.util.Scanner;

public class LottoMain {
	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		// add exception
		try {
			while (true) {
				Scanner scan = new Scanner(System.in);
				System.out.println("랜던 로또 생성기입니다!");
				System.out.println("추천 랜덤 로또 번호 생성할려면 1번 : ");
				System.out.println("추첨 로또 번호 확인할려면 2번 : ");
				System.out.println("랜덤 로또 생성기 끌려면 3번 : ");

				int num = scan.nextInt();
				LottoDAO lotto = new LottoDAO();
				switch (num) {
				case 1:
//					System.out.println("구매할 개수 입력:  ");

//					int count = scan.nextInt();
					lotto.generateLottoNumber();
					System.out.println("성공적으로  추첨 로또 번호가 Mysql에 생성완료");
					break;
				case 2:
					lotto.showLottoNumber();
					System.out.println("추첨 로또 번호입니다");
					break;
				default:
					break;
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

		
	}

}
