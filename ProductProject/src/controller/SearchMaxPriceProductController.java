package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class SearchMaxPriceProductController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제일 비싼 제품 목록을 조회합니다............");
		ArrayList<ProductVO> list = ProductService.getInstance().maxPriceProductList();
		if(list.isEmpty()) {
			System.out.println("현재 등록된 제품들이 없습니다.");
			return;
		}
		
		for(ProductVO vo : list)
			System.out.println(vo);
		System.out.println();
	}

}








