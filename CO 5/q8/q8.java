import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class q8 extends Applet implements KeyListener{
   TextField t;
   TextArea tA;
public void init(){
   t=new TextField(20);
   tA=new TextArea();
   add(t);
   add(tA);
   t.addKeyListener(this);
  }
public void keyPressed(KeyEvent e){
   if(e.getSource()==t)
   tA.append("keyPressed\n");
  }
public void keyReleased(KeyEvent e){
   if(e.getSource()==t)
   tA.append("Key Released\n");
  }
public void keyTyped(KeyEvent e){
   if(e.getSource()==t){
   char c=e.getKeyChar();
   tA.append("KeyTyped\n");
  }
 }
}