import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingWindow extends JFrame {
	
	JLabel lbl;
	int idx;
	String [] images = {"/Users/mac/Documents/flying1.png", "/Users/mac/Documents/flying2.png"}; 
	
	public SwingWindow() {
		//상위 클래스의 생성자 호출 
		//new JFrame("스윙 윈도우"); 와 같음 
		super("스윙 윈도우"); 
		
		//SwingWindow에 아래 내용 없지만 
		//JFrame 가져왔으므로 생성 가능 
		setSize(500, 500);
		setLocation(100, 100);
		
		//종료 버튼을 눌렀을 때 프로그램이 종료되도록 해주는 설정 
		//this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
				
		
		//패널 생성 
		JPanel p = new JPanel();
		p.setLayout(null);
		
		//이미지 만들어서 레이블에 출력 
		ImageIcon image = new ImageIcon("/Users/mac/Downloads/cry.jpg");
	
				
		lbl = new JLabel(image);
		lbl.setSize(300, 300);
		lbl.setLocation(50, 50);

		
		new Thread() {
			public void run() {
				try {
					while(true) {
						Thread.sleep(100);
						idx = idx + 1; 
						ImageIcon image = new ImageIcon(images[idx%images.length]);
						lbl.setIcon(image);
						int x = lbl.getLocation().x;
						int y = lbl.getLocation().y; 
						lbl.setLocation(x+5, y);
					}
				}
				catch(Exception e) {}
			}
		}.start();
	

		
		
		
		
		p.add(lbl);
		
		add(p);
		
		
		pack();
		//인스턴스 자신을 가리키는 포인터 
		this.setVisible(true);
	}

}
