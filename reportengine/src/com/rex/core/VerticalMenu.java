package com.rex.core;

import java.util.ArrayList;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

public class VerticalMenu extends VerticalLayout{
	private static final long serialVersionUID = -1508291768897794634L;
	
	private ArrayList<Button> buttons;
	
	public VerticalMenu(){
		initRoot();
        initComponents();
	}
    
    private void initRoot(){
        setStyleName("vertical-menu");
    }
    private void initComponents(){
        initButtons();
    }
    
    private void initButtons(){
        buttons    = new ArrayList<>();
        
        buttons.add(new Button("First"));
        buttons.add(new Button("Second"));
        buttons.add(new Button("Third"));
        
        
        for(Button button:buttons){
            button.addClickListener((clickEvent)->{
                Notification.show("i'm "+button.getCaption()+" Button");
            });
            switch(button.getCaption()){
            case "First":{button.setIcon(FontAwesome.USER);}break;
            case "Second":{button.setIcon(FontAwesome.CLOUD);}break;
            case "Third":{button.setIcon(FontAwesome.MAGIC);}break;
            
            }
            addComponent(button);
        }
        
        
        
    }
    

}
