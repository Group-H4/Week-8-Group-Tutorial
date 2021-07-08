# Week-8-Group-Tutorial
import java.util.*;

public class Player{
String name;
int age;
String team;
String type;
int matches;
double statistics;

public Player(){

}

void getAverageRate(){
Scanner input=new Scanner(System.in);

System.out.println("Enter batting or bowling average :");
statistics = input.nextDouble();

}

void getPlayerDetails(){
Scanner input=new Scanner(System.in);

System.out.println("Player Details");
System.out.println("Enter player name :");
name = input.nextLine();

System.out.println("Enter player age :");
age=input.nextInt();

Scanner input1=new Scanner(System.in);
System.out.println("Enter player's team :");
team=input1.nextLine();


System.out.println("Enter number of matches :");
matches=input1.nextInt();

}

void getBestPerformance(){
Scanner input1=new Scanner(System.in);
System.out.println("Enter player's best performance :");
String per=input1.nextLine();
}

void getPlayerType(){
Scanner input1=new Scanner(System.in);
System.out.println("Enter player type(bowler, batsman, keeper) :");
type = input1.nextLine();
}

void display(){
System.out.println("------------------------------------------");
System.out.println("Player Details");
System.out.println("Player Name : "+name);
System.out.println("Player age : "+age);
System.out.println("Player team : "+team);
System.out.println("Player type : "+type);
System.out.println("Batting or bowling average : "+statistics);
System.out.println("------------------------------------------");
}


public static void main(String[] args) {

Player x= new Player();

x.getPlayerDetails();
x.getAverageRate();
x.getBestPerformance();
x.getPlayerType();
x.display();
}
}
