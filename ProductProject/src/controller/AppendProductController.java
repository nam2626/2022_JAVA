package controller;

import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class AppendProductController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품정보 등록을 시작합니다......");

		System.out.println("등록할 제품 번호 : ");
		String productNo = sc.nextLine();
		System.out.println("등록할 제품명 : ");
		String productName = sc.nextLine();
		System.out.println("등록할 제품의 제조사 : ");
		String makerName = sc.nextLine();
		System.out.println("등록할 제품 재고 : ");
		int ea = sc.nextInt();
		sc.nextLine();
		System.out.println("등록할 제품 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		if(ProductService.getInstance().appendProduct(new ProductVO(productNo, productName, makerName, ea, price))) {
			System.out.println("제품 등록 완료");
		}else {
			System.out.println("제품 등록 실패, 입력하신 데이터를 확인하세요.");
		}

	}

}



