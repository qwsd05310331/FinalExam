package finalterm;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class qwsd0331_06 extends JFrame implements ActionListener
{
//static JFrame myfrm=new JFrame("JButton class"); // Java Class JFrame
//static AwtTestEvent myfrm=new AwtTestEvent("JFrame 1 "); // Java Class JFrame
//static JTextField tbx1=new JTextField(2); // �إ�1��r�������
static JButton buttons[]=new JButton[10];//�إ�25��JButton
public static void main(String args[])	
{
	qwsd0331_06 myfrm=new qwsd0331_06();
String numbers[]  =new String[10];
FlowLayout flow=new FlowLayout();
GridLayout grid12= new GridLayout(1,2);
GridLayout grid33= new GridLayout(5,2);
myfrm.setLayout(grid12);
myfrm.setSize(700,700);
JPanel p1 = new JPanel(grid33); //��@  panel 1
for (int i=0;i<10;i++)
{
numbers[i]=String.valueOf(i);
}
for (int i = 0; i < numbers.length; i++)
{
buttons[i] = new JButton(numbers[i]); // create buttons
p1.add(buttons[i], grid33); // �b panel 1���[�J���s�}�C
}
myfrm.add(p1); // �b����myfrm ���[�J panel 1
JPanel p2 = new JPanel(flow); //��@  panel 2
JButton btn1=new JButton("Random"); // �إ߫��s���� btn1
btn1.addActionListener(myfrm);
//p2.add(tbx1); // �b panel 2���[�J��r���
p2.add(btn1); // �b panel 2���[�J���s
myfrm.add(p2); // �b����myfrm ���[�J panel 2

myfrm.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String stringValue;
int i,ran;
String numbers[]  = new String[10];
String j;
for (i=0;i<10;i++)
{
numbers[i]=String.valueOf(i);
}
//�W���j��O���F�bnumbers[ ] �̭���i0~24���Ʀr
for (i=0; i<=9;i++)
{
ran=(int)(Math.random()*(10-i));   // ���Ͷü�
buttons[i].setLabel(numbers[ran]);  // �ھڶüơA��numbers[ ] �̭����Ʀr ��buttons[ ] ���D����
//�H�U�}�l�����
j=numbers[ran];
numbers[ran]=numbers[10-i-1];
numbers[10-i-1]=j;
}
}
}