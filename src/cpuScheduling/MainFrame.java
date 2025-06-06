
package cpuScheduling;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class MainFrame extends javax.swing.JFrame {
    
     DefaultTableModel model;
     int  rowCount =0;
  
    public MainFrame() {
        initComponents();
        NumberProcess.setText("1");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RunAlgorithm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        AddProcessInTable = new javax.swing.JButton();
        NumberProcess = new javax.swing.JTextField();
        CPUTime = new javax.swing.JTextField();
        AlgorithmsList = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        QuantamTimeField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        stateofProcess = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operating System");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Left.setBackground(new java.awt.Color(204, 204, 204));
        Left.setMinimumSize(new java.awt.Dimension(400, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Process Info");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Num.Process");

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("CPU Time");

        RunAlgorithm.setBackground(new java.awt.Color(102, 153, 255));
        RunAlgorithm.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        RunAlgorithm.setForeground(new java.awt.Color(255, 255, 255));
        RunAlgorithm.setText("Run Algorithm");
        RunAlgorithm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        RunAlgorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunAlgorithmActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("You Must Select one");

        AddProcessInTable.setBackground(new java.awt.Color(102, 153, 255));
        AddProcessInTable.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        AddProcessInTable.setForeground(new java.awt.Color(255, 255, 255));
        AddProcessInTable.setText("Add Process");
        AddProcessInTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        AddProcessInTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProcessInTableActionPerformed(evt);
            }
        });

        NumberProcess.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NumberProcess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 3));

        CPUTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CPUTime.setForeground(new java.awt.Color(102, 102, 102));
        CPUTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 3));

        AlgorithmsList.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        AlgorithmsList.setForeground(new java.awt.Color(51, 153, 255));
        AlgorithmsList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFS", "SJF", "Priority", "Round Robin", " " }));
        AlgorithmsList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        AlgorithmsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlgorithmsListActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setText("Algorithms");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(37, 37, 37)
                                .addComponent(AlgorithmsList, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RunAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NumberProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CPUTime, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddProcessInTable, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumberProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPUTime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddProcessInTable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(AlgorithmsList, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(RunAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(363, 363, 363))
        );

        jPanel1.add(Left);
        Left.setBounds(0, 0, 1040, 250);

        Right.setBackground(new java.awt.Color(102, 153, 255));
        Right.setMinimumSize(new java.awt.Dimension(400, 600));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CPU SCHEDULING");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N.Process", "CPU.T", "Wait.T", "Turn.T"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setOpaque(false);
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(3).setResizable(false);
        }

        QuantamTimeField.setBackground(new java.awt.Color(204, 204, 204));
        QuantamTimeField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        QuantamTimeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("   ");

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Quantam.T");

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("State of Processes =>");

        stateofProcess.setBackground(new java.awt.Color(204, 204, 204));
        stateofProcess.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stateofProcess.setForeground(new java.awt.Color(0, 204, 102));
        stateofProcess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(jLabel8))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel9)
                .addGap(36, 36, 36)
                .addComponent(QuantamTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel10)
                .addGap(28, 28, 28)
                .addComponent(stateofProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(QuantamTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(stateofProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel5))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(194, 194, 194)
                .addComponent(jLabel8)
                .addGap(78, 109, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 250, 1040, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RunAlgorithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunAlgorithmActionPerformed
        rowCount = model.getRowCount();
        ChangeState("Running");
        int Cputime [] = new int[rowCount];
        int WaitingTime[]= new int[rowCount];
        int TrunaroundTime []= new int[rowCount];        
      if(AlgorithmsList.getSelectedItem().equals("FCFS")){
        for(int i=0; i< rowCount; i++ ){
            Cputime[i] = Integer.parseInt(model.getValueAt(i, 1).toString());
        }
        WaitingTime[0]=0;
        for(int i=1;i<rowCount;i++){
            WaitingTime[i]= WaitingTime[i-1]+Cputime[i-1];
        }
        for(int i=0;i<rowCount; i++){
           TrunaroundTime[i]= WaitingTime[i]+Cputime[i];
        }
        SetWaitingAndTrunAroud(WaitingTime,TrunaroundTime);
        ShowMessageAverageWT("FCFS");
      }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
      else if (AlgorithmsList.getSelectedItem().equals("SJF")){
           List<Object[]> TableData = new ArrayList<>();
         
         for(int i=0; i<rowCount; i++){
             Object[] row = new Object[4];
             row[0] = model.getValueAt(i, 0);
             row[1] = Integer.parseInt(model.getValueAt(i, 1).toString());
             row[2] = 0;
             row[3] = 0; 
             TableData.add(row); 
         }

        TableData.sort((a,b) -> Integer.compare((int) a[1], (int)b[1]));
        int CurrentTime = 0;
        for(int i=0; i<rowCount; i++){
            Object[] row = TableData.get(i);
           int CpuTime = (int) row[1];
           row[2] = CurrentTime ;
           row[3] = (int)row[2] + CpuTime;
           CurrentTime += CpuTime;
        }
    
        SeaderTableData(TableData);
        ShowMessageAverageWT("SJF");
      }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
else if (AlgorithmsList.getSelectedItem().equals("Priority")) {
    model.addColumn("Priority.P");

    for (int i = 0; i < rowCount; i++) {
        String inputPriority = JOptionPane.showInputDialog(this, 
            "Enter Priority for Process " + (i + 1) + ":",
            "Input Priority Process", 
            JOptionPane.QUESTION_MESSAGE);
        
        try {
            int priority = Integer.parseInt(inputPriority);
            model.setValueAt(priority, i, 4); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid priority value. Please enter a valid integer.");
            return; 
        }
    }

    List<Object[]> tableData = new ArrayList<>();
    for (int i = 0; i < rowCount; i++) {
        Object[] process = new Object[5];
        process[0] = model.getValueAt(i, 0); 
        process[1] = Integer.parseInt(model.getValueAt(i, 1).toString()); 
        process[2] = 0;
        process[3] = 0;
        process[4] = Integer.parseInt(model.getValueAt(i, 4).toString()); 
        tableData.add(process);
    }

    tableData.sort((a, b) -> Integer.compare((int) a[4], (int) b[4]));

    int currentTime = 0;
    for (int i = 0; i < rowCount; i++) {
        Object[] process = tableData.get(i);
        int cpuTime = (int) process[1];
        
        process[2] = currentTime;
        process[3] = (int) process[2] + cpuTime;

        currentTime += cpuTime;
    }

    for (int i = 0; i < rowCount; i++) {
        Object[] process = tableData.get(i);
        model.setValueAt(process[0], i, 0); 
        model.setValueAt(process[1], i, 1); 
        model.setValueAt(process[2], i, 2);
        model.setValueAt(process[3], i, 3);
    }

    ShowMessageAverageWT("Priority Algorithm");
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
else if (AlgorithmsList.getSelectedItem().equals("Round Robin")) {
    String inputQuantum = JOptionPane.showInputDialog(this,
            "Enter Quantum time for all processes",
            "Quantum Time",
            JOptionPane.QUESTION_MESSAGE);
    
    QuantamTimeField.setText(inputQuantum);
    int quantumTime = Integer.parseInt(inputQuantum);
    int rowCount = model.getRowCount();
    List<Object[]> tableData = new ArrayList<>();
    int[] backupCpuTime = new int[rowCount];
    for (int i = 0; i < rowCount; i++) {
        Object[] process = new Object[4];
        process[0] = model.getValueAt(i, 0);
        process[1] = Integer.parseInt(model.getValueAt(i, 1).toString()); 
        backupCpuTime[i] = Integer.parseInt(model.getValueAt(i, 1).toString());
        process[2] = 0; 
        process[3] = 0; 
        tableData.add(process);
    }

    boolean allProcessesComplete;
    int currentTime = 0;
    do {
        allProcessesComplete = true;
        for (Object[] process : tableData) {
            int cpuTime = (int) process[1];
            if (cpuTime > 0) {
                allProcessesComplete = false;
                if (cpuTime > quantumTime) {
                    currentTime += quantumTime;
                    process[1] = cpuTime - quantumTime; 
                } else {
                    currentTime += cpuTime;
                    process[1] = 0; 
                    process[3] = currentTime;
                    process[2] = currentTime - backupCpuTime[tableData.indexOf(process)]; 
                }
            }
        }
    } while (!allProcessesComplete); 

    for (int i = 0; i < rowCount; i++) {
        Object[] process = tableData.get(i);
        model.setValueAt(process[0], i, 0); 
        model.setValueAt(backupCpuTime[i], i, 1); 
        model.setValueAt(process[2], i, 2);
        model.setValueAt(process[3], i, 3);
    }

    ShowMessageAverageWT("Round Robin");
}
            
        
    }//GEN-LAST:event_RunAlgorithmActionPerformed

    
    
    
    
    
    private void AddProcessInTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProcessInTableActionPerformed
                model = (DefaultTableModel) Table.getModel();
                if(CPUTime.getText().isEmpty()   ){
                    JOptionPane.showMessageDialog(this, "CPU Time UnVailed","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(Integer.parseInt(CPUTime.getText()) <= 0 ){
                    JOptionPane.showMessageDialog(this, "CPU is less than Zero","Error",JOptionPane.ERROR_MESSAGE);

                }
                
                else{
                        Add_To_Table();
                        ClearCPUTime();
                        IncreamentNumberProcess();
                        ChangeState("Waiting");
                }
    }//GEN-LAST:event_AddProcessInTableActionPerformed

    private void AlgorithmsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlgorithmsListActionPerformed
    }//GEN-LAST:event_AlgorithmsListActionPerformed
             
    
            private void ChangeState(String state){
                
                stateofProcess.setText(state);
            }
            private void SeaderTableData(List<Object[]> TableDate ){
                for (int i=0 ; i< TableDate.size(); i++){
                    Object[] row = TableDate.get(i);
                    model.setValueAt(row[0], i, 0);
                    model.setValueAt(row[1], i, 1);
                    model.setValueAt(row[2], i, 2);
                    model.setValueAt(row[3], i, 3);
                    if(model.getColumnCount() == 5){
                        model.setValueAt(row[4],i, 4);
                    }
      
                }
            }
            private void Add_To_Table(){
                model.addRow(new Object[]{"p"+NumberProcess.getText(),CPUTime.getText(),0,0});
            }
            private void ClearCPUTime(){
                CPUTime.setText("");
            }
            private void IncreamentNumberProcess(){
              int Number = Integer.parseInt(NumberProcess.getText())  ;
              Number++;
              NumberProcess.setText(Number+"");
              
            }
            private void SetWaitingAndTrunAroud(int waitingTime[],int trunAround[]){
                for(int i=0;i<model.getRowCount();i++){
                    model.setValueAt(waitingTime[i], i, 2);
                    model.setValueAt(trunAround[i], i, 3);

                }
            }
            private void ShowMessageAverageWT(String Algorithm){
                double tatalwaiting=0;
                double tatalTrunaround = 0;
                for(int i=0;i<model.getRowCount();i++){
                    tatalwaiting += Integer.parseInt(model.getValueAt(i, 2).toString());
                    tatalTrunaround += Integer.parseInt(model.getValueAt(i, 3).toString());
                }
              tatalwaiting /= model.getRowCount();
              tatalTrunaround /=model.getRowCount();
              JOptionPane.showMessageDialog(this, 
                      "in "+Algorithm+" \n when Arrival Time equal zero \n Average Waiting Time :"+tatalwaiting+"\n average trunAround Time :"+tatalTrunaround,"Result",JOptionPane.INFORMATION_MESSAGE);
            }
           
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProcessInTable;
    private javax.swing.JComboBox<String> AlgorithmsList;
    private javax.swing.JTextField CPUTime;
    private javax.swing.JPanel Left;
    private javax.swing.JTextField NumberProcess;
    private javax.swing.JTextField QuantamTimeField;
    private javax.swing.JPanel Right;
    private javax.swing.JButton RunAlgorithm;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField stateofProcess;
    // End of variables declaration//GEN-END:variables
}
