import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventWindow extends Frame {
	Label lbl, lbl2; 

	public EventWindow() {
		setTitle("AWT 이벤트 처리");
		setSize(300,300);
		setLocation(10,10);
		
		//컴포넌트를 마음대로 배치하기 위해서 레이아웃을 null로 설정 
		setLayout(null);
		lbl = new Label("<ㅁㅁㅁ]=333"); 
		lbl.setSize(120,50);
		lbl.setLocation(150, 150);
		add(lbl);

		setLayout(null);
		lbl2 = new Label("(ㅇ 0ㅇ)?!!!!");
		lbl2.setSize(80,50);
		lbl2.setLocation(50, 150);
		add(lbl2);
		
		WindowAdapter windowAdapter = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			public void windowClosed(WindowEvent e) {
				
			}
			
		};
		this.addWindowListener(windowAdapter);
		
		KeyAdapter keyAdapter = new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				int x = lbl.getX();
				int y = lbl.getY();
						
				if(key == KeyEvent.VK_UP) {
					y = y - 3; 
					lbl.setLocation(x, y);
				}
				else if(key == KeyEvent.VK_DOWN) {
					y = y + 3; 
					lbl.setLocation(x, y);
				}
				else if(key == KeyEvent.VK_LEFT) {
					x = x - 3; 
					lbl.setLocation(x, y);
				}
				else if(key == KeyEvent.VK_RIGHT) {
					x = x + 3; 
					lbl.setLocation(x, y);
				}
			}
		};
		this.addKeyListener(keyAdapter);
		
		
		MouseMotionAdapter mouseMotionAdapter = new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				lbl.setLocation(x-10, y);
				
			}
		};
		
		
/*		
		//현재 프레임에 윈도우 이벤트를 처리 : windowListener 
		//윈도우 이벤트 : 아이콘화, 종료 
		WindowListener windowListener = new WindowListener() {

			//윈도우가 출력이 됐을 때 
			@Override
			public void windowOpened(WindowEvent e) {
				
			}
			//종료 버튼을 눌렀을 때 
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			//윈도우가 사라졌을 때 
			@Override
			public void windowClosed(WindowEvent e) {
				
			}
			//아이콘화 됐을 때 
			@Override
			public void windowIconified(WindowEvent e) {
				
			}
			//윈도우가 원래대로 복원됐을 때 
			@Override
			public void windowDeiconified(WindowEvent e) {
				
			}
			//윈도우가 활성화 됐을 때 
			@Override
			public void windowActivated(WindowEvent e) {
				
			}
			//비활성화 됐을 때 
			@Override
			public void windowDeactivated(WindowEvent e) {
				
			}
			
		};
		//윈도우 이벤트를 처리해줄 리스너를 연결 
		this.addWindowListener(windowListener);
		
		//키보드 이벤트 처리를 위한 리스너 
		KeyListener keyListener = new KeyListener() {

			//문자키를 눌렀을 때 호출되는 메소드 
			@Override
			public void keyTyped(KeyEvent e) {
				//System.out.printf("문자키를 누른 경우\n");
			}
			//키보드를 눌렀을 때 호출되는 메소드
			//누른 키가 문자면 -> keyTyped가 호출됨, 아니면 호출 안 됨 
			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.printf("키를 누른 경우\n");	
				//모든 키에 대해서 반응 - 대소문자 구분 못함 
				//System.out.printf("keyCode:%d\n", e.getKeyCode());
				//반응하지 않는 키도 있음 - 대소문자 구분함 
				//System.out.printf("keyChar:%c\n", e.getKeyChar());
				
				int key = e.getKeyCode();
				int x = lbl.getX();
				int y = lbl.getY();
						
				if(key == KeyEvent.VK_UP) {
					y = y - 3; 
					lbl.setLocation(x, y);
				}
				else if(key == KeyEvent.VK_DOWN) {
					y = y + 3; 
					lbl.setLocation(x, y);
				}
				else if(key == KeyEvent.VK_LEFT) {
					x = x - 3; 
					lbl.setLocation(x, y);
				}
				else if(key == KeyEvent.VK_RIGHT) {
					x = x + 3; 
					lbl.setLocation(x, y);
				}
			}
			//키보드에서 손을 뗄 때 
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.printf("키를 누른 경우\n");
			}
			
		};
		this.addKeyListener(keyListener);
		
		//마우스를 움직일 때 처리를 위한 리스너 
		MouseMotionListener mouseListener = new MouseMotionListener() {
			//버튼을 누르고 움직일 때 호출되는 메소드 
			@Override
			public void mouseDragged(MouseEvent e) {
				//마우스의 위치를 레이블의 위치로 설정 
				int x = e.getX();
				int y = e.getY();
				lbl.setLocation(x-10, y);
				
			}

			//버튼을 누르지 않고 움직일 때 호출되는 메소드 
			@Override
			public void mouseMoved(MouseEvent e) {
				
			}

			
		};
*/
		
		
		
		
		
		setVisible(true);
	}
}
