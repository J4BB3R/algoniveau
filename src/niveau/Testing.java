package niveau;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
  
class Testing extends JFrame
{
  String colNames[] = {"CheckBox", "CkeckBox", "Checkbox"};
  Object[][] data = {};
  DefaultTableModel dtm;
  public Testing()
  {
    setLocation(400,100);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    dtm = new DefaultTableModel(data,colNames);
    JTable table = new JTable(dtm);
    JScrollPane sp = new JScrollPane(table);
    TableColumn tc = table.getColumnModel().getColumn(0);
    tc.setCellEditor(table.getDefaultEditor(Boolean.class));
    tc.setCellRenderer(table.getDefaultRenderer(Boolean.class));
    getContentPane().add(sp);
    for(int x = 0; x < 5; x++)
    {
      dtm.addRow(new Object[]{new Boolean(false),new Boolean(false),new Boolean(false)});
    }
    pack();
    setVisible(true);
  }
}