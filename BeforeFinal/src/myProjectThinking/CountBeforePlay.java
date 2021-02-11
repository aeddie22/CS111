package myProjectThinking;

import java.awt.event.ActionEvent;

public class CountBeforePlay implements ActionListener {

	private int count;
	
	public CountBeforePlay(){
		count = 1;
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Count : "+count);
		count++;
		
	}

}
