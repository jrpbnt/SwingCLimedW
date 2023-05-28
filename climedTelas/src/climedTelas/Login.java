package climedTelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtColoqueSuaSenha;
	int xx,xy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					//frame.setUndecorated(true);
					
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

	
	/**
	 * Create the frame.
	 */
	public Login() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 406);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, -12, 299, 398);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				
				int x = arg0.getXOnScreen();

		        int y = arg0.getYOnScreen();

		        Login.this.setLocation(x - xx, y - xy);  
		       
				
				
			}
		});
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				xx = e.getX();
				xy = e.getY();
			}
		});
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Images/Captura de tela_2023-05-09_17-04-41.png")));
		lblNewLabel.setBounds(-15, 12, 314, 384);
		panel.add(lblNewLabel);
		
		
		
		txtUsuario = new JTextField();
		txtUsuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsuario.getText().equals("Digite o usuario aqui")) {
					txtUsuario.setText(null);
					txtUsuario.requestFocus();
			
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsuario.getText().isEmpty()) {
					
					txtUsuario.setText("Digite o usuario aqui");
				}
			}
		});
		txtUsuario.setFont(new Font("Nimbus Roman No9 L", Font.PLAIN, 12));
		txtUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsuario.setForeground(new Color(87, 227, 137));
		txtUsuario.setBackground(Color.DARK_GRAY);
		txtUsuario.setText("Digite o usuario aqui");
		txtUsuario.setBounds(350, 109, 247, 40);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("FreeSerif", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(46, 194, 126));
		lblNewLabel_1.setBounds(351, 82, 84, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha :");
		lblNewLabel_1_1.setForeground(new Color(46, 194, 126));
		lblNewLabel_1_1.setFont(new Font("FreeSerif", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(351, 188, 84, 15);
		contentPane.add(lblNewLabel_1_1);
		
		txtColoqueSuaSenha = new JTextField();
		txtColoqueSuaSenha.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtColoqueSuaSenha.getText().equals("Digite sua senha aqui")) {
					txtColoqueSuaSenha.setText(null);
					txtColoqueSuaSenha.requestFocus();
			
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				
	if(txtColoqueSuaSenha.getText().isEmpty()) {
					
		txtColoqueSuaSenha.setText("Digite sua senha aqui");
				}
			}
		});
		txtColoqueSuaSenha.setText("Digite sua senha aqui");
		txtColoqueSuaSenha.setHorizontalAlignment(SwingConstants.LEFT);
		txtColoqueSuaSenha.setForeground(new Color(87, 227, 137));
		txtColoqueSuaSenha.setFont(new Font("Nimbus Roman No9 L", Font.PLAIN, 12));
		txtColoqueSuaSenha.setColumns(10);
		txtColoqueSuaSenha.setBackground(Color.DARK_GRAY);
		txtColoqueSuaSenha.setBounds(350, 215, 247, 40);
		contentPane.add(txtColoqueSuaSenha);
		
		Button button = new Button("Entrar");
		button.setFont(new Font("Century Schoolbook L", Font.PLAIN, 12));
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(46, 194, 126));
		button.setBounds(350, 302, 247, 56);
		contentPane.add(button);
	}
}