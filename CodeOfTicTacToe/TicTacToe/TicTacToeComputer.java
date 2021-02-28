/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import javax.swing.JOptionPane;

/**
 *
 * @author HarshitMaurya
 */
public class TicTacToeComputer extends javax.swing.JFrame {
public int i=10;
Boolean CheckCo=true;


        
    /**
     * Creates new form TicTacToeComputer
     */
    public TicTacToeComputer() {
        
        super("TicTacToe");
        initComponents();
    }
 public void WinResult()
    {
      
       if(A1.getText().equalsIgnoreCase("0") && A2.getText().equalsIgnoreCase("0") && A3.getText().equalsIgnoreCase("0") ||
               B1.getText().equalsIgnoreCase("0") && B2.getText().equalsIgnoreCase("0") && B3.getText().equalsIgnoreCase("0") ||
               C1.getText().equalsIgnoreCase("0") && C2.getText().equalsIgnoreCase("0") && C3.getText().equalsIgnoreCase("0") ||
               A1.getText().equalsIgnoreCase("0") && B1.getText().equalsIgnoreCase("0") && C1.getText().equalsIgnoreCase("0") || 
               A2.getText().equalsIgnoreCase("0") && B2.getText().equalsIgnoreCase("0") && C2.getText().equalsIgnoreCase("0") ||
               A3.getText().equalsIgnoreCase("0") && B3.getText().equalsIgnoreCase("0") && C3.getText().equalsIgnoreCase("0") ||
                   A1.getText().equalsIgnoreCase("0") && B2.getText().equalsIgnoreCase("0") && C3.getText().equalsIgnoreCase("0") ||
                   A3.getText().equalsIgnoreCase("0") && B2.getText().equalsIgnoreCase("0") && C1.getText().equalsIgnoreCase("0"))
       {
           JOptionPane.showMessageDialog(this,"Team 0 Win");
                int j= JOptionPane.showConfirmDialog(this,"DO You Want To Play Again ?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
     if(j == JOptionPane.YES_OPTION)
     {
       
           A1.setText("");
           A2.setText("");
           A3.setText("");
           B1.setText("");
                   B2.setText("");
                   B3.setText("");
                   C1.setText("");
                   C2.setText("");
                   C3.setText("");
                    this.setVisible(false);
                  TicTacToeComputer ttt = new TicTacToeComputer();
                   ttt.setVisible(true);
                   i=10;
     }
     else
     {
           System.exit(0);
     }
       }
       else
       {
            if(A1.getText().equalsIgnoreCase("x") && A2.getText().equalsIgnoreCase("x") && A3.getText().equalsIgnoreCase("x") ||
               B1.getText().equalsIgnoreCase("x") && B2.getText().equalsIgnoreCase("x") && B3.getText().equalsIgnoreCase("x") ||
               C1.getText().equalsIgnoreCase("x") && C2.getText().equalsIgnoreCase("x") && C3.getText().equalsIgnoreCase("x") ||
               A1.getText().equalsIgnoreCase("x") && B1.getText().equalsIgnoreCase("x") && C1.getText().equalsIgnoreCase("x") || 
               A2.getText().equalsIgnoreCase("x") && B2.getText().equalsIgnoreCase("x") && C2.getText().equalsIgnoreCase("x") ||
               A3.getText().equalsIgnoreCase("x") && B3.getText().equalsIgnoreCase("x") && C3.getText().equalsIgnoreCase("x") ||
                   A1.getText().equalsIgnoreCase("x") && B2.getText().equalsIgnoreCase("x") && C3.getText().equalsIgnoreCase("x") ||
                   A3.getText().equalsIgnoreCase("x") && B2.getText().equalsIgnoreCase("x") && C1.getText().equalsIgnoreCase("x"))
            {
           JOptionPane.showMessageDialog(this, "Team X wins");
            int j= JOptionPane.showConfirmDialog(this,"DO You Want To Play Again ?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
     if(j == JOptionPane.YES_OPTION)
     {
        A1.setText("");
           A2.setText("");
           A3.setText("");
           B1.setText("");
                   B2.setText("");
                   B3.setText("");
                   C1.setText("");
                   C2.setText("");
                   C3.setText("");
                    this.setVisible(false);
                  TicTacToeComputer ttt = new TicTacToeComputer();
                   ttt.setVisible(true);
                   i=10;
     }
     else
     {
         System.exit(0);
     }
                }
            if(i==1)
            {
             JOptionPane.showMessageDialog(this, " Ou o Match Draw !");
           int j= JOptionPane.showConfirmDialog(this,"DO You Want To Play Again ?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
     if(j == JOptionPane.YES_OPTION)
     {
        A1.setText("");
           A2.setText("");
           A3.setText("");
           B1.setText("");
                   B2.setText("");
                   B3.setText("");
                   C1.setText("");
                   C2.setText("");
                   C3.setText("");
                   this.setVisible(false);
                  TicTacToeComputer ttt = new TicTacToeComputer();
                   ttt.setVisible(true);
                   i=10;
     }
     else
     {
         System.err.println("TEsted");
         System.exit(0);
     }
            }
       }
      
    
    }
 public void ComputerTurnA()
 {
     if(A3.getText().equalsIgnoreCase(""))
     {
         CheckCo=true;
         if(CheckCo==true)
         {
     if(A1.getText().equalsIgnoreCase("0") && A2.getText().equalsIgnoreCase("0") ||
             C1.getText().equalsIgnoreCase("0") && B2.getText().equalsIgnoreCase("0") ||
             C3.getText().equalsIgnoreCase("0") && B3.getText().equalsIgnoreCase("0"))
     {
         System.out.println("A3");
         A3.setText("x");
         i--;
          CheckCo = false;
     }
     }
     }
        
         if(CheckCo==true)
         {
     if(A2.getText().equalsIgnoreCase(""))
            
     {
         
     if(B2.getText().equalsIgnoreCase("0") && C2.getText().equalsIgnoreCase("0") ||
             A1.getText().equalsIgnoreCase("0") && A3.getText().equalsIgnoreCase("0"))
           
     {
         System.err.println("A3");
         A2.setText("x");
         i--;
          CheckCo = false;
     }
     }
     }
        
         if(CheckCo==true)
         {
       if(B1.getText().equalsIgnoreCase(""))
        {
     if(B2.getText().equalsIgnoreCase("0") && B3.getText().equalsIgnoreCase("0") ||
             A1.getText().equalsIgnoreCase("0") && C1.getText().equalsIgnoreCase("0"))
           
     {
         System.out.println("B1CombInner()");
         B1.setText("x");
         i--;
          CheckCo = false;
     }
              }
     }
      
         if(CheckCo==true)
         {
       if(B2.getText().equalsIgnoreCase(""))
        
     {
     if(A1.getText().equalsIgnoreCase("0") && C3.getText().equalsIgnoreCase("0") ||
             A3.getText().equalsIgnoreCase("0") && C1.getText().equalsIgnoreCase("0")||
              A2.getText().equalsIgnoreCase("0") && C2.getText().equalsIgnoreCase("0")||
              B1.getText().equalsIgnoreCase("0") && B3.getText().equalsIgnoreCase("0"))
           
     {
         System.out.println("B1CombInner()");
         B2.setText("x");
         i--;
          CheckCo = false;
     }
     }
     }
         if(CheckCo==true)
         {
       if(B3.getText().equalsIgnoreCase(""))
        
     {
     if(A3.getText().equalsIgnoreCase("0") && C3.getText().equalsIgnoreCase("0") ||
             B1.getText().equalsIgnoreCase("0") && B2.getText().equalsIgnoreCase("0"))
            
           
     {
         System.out.println("B1CombInner()");
         B3.setText("x");
         i--;
          CheckCo = false;
     }
     }
     }
       if(CheckCo==true)
         {
     if(C2.getText().equalsIgnoreCase(""))
            
     {
         
     if(C1.getText().equalsIgnoreCase("0") && C3.getText().equalsIgnoreCase("0") ||
             A2.getText().equalsIgnoreCase("0") && B2.getText().equalsIgnoreCase("0"))
           
     {
         System.err.println("A3");
         C2.setText("x");
         i--;
          CheckCo = false;
     }
     }
     }   
     
     
 }
 public void ComputerTurnA1()
 {
        if(A1.getText().equalsIgnoreCase(""))
        {
     if(A3.getText().equalsIgnoreCase("0") && A2.getText().equalsIgnoreCase("0") ||
             C3.getText().equalsIgnoreCase("0") && B2.getText().equalsIgnoreCase("0") ||
             C1.getText().equalsIgnoreCase("0") && B1.getText().equalsIgnoreCase("0"))
     {
         A1.setText("x");
  
         i--;
          CheckCo = false;
     }
        }
 }
 public void ComputerTurnC()
 {
     if(C3.getText().equalsIgnoreCase(""))
     {
     if(A1.getText().equalsIgnoreCase("0") && B2.getText().equalsIgnoreCase("0") ||
             C1.getText().equalsIgnoreCase("0") && C2.getText().equalsIgnoreCase("0") ||
             A3.getText().equalsIgnoreCase("0") && B3.getText().equalsIgnoreCase("0"))
     {
         System.err.println("C3");
         C3.setText("x");
         i--;
          CheckCo = false;
     }
     }
 }
 public void ComputerTurnC1()
 {
     if(C1.getText().equalsIgnoreCase(""))
     {
     if(A1.getText().equalsIgnoreCase("0") && B1.getText().equalsIgnoreCase("0") ||
             A3.getText().equalsIgnoreCase("0") && B2.getText().equalsIgnoreCase("0") ||
             C3.getText().equalsIgnoreCase("0") && C2.getText().equalsIgnoreCase("0"))
     {
         System.err.println("C1");
         C1.setText("x");
         i--;
          CheckCo = false;
     }
     }
 }
 public void NextTurn()
 {
     CheckCo=true;
    if(CheckCo==true)
    {
        if(A1.getText().equalsIgnoreCase("0") && B2.getText().equals("") || 
                A3.getText().equalsIgnoreCase("0") && B2.getText().equals("") ||
                C1.getText().equalsIgnoreCase("0")  && B2.getText().equals("") || 
                C3.getText().equalsIgnoreCase("0") && B2.getText().equals(""))
        {
        B2.setText("x");
        i--;
        CheckCo=false;
        }
    }
  /*  if(CheckCo==true)
    {
        if(C1.getText().equalsIgnoreCase("") && C3.getText().equalsIgnoreCase("0") && A1.getText().equalsIgnoreCase("0"))
        {
            C1.setText("x");
            i--;
            CheckCo=false;
        }
    }*/
     if(CheckCo==true)
    {
        if(C1.getText().equalsIgnoreCase("0") &&
                A3.getText().equalsIgnoreCase("0") && 
                B2.getText().equalsIgnoreCase("x")
                && B3.getText().equalsIgnoreCase(""))
        {
            B3.setText("x");
            i--;
            CheckCo=false;
        }
    }
       if(CheckCo==true)
    {
        if(C3.getText().equalsIgnoreCase("0") &&
                A1.getText().equalsIgnoreCase("0") && 
                B2.getText().equalsIgnoreCase("x") &&
                B1.getText().equalsIgnoreCase(""))
        {
            B1.setText("x");
            i--;
            CheckCo=false;
        }
    }
    
     if(CheckCo==true)
     {
      if(A1.getText().equals(""))
     {
         
         A1.setText("x");
         i--;
          CheckCo = true;
     }
        else  if(A2.getText().equals(""))
     {
         A2.setText("x");
         i--;
         CheckCo = true;
     }
            else  if(A3.getText().equals(""))
     {
         A3.setText("x");
         i--;
          CheckCo = true;
     }
          else  if(B1.getText().equals(""))
     {
         B1.setText("x");
         i--;
          CheckCo = true;
     }
        else  if(B2.getText().equals(""))
     {
        B2.setText("x");
        i--;
         CheckCo = true;
     }
        else  if(B3.getText().equals(""))
     {
         B3.setText("x");
         i--;
          CheckCo = true;
     }
        else  if(C1.getText().equals(""))
     {
         C1.setText("x");
         i--;
          CheckCo = true;
     }
        else  if(C2.getText().equals(""))
     {
         C2.setText("x");
         i--;
          CheckCo = true;
     }
        else  if(C3.getText().equals(""))
     {
         C3.setText("x");
         i--;
          CheckCo = true;
     }
      
     }
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        C2 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        A3 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 468, 20));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 60, 370));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 468, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 60, 370));

        C2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 150)); // NOI18N
        C2.setForeground(new java.awt.Color(255, 255, 255));
        C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C2MouseClicked(evt);
            }
        });
        jPanel1.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 140, 130));

        C1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 150)); // NOI18N
        C1.setForeground(new java.awt.Color(255, 255, 255));
        C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C1MouseClicked(evt);
            }
        });
        jPanel1.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 140, 140));

        B3.setFont(new java.awt.Font("Tekton Pro Ext", 1, 150)); // NOI18N
        B3.setForeground(new java.awt.Color(255, 255, 255));
        B3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3MouseClicked(evt);
            }
        });
        jPanel1.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 140, 130));

        B2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 150)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
        });
        jPanel1.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 140, 130));

        B1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 150)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });
        jPanel1.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 130));

        A3.setFont(new java.awt.Font("Tekton Pro Ext", 1, 150)); // NOI18N
        A3.setForeground(new java.awt.Color(255, 255, 255));
        A3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A3MouseClicked(evt);
            }
        });
        jPanel1.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 140, 130));

        A2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 150)); // NOI18N
        A2.setForeground(new java.awt.Color(255, 255, 255));
        A2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A2MouseClicked(evt);
            }
        });
        jPanel1.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, -10, 140, 190));

        A1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 150)); // NOI18N
        A1.setForeground(new java.awt.Color(255, 255, 255));
        A1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });
        jPanel1.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 140, 130));

        C3.setFont(new java.awt.Font("Tekton Pro Ext", 1, 150)); // NOI18N
        C3.setForeground(new java.awt.Color(255, 255, 255));
        C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C3MouseClicked(evt);
            }
        });
        jPanel1.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 140, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C2MouseClicked
         System.out.println("C2 Outer"+i);
        if(C2.getText().equals(""))
  {
        if(i%2==0)
   {
        C2.setText("0");
          i--;
            System.out.println("C2 INNER"+i);
             System.out.println("Before NextTrun()"+CheckCo);
             
       CheckCo=true;
   if(CheckCo==true)  
      {
            System.out.println("ComputerTurn()%"+CheckCo);
            if(CheckCo==true)
            {
          this.ComputerTurnA();
            }
              if(CheckCo==true)
            {
         this.ComputerTurnA1();
            }
                if(CheckCo==true)
            {
         this.ComputerTurnC1();
            }
                  if(CheckCo==true)
            {
         this.ComputerTurnC();
            }
         this.WinResult();
          
      }  
           if(CheckCo==true)
           {
             System.out.println("NextTrun()"+CheckCo);
            this.NextTurn();  
           this.WinResult();
           }
        
          
   }

  
  }
    }//GEN-LAST:event_C2MouseClicked

    private void C1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseClicked
          System.out.println("C1 Outer"+i);  
        if(C1.getText().equals(""))
  {
        if(i%2==0)
   {
        C1.setText("0");
          System.out.println("C1 iNNER"+i);
          i--;
        
    CheckCo=true;
   if(CheckCo==true)  
      {
            System.out.println("ComputerTurn()%"+CheckCo);
        if(CheckCo==true)
            {
          this.ComputerTurnA();
            }
              if(CheckCo==true)
            {
         this.ComputerTurnA1();
            }
                if(CheckCo==true)
            {
         this.ComputerTurnC1();
            }
                  if(CheckCo==true)
            {
         this.ComputerTurnC();
            }
         this.WinResult();
          
      }  
           if(CheckCo==true)
           {
             System.out.println("NextTrun()"+CheckCo);
            this.NextTurn();  
           this.WinResult();
           }
   }
   
  }
    }//GEN-LAST:event_C1MouseClicked

    private void B3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseClicked
        System.out.println("B3 Outer"+i);
        CheckCo=true;
        if(B3.getText().equals(""))
  {
        if(i%2==0)
   {
        B3.setText("0");
          System.out.println("B3 INNER"+i);
           i--;
           
        CheckCo=true;
   if(CheckCo==true)  
      {
            System.out.println("ComputerTurn()%"+CheckCo);
         if(CheckCo==true)
            {
          this.ComputerTurnA();
            }
              if(CheckCo==true)
            {
         this.ComputerTurnA1();
            }
                if(CheckCo==true)
            {
         this.ComputerTurnC1();
            }
                  if(CheckCo==true)
            {
         this.ComputerTurnC();
            }
         this.WinResult();
          
      }  
           if(CheckCo==true)
           {
             System.out.println("NextTrun()"+CheckCo);
            this.NextTurn();  
           this.WinResult();
           }
   }
  
  }
    }//GEN-LAST:event_B3MouseClicked

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseClicked
         System.out.println("B2 Outer"+i);
        if(B2.getText().equals(""))
  {
        if(i%2==0)
   {
        B2.setText("0");
           i--;
             System.out.println("B2 Outer"+i);
      CheckCo=true;
   if(CheckCo==true)  
      {
            System.out.println("ComputerTurn()%"+CheckCo);
         if(CheckCo==true)
            {
          this.ComputerTurnA();
            }
              if(CheckCo==true)
            {
         this.ComputerTurnA1();
            }
                if(CheckCo==true)
            {
         this.ComputerTurnC1();
            }
                  if(CheckCo==true)
            {
         this.ComputerTurnC();
            }
         this.WinResult();
          
      }  
           if(CheckCo==true)
           {
             System.out.println("NextTrun()"+CheckCo);
            this.NextTurn();  
           this.WinResult();
           }
   }
    
  }
    }//GEN-LAST:event_B2MouseClicked

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
          System.out.println("B1 Outer"+i);  
        if(B1.getText().equals(""))
  {
        if(i%2==0)
   {
        B1.setText("0");
           i--;
             System.out.println("B1 INNER"+i);
         CheckCo=true;
         
   if(CheckCo==true)  
      {
            System.out.println("ComputerTurn()%"+CheckCo);
        if(CheckCo==true)
            {
          this.ComputerTurnA();
            }
              if(CheckCo==true)
            {
         this.ComputerTurnA1();
            }
                if(CheckCo==true)
            {
         this.ComputerTurnC1();
            }
                  if(CheckCo==true)
            {
         this.ComputerTurnC();
            }
         this.WinResult();
          
      }  
           if(CheckCo==true)
           {
             System.out.println("NextTrun()"+CheckCo);
            this.NextTurn();  
           this.WinResult();
           }
   }
   
  }
    }//GEN-LAST:event_B1MouseClicked

    private void A3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseClicked
        System.out.println("A3 Outer"+i);
        if(A3.getText().equals(""))
  {
        if(i%2==0)
   {
        A3.setText("0");
           i--;
          CheckCo=true;
   if(CheckCo==true)  
      {
            System.out.println("ComputerTurn()%"+CheckCo);
         if(CheckCo==true)
            {
          this.ComputerTurnA();
            }
              if(CheckCo==true)
            {
         this.ComputerTurnA1();
            }
                if(CheckCo==true)
            {
         this.ComputerTurnC1();
            }
                  if(CheckCo==true)
            {
         this.ComputerTurnC();
            }
         this.WinResult();
          
      }  
           if(CheckCo==true)
           {
             System.out.println("NextTrun()"+CheckCo);
            this.NextTurn();  
           this.WinResult();
           }
   }
   
  }
    }//GEN-LAST:event_A3MouseClicked

    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked
       
        System.out.println("A1 Outer"+i); 
        if(A1.getText().equals(""))
  {
        if(i%2==0)
   {
       System.out.println(i);
        A1.setText("0");
            i--;
          System.out.println("A1 Inner"+i);

       CheckCo=true;
   if(CheckCo==true)  
      {
            System.out.println("ComputerTurn()%"+CheckCo);
         if(CheckCo==true)
            {
          this.ComputerTurnA();
            }
              if(CheckCo==true)
            {
         this.ComputerTurnA1();
            }
                if(CheckCo==true)
            {
         this.ComputerTurnC1();
            }
                  if(CheckCo==true)
            {
         this.ComputerTurnC();
            }
         this.WinResult();
          
      }  
           if(CheckCo==true)
           {
             System.out.println("NextTrun()"+CheckCo);
            this.NextTurn();  
           this.WinResult();
           }
   }
    
 
  }
    }//GEN-LAST:event_A1MouseClicked

    private void C3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C3MouseClicked
       System.out.println("C3 Outer"+i);
        if(C3.getText().equals(""))
  {
        if(i%2==0)
   {
        C3.setText("0");
          System.out.println("C3 Inner"+i);
           i--;
         CheckCo=true;
   if(CheckCo==true)  
      {
            System.out.println("ComputerTurn()%"+CheckCo);
         if(CheckCo==true)
            {
          this.ComputerTurnA();
            }
              if(CheckCo==true)
            {
         this.ComputerTurnA1();
            }
                if(CheckCo==true)
            {
         this.ComputerTurnC1();
            }
                  if(CheckCo==true)
            {
         this.ComputerTurnC();
            }
         this.WinResult();
          
      }  
           if(CheckCo==true)
           {
             System.out.println("NextTrun()"+CheckCo);
            this.NextTurn();  
           this.WinResult();
           }
   }
   
  }
    }//GEN-LAST:event_C3MouseClicked

    private void A2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseClicked
  System.out.println("A2 Outer"+i);
        if(A2.getText().equals(""))
  {
        if(i%2==0)
   {
        A2.setText("0");
          System.out.println("A2 Inner"+i);
           i--;
           CheckCo=true;
   if(CheckCo==true)  
      {
            System.out.println("ComputerTurn()%"+CheckCo);
        if(CheckCo==true)
            {
          this.ComputerTurnA();
            }
              if(CheckCo==true)
            {
         this.ComputerTurnA1();
            }
                if(CheckCo==true)
            {
         this.ComputerTurnC1();
            }
                  if(CheckCo==true)
            {
         this.ComputerTurnC();
            }
          
      }  
           if(CheckCo==true)
           {
             System.out.println("NextTrun()"+CheckCo);
            this.NextTurn();  
           this.WinResult();
           }
   }
     
  }
    }//GEN-LAST:event_A2MouseClicked

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
            java.util.logging.Logger.getLogger(TicTacToeComputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeComputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeComputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeComputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeComputer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel A3;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
