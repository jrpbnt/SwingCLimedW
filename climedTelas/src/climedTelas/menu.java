package climedTelas;

import javax.swing.JComponent;

import net.miginfocom.swing.MigLayout;

public class menu extends JComponent{
	
	private MigLayout layout;
	private String [] []menuItems=new String[][] {
		{"Email","Inbox","Read ","Compost"}
	};
	public menu() {
		
		init();
	}
	 private void init() {
		layout=new MigLayout("wrap 1,fillx,gapy 0,inset 2","fill"); 
		setLayout(layout);
		
		
		//init MenuItem
		for(int i=0;i<menuItems.length;i++) {
			addMenu(menuItems[i][0],i);
			
		}
		
	 }
	 
	 private void addMenu(String menuName,int index) {
		 int length=menuItems[index].length;
		 MenuItem item=new MenuItem(menuName,index,length>1);
		 add(item);
		 revalidate();
		 repaint();
		 
	 }
}
