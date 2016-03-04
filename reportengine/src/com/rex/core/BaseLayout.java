package com.rex.core;

import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;

public class BaseLayout extends HorizontalSplitPanel{
	private static final long serialVersionUID = -2265922916170768007L;
	
	private VerticalMenu verticalMenu;
	
	public BaseLayout(){
		initRoot();
        initComponents();
	}
	
	private void initRoot(){
        setStyleName("base-layout");
        /*    set component style name    */
        setSplitPosition(150, Unit.PIXELS, false);
        /*Moves the position of the splitter with given position and unit.
        Parameters:
        pos the new size of the first region. Fractions are only allowed when unit is percentage.
        unit the unit (from Sizeable) in which the size is given.
        reverse if set to true the split splitter position is measured by the second region else it is measured by the first region
         */
    }
	
    private void initComponents(){
        verticalMenu    = new VerticalMenu();
        setFirstComponent(verticalMenu);
        setSecondComponent(new Label("[ here goes the pretty body ]"));
    }
}
