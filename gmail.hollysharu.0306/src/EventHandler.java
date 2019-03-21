import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {

	//윈도우 클래스에서 받아올 데이터를 저장할 변수 
	private Button btn1, btn2;
	
	//위 2개의 데이터를 넘겨받을 생성자 
		public EventHandler(Button btn1, Button btn2) {
		super();
		this.btn1 = btn1;
		this.btn2 = btn2;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//이벤트가 발생한 객체를 Button 타입으로 형 변환
		//안 하면 Object 타입으로 리턴함 
		Button btn = (Button)e.getSource();
		if(btn == btn1) {
			System.out.printf("버튼1을 클릭했습니다\n");
		}else if(btn == btn2) {
			System.exit(0);						
		}
		
	}
	
	


}
