package mysmallsearchengine;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class My_Currency_Converter extends javax.swing.JFrame {

    String[] currencyUnits = {
        "Units",
        "Brunei Dollar",
        "Cambodia Riel",
        "Indonesia Rupiah",
        "Laos Kip",
        "Malaysia Ringgit",
        "Myammar Kyat",
        "Philipine Peso",
        "Singapore Dollar",
        "Thai Baht",
        "Vietnam Dong",
        "US Dollar"
    };

    double usd = 1.31386;
    double bnd = 1.78732;
    double khr = 5317.82;
    double lak = 11623.51;
    double idr = 18442.42;
    double myr = 5.46598;
    double mmk = 1973.64;
    double php = 66.7717;
    double sgd = 1.78732;
    double thb = 39.8857;
    double vnd = 30507.91;

    /**
     * Creates new form My_Currency_Converter
     */
    public My_Currency_Converter() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        country1 = new javax.swing.JComboBox<>();
        country2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        currencyunits2 = new javax.swing.JLabel();
        currencyunits1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Currency Converter");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Convert");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("To");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Amount");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        country1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        country1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Choose One...", "Brunei Dollar(BND)", "Cambodia Riel(KHR)", "Indonesia Rupiah(IDR)", "Laos Kip(LAK)", "Malaysia Ringgit(MYR)", "Myammar Kyat(MMK)", "Philippine Peso(PHP)", "Singapore Dollar(SGD)", "Thai Baht(THB)", "Vietnam Dong(VND)", "Timor-Leste(USD)"}));
        country1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                country1ItemStateChanged(evt);
            }
        });
        country1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                country1ActionPerformed(evt);
            }
        });

        country2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        country2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Choose One...", "Brunei Dollar(BND)", "Cambodia Riel(KHR)", "Indonesia Rupiah(IDR)", "Laos Kip(LAK)", "Malaysia Ringgit(MYR)", "Myammar Kyat(MMK)", "Philippine Peso(PHP)", "Singapore Dollar(SGD)", "Thai Baht(THB)", "Vietnam Dong(VND)", "Timor-Leste(USD)"}));
        country2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                country2ItemStateChanged(evt);
            }
        });
        country2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                country2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Amount after Convert");

        t2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        t1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        currencyunits2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        currencyunits2.setText("units");

        currencyunits1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        currencyunits1.setText("units");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(209, 209, 209)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addGap(72, 72, 72))))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(52, 52, 52)
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(country1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(t1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                                                                                .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING))
                                                                        .addComponent(country2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(currencyunits1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                                                        .addComponent(currencyunits2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(237, 237, 237)
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(164, 164, 164)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(108, 108, 108)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(159, 159, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(country1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(31, 31, 31)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(country2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(currencyunits2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(currencyunits1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(204, 204, 204)))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void country1ItemStateChanged(java.awt.event.ItemEvent evt) {
        int position = country1.getSelectedIndex();

        currencyunits1.setText(currencyUnits[position]);
    }

    private void country2ItemStateChanged(java.awt.event.ItemEvent evt) {
        int position = country2.getSelectedIndex();

        currencyunits2.setText(currencyUnits[position]);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (country1.getSelectedIndex() == 0 || country2.getSelectedIndex() == 0 || t1.getText().equals("")) {
            JOptionPane.showMessageDialog(null,
                    "You Must Select Both Countries and Must Input The Amount.", "Error Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        double amount = Double.parseDouble(t1.getText());
        double amountingbp = 0.0;

        switch (country1.getSelectedItem().toString()) {
            case "Brunei Dollar(BND)":
                amountingbp = amount / bnd;
                break;
            case "Cambodia Riel(KHR)":
                amountingbp = amount / khr;
                break;
            case "Indonesia Rupiah(IDR)":
                amountingbp = amount / idr;
                break;
            case "Laos Kip(LAK)":
                amountingbp = amount / lak;
                break;
            case "Malaysia Ringgit(MYR)":
                amountingbp = amount / myr;
                break;
            case "Myammar Kyat(MMK)":
                amountingbp = amount / mmk;
                break;
            case "Philippine Peso(PHP)":
                amountingbp = amount / php;
                break;
            case "Singapore Dollar(SGD))":
                amountingbp = amount / sgd;
                break;
            case "Thai Baht(THB)":
                amountingbp = amount / thb;
                break;
            case "Vietnam Dong(VND)":
                amountingbp = amount / vnd;
                break;
            case "Timor-Leste(USD)":
                amountingbp = amount / usd;
                break;
        }

        double amountconverted = 0.0;
        switch (country2.getSelectedItem().toString()) {
            case "Brunei Dollar(BND)":
                amountconverted = amountingbp * bnd;
                break;
            case "Cambodia Riel(KHR)":
                amountconverted = amountingbp * khr;
                break;
            case "Indonesia Rupiah(IDR)":
                amountconverted = amountingbp * idr;
                break;
            case "Laos Kip(LAK)":
                amountconverted = amountingbp * lak;
                break;
            case "Malaysia Ringgit(MYR)":
                amountconverted = amountingbp * myr;
                break;
            case "Myammar Kyat(MMK)":
                amountconverted = amountingbp * mmk;
                break;
            case "Philippine Peso(PHP)":
                amountconverted = amountingbp * php;
                break;
            case "Singapore Dollar(SGD)":
                amountconverted = amountingbp * sgd;
                break;
            case "Thai Baht(THB)":
                amountconverted = amountingbp * thb;
                break;
            case "Vietnam Dong(VND)":
                amountconverted = amountingbp * vnd;
                break;
            case "Timor-Leste(USD)":
                amountconverted = amountingbp * usd;
                break;
        }

        String value = String.format("%.2f", amountconverted);

        t2.setText(value);
    }

    private void country1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void country2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        country1.setSelectedIndex(0);
        country2.setSelectedIndex(0);
        t1.setText(null);
        t2.setText(null);
    }


    private javax.swing.JComboBox<String> country1;
    private javax.swing.JComboBox<String> country2;
    private javax.swing.JLabel currencyunits1;
    private javax.swing.JLabel currencyunits2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;

}
