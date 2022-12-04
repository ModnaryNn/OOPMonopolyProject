package gamefunction.board;

import gamefunction.GameBoard;
import gamefunction.enums.CardType;
import gamefunction.enums.ColorGroup;
import gamefunction.square.*;

public class DefaultBoard extends GameBoard {

    int rrBaseRent = 25;
    int rrPrice = 200;

    PropertySquare dp1 = new PropertySquare();
    ///CardSquare cc1 = new CardSquare(CardType.CC, "Community Chest 1");
    PropertySquare dp2 = new PropertySquare();
    PropertySquare dp3 = new PropertySquare();
    RailRoadSquare rr1 = new RailRoadSquare();
    PropertySquare lb1 = new PropertySquare();
    //CardSquare c1 = new CardSquare(CardType.CHANCE, "Chance 1");
    PropertySquare lb2 = new PropertySquare();
    PropertySquare lb3 = new PropertySquare();
    JailSquare jail = new JailSquare();
    PropertySquare p1 = new PropertySquare();
    UtilitySquare u1 = new UtilitySquare();
    PropertySquare p2 = new PropertySquare();
    PropertySquare p3 = new PropertySquare();
    RailRoadSquare rr2 = new RailRoadSquare();
    PropertySquare o1 = new PropertySquare();
    //CardSquare cc2 = new CardSquare(CardType.CC, "Community Chest 2");
    PropertySquare o2 = new PropertySquare();
    PropertySquare o3 = new PropertySquare();
    FreeParkingSquare fp = new FreeParkingSquare();
    PropertySquare r1 = new PropertySquare();
    //CardSquare c2 = new CardSquare(CardType.CHANCE, "Chance 2");
    PropertySquare r2 = new PropertySquare();
    PropertySquare r3 = new PropertySquare();
    RailRoadSquare rr3 = new RailRoadSquare();
    PropertySquare y1 = new PropertySquare();
    PropertySquare y2 = new PropertySquare();
    UtilitySquare u2 = new UtilitySquare();
    PropertySquare y3 = new PropertySquare();
    GoToJailSquare goToJail = new GoToJailSquare();
    PropertySquare g1 = new PropertySquare();
    PropertySquare g2 = new PropertySquare();
    //CardSquare cc3 = new CardSquare(CardType.CC, "Community Chest 3");
    PropertySquare g3 = new PropertySquare();
    RailRoadSquare rr4 = new RailRoadSquare();
    //CardSquare c3 = new CardSquare(CardType.CHANCE, "Chance 3");

    PropertySquare db1 = new PropertySquare();
    PropertySquare db2 = new PropertySquare();
    PropertySquare db3 = new PropertySquare();

        dp1.setPrice(60);
        dp1.setColorGroup(ColorGroup.PURPLE);
        dp1.setHousePrice(50);
        dp1.setName("Mediterranean Avenue");
        dp1.setRent(2);

        dp2.setPrice(60);
        dp2.setColorGroup(ColorGroup.PURPLE);
        dp2.setHousePrice(50);
        dp2.setName("Baltic Avenue");
        dp2.setRent(4);

        dp3.setPrice(60);
        dp3.setColorGroup(ColorGroup.PURPLE);
        dp3.setHousePrice(50);
        dp3.setName("Sarah Avenue");
        dp3.setRent(4);

        lb1.setPrice(100);
        lb1.setColorGroup(ColorGroup.TEAL);
        lb1.setHousePrice(50);
        lb1.setName("Oriental Avenue");
        lb1.setRent(6);

        lb2.setPrice(100);
        lb2.setColorGroup(ColorGroup.TEAL);
        lb2.setHousePrice(50);
        lb2.setName("Vermont Avenue");
        lb2.setRent(6);

        lb3.setPrice(120);
        lb3.setColorGroup(ColorGroup.TEAL);
        lb3.setHousePrice(50);
        lb3.setName("Connecticut Avenue");
        lb3.setRent(8);

        p1.setPrice(140);
        p1.setColorGroup(ColorGroup.FUCHSIA);
        p1.setHousePrice(100);
        p1.setName("St. Charles Place");
        p1.setRent(10);

        p2.setPrice(140);
        p2.setColorGroup(ColorGroup.FUCHSIA);
        p2.setHousePrice(100);
        p2.setName("States Avenue");
        p2.setRent(10);

        p3.setPrice(160);
        p3.setColorGroup(ColorGroup.FUCHSIA);
        p3.setHousePrice(100);
        p3.setName("Virginia Avenue");
        p3.setRent(12);

        o1.setPrice(180);
        o1.setColorGroup(ColorGroup.MAROON);
        o1.setHousePrice(100);
        o1.setName("St. James Avenue");
        o1.setRent(14);

