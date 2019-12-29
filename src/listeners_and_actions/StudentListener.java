package listeners_and_actions;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;

import gui.controller.CheckValidation;
import gui.model.Student;

public class StudentListener implements FocusListener, ItemListener{
	
	private static String data[] = {"", "", "", "", "", "", "", "", "", ""};

	@Override
	public void focusGained(FocusEvent e) {}

	@Override
	public void focusLost(FocusEvent e) {
		JTextField txt = (JTextField) e.getComponent();
		
		if(txt.getName().trim().equals("tfime")) 
		{
			data[0] = (txt.getText().trim()); 
			data[0] = CheckValidation.firstLetterToCapital(data[0]);
		}
		else if(txt.getName().trim().equals("tfprez")) 
		{
			data[1] = (txt.getText().trim());	
			data[1] = CheckValidation.firstLetterToCapital(data[1]);
		}
		else if(txt.getName().trim().equals("tfdatr"))			data[2] = (txt.getText().trim());
		else if(txt.getName().trim().equals("tfadr"))
		{
			data[3] = (txt.getText().trim());
			data[3] = CheckValidation.firstLetterToCapital(data[3]);
		}
		else if(txt.getName().trim().equals("tftel"))			data[4] = (txt.getText().trim());
		else if(txt.getName().trim().equals("tfmail"))			data[5] = (txt.getText().trim());
		else if(txt.getName().trim().equals("tfindeks"))		data[6] = (txt.getText().toUpperCase().trim());
		else if(txt.getName().trim().equals("tfdatu"))			data[7] = (txt.getText().trim());
		else if(txt.getName().trim().equals("tfpros"))			data[9] = (txt.getText().trim());
	}
	
	public void setInitialData(Student s)
	{
		data[0] = s.getIme();
		data[1] = s.getPrezime();
		data[2] = s.getDatumRodjenja();
		data[3] = s.getAdresa();
		data[4] = s.getTelefon();
		data[5] = s.geteMail();
		data[6] = s.getBrIndeksa();
		data[7] = s.getDatumUpisa();
		data[8] = s.getGodStudija().name();
		Double p = s.getProsecnaOcena();
		data[9] = p.toString();
	}
	
	public static void ispis()
	{
		for(int i = 0; i < data.length; i++)	System.out.println(data[i]);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			String temp = (String) e.getItem();
			if(temp.contains("prva"))		data[8] = "I";
			else if(temp.contains("druga"))		data[8] = "II";
			else if(temp.contains("tre"))		data[8] = "III";
			else		data[8] = "IV";
	       }
	}

	public String[] getData()
	{
		return data;
	}
	
	public void clearData()
	{
		for(int i = 0; i < data.length; i++)		data[i] = "";
	}
}
