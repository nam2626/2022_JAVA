package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class PrintAllProductController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("전체 제품 정보를 출력합니다.....");
		ArrayList<ProductVO> list = ProductService.getInstance().getList();
		
		if(list.isEmpty()) {
			System.out.println("등록된 제품이 없습니다.");
			return;
		}
		
		for(ProductVO vo : list)
			System.out.println(vo);
		System.out.println();
	}

}
