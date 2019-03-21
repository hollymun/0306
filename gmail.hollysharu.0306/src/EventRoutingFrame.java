import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRoutingFrame extends Frame {
		
		//프레임 위에 배치될 컴포넌트 
		private Button btn1, btn2;
		private Panel panel;
		
		public EventRoutingFrame() {
			setTitle("액션 이벤트 라우팅");
			setSize(300,300);
			setLocation(20,20);
			
			panel = new Panel();
			
			btn1 = new Button("버튼1");
			panel.add(btn1);
			
			btn2 = new Button("종료");
			panel.add(btn2);
/*			
			ActionListener action = new ActionListener() {

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
				
			};
			//이벤트 라우팅 - 2개 객체의 이벤트를 action 하나로 처리 
			btn1.addActionListener(action);
			btn2.addActionListener(action);
*/
			
			EventHandler eventHandler = new EventHandler(btn1, btn2);
			btn1.addActionListener(eventHandler);
			btn2.addActionListener(eventHandler);
			
			
			
			add(panel);
			setVisible(true);
		}

}
