package naive;
//

//import java.util.*;
//
//class Naive {
//	// static char
//	static char outlook[]={'S','S','O','R','R','R','O','S','S','R','S','O','O','R'};
//	static char temperature[] = { 'H', 'H', 'H', 'M', 'C', 'C', 'C', 'M', 'C', 'M', 'M', 'M', 'H', 'M' };
//	static char humidity[] = { 'P', 'P', 'P', 'P', 'N', 'N', 'N', 'P', 'N', 'N', 'N', 'P', 'N', 'P' };
//	static char windy[] = { 'F', 'T', 'F', 'F', 'F', 'T', 'T', 'F', 'F', 'F', 'T', 'T', 'F', 'T' };
//	static char class1[] = { 'N', 'N', 'P', 'P', 'P', 'N', 'P', 'N', 'P', 'P', 'P', 'P', 'P', 'N' };
//	static double[][] iris_data = { { 5.1, 3.5, 1.4, 0.2, 1 }, { 4.9, 3.0, 1.4, 0.2, 1 }, { 4.7, 3.2, 1.3, 0.2, 1 },
//			{ 4.6, 3.1, 1.5, 0.2, 1 }, { 5.0, 3.6, 1.4, 0.2, 1 }, { 5.4, 3.9, 1.7, 0.4, 1 }, { 4.6, 3.4, 1.4, 0.3, 1 },
//			{ 5.0, 3.4, 1.5, 0.2, 1 }, { 4.4, 2.9, 1.4, 0.2, 1 }, { 4.9, 3.1, 1.5, 0.1, 1 },
//
//			{ 7.0, 3.2, 4.7, 1.4, 2 }, { 6.9, 3.1, 4.9, 1.5, 2 }, { 5.5, 2.3, 4.0, 1.3, 2 }, { 6.4, 3.2, 4.5, 1.5, 2 },
//			{ 6.5, 2.8, 4.6, 1.5, 2 }, { 5.7, 2.8, 4.5, 1.3, 2 }, { 6.3, 3.3, 4.7, 1.6, 2 }, { 4.9, 2.4, 3.3, 1.0, 2 },
//			{ 6.6, 2.9, 4.6, 1.3, 2 }, { 5.2, 2.7, 3.9, 1.4, 2 },
//
//			{ 6.3, 3.3, 6.0, 2.5, 3 }, { 5.8, 2.7, 5.1, 1.9, 3 }, { 7.1, 3.0, 5.9, 2.1, 3 }, { 6.3, 2.9, 5.6, 1.8, 3 },
//			{ 6.5, 3.0, 5.8, 2.2, 3 }, { 7.6, 3.0, 6.6, 2.1, 3 }, { 4.9, 2.5, 4.5, 1.7, 3 }, { 7.3, 2.9, 6.3, 1.8, 3 },
//			{ 6.7, 2.5, 5.8, 1.8, 3 }, { 7.2, 3.6, 6.1, 2.5, 3 }, };
//
//	static double prob[][] = new double[4][3];
//
//	static double pp = 9.0 / 14.0;
//	static double npp = 5.0 / 14.0;
//
//	// static double isepp=1.0/3.0;
//	// static double ivenpp=1.0/3.0;
//	// static double ivipp=1.0/3.0;
//
//	static int flag = 0;
//	static int flag1 = 0;
//
//	static double play_N = 1;
//	static double notplay_N = 1;
//
//	static double Sepal_length_mean[]= {0,0,0};
//	static double Sepal_width_mean[] = {0,0,0};
//	static double Petal_length_mean[]= {0,0,0};
//	static double Petal_width_mean[]= {0,0,0};
//	static double Sepal_length_variance[]= {0,0,0};
//	static double Sepal_width_variance[]= {0,0,0};
//	static double Petal_length_variance[]= {0,0,0};
//	static double Petal_width_variance[]= {0,0,0};
//
//
//	public static void main(String args[]) {
//		Scanner scr = new Scanner(System.in);
//		System.out.println("Table\n");
//		System.out.println("Outlook\t   Temperature\t    Humidity\t      Windy     \tClass");
//		
//		int j = 0;
//		
//		for (int i = 0; i < 30; ++i) {
//			System.out.print(iris_data[i][0] + "\t\t" + iris_data[i][1] + "\t\t" + iris_data[i][2] + "\t\t" + iris_data[i][3]
//					+ "\t\t" + iris_data[i][4]);
//			System.out.println();
//			
//			j = i/10;
//			Sepal_length_mean[j] += iris_data[i][0]/10.0;
//			Sepal_width_mean[j] += iris_data[i][1]/10.0;
//			Petal_length_mean[j] += iris_data[i][2]/10.0;
//			Petal_width_mean[j] += iris_data[i][3]/10.0;
//		}
//		get_variance();
//
//		for(int i = 0; i<3;++i){
//		System.out.println(Sepal_length_mean[i] +" "+ Sepal_width_mean[i] +" "+ Petal_length_mean[i]+" "+ Petal_width_mean[i]+"\n");
//		System.out.println(Sepal_length_variance[i] +" "+ Sepal_width_variance[i] +" "+ Petal_length_variance[i]+" "+ Petal_width_variance[i]+"\n");
//		}
//		
//		 double Sepal_length_input = Double.parseDouble(Knn.text1.getText());
//	      double Sepal_width_input = Double.parseDouble(Knn.text2.getText());
//	      double Petal_length_input = Double.parseDouble(Knn.text3.getText());
//	      double Petal_width_input = Double.parseDouble(Knn.text4.getText());
//
//		if (prob_of_play > prob_of_noplay)
//			System.out.println("\nThe new tuple classified under \"PLAY\" category.Hence there will be play!!!");
//		else
//			System.out.println("\nThe new tuple classified under \"NO PLAY\" category.Hence there will be NO play.");
//
//	}
//
//	private static void get_variance() {
//		int j = 0;
//		for(int i=0;i<30;++i)
//		{
//			j = i/10;
//			Sepal_length_variance[j] += iris_data[i][0]*iris_data[i][0];
//			Sepal_width_variance[j] += iris_data[i][1]*iris_data[i][1];
//			Petal_length_variance[j] += iris_data[i][2]*iris_data[i][2];
//			Petal_width_variance[j] += iris_data[i][3]*iris_data[i][3];
//
//		}
//		for(j = 0; j<3; ++j){
//		Sepal_length_variance[j] = Math.sqrt(Sepal_length_variance[j]/10.0 - Sepal_length_mean[j]*Sepal_length_mean[j]);
//		Sepal_width_variance[j] = Math.sqrt(Sepal_width_variance[j]/10.0 - Sepal_width_mean[j]*Sepal_width_mean[j]);
//		Petal_length_variance[j] = Math.sqrt(Petal_length_variance[j]/10.0 - Petal_length_mean[j]*Petal_length_mean[j]);
//		Petal_width_variance[j] = Math.sqrt(Petal_width_variance[j]/10.0 - Petal_width_mean[j]*Petal_width_mean[j]);
//		}
//	}
//}
//

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Naive implements ActionListener {
	
	//GUI
	public static JLabel label1 = new JLabel("Enter Sepal length", SwingConstants.CENTER);
	public static JLabel label2 = new JLabel("Enter Sepal width", SwingConstants.CENTER);
	public static JLabel label3 = new JLabel("Enter Petal length", SwingConstants.CENTER);
	public static JLabel label4 = new JLabel("Enter Petal width", SwingConstants.CENTER);
	public static JLabel result = new JLabel("", SwingConstants.CENTER);
	public static JTextField text1 = new JTextField();
	public static JTextField text2 = new JTextField();
	public static JTextField text3 = new JTextField();
	public static JTextField text4 = new JTextField();
	ImageIcon Image = new ImageIcon("");
	public static JButton submit = new JButton("Submit");
	
	//Training data
	double[][] iris_data = { { 5.1, 3.5, 1.4, 0.2, 1 }, { 4.9, 3.0, 1.4, 0.2, 1 }, { 4.7, 3.2, 1.3, 0.2, 1 },
			{ 4.6, 3.1, 1.5, 0.2, 1 }, { 5.0, 3.6, 1.4, 0.2, 1 }, { 5.4, 3.9, 1.7, 0.4, 1 }, { 4.6, 3.4, 1.4, 0.3, 1 },
			{ 5.0, 3.4, 1.5, 0.2, 1 }, { 4.4, 2.9, 1.4, 0.2, 1 }, { 4.9, 3.1, 1.5, 0.1, 1 },

			{ 7.0, 3.2, 4.7, 1.4, 2 }, { 6.9, 3.1, 4.9, 1.5, 2 }, { 5.5, 2.3, 4.0, 1.3, 2 }, { 6.4, 3.2, 4.5, 1.5, 2 },
			{ 6.5, 2.8, 4.6, 1.5, 2 }, { 5.7, 2.8, 4.5, 1.3, 2 }, { 6.3, 3.3, 4.7, 1.6, 2 }, { 4.9, 2.4, 3.3, 1.0, 2 },
			{ 6.6, 2.9, 4.6, 1.3, 2 }, { 5.2, 2.7, 3.9, 1.4, 2 },

			{ 6.3, 3.3, 6.0, 2.5, 3 }, { 5.8, 2.7, 5.1, 1.9, 3 }, { 7.1, 3.0, 5.9, 2.1, 3 }, { 6.3, 2.9, 5.6, 1.8, 3 },
			{ 6.5, 3.0, 5.8, 2.2, 3 }, { 7.6, 3.0, 6.6, 2.1, 3 }, { 4.9, 2.5, 4.5, 1.7, 3 }, { 7.3, 2.9, 6.3, 1.8, 3 },
			{ 6.7, 2.5, 5.8, 1.8, 3 }, { 7.2, 3.6, 6.1, 2.5, 3 }, };
	/*
	 * double Sepal_length_input; double Sepal_width_input; double
	 * Petal_length_input; double Petal_width_input;
	 */
	double Sepal_length_mean[] = { 0, 0, 0 };
	double Sepal_width_mean[] = { 0, 0, 0 };
	double Petal_length_mean[] = { 0, 0, 0 };
	double Petal_width_mean[] = { 0, 0, 0 };
	double Sepal_length_variance[] = { 0, 0, 0 };
	double Sepal_width_variance[] = { 0, 0, 0 };
	double Petal_length_variance[] = { 0, 0, 0 };
	double Petal_width_variance[] = { 0, 0, 0 };

	double isepp = 1.0 / 3.0;
	double ivepp = 1.0 / 3.0;
	double ivipp = 1.0 / 3.0;

	double ise_posterior = 0.0;
	double ive_posterior = 0.0;
	double ivi_posterior = 0.0;

	double ise_posterior_num = 0.0;
	double ive_posterior_num = 0.0;
	double ivi_posterior_num = 0.0;

	double Sepal_length_input = 0.0;
	double Sepal_width_input = 0.0;
	double Petal_length_input = 0.0;
	double Petal_width_input = 0.0;

	public static void main(String[] args) {
		// GUI
		Dimension dim = new Dimension(500, 300);

		JFrame jFrame = new JFrame("IRIS FLOWER");
		Container c = jFrame.getContentPane();

		c.setLayout(new GridLayout(7, 2));
		c.add(label1);
		c.add(text1);
		c.add(label2);
		c.add(text2);
		c.add(label3);
		c.add(text3);
		c.add(label4);
		c.add(text4);
		c.add(submit);
		c.add(result);
		result.setEnabled(false);
		submit.addActionListener(new Naive());

		jFrame.setLocation(200, 200);
		jFrame.setPreferredSize(dim);
		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {

		//Calculate the data by Naive Bayes
		for (int i = 0; i < 3; i++) {
			Sepal_length_mean[i] = 0;
			Sepal_width_mean[i] = 0;
			Petal_length_mean[i] = 0;
			Petal_width_mean[i] = 0;
			Sepal_length_variance[i] = 0;
			Sepal_width_variance[i] = 0;
			Petal_length_variance[i] = 0;
			Petal_width_variance[i] = 0;
		}

		isepp = 1.0 / 3.0;
		ivepp = 1.0 / 3.0;
		ivipp = 1.0 / 3.0;

		ise_posterior = 0.0;
		ive_posterior = 0.0;
		ivi_posterior = 0.0;

		ise_posterior_num = 0.0;
		ive_posterior_num = 0.0;
		ivi_posterior_num = 0.0;

		Sepal_length_input = 0.0;
		Sepal_width_input = 0.0;
		Petal_length_input = 0.0;
		Petal_width_input = 0.0;

		int j = 0;
		
		for (int i = 0; i < 30; ++i) {
			// System.out.print(iris_data[i][0] + "\t\t" + iris_data[i][1] +
			// "\t\t" + iris_data[i][2] + "\t\t" + iris_data[i][3]
			// + "\t\t" + iris_data[i][4]);
			// System.out.println();

			j = i / 10;
			Sepal_length_mean[j] += iris_data[i][0] / 10.0;
			Sepal_width_mean[j] += iris_data[i][1] / 10.0;
			Petal_length_mean[j] += iris_data[i][2] / 10.0;
			Petal_width_mean[j] += iris_data[i][3] / 10.0;
		}
		get_variance();

		// for(int i = 0; i<3;++i){
		// System.out.println("mean "+Sepal_length_mean[i] +" "+
		// Sepal_width_mean[i] +" "+ Petal_length_mean[i]+" "+
		// Petal_width_mean[i]+"\n");
		// System.out.println("variance "+Sepal_length_variance[i] +" "+
		// Sepal_width_variance[i] +" "+ Petal_length_variance[i]+" "+
		// Petal_width_variance[i]+"\n");
		// }

		//read the input
		Sepal_length_input = Double.parseDouble(Naive.text1.getText());
		Sepal_width_input = Double.parseDouble(Naive.text2.getText());
		Petal_length_input = Double.parseDouble(Naive.text3.getText());
		Petal_width_input = Double.parseDouble(Naive.text4.getText());

		cal_ise();
		cal_ive();
		cal_ivi();

		//get the percentage for each type with the input data
		ise_posterior = ise_posterior_num / (ise_posterior_num + ive_posterior_num + ivi_posterior_num);
		ive_posterior = ive_posterior_num / (ise_posterior_num + ive_posterior_num + ivi_posterior_num);
		ivi_posterior = ivi_posterior_num / (ise_posterior_num + ive_posterior_num + ivi_posterior_num);

		
		//compare and get the final result
		int result = 0;
		if (ise_posterior > ive_posterior && ise_posterior > ivi_posterior) {
			result = 1;
		} else if (ive_posterior > ise_posterior && ive_posterior > ivi_posterior) {
			result = 2;
		} else if (ivi_posterior > ise_posterior && ivi_posterior > ive_posterior) {
			result = 3;
		}

		System.out.println("i= " + result + " " + ise_posterior + " " + ive_posterior + " " + ivi_posterior + "\n");

		switch (result) {
		case 1:
			Naive.result.setText("It is Iris-setosa");
			break;
		case 2:
			Naive.result.setText("It is Iris-versicolor");
			break;
		case 3:
			Naive.result.setText("It is Iris-virginica");
			break;
		default:
			System.out.println("Error!");
		}
	}

	private void cal_ise() {

		double a = 1.0 / (2.0 * Math.PI * Sepal_length_variance[0])
				* Math.exp(-(Sepal_length_input - Sepal_length_mean[0]) * (Sepal_length_input - Sepal_length_mean[0])
						/ (2.0 * Sepal_length_variance[0]));
		double b = 1.0 / (2.0 * Math.PI * Sepal_width_variance[0]) * Math.exp(-(Sepal_width_input - Sepal_width_mean[0])
				* (Sepal_width_input - Sepal_width_mean[0]) / (2.0 * Sepal_width_variance[0]));
		double c = 1.0 / (2.0 * Math.PI * Petal_length_variance[0])
				* Math.exp(-(Petal_length_input - Petal_length_mean[0]) * (Petal_length_input - Petal_length_mean[0])
						/ (2.0 * Petal_length_variance[0]));
		double d = 1.0 / (2.0 * Math.PI * Petal_width_variance[0]) * Math.exp(-(Petal_width_input - Petal_width_mean[0])
				* (Petal_width_input - Petal_width_mean[0]) / (2.0 * Petal_width_variance[0]));

		ise_posterior_num = isepp * a * b * c * d;

		// //test
		// double a1 =
		// 1.0/Math.sqrt((2.0*Math.PI*3.5033e-02))*Math.exp(-(6-5.855)*(6-5.855)/(2.0*3.5033e-02));
		//
		// double b1 = 1.0/Math.sqrt(2.0*Math.PI*0.035033);
		// double b2 = (-(6-5.855)*(6-5.855))/(2*0.035033);
		// double b3 = Math.exp(b2);
		//
		// System.out.println("abcd= "+a1+" "+b+" "+c+" "+d+"
		// "+"ise_posterior_num = "+ise_posterior_num +" \n");
	}

	private void cal_ive() {
		double a = 1.0 / (2.0 * Math.PI * Sepal_length_variance[1])
				* Math.exp(-(Sepal_length_input - Sepal_length_mean[1]) * (Sepal_length_input - Sepal_length_mean[1])
						/ (2.0 * Sepal_length_variance[1]));
		double b = 1.0 / (2.0 * Math.PI * Sepal_width_variance[1]) * Math.exp(-(Sepal_width_input - Sepal_width_mean[1])
				* (Sepal_width_input - Sepal_width_mean[1]) / (2.0 * Sepal_width_variance[1]));
		double c = 1.0 / (2.0 * Math.PI * Petal_length_variance[1])
				* Math.exp(-(Petal_length_input - Petal_length_mean[1]) * (Petal_length_input - Petal_length_mean[1])
						/ (2.0 * Petal_length_variance[1]));
		double d = 1.0 / (2.0 * Math.PI * Petal_width_variance[1]) * Math.exp(-(Petal_width_input - Petal_width_mean[1])
				* (Petal_width_input - Petal_width_mean[1]) / (2.0 * Petal_width_variance[1]));

		ive_posterior_num = ivepp * a * b * c * d;

	}

	private void cal_ivi() {
		double a = 1.0 / (2.0 * Math.PI * Sepal_length_variance[2])
				* Math.exp(-(Sepal_length_input - Sepal_length_mean[2]) * (Sepal_length_input - Sepal_length_mean[2])
						/ (2.0 * Sepal_length_variance[2]));
		double b = 1.0 / (2.0 * Math.PI * Sepal_width_variance[2]) * Math.exp(-(Sepal_width_input - Sepal_width_mean[2])
				* (Sepal_width_input - Sepal_width_mean[2]) / (2.0 * Sepal_width_variance[2]));
		double c = 1.0 / (2.0 * Math.PI * Petal_length_variance[2])
				* Math.exp(-(Petal_length_input - Petal_length_mean[2]) * (Petal_length_input - Petal_length_mean[2])
						/ (2.0 * Petal_length_variance[2]));
		double d = 1.0 / (2.0 * Math.PI * Petal_width_variance[2]) * Math.exp(-(Petal_width_input - Petal_width_mean[2])
				* (Petal_width_input - Petal_width_mean[2]) / (2.0 * Petal_width_variance[2]));

		ivi_posterior_num = ivipp * a * b * c * d;

	}

	private void get_variance() {
		int j = 0;
		for (int i = 0; i < 30; ++i) {
			j = i / 10;
			Sepal_length_variance[j] += iris_data[i][0] * iris_data[i][0];
			Sepal_width_variance[j] += iris_data[i][1] * iris_data[i][1];
			Petal_length_variance[j] += iris_data[i][2] * iris_data[i][2];
			Petal_width_variance[j] += iris_data[i][3] * iris_data[i][3];

		}
		for (j = 0; j < 3; ++j) {
			Sepal_length_variance[j] = Sepal_length_variance[j] / 10.0 - Sepal_length_mean[j] * Sepal_length_mean[j];
			Sepal_width_variance[j] = Sepal_width_variance[j] / 10.0 - Sepal_width_mean[j] * Sepal_width_mean[j];
			Petal_length_variance[j] = Petal_length_variance[j] / 10.0 - Petal_length_mean[j] * Petal_length_mean[j];
			Petal_width_variance[j] = Petal_width_variance[j] / 10.0 - Petal_width_mean[j] * Petal_width_mean[j];
		}
	}
}