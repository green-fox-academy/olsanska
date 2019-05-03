package bettingSystem;

public class Main {
    public static void main(String[] args) {
        Contestant first = new Contestant("first");
        Contestant s = new Contestant("s");
        Contestant t = new Contestant("t");
        Contestant f = new Contestant("f");

        Player a = new Player();
        Player b = new Player();
        Player c = new Player();

        Race myrace = new Race();

        myrace.contestantList.add(first);
        myrace.contestantList.add(s);
        myrace.contestantList.add(t);
        myrace.contestantList.add(f);

        myrace.playerList.add(a);
        myrace.playerList.add(b);
        myrace.playerList.add(c);

        myrace.startRace();





    }
}
