package Sem2.Sample2;

public class Championship {
    public static void main(String[] args) {

        Obstracte[] obstractes = {
                new Track(1200),
                new Wall(40),
                new Track(2000),
                new Wall(150),
                new Track(3000),
                new Wall(250)
        };

        Runner[] runners = {
                new Cat("Барсик", 1500, 200),
                new Cat("Макс", 1700, 100),
                new Robot("R2D2", 2500, 240),
                new Robot("R3PO", 4000, 100),
                new Human("Вася", 2300, 250),
                new Human("Петя", 3000, 260)
        };

        for (Runner runner : runners) {
            for (Obstracte obstracte : obstractes) {
                if (obstracte instanceof Track) {
                   if (!runner.run(obstracte.getLength())) {
                       break;
                   }
                } else if (obstracte instanceof Wall) {
                    if(!runner.jump(obstracte.getHeight())){
                        break;
                    }
                }
            }

        }

    }
}
