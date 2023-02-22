package Assignment_9;

abstract class Instrument{
   abstract public void play();
}

class Piano extends Instrument{

    @Override
    public void play() {
        System.out.println("Piano is playing tan tan tan tan tan");
    }
}

class Flute extends Instrument{

    @Override
    public void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}

class Guitar extends Instrument{

    @Override
    public void play() {
        System.out.println("Guitar is playing tin tin tin tin tin");
    }
}
public class InstrumentAbstraction {
    public static void main(String[] args) {
        Instrument [] instruments = new Instrument[10];

        for(int i = 0 ; i<3 ; i++){
            instruments[i] = new Piano();

        }

        for(int i = 4; i<7 ; i++){
            instruments[i] = new Flute();
        }

        for(int i = 8; i<10; i++){
            instruments[i] = new Guitar();
        }

        for(int i = 0; i <10; i++){
            instruments[i].play();
        }
    }
}


/*
Piano is playing tan tan tan tan tan
Piano is playing tan tan tan tan tan
Piano is playing tan tan tan tan tan
Flute is playing toot toot toot toot
Flute is playing toot toot toot toot
Flute is playing toot toot toot toot
Flute is playing toot toot toot toot
Guitar is playing tin tin tin tin tin
Guitar is playing tin tin tin tin tin
Guitar is playing tin tin tin tin tin


 */