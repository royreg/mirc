package sample.hello;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;

import javax.swing.*;

/**
 * Created by Roy on 02/06/2017.
 */
public class chatRoomPanel  extends javax.swing.JPanel{

    ActorSystem system;
    String username;
    ActorRef client;
    Client c;
    ActorRef   channel; //may  be useless
    String roomName;
    final DefaultListModel model = new DefaultListModel();


    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton leaveBtn;
    private javax.swing.JTextArea messageArea;
    private javax.swing.JTextArea messageInput;
    private javax.swing.JLabel roomTitle;
    private javax.swing.JButton sendBtn;
    private javax.swing.JList<String> usersList;
    // End of variables declaration
    public chatRoomPanel(ActorRef client,String roomName,String username,Client c) {

        this.client=client;
        initComponents();
        roomTitle.setText("Welcome to : "+roomName);
        this.username=username;
        this.c=c;
        roomName=roomName;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        messageArea = new javax.swing.JTextArea();
        sendBtn = new javax.swing.JButton();
        leaveBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        usersList = new javax.swing.JList<>();
        roomTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        messageInput = new javax.swing.JTextArea();

        messageArea.setColumns(20);
        messageArea.setRows(5);
        jScrollPane1.setViewportView(messageArea);

        sendBtn.setText("Send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        leaveBtn.setText("Leave");
        leaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveBtnActionPerformed(evt);
            }
        });

        usersList.setModel(model);
        jScrollPane2.setViewportView(usersList);

        roomTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roomTitle.setText("Welcome To: Room Name");

        jLabel2.setText("Active users");

        messageInput.setColumns(20);
        messageInput.setRows(5);
        jScrollPane3.setViewportView(messageInput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(leaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(roomTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(roomTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(17, 17, 17))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sendBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(leaveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                                .addContainerGap(40, Short.MAX_VALUE))
        );

        roomTitle.getAccessibleContext().setAccessibleName("Welcoome to : RoomName");
    }// </editor-fold>

    public void printInMessageArea(String msg){

        messageArea.append(msg+'\n');
    }
    public void addTolist(String s){
        model.addElement(s);
    }
    public void changeTitle(String newTitle){
        roomName=newTitle;
        roomTitle.setText(newTitle);

    }



    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {
        Message_UserInput msg = new Message_UserInput("",roomName,messageInput.getText());

        client.tell(msg,null);

    }

    private void leaveBtnActionPerformed(java.awt.event.ActionEvent evt) {
        Message_LeaveChannel lev=new Message_LeaveChannel(this.username,roomName,client);
        c.connectorActor.tell(lev,client);






    }


    public void clearList() {
        model.clear();
    }
}
