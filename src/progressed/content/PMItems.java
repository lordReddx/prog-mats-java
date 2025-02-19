package progressed.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;
import progressed.type.*;

public class PMItems implements ContentList{
    public static Item
    techtanite,
    
    missileShell, nukeShell,

    basicMissile, empMissile, recursiveMissile,

    basicNuke, clusterNuke, sentryNuke,

    basicSentryBox, strikeSentryBox, dashSentryBox;

    @Override
    public void load(){
        techtanite = new Item("techtanite", Color.valueOf("B0BAC0")){{
            cost = 1.6f;
        }};

        missileShell = new Item("missile-shell", Color.valueOf("FEB380"));

        nukeShell = new Item("nuke-shell", Color.valueOf("F58859"));

        basicMissile = new VisualItem("basic-missile", Color.valueOf("EAB678"), "prog-mats-strikedown-basic");

        empMissile = new VisualItem("emp-missile", Color.valueOf("6974C4"), "prog-mats-strikedown-emp");

        recursiveMissile = new VisualItem("recursive-missile", Color.valueOf("73D188"), "prog-mats-arbiter-cluster-frag");

        basicNuke = new VisualItem("basic-nuke", Color.valueOf("D4816B"), "prog-mats-arbiter-basic");

        clusterNuke = new VisualItem("cluster-nuke", Color.valueOf("62AE7F"), "prog-mats-arbiter-cluster");

        sentryNuke = new VisualItem("sentry-nuke", Color.valueOf("FEB380"), "prog-mats-arbiter-unit");

        basicSentryBox = new VisualItem("basic-sentry-box", Color.valueOf("C9A58F"), PMUnitTypes.basicSentry);
        
        strikeSentryBox = new VisualItem("strike-sentry-box", Color.valueOf("FFA665"), PMUnitTypes.strikeSentry);

        dashSentryBox = new VisualItem("dash-sentry-box", Color.valueOf("84F491"), PMUnitTypes.dashSentry);
    }
}