        o2.setPrice(180);
        o2.setColorGroup(ColorGroup.MAROON);
        o2.setHousePrice(100);
        o2.setName("Tennessee Avenue");
        o2.setRent(14);

        o3.setPrice(200);
        o3.setColorGroup(ColorGroup.MAROON);
        o3.setHousePrice(100);
        o3.setName("New York Avenue");
        o3.setRent(16);

        r1.setPrice(220);
        r1.setColorGroup(ColorGroup.RED);
        r1.setHousePrice(150);
        r1.setName("Kentucky Avenue");
        r1.setRent(18);

        r2.setPrice(220);
        r2.setColorGroup(ColorGroup.RED);
        r2.setHousePrice(150);
        r2.setName("Indiana Avenue");
        r2.setRent(18);

        r3.setPrice(240);
        r3.setColorGroup(ColorGroup.RED);
        r3.setHousePrice(150);
        r3.setName("Illinois Avenue");
        r3.setRent(20);

        y1.setPrice(260);
        y1.setColorGroup(ColorGroup.ORANGE);
        y1.setHousePrice(150);
        y1.setName("Atlantic Avenue");
        y1.setRent(22);

        y2.setPrice(260);
        y2.setColorGroup(ColorGroup.ORANGE);
        y2.setHousePrice(150);
        y2.setName("Ventnor Avenue");
        y2.setRent(22);

        y3.setPrice(280);
        y3.setColorGroup(ColorGroup.ORANGE);
        y3.setHousePrice(150);
        y3.setName("Marvin Gardens");
        y3.setRent(24);

        g1.setPrice(300);
        g1.setColorGroup(ColorGroup.GREEN);
        g1.setHousePrice(200);
        g1.setName("Pacific Avenue");
        g1.setRent(26);

        g2.setPrice(300);
        g2.setColorGroup(ColorGroup.GREEN);
        g2.setHousePrice(200);
        g2.setName("North Carolina Avenue");
        g2.setRent(26);

        g3.setPrice(320);
        g3.setColorGroup(ColorGroup.GREEN);
        g3.setHousePrice(200);
        g3.setName("Pennsylvania Avenue");
        g3.setRent(28);

        db1.setPrice(350);
        db1.setColorGroup(ColorGroup.BLUE);
        db1.setHousePrice(200);
        db1.setName("Park Place");
        db1.setRent(35);

        db2.setPrice(350);
        db2.setColorGroup(ColorGroup.BLUE);
        db2.setHousePrice(200);
        db2.setName("Dright Place");
        db2.setRent(35);

        db3.setPrice(400);
        db3.setColorGroup(ColorGroup.BLUE);
        db3.setHousePrice(200);
        db3.setName("Boardwalk");
        db3.setRent(50);

        rr1.setName("Reading Railroad");
        rr1.setBaseRent(rrBaseRent);
        rr1.setPrice(rrPrice);

        rr2.setName("Pennsylvania Railroad");
        rr2.setBaseRent(rrBaseRent);
        rr2.setPrice(rrPrice);

        rr3.setName("B. & O. RailRoad");
        rr3.setBaseRent(rrBaseRent);
        rr3.setPrice(rrPrice);

        rr4.setName("Short Line");
        rr4.setBaseRent(rrBaseRent);
        rr4.setPrice(rrPrice);

        UtilitySquare.setPrice(150);

        u1.setName("Electric Company");
        u2.setName("Water Works");

        super.addSquare(dp1);
        super.addSquare(cc1);
        super.addSquare(dp2);
        super.addSquare(dp3);
        super.addSquare(rr1);
        super.addSquare(lb1);
        super.addSquare(c1);
        super.addSquare(lb2);
        super.addSquare(lb3);
        super.addSquare(jail);
        super.addSquare(p1);
        super.addSquare(u1);
        super.addSquare(p2);
        super.addSquare(p3);
        super.addSquare(rr2);
        super.addSquare(o1);
        super.addSquare(cc2);
        super.addSquare(o2);
        super.addSquare(o3);
        super.addSquare(fp);
        super.addSquare(r1);
        super.addSquare(c2);
        super.addSquare(r2);
        super.addSquare(r3);
        super.addSquare(rr3);
        super.addSquare(y1);
        super.addSquare(y2);
        super.addSquare(u2);
        super.addSquare(y3);
        super.addSquare(goToJail);
        super.addSquare(g1);
        super.addSquare(g2);
        super.addSquare(cc3);
        super.addSquare(g3);
        super.addSquare(rr4);
        super.addSquare(c3);
        super.addSquare(db1);
        super.addSquare(db2);
        super.addSquare(db3);


}
