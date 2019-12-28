package gui.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
class StatusBar extends JPanel implements ActionListener{
	private static StatusBar instance = null;
	public static StatusBar getInstance() {
		if(instance==null) instance = new StatusBar();
		return instance;
	}
	private JLabel date = new JLabel();
	SimpleDateFormat dateFormat = new SimpleDateFormat( "E  HH:mm:ss  dd.MM.yyyy.  " );
	private StatusBar() 
	{
		JLabel name = new JLabel("  Studentska Služba");
		BoxLayout box = new BoxLayout(this, BoxLayout.X_AXIS);
		this.setLayout(box);
		this.add(name,BorderLayout.WEST);
		this.add(Box.createGlue());
	    date = new JLabel(dateFormat.format(new GregorianCalendar().getTime()));
	    this.add(date, BorderLayout.EAST);
	    Timer timer = new Timer(1000, this);
	    timer.start();
	    this.add(date);
	    this.setBackground(Color.LIGHT_GRAY);
	    this.setSize(100, 100);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		date.setText(dateFormat.format(new GregorianCalendar().getTime()));
	}
}
