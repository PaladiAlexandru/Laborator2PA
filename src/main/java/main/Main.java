package main;

import enums.SourceType;
import transporationPrbl.Destination;
import transporationPrbl.Problem;
import transporationPrbl.Source;
import transporationPrbl.Trade;


public class Main {
    public static void main(String[] args) {


        Problem problem = new Problem();
        int[][] costsMatrix = new int[3][3];
        costsMatrix[0][0]=2;
        costsMatrix[0][1]=3;
        costsMatrix[0][2]=1;
        costsMatrix[1][0]=5;
        costsMatrix[1][1]=4;
        costsMatrix[1][2]=8;
        costsMatrix[2][0]=5;
        costsMatrix[2][1]=6;
        costsMatrix[2][2]=8;

        Destination destination1 =new Destination("D1",20);
        Destination destination2 =new Destination("D2",25);
        Destination destination3 =new Destination("D3",25);

        Source source1 = new Source("S1",10, SourceType.FACTORY);
        Source source2 = new Source("S2",35, SourceType.FACTORY);
        Source source3 = new Source("S3",25, SourceType.FACTORY);

        Trade trade1 =new Trade(source1,destination3,costsMatrix[0][2]);
        System.out.println(trade1);
        problem.addToTheTotalCost(trade1.getTotalCost());

        Trade trade2=new Trade(source2,destination2,costsMatrix[1][1]);
        System.out.println(trade2);
        problem.addToTheTotalCost(trade2.getTotalCost());

        Trade trade3=new Trade(source2,destination3,costsMatrix[1][2]);
        System.out.println(trade3);
        problem.addToTheTotalCost(trade3.getTotalCost());

        Trade trade4=new Trade(source3,destination1,costsMatrix[2][0]);
        System.out.println(trade4);
        problem.addToTheTotalCost(trade4.getTotalCost());

        Trade trade5=new Trade(source3,destination3,costsMatrix[2][2]);
        System.out.println(trade5);
        problem.addToTheTotalCost(trade5.getTotalCost());

        System.out.println("Total cost: " + problem.getTotalCost());
    }
}
