package agenda;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelPrincipal extends JPanel
{
    private JTextField txtnome = new JTextField();
    private JTextField txtendereco = new JTextField();
    private JTextField txtbairro = new JTextField();
    private JTextField txtcidade = new JTextField();
    private JTextField txttelefone = new JTextField();
    private JTextField txtcep = new JTextField();
    private JTextField txtcpf = new JTextField();
   
    
    public PainelPrincipal()
    {   
            
       this.setLayout(new GridBagLayout()); 
       this.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        AddComponentes("Nome", txtnome, this);
        AddComponentes("Endere�o", txtendereco, this);
        AddComponentes("Bairro", txtbairro, this);
        AddComponentes("Cidade", txtcidade, this);
        AddComponentes("Telefone", txttelefone, this);
        AddComponentes("CEP", txtcep, this);
        AddComponentes("CPF", txtcpf, this);
       
    }
    
     private void AddComponentes(String label, JComponent componente,JPanel painel ) 
     {  
        GridBagConstraints cons = new GridBagConstraints();  
        cons.fill = GridBagConstraints.NONE;  
        cons.anchor = GridBagConstraints.NORTHWEST;  
        cons.insets = new Insets(4,4,4,4);  
  
        cons.weightx = 0;  
        cons.gridwidth = 1;  
        painel.add(new JLabel(label), cons);  
          
        cons.fill = GridBagConstraints.BOTH;  
        cons.weightx = 1;  
        cons.gridwidth = GridBagConstraints.REMAINDER;  
         painel.add(componente, cons);  
    }  
     
     
}
