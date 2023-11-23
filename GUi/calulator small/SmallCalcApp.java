import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class SmallCalcApp implements ActionListener
{
	JFrame frame;
	JLabel firstOperand,secondOperand,answer;
	JTextField op1,op2,ans;
	JButton plus,mul;
	

	public void initGUI()
	{
		frame=new JFrame();
		firstOperand=new JLabel("FIRST OPERAND");
		secondOperand=new JLabel("SECOND OPERAND");
		answer=new JLabel("ANSWER");
		op1=new JTextField(10);
		op2=new JTextField(10);
		ans=new JTextField(10);
		plus=new JButton("+");
		mul=new JButton("*");
		

		Container c=frame.getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(firstOperand);
		c.add(op1);		
		c.add(secondOperand);
		c.add(op2);
		c.add(plus);
		c.add(mul);
		c.add(answer);
		c.add(ans);
		
		plus.addActionListener(this);
		mul.addActionListener(this);
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		frame.setVisible(true);
		
			
	}	



	public SmallCalcApp()
	{
		initGUI();
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String oper,result;
		int num1,num2,num3;
		
		if(ae.getSource()==plus)
		{
		oper=op1.getText();
		num1=Integer.parseInt(oper);
		

		oper=op2.getText();
		num2=Integer.parseInt(oper);

		num3=num1+num2;

		result=num3+"";

		ans.setText(result);
		}

		else if(ae.getSource()==mul)
		{
		oper=op1.getText();
		num1=Integer.parseInt(oper);
		

		oper=op2.getText();
		num2=Integer.parseInt(oper);

		num3=num1*num2;

		result=num3+"";
		ans.setText(result);
		}
	}

	
	public static void main(String args[])
	
	{
		SmallCalcApp o=new SmallCalcApp();
	}
}

		