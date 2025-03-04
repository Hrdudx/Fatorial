package classes;

/**
 *
 * @author Hayyra
 */
public class telaFatorial extends javax.swing.JFrame {

    public telaFatorial() {
        initComponents();
        lblFat.setText("1"); // Valor inicial
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtN = new javax.swing.JSpinner();
        lblFat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); 
        jLabel1.setText("! =");

        txtN.setFont(new java.awt.Font("Segoe UI", 0, 36)); 
        txtN.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        txtN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtNStateChanged(evt);
            }
        });

        lblFat.setFont(new java.awt.Font("Segoe UI", 0, 36)); 
        lblFat.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblFat, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
    }

    private void txtNStateChanged(javax.swing.event.ChangeEvent evt) {                                  
        int n = Integer.parseInt(txtN.getValue().toString());
        int f = 1;
        int c = n;
        StringBuilder sb = new StringBuilder(); // Para mostrar a sequência do cálculo

        while (c >= 1) {
            if (c == 1) {
                break; // Interrompe o laço mais cedo quando chegar no 1
            }
            if (c == 0) {
                lblFat.setText("1");
                return;
            }

            f *= c;
            sb.append(c).append(" x ");
            c--;
        }

        sb.append("1 = ").append(f); // Adiciona o resultado final
        lblFat.setText(sb.toString()); // Exibe o resultado com a sequência do cálculo
    } 

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaFatorial().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFat;
    private javax.swing.JSpinner txtN;
}
