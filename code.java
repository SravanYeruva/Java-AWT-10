import java.awt.*;
import java.awt.event.*;
public class ListExample
{
ListExample()
{
Frame f = new Frame("Text Feild");
final Label label = new Label();
label.setAlignment(Label.CENTER);
label.setSize(400,100);
Button b = new Button("click");
b.setBounds(200,100,50,20);
final List c = new List();
c.setBounds(100,100,75,75);
c.add("one");
c.add("two");
c.add("three");
c.add("four");
c.add("five");
f.add(c);
f.add(label);
f.add(b);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String data = "programming language selected:"+c.getItem(c.getSelectedIndex());
label.setText(data);
}
}
);
}
public static void main(String args[])
{
new ListExample();
}
}
