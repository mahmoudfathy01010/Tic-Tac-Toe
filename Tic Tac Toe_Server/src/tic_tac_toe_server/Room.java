package tic_tac_toe_server;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Room {
    String[] board = new String[9]; 
    GamePartner[] gamePartner;
     final Lock ToLock;
     final Condition oppenentTurn;
        
    int currentPartner;
    int X = 0;
    int O = 1; 
    String[] Signs = {"x", "o"};
    String [] database=new String[9];
    int index=0;
    int Replay=0;
    int Replay1=0;
    int RoomWin=0;
    int RoomLoss=0;
    boolean ToControlReplay=true;
    
    Connection con=null;
    ResultSet rsretrieve;
    String url = "jdbc:mysql://172.16.4.137:3306/game_xo";
    String dbUser = "xoclient";
    //String dbUser = "root";
    String password = "xoiti";
    ResultSet rs ;
    
   
    public Room() {
          ToLock = new ReentrantLock();
          oppenentTurn = ToLock.newCondition();
        for (int i = 0; i < 9; i++) {
            board[i] = ""; 
        }
        currentPartner = X; 
        gamePartner = new GamePartner[2]; 
    }
    
   

    public boolean check(int location, int player) {
        while (player != currentPartner) {
            ToLock.lock(); 

            try {
                oppenentTurn.await(); 
            } catch (InterruptedException exception) {
                System.out.println(exception.toString());
            } finally {
                ToLock.unlock(); 
            }
        }
        
        if (!isBusy(location)) {
            
            board[location] = Signs[currentPartner];
            System.out.println(Arrays.toString(board));
            database[index]=Signs[currentPartner]+"-"+location;
            System.out.println(Arrays.toString(database));
            index++;
            currentPartner = (currentPartner + 1) % 2; 
            gamePartner[currentPartner].oppenentDetails(location);
            
            ToLock.lock();

            try {
                oppenentTurn.signal();
            } finally {
                ToLock.unlock();
            }
            
            return true; 
        } else {
            return false; 
        }
    }

    public boolean isBusy(int location) {
        return board[location].equals(Signs[X]) || board[location].equals(Signs[O]);
    }
    public boolean getTheWinner() {
        return (!board[0].isEmpty() && board[0].equals(board[1]) && board[0].equals(board[2]))
                || (!board[3].isEmpty() && board[3].equals(board[4]) && board[3].equals(board[5]))
                || (!board[6].isEmpty() && board[6].equals(board[7]) && board[6].equals(board[8]))
                || (!board[0].isEmpty() && board[0].equals(board[3]) && board[0].equals(board[6]))
                || (!board[1].isEmpty() && board[1].equals(board[4]) && board[1].equals(board[7]))
                || (!board[2].isEmpty() && board[2].equals(board[5]) && board[2].equals(board[8]))
                || (!board[0].isEmpty() && board[0].equals(board[4]) && board[0].equals(board[8]))
                || (!board[2].isEmpty() && board[2].equals(board[4]) && board[2].equals(board[6]));
       
            
    }
    
    public boolean isBoardfull() {
        for (int i = 0; i < board.length; ++i) {
            if (board[i].isEmpty()) {
                return false;
            }
        }

        return true;
    }
    public void validateReplay(String mark)
    {
    
    if(mark.equals("x"))
    {Replay=1;
    System.out.println("validate first if");
    }
    
    if(mark.equals("o")){
        Replay1=1;
        System.out.println("validate second if");
    }
    ToControlReplay=false;
    if(Replay==1&&Replay1==1)
    {
         for (int i = 0; i < 9; i++) {
            board[i] = "";
        }
         
         for (int i = 0; i < 9; i++) {
            database[i] = null;
        }
         
         gamePartner[currentPartner].otherReplay();
         currentPartner = (currentPartner + 1) % 2;
         gamePartner[currentPartner].otherReplay();
         Replay=0;
         Replay1=0;
         currentPartner = X;
         index=0;
         ToControlReplay=true;
         System.out.println("I finished validate replay");
         
    }
   
        
    
    }
    
   void handleOnclosing(String m)
   {
       if(m.equals("x"))
       {
           System.out.println("before out of closing");
           gamePartner[1].ToCloseMessage();
           try {
               gamePartner[0].DOS.writeUTF("IAMOUT");
           } catch (IOException ex) {
               Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
           }
           System.out.println("out of closing");
           
           try {        
               gamePartner[0].DIS.close();
               gamePartner[0].DOS.close();
               gamePartner[0].connection.close();
               
               //gamePartner[0].stop();
           } catch (IOException ex) {
               Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
           }

           
       }
       else
       {
           gamePartner[0].ToCloseMessage();
            try {
               
               gamePartner[1].DIS.close();
               gamePartner[1].DOS.close();
               gamePartner[1].connection.close();
               
           } catch (IOException ex) {
               Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
           }
            
            try {
               gamePartner[1].DOS.writeUTF("IAMOUT");
           } catch (IOException ex) {
               Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           
       }
          
       }
   
   public void ToSendReplayRequest(String s, String mark)
   {
       if(mark.equals("x"))
       {
           try {
               gamePartner[1].DOS.writeUTF(s);
           } catch (IOException ex) {
               Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else
       {
           try {
               gamePartner[0].DOS.writeUTF(s);
           } catch (IOException ex) {
               Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
   }
   
   public void confirmReplaying(String mark)
   {
   if(mark.equals("x"))
           
       {
           
           try {
               gamePartner[1].DOS.writeUTF("ReplayConfirmation");
           } catch (IOException ex) {
               Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else
       {
           
           try {
               gamePartner[0].DOS.writeUTF("ReplayConfirmation");
           } catch (IOException ex) {
               Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
   }
   
   
   //To manage refusing playing
   public void refusePlaying(String mark)
   {
        if(mark.equals("x"))
           
       {
           
           try {
               gamePartner[1].DOS.writeUTF("RefuseAlert");
           } catch (IOException ex) {
               Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else
       {
           
           try {
               gamePartner[0].DOS.writeUTF("RefuseAlert");
           } catch (IOException ex) {
               Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
   }
   
 
     public void sendData(String s)
   {
         try {
             System.out.println(s+"i will save");
           Statement stmt;

             try {
                 con = DriverManager.getConnection(url, dbUser, "xoiti");
  
                 //if(con){
                 System.out.println("connection success");
                 //}
             } catch (SQLException ex) {
                 Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
             }
          
             stmt=con.createStatement();
             ResultSet rs=stmt.executeQuery("select * from Game");
             int i=0;
             while(rs.next()){i++;}    
             System.out.println(i);
             Date date;
            date= new Date();
            long time = date.getTime();
                      
              Timestamp ts = new Timestamp(time);
             PreparedStatement preparedStmt = con.prepareStatement("insert into GAME values(?,?,?,?,?,?,?,?,?,?,?,?)");
             preparedStmt.setInt(1, i);
             preparedStmt.setTimestamp(2, ts);
               preparedStmt.setString(3, s);
               for(int j=0;j<9;j++)
               {
                 preparedStmt.setString(j+4, database[j]);
                   System.out.println(database[j]);
               }  

//               if(preparedStmt==null)
//               {
//                   System.out.println("NULL");
//               }
               preparedStmt.executeUpdate();
               preparedStmt.close();
               con.close();
             
              
             
             
         } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
 

}