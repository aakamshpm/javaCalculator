import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class Calculator implements ActionListener {
	
		
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevButton;
	JButton eightButton;
	JButton nineButton;
	JButton oneButton;
	JButton fourButton;
	JButton twoButton,zeroButton,clrButton;
	JButton threeButton,fiveButton,dotButton,equalButton,mulButton,divButton,plusButton,minusButton,sixButton;
	double num1,num2;
	Boolean isOperatorClicked=false;
	char operator;
	double result;
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(1200,150);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		displayLabel=new JLabel();
		jf.add(displayLabel);
		displayLabel.setBounds(30, 50, 540, 70);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setBorder(BorderFactory.createLineBorder(Color.black, 1));;
		
		sevButton=new JButton("7");
		jf.add(sevButton);
		sevButton.setBounds(30, 150, 80, 80);
		sevButton.addActionListener(this);		
		
		eightButton=new JButton("8");
		jf.add(eightButton);
		eightButton.setBounds(130, 150, 80, 80);
		eightButton.addActionListener(this);	
		
		nineButton=new JButton("9");
		jf.add(nineButton);
		nineButton.setBounds(230, 150, 80, 80);
		nineButton.addActionListener(this);	
		
		fourButton=new JButton("4");
		jf.add(fourButton);
		fourButton.setBounds(30, 250, 80, 80);
		fourButton.addActionListener(this);	
		
		fiveButton=new JButton("5");
		jf.add(fiveButton);
		fiveButton.setBounds(130, 250, 80, 80);
		fiveButton.addActionListener(this);	
		
		sixButton=new JButton("6");
		jf.add(sixButton);
		sixButton.setBounds(230, 250, 80, 80);
		sixButton.addActionListener(this);	
		
		oneButton=new JButton("1");
		jf.add(oneButton);
		oneButton.setBounds(30, 350, 80, 80);
		oneButton.addActionListener(this);	
		
		twoButton=new JButton("2");
		jf.add(twoButton);
		twoButton.setBounds(130, 350, 80, 80);
		twoButton.addActionListener(this);	
		
		 threeButton=new JButton("3");
		jf.add(threeButton);
		threeButton.setBounds(230, 350, 80, 80);
		threeButton.addActionListener(this);	
		
		 dotButton=new JButton(".");
		jf.add(dotButton);
		dotButton.setBounds(30, 450, 80, 80);
		dotButton.addActionListener(this);	
		
		zeroButton=new JButton("0");
		jf.add(zeroButton);
		zeroButton.setBounds(130, 450, 80, 80);
		zeroButton.addActionListener(this);	
		
		
		 equalButton=new JButton("=");
		jf.add(equalButton);
		equalButton.setBounds(230, 450, 80, 80);
		equalButton.addActionListener(this);	
		
		 divButton=new JButton("/");
		jf.add(divButton);
		divButton.setBounds(330, 150, 80, 80);
		divButton.addActionListener(this);	
		
		 mulButton=new JButton("x");
		jf.add(mulButton);
		mulButton.setBounds(330, 250, 80, 80);
		mulButton.addActionListener(this);	
		
		 minusButton=new JButton("-");
		jf.add(minusButton);
		minusButton.setBounds(330, 350, 80, 80);
		minusButton.addActionListener(this);	
		
		
		plusButton=new JButton("+");
		jf.add(plusButton);
		plusButton.setBounds(330, 450, 80, 80);
		plusButton.addActionListener(this);	
		
		clrButton=new JButton("Clear");
		jf.add(clrButton);
		clrButton.setBounds(430, 450, 80, 80);
		clrButton.addActionListener(this);	
		
		
		
	}
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevButton){
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}
			else{
			displayLabel.setText(displayLabel.getText()+"7");
			}
		}
		else if(e.getSource()==eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"8");
			}
	}
		else if(e.getSource()==nineButton) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"9");			
			}
		}
		else if(e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"0");			
			}		
		}
		else if(e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"4");			
			}	
		}
		else if(e.getSource()==fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"5");			
			}		
		}
		else if(e.getSource()==sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"6");			
			}	
		}
		else if(e.getSource()==twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"2");			
			}		
		}
		else if(e.getSource()==oneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"1");			
			}
		}
		else if(e.getSource()==threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"3");			
			}		
		}
		else if(e.getSource()==dotButton) {
			displayLabel.setText(displayLabel.getText()+".");		
		}
		else if(e.getSource()==plusButton) {
			isOperatorClicked=true;
			num1=Double.parseDouble(displayLabel.getText());
			operator='+';
			
		}
		else if(e.getSource()==divButton) {
			isOperatorClicked=true;
			num1=Double.parseDouble(displayLabel.getText());
			operator='/';
			
		}
		else if(e.getSource()==mulButton) {
			isOperatorClicked=true;
			num1=Double.parseDouble(displayLabel.getText());
			operator='*';
			
		}
		else if(e.getSource()==minusButton) {
			isOperatorClicked=true;
			num1=Double.parseDouble(displayLabel.getText());
			operator='-';
			
		}
		else if(e.getSource()==clrButton) {
			displayLabel.setText("");
		}
		
		else if(e.getSource()==equalButton) {
			num2=Double.parseDouble(displayLabel.getText());
			switch(operator) {
			case '+':
				result=num1+num2;
				break;
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '/':
				result=num1/num2;
				
				
			}
			
				
			displayLabel.setText(result+"");
			num1=result;
			
		}
		
		
		
		
		
	}
}
	
