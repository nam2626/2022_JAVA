package event;

public class EventMain {

	public static void main(String[] args) {
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		
		btn1.onClick();
		btn1.setOnClickListener(new ButtonClickEvent());
		btn1.onClick();
		btn2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				System.out.println(view.name + " 버튼클릭 이벤트 발생");
				//btn1.onClick();//같은 영역에 선언해 놓은 지역변수도 접근이 가능
			}
		});
		btn2.onClick();
		
		//btn3 클릭이벤트 람다식을 이용해서 이벤트 처리
		btn3.setOnClickListener((v)->{
			System.out.println(v.name + " 버튼 이벤트");
		});
		btn3.onClick();
	}

}









