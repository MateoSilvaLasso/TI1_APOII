package ui;
import model.Game;
import java.util.Scanner;
public class GameMain{

    private Game play;
    private Scanner read;

    public GameMain(){
        play= new Game();
        read= new Scanner(System.in);
    }

    public static void main(String[] args) {
        GameMain op= new GameMain();
        int option=0;
        do{
            option= op.menu();
            op.showmenu(option);
        }while(option!=0);
    }

    /*
    * DESCRIPTION: este metodo nos servira para desplegar el menu principal del juego
    * @return option, esta variable debe estar conteniendo una opcion válida
    * */
    public int menu(){
        System.out.println("1. Nueva partida\n"+
                           "2. Ver puntaje\n"+
                           "3. salir");
        int option= read.nextInt();
        return option;
    }
    /*
    * DESCRIPTION: este metodo ejecutara las opciones del menu
    * @param option, esta variable debe ir con un valor
    * */
    public void showmenu(int option){
        switch (option){
            case 1:
                int p= menu1();
                showMenu1(p);
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }
    /*
    * DESCRIPTION: este metodo nos servira para desplegar el menu de la partida
    * @return option, esta variable debe tener una opcion correcta del menu
    * */
    public int menu1(){
        System.out.println("1. poner tuberia\n"+
                           "2.simular\n"+
                           "3. salir");
        int option= read.nextInt();
        return option;
    }
    /*
    * DESCRIPTION: este metodo ayudara a ejecutar el menu de la partida
    * @param option, esta variable debe estar llena
    * */
    public void showMenu1(int option){
        switch (option){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }

}

