package maze;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.Timer;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class MazeProgram extends JPanel implements KeyListener {
   JFrame frame;
   String[][] maze;

   ArrayList<Wall> walllist;
   boolean in2d = true;
   boolean lock = false;
   int a_ = 0;
   
   Player p;

   public MazeProgram() {

       frame = new JFrame();
       frame.add(this);
       frame.setSize(1000, 600);
       frame.setVisible(true);
       frame.addKeyListener(this);

       setMaze();

   }

   public void paintComponent(Graphics g) {
       super.paintComponent(g);

       if(in2d) {
           drawMaze(0, 0, g, 3);
       }
       else{

           drawMaze(300, 500, g, 1);

           for(Wall w : walllist){
               g.setColor(Color.DARK_GRAY);
               g.fillPolygon(w.getPoly());
               g.setColor(Color.BLACK);
               g.drawPolygon(w.getPoly());
           }

       }
   }

   public void drawMaze(int x, int y, Graphics g, int scale){
       g.setColor(new Color(74, 163, 87));
       g.fillRect(0, 0, frame.getWidth(), frame.getHeight());
       for (int i = 0; i < maze.length; i++) {
           for (int j = 0; j < maze[0].length; j++) {

               g.setColor(Color.BLACK);
               if (maze[i][j].equals("*"))
                   g.fillRect(x + j * 5 * scale, y + i * 5 * scale, 4 * scale, 4 * scale);

               g.setColor(Color.RED);
               g.fillOval(x + p.getC() * 5 * scale, y + p.getR() * 5 * scale, 4 * scale, 4 * scale);


           }
       }
   }

   public void set3D(){

       walllist = new ArrayList<Wall>();

       for(int a = 0; a < 5; a++){
           //leftWall(a);
           //rightWall(a);
           leftPath(a);
           rightPath(a);



       }
       int row = p.getR();
       int col = p.getC();

       lock = false;
       for(int a = 0; a < 5; a++){
           try {
               switch(p.getDir()) {
                   case 'E':
                       
                	   if(lock) {
                		   a_ = a;
                	   }
                	   
                	   if (maze[row - 1][col + a].equals("*")) {
                           leftWall(a);
                       }
                       if (maze[row + 1][col + a].equals("*")) {
                    	   rightWall(a);
                       }
                       System.out.println(row+1 + " " + (col + a));
                       if(maze[row][col+a].equals("*")){
                           if(a == a_)
                        	   frontwall(a);
                           
                           break;
                       }
                       break;
                   case 'S':

                       if (maze[row + a][col + 1].equals("*")) {
                           leftWall(a);
                       }
                       if (maze[row + a][col - 1].equals("*")) {
                           rightWall(a);
                       }
                       break;
                   case 'W':
                       if (maze[row + 1][col - a].equals("*")) {
                           leftWall(a);
                       }
                       if (maze[row - 1][col - a].equals("*")) {
                           rightWall(a);
                       }
                       break;
                   case 'N':
                       if (maze[row - a][col - 1].equals("*")) {
                           leftWall(a);
                       }
                       if (maze[row - a][col + 1].equals("*")) {
                           rightWall(a);
                       }
                       break;
               }

           }
           catch(ArrayIndexOutOfBoundsException e){
               System.out.println("Out Of Bounds");
           }
       }

   }
   
//   int[] x ={10, 50, 50, 10};
//   int[] y ={10, 10, 50, 50};
   
   public void frontwall(int a){
	   lock = true;
       int[] x ={100 + 50 * a, 850 - 50 * a, 850 - 50 * a, 100 + 50 * a};
       int[] y ={50 + 50 * a, 100 + 50 * a, 500 - 50 * a, 550 - 50 * a};
       walllist.add(new Wall(x,y));
   }
   public void leftPath(int a){
       int[] x ={100 + 50 * a, 150 + 50 * a, 150 + 50 * a, 100 + 50 * a};
       int[] y ={100 + 50 * a, 100 + 50 * a, 500 - 50 * a, 500 - 50 * a};
       walllist.add(new Wall(x,y));
   }
   public void leftWall(int a){
       int[] x ={100 + 50 * a, 150 + 50 * a, 150 + 50 * a, 100 + 50 * a};
       int[] y ={50 + 50 * a, 100 + 50 * a, 500 - 50 * a, 550 - 50 * a};
       walllist.add(new Wall(x,y));
   }

   public void rightPath(int a){
       int[] x2 ={900 - 50 * a, 850 - 50 * a, 850 - 50 * a, 900 - 50 * a};
       int[] y2 ={100 + 50 * a, 100 + 50 * a, 500 - 50 * a, 500 - 50 * a};
       walllist.add(new Wall(x2,y2));
   }
   public void rightWall(int a){
       int[] x ={900 - 50 * a, 850 - 50 * a, 850 - 50 * a, 900 - 50 * a};
       int[] y ={50 + 50 * a, 100 + 50 * a, 500 - 50 * a, 550 - 50 * a};
       walllist.add(new Wall(x,y));
   }

   public void setMaze(){

       maze = new String[34][0];

       File file = new File("C:\\Users\\yash0\\eclipse-workspace\\maze\\src\\mazefile.txt");

       try{
           String text;
           BufferedReader input = new BufferedReader(new FileReader(file));
           int r = 0;
           boolean first = true;
           while((text=input.readLine()) != null){
               if(first) {
                   String[] pieces=text.split(" ");
                   int row = Integer.parseInt(pieces[0]);
                   int col = Integer.parseInt(pieces[1]);
                   char dir = pieces[2].charAt(0);
                   int endRow = Integer.parseInt(pieces[3]);
                   int endCol = Integer.parseInt(pieces[4]);

                   p = new Player(row, col, dir);
                   first = false;
               }
               else{
                   String[] pieces = text.split("");
                   maze[r] = pieces;
                   r++;
               }
           }

       }
       catch(IOException e){
           System.out.println("File not found");
       }

   }

   @Override
   public void keyTyped(KeyEvent e) {

   }

   @Override
   public void keyPressed(KeyEvent e) {

       if(e.getKeyCode() == KeyEvent.VK_E){
           in2d = !in2d;
       }

       p.move(e.getKeyCode());

       if(!in2d)
           set3D();
       repaint();
   }

   @Override
   public void keyReleased(KeyEvent e) {

   }


   public static void main(String[] args) {
       new MazeProgram();
   }

   public class Wall{

       int[] x,y;
       public Wall(int[] x, int[] y){
           this.x = x;
           this.y = y;
       }

       public Polygon getPoly(){
           return new Polygon(x,y, 4);
       }

   }

   public class Player {

       private int r;
       private int c;
       private char dir;

       public Player(int r, int c, char dir) {
           this.r = r;
           this.c = c;
           this.dir = dir;
       }
       public int getR() {
           return r;
       }

       public void setR(int r) {
           this.r = r;
       }

       public char getDir() {
           return dir;
       }

       public void setDir(char dir) {
           this.dir = dir;
       }

       public int getC() {
           return c;
       }

       public void setC(int c) {
           this.c = c;
       }


       public void move(int code){

           if(code == 87){
               dir = 'N';
           }

           if(code == 65){
               dir = 'W';
           }

           if(code == 83){
               dir = 'S';
           }

           if(code == 68){
               dir = 'E';
           }

           if(code == KeyEvent.VK_SPACE){
               if(dir == 'N'){
                   if (!maze[r - 1][c].equals("*"))
                   r--;
               }
               if(dir == 'E'){
                   if (!maze[r][c + 1].equals("*"))
                   c++;
               }
               if(dir == 'S'){
                   if (!maze[r + 1][c].equals("*"))
                   r++;
               }
               if(dir == 'W'){
                   if (!maze[r][c - 1].equals("*"))
                   c--;
               }

           }

       }

   }


}



