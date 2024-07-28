
package Figuras;

public class VentanaPrincipal extends javax.swing.JFrame {

    
    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCRadio = new javax.swing.JTextField();
        txtCArea = new javax.swing.JTextField();
        txtCPerimetro = new javax.swing.JTextField();
        btnArea = new javax.swing.JButton();
        btnPerimetro = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCuLado = new javax.swing.JTextField();
        txtCuArea = new javax.swing.JTextField();
        txtCuPerimetro = new javax.swing.JTextField();
        btnCuArea = new javax.swing.JButton();
        btnCuPerimetro = new javax.swing.JButton();
        btnCuBorrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtRAltura = new javax.swing.JTextField();
        txtRArea = new javax.swing.JTextField();
        txtRPerimetro = new javax.swing.JTextField();
        btnRArea = new javax.swing.JButton();
        btnRperimetro = new javax.swing.JButton();
        btnRBorrar = new javax.swing.JButton();
        txtRBase = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtTRBase = new javax.swing.JTextField();
        txtTRAltura = new javax.swing.JTextField();
        txtTRArea = new javax.swing.JTextField();
        txtTRPerimetro = new javax.swing.JTextField();
        txtTRHipotenusa = new javax.swing.JTextField();
        txtTRTriangulo = new javax.swing.JTextField();
        btnTRArea = new javax.swing.JButton();
        btnTRPerimetro = new javax.swing.JButton();
        btnTRHipotenusa = new javax.swing.JButton();
        btnTRTriangulo = new javax.swing.JButton();
        btnTRBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Circulo");

        jLabel2.setText("Radio");

        jLabel3.setText("Area");

        jLabel4.setText("Perimetro");

        txtCRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCRadioActionPerformed(evt);
            }
        });

        btnArea.setText("Calcular Area");
        btnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaActionPerformed(evt);
            }
        });

        btnPerimetro.setText("Calcular Perimetro");
        btnPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerimetroActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Cuadrado");

        jLabel6.setText("Lado");

        jLabel7.setText("Area");

        jLabel8.setText("Perimetro");

        txtCuArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuAreaActionPerformed(evt);
            }
        });

        txtCuPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuPerimetroActionPerformed(evt);
            }
        });

        btnCuArea.setText("Calcular Area");
        btnCuArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuAreaActionPerformed(evt);
            }
        });

        btnCuPerimetro.setText("Calcular Perimetro");
        btnCuPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuPerimetroActionPerformed(evt);
            }
        });

        btnCuBorrar.setText("Borrar");
        btnCuBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuBorrarActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Rectangulo");

        jLabel10.setText("Base");

        jLabel11.setText("Altura");

        jLabel12.setText("Area");

        jLabel13.setText("Perimetro");

        txtRArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRAreaActionPerformed(evt);
            }
        });

        txtRPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRPerimetroActionPerformed(evt);
            }
        });

        btnRArea.setText("Calcular Area");
        btnRArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRAreaActionPerformed(evt);
            }
        });

        btnRperimetro.setText("Calcular Perimetro");
        btnRperimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRperimetroActionPerformed(evt);
            }
        });

        btnRBorrar.setText("Borrar");
        btnRBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRBorrarActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Triangulo Rectangulo");

        jLabel15.setText("Base");

        jLabel16.setText("Altura");

        jLabel17.setText("Area");

        jLabel18.setText("Perimetro");

        jLabel19.setText("Hipotenusa");

        jLabel20.setText("Tipo Triangulo");

        btnTRArea.setText("Area");
        btnTRArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTRAreaActionPerformed(evt);
            }
        });

        btnTRPerimetro.setText("Perimetro");
        btnTRPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTRPerimetroActionPerformed(evt);
            }
        });

        btnTRHipotenusa.setText("Hipotenusa");
        btnTRHipotenusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTRHipotenusaActionPerformed(evt);
            }
        });

        btnTRTriangulo.setText("Tipo Triangulo");
        btnTRTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTRTrianguloActionPerformed(evt);
            }
        });

        btnTRBorrar.setText("Borrar");
        btnTRBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTRBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRperimetro)
                                .addGap(18, 18, 18)
                                .addComponent(btnRBorrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(25, 25, 25))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPerimetro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(btnBorrar)))
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRArea, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(txtRBase, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel15)
                        .addComponent(jLabel17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24))
                    .addComponent(jLabel20)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCuArea)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel14)
                        .addComponent(txtTRBase)
                        .addComponent(txtTRAltura)
                        .addComponent(txtTRArea)
                        .addComponent(txtTRPerimetro)
                        .addComponent(txtTRHipotenusa)
                        .addComponent(txtCuLado)
                        .addComponent(txtCuArea)
                        .addComponent(txtCuPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel5))
                        .addComponent(txtTRTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCuPerimetro)
                        .addGap(18, 18, 18)
                        .addComponent(btnCuBorrar)))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTRArea)
                .addGap(18, 18, 18)
                .addComponent(btnTRPerimetro)
                .addGap(18, 18, 18)
                .addComponent(btnTRHipotenusa)
                .addGap(18, 18, 18)
                .addComponent(btnTRTriangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTRBorrar)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCuLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCuArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCuPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCuArea)
                            .addComponent(btnCuPerimetro)
                            .addComponent(btnCuBorrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtTRBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTRAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(txtTRArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txtTRPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtTRHipotenusa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtTRTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnArea)
                            .addComponent(btnPerimetro)
                            .addComponent(btnBorrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtRBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRArea)
                                    .addComponent(btnRperimetro)
                                    .addComponent(btnRBorrar)))
                            .addComponent(jLabel13))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTRArea)
                    .addComponent(btnTRPerimetro)
                    .addComponent(btnTRHipotenusa)
                    .addComponent(btnTRTriangulo)
                    .addComponent(btnTRBorrar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
        // TODO add your handling code here:
        double area;
        int radio = Integer.parseInt(txtCRadio.getText());
        Circulo figura1 = new Circulo(radio);
        area = figura1.calcularArea();
        txtCArea.setText(String.valueOf(area));
    }//GEN-LAST:event_btnAreaActionPerformed

    private void txtCRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCRadioActionPerformed

    private void btnPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimetroActionPerformed
        // TODO add your handling code here:
        double perimetro;
        int radio = Integer.parseInt(txtCRadio.getText());
        Circulo figura1 = new Circulo(radio);
        perimetro = figura1.calcularPerimetro();
        txtCPerimetro.setText(String.valueOf(perimetro));
    }//GEN-LAST:event_btnPerimetroActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
         txtCRadio.setText("");
         txtCArea.setText("");
         txtCPerimetro.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCuAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuAreaActionPerformed
        // TODO add your handling code here:
        double area;
        int lado = Integer.parseInt(txtCuLado.getText());
        Cuadrado figura2 = new Cuadrado(lado);
        area = figura2.calcularArea();
        txtCuArea.setText(String.valueOf(area));
    }//GEN-LAST:event_btnCuAreaActionPerformed

    private void btnCuPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuPerimetroActionPerformed
        // TODO add your handling code here:
        double perimetro;
        int lado = Integer.parseInt(txtCuLado.getText());
        Cuadrado figura2 = new Cuadrado(lado);
        perimetro = figura2.calcularPerimetro();
        txtCuPerimetro.setText(String.valueOf(perimetro));
    }//GEN-LAST:event_btnCuPerimetroActionPerformed

    private void txtCuAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuAreaActionPerformed

    private void txtCuPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuPerimetroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuPerimetroActionPerformed

    private void btnCuBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuBorrarActionPerformed
        // TODO add your handling code here:
        txtCuLado.setText("");
        txtCuArea.setText("");
        txtCuPerimetro.setText("");
    }//GEN-LAST:event_btnCuBorrarActionPerformed

    private void txtRAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRAreaActionPerformed

    private void txtRPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRPerimetroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRPerimetroActionPerformed

    private void btnRAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRAreaActionPerformed
        double area;
        int base = Integer.parseInt(txtRBase.getText());
        int altura = Integer.parseInt(txtRAltura.getText());
        Rectangulo figura3 = new Rectangulo(base,altura);
        area = figura3.calcularArea();
        txtRArea.setText(String.valueOf(area));
    }//GEN-LAST:event_btnRAreaActionPerformed

    private void btnRperimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRperimetroActionPerformed
        double perimetro;
        int base = Integer.parseInt(txtRBase.getText());
        int altura = Integer.parseInt(txtRAltura.getText());
        Rectangulo figura3 = new Rectangulo(base,altura);
        perimetro = figura3.calcularPerimetro();
        txtRPerimetro.setText(String.valueOf(perimetro));
    }//GEN-LAST:event_btnRperimetroActionPerformed

    private void btnRBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRBorrarActionPerformed
        txtRBase.setText("");
        txtRAltura.setText("");
        txtRArea.setText("");
        txtRPerimetro.setText("");
    }//GEN-LAST:event_btnRBorrarActionPerformed

    private void btnTRAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTRAreaActionPerformed
        double area;
        int base = Integer.parseInt(txtTRBase.getText());
        int altura = Integer.parseInt(txtTRAltura.getText());
        TrianguloRectangulo figura4 = new TrianguloRectangulo(base,altura);
        area = figura4.calcularArea();
        txtTRArea.setText(String.valueOf(area));
    }//GEN-LAST:event_btnTRAreaActionPerformed

    private void btnTRHipotenusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTRHipotenusaActionPerformed
        double hipotenusa;
        int base = Integer.parseInt(txtTRBase.getText());
        int altura = Integer.parseInt(txtTRAltura.getText());
        TrianguloRectangulo figura4 = new TrianguloRectangulo(base,altura);
        hipotenusa = figura4.calcularHipotenusa();
        txtTRHipotenusa.setText(String.valueOf(hipotenusa));
    }//GEN-LAST:event_btnTRHipotenusaActionPerformed

    private void btnTRPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTRPerimetroActionPerformed
        double perimetro;
        int base = Integer.parseInt(txtTRBase.getText());
        int altura = Integer.parseInt(txtTRAltura.getText());
        TrianguloRectangulo figura4 = new TrianguloRectangulo(base,altura);
        perimetro = figura4.calcularPerimetro();
        txtTRPerimetro.setText(String.valueOf(perimetro));
    }//GEN-LAST:event_btnTRPerimetroActionPerformed

    private void btnTRTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTRTrianguloActionPerformed
        String tipotriangulo;
        int base = Integer.parseInt(txtTRBase.getText());
        int altura = Integer.parseInt(txtTRAltura.getText());
        TrianguloRectangulo figura4 = new TrianguloRectangulo(base,altura);
        tipotriangulo = figura4.determinarTipoTriangulo();
        txtTRTriangulo.setText(String.valueOf(tipotriangulo));
    }//GEN-LAST:event_btnTRTrianguloActionPerformed

    private void btnTRBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTRBorrarActionPerformed
        txtTRBase.setText("");
        txtTRAltura.setText("");
        txtTRArea.setText("");
        txtTRPerimetro.setText("");
        txtTRHipotenusa.setText("");
        txtTRTriangulo.setText("");
    }//GEN-LAST:event_btnTRBorrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCuArea;
    private javax.swing.JButton btnCuBorrar;
    private javax.swing.JButton btnCuPerimetro;
    private javax.swing.JButton btnPerimetro;
    private javax.swing.JButton btnRArea;
    private javax.swing.JButton btnRBorrar;
    private javax.swing.JButton btnRperimetro;
    private javax.swing.JButton btnTRArea;
    private javax.swing.JButton btnTRBorrar;
    private javax.swing.JButton btnTRHipotenusa;
    private javax.swing.JButton btnTRPerimetro;
    private javax.swing.JButton btnTRTriangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCArea;
    private javax.swing.JTextField txtCPerimetro;
    private javax.swing.JTextField txtCRadio;
    private javax.swing.JTextField txtCuArea;
    private javax.swing.JTextField txtCuLado;
    private javax.swing.JTextField txtCuPerimetro;
    private javax.swing.JTextField txtRAltura;
    private javax.swing.JTextField txtRArea;
    private javax.swing.JTextField txtRBase;
    private javax.swing.JTextField txtRPerimetro;
    private javax.swing.JTextField txtTRAltura;
    private javax.swing.JTextField txtTRArea;
    private javax.swing.JTextField txtTRBase;
    private javax.swing.JTextField txtTRHipotenusa;
    private javax.swing.JTextField txtTRPerimetro;
    private javax.swing.JTextField txtTRTriangulo;
    // End of variables declaration//GEN-END:variables
}
