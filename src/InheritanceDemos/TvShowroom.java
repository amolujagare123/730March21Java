package InheritanceDemos;

public /*final*/ class TvShowroom {

   /* final*/ void volumeControl()
    {
        System.out.println("TV Showroom Volume Control");
    }
    void channels()
    {
        System.out.println("TV Showrrom channels");
    }

    void settings()
    {
        System.out.println("TV Showrrom settings");
    }

}


class Onida extends TvShowroom {

    void volumeControl()
    {
        System.out.println("Onida Volume Control");
    }
    void channels()
    {
        System.out.println("Onida channels");
    }

    void settings()
    {
        System.out.println("Onida settings");
    }

}


class LG extends TvShowroom {

    void volumeControl()
    {
        System.out.println("LG Volume Control");
    }
    void channels()
    {
        System.out.println("LG channels");
    }

    void settings()
    {
        System.out.println("LG settings");
    }

}

class Samsung extends TvShowroom {

    void volumeControl()
    {
        System.out.println("Samsung Volume Control");
    }
    void channels()
    {
        System.out.println("Samsung channels");
    }

    void settings()
    {
        System.out.println("Samsung settings");
    }

}

class TestOverriding  {

    public static void main(String[] args) {

        TvShowroom ob = new TvShowroom();
        ob.channels();
        ob.volumeControl();
        ob.settings();

        ob = new Onida();
        ob.channels();
        ob.volumeControl();
        ob.settings();

        ob = new LG();
        ob.channels();
        ob.volumeControl();
        ob.settings();

        ob = new Samsung();
        ob.channels();
        ob.volumeControl();
        ob.settings();
    }


}


