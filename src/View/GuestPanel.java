/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.BillDAL;
import Controller.GuestDAL;
import Controller.RoomsDAL;
import Model.Guest;
import Model.Room;
import java.awt.Color;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author NT_Thanh
 */
public class GuestPanel extends javax.swing.JPanel {
    private ArrayList<Guest> listGuest;
    private ArrayList<Room> listRoom;
    DefaultTableModel model;
   
    /**
     * Creates new form GuestPanel
     */
    public GuestPanel() {
        initComponents();
       // GuestDAL us = new GuestDAL();
        //listGuest = us.GetGuestAll();
        setVisible(true);
        SetCombobox();
        jdcNgayDk.setDate(new Date());
    }
    public void SetCombobox()
    {
        RoomsDAL us = new RoomsDAL();
        listRoom = us.GetRoomAll();
        for(Room s : listRoom){   
            cbRoom.addItem(String.valueOf(s.getId()));
        }
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbGuest = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cbRoom = new javax.swing.JComboBox<>();
        txtcmnd = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jrnam = new javax.swing.JRadioButton();
        jrnu = new javax.swing.JRadioButton();
        jdcNgayDk = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtMaxGuest = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setEnabled(false);

        tbGuest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbGuest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbGuest.setFillsViewportHeight(true);
        tbGuest.setGridColor(new java.awt.Color(204, 204, 204));
        tbGuest.setRowHeight(30);
        tbGuest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGuestMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGuest);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cbRoom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRoomActionPerformed(evt);
            }
        });

        txtcmnd.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtsdt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jrnam.setBackground(new java.awt.Color(255, 255, 255));
        jrnam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrnam.setText("Nam");
        jrnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrnamActionPerformed(evt);
            }
        });

        jrnu.setBackground(new java.awt.Color(255, 255, 255));
        jrnu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrnu.setText("Nữ");
        jrnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrnuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Họ và tên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CMND");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("SDT");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ngày Đăng Ký");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Phòng");

        btnadd.setBackground(new java.awt.Color(102, 0, 102));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Thêm Người");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Xóa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtsdt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addComponent(txtcmnd, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jdcNgayDk, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrnu)
                            .addComponent(jrnam))
                        .addGap(155, 155, 155))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnadd)
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4))
                    .addComponent(jdcNgayDk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcmnd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrnam))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrnu)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtMaxGuest.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMaxGuest.setForeground(new java.awt.Color(255, 0, 0));
        txtMaxGuest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMaxGuest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtMaxGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("QUẢN LÝ KHÁCH HÀNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRoomActionPerformed
        // TODO add your handling code here:
        
        LoadData();
        
    }//GEN-LAST:event_cbRoomActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        GuestDAL us = new GuestDAL();
        String item = cbRoom.getSelectedItem().toString();
        int tem = Integer.parseInt(item);
                int gender = 0;
                SimpleDateFormat f= new SimpleDateFormat("yyyy-MM-dd");
                Date dt_end = jdcNgayDk.getDate();
                String datedk = f.format(dt_end);
                if(txtname.getText().equals("")||txtcmnd.getText().equals("")||txtsdt.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(this, "Please enter infor!");
                }
                else
                {
                     if(jrnam.isSelected()||jrnu.isSelected())
                    {
                        if(jrnam.isSelected())
                        {
                            gender =1;
                        }
                        if(jrnu.isSelected())
                        {
                            gender =0;
                        }

                        if(us.AddGuest(txtname.getText(), txtcmnd.getText(), txtsdt.getText(), gender , tem, datedk))
                        {
                            JOptionPane.showMessageDialog(this, "Add Success!");
                            LoadData();
                        }   
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Please check radio!");
                    }
                }
    }//GEN-LAST:event_btnaddActionPerformed

    private void jrnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrnamActionPerformed
        jrnu.setSelected(false); 
    }//GEN-LAST:event_jrnamActionPerformed

    private void jrnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrnuActionPerformed
        jrnam.setSelected(false); 
    }//GEN-LAST:event_jrnuActionPerformed

    private void tbGuestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGuestMouseClicked
        int click = tbGuest.getSelectedRow();
    }//GEN-LAST:event_tbGuestMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int click = -1;
        click = tbGuest.getSelectedRow();
        if(click==-1)
        {
            JOptionPane.showMessageDialog(this, "Bạn cần chọn đối tượng cần xóa!");
            
        }
        else
        {
            int cmnd = Integer.parseInt(tbGuest.getValueAt(click, 3).toString());
            GuestDAL us = new GuestDAL();
       
            if(us.RemoveGuestByName(cmnd))
            {
                JOptionPane.showMessageDialog(this, "Xóa Thành Công!");
                LoadData();
            }
        }

//        {
//            
//        }
//        name = tbGuest.getValueAt(click, 0).toString();
//        if(name==null)
//        {
//            
//        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JComboBox<String> cbRoom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcNgayDk;
    private javax.swing.JRadioButton jrnam;
    private javax.swing.JRadioButton jrnu;
    private javax.swing.JTable tbGuest;
    private javax.swing.JLabel txtMaxGuest;
    private javax.swing.JTextField txtcmnd;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsdt;
    // End of variables declaration//GEN-END:variables

    private void LoadData() {
         
        String item = cbRoom.getSelectedItem().toString();
        int tem = Integer.parseInt(item);
        GuestDAL us = new GuestDAL();
        listGuest = us.GetGuestByID(tem);
        
        model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
         tbGuest.setModel(model);
         
         
         model.setRowCount(0);
         model.setColumnIdentifiers(new Object[]{
             "TÊN", "SDT", "GIỚI TÍNH", "CMND", "NGÀY ĐĂNG KÍ", "MÃ PHÒNG"
        });
         //set background table
        JTableHeader tableHeader = tbGuest.getTableHeader();
        tableHeader.setBackground(new Color(102, 0, 102));
        tableHeader.setForeground(Color.WHITE);
        tableHeader.setPreferredSize(new Dimension(300, 30));
        
        TableColumnModel columnModel = tbGuest.getColumnModel();
        int count =0;
        if(listGuest!=null)
        {
            for(Guest s : listGuest){
            String gender;
            if(s.getSex()==1)
            {
                gender = "Nam";
            }
            else
            {
                gender = "Nữ";
            }
          model.addRow(new Object[]{s.getName(), s.getSdt(), gender, s.getCmnd(), s.getNgaydk(),s.getId_phong()});
          DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(JLabel.CENTER);
            columnModel.getColumn(0).setCellRenderer(renderer);
            columnModel.getColumn(1).setCellRenderer(renderer);
            columnModel.getColumn(2).setCellRenderer(renderer);
            columnModel.getColumn(0).setPreferredWidth(120);
            columnModel.getColumn(3).setCellRenderer(renderer);
            columnModel.getColumn(4).setCellRenderer(renderer);
            columnModel.getColumn(5).setCellRenderer(renderer);
            
            count++;
            }
             if(count == 3)
             {
                 txtMaxGuest.setText("Phòng đạt số người tối đa!");
             }
             else
             {
                 txtMaxGuest.setText("");
             }
        }
        else
        {
            txtMaxGuest.setText("");
        }
    }
}
