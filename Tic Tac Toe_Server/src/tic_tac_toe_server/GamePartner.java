/**
 *
 * @author MamoudFathy
 */
package tic_tac_toe_server;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GamePartner extends Thread {
    
        Socket connection;
        DataOutputStream DOS;
        DataInputStream DIS;
        final Lock ToLock;
        final Condition oppenentConnected;
        int playerNumber;
        String mark; 
        String UserName;
        boolean Pause = true; 
        Room s;
        

        public GamePartner(Socket socket, int number, Room s) {
            playerNumber = number;
            mark = s.Signs[playerNumber];
            connection = socket; 
            ToLock = new ReentrantLock();
            oppenentConnected = ToLock.newCondition();
            this.s=s;
            try {
                DIS = new DataInputStream(connection.getInputStream());
                DOS = new DataOutputStream(connection.getOutputStream());
            } catch (IOException ioException) {
                System.out.println(ioException.toString());
                System.exit(1);
            }
            start();
        }
        
        public void oppenentDetails(int location) {
            try {
                DOS.writeUTF("Opponent moved");
                DOS.writeInt(location);
                if(s.getTheWinner())
                    DOS.writeUTF("LOSS");
                else if(s.isBoardfull())
                    DOS.writeUTF("TIE");
            } catch (IOException ex) {
                Logger.getLogger(GamePartner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        @Override
        public void run() {
            try {
              
                try {
                    DOS.writeUTF(mark);
                } catch (IOException ex) {
                    Logger.getLogger(GamePartner.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (playerNumber == s.X) {
                    try {
                        DOS.writeUTF("X connected");
                    } catch (IOException ex) {
                        Logger.getLogger(GamePartner.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
                    
                   
                    ToLock.lock();
                  try {
                        while (Pause) {
                            oppenentConnected.await(); 
                        }
                    } catch (InterruptedException exception) {
                        System.out.println(exception.toString());
                    } finally {
                        ToLock.unlock(); 
                    }
                    try {
                        DOS.writeUTF("You Are X, Your Turn");
                    } catch (IOException ex) {
                        Logger.getLogger(GamePartner.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
                } else {
                    try {
                        DOS.writeUTF("You Are O, Wait");
                    } catch (IOException ex) {
                        Logger.getLogger(GamePartner.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
              
                while (true) {
                    
                    int location = 0;
                   
          
                    try {
                        location = DIS.readInt();
                    } catch (IOException ex) {
                        Logger.getLogger(GamePartner.class.getName()).log(Level.SEVERE, null, ex);
                        break;
                    }
                   
                    if(location==10)//save Button action
                    {
                        try {
                            UserName=DIS.readUTF();
                            s.sendData(UserName);
                            
                            System.out.println(UserName);
                        } catch (IOException ex) {
                            Logger.getLogger(GamePartner.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else if(location==100||location==200||location==300)//play again management
                    {
                       
                            if(s.ToControlReplay)//to prevent more than request
                            {    
                                
                                switch(location)
                                {
                                    case 100:
                                        s.ToSendReplayRequest("ReplayTie",mark);
                                    break;
                                    case 200:
                                        s.ToSendReplayRequest("ReplayLoss",mark);
                                    break;
                                    case 300:
                                    s.ToSendReplayRequest("ReplayWin",mark);
                                    break;
 
                                }
                            }    

                           s.validateReplay(mark);
                    }
                    else if(location==15)//closing management
                    {
                        s.handleOnclosing(mark);
                    }
                    else if(location == 50)//confirm playing again
                    {
                    s.confirmReplaying(mark);
                    }
                    
                    else if(location==13)//cancel request to play again
                    {
                    s.ToControlReplay=true;
                    s.Replay=0;
                    s.Replay1=0;
                    s.refusePlaying(mark);
                    
                    }
                    else if (s.check(location, playerNumber)) {   
                        try {
                            DOS.writeUTF("Valid Move.");
                        } catch (IOException ex) {
                            Logger.getLogger(GamePartner.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            if(s.getTheWinner())
                             DOS.writeUTF("WIN");
                            else if(s.isBoardfull())
                             DOS.writeUTF("TIE");
                        } catch (IOException ex) {
                            Logger.getLogger(GamePartner.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        try {
                         
                            DOS.writeUTF("Invalid Move, Try Again");
                           
                        } catch (IOException ex) {
                            Logger.getLogger(GamePartner.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            } finally {
                try {
                    connection.close();
                } catch (IOException ioException) {
                    System.out.println(ioException.toString());
                    System.exit(1);
                }
            }
        }
        public void otherReplay()
        {
            System.out.println("otherReplay");
            try {
                DOS.writeUTF("REPLAY");
            } catch (IOException ex) {
                Logger.getLogger(GamePartner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public void ToCloseMessage()
        {
        try {
                            DOS.writeUTF("OUT");
                        } catch (IOException ex) {
                            Logger.getLogger(GamePartner.class.getName()).log(Level.SEVERE, null, ex);
                        }
        }
     
    }


