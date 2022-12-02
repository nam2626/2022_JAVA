package controller;

import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class UpdateProductController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품정보 수정을 시작합니다.............");
		
		System.out.println("수정할 제품 번호 : ");
		String productNo = sc.nextLine();
		
		ProductVO vo = ProductService.getInstance().searchProduct(productNo);
		
		if(vo == null) {
			System.out.println("수정할 제품이 없습니다. 제품번호를 확인하세요");
			return;
		}
		
		System.out.println("수정할 제품명 : ");
		String productName = sc.nextLine();
		vo.setProductName(productName);
		System.out.println("수정할 제품의 제조사 : ");
		String makerName = sc.nextLine();
		vo.setMakerName(makerName);
		System.out.println("수정할 제품 재고 : ");
		int ea = sc.nextInt();
		sc.nextLine();
		vo.setEa(ea);
		System.out.println("수정할 제품 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		vo.setPrice(price);
		
		System.out.println("제품 정보 수정이 완료 되었습니다....");
	}

}
