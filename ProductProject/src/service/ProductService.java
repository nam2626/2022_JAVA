package service;

import java.util.ArrayList;

import vo.ProductVO;

public class ProductService {
	private static ProductService instance = new ProductService();
	private ArrayList<ProductVO> list;
	private ProductService() {
		list = new ArrayList<ProductVO>();
		list.add(new ProductVO("1111", "갤럭시", "삼성", 100, 2000));
		list.add(new ProductVO("2222", "아이폰", "애플", 200, 3000));
		list.add(new ProductVO("3333", "아이패드", "애플", 100, 3000));
	}

	public static ProductService getInstance() {
		if(instance == null)
			instance = new ProductService();
		return instance;
	}

	public boolean appendProduct(ProductVO productVO) {
		if(list.contains(productVO)) {
			return false;
		}
		return list.add(productVO);
	}

	public ArrayList<ProductVO> getList() {
		return list;
	}

	public ArrayList<ProductVO> maxPriceProductList(){
		ArrayList<ProductVO> rList = new ArrayList<ProductVO>();
		
		//1. 제품 가격 중 최대값
		int max = 0;
		for(ProductVO vo : list) {
			if(max < vo.getPrice())
				max = vo.getPrice();
		}
		//2. 제품가격 최대값과 같은 제품을 리스트에 저장
		for(ProductVO vo : list) {
			if(max == vo.getPrice())
				rList.add(vo);
		}
		
		return rList;
	}

	public ProductVO searchProduct(String productNo) {
		int i = list.indexOf(new ProductVO(productNo, null, null, 0, 0));
		if(i == -1)
			return null;
		return list.get(i);
	}
	
}










