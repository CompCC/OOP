package Sem7.adapter;

public class Program {
    public static void main(String[] args) {

        MS200 ms200 = new MS200(15);
        ST550Info st550Info = new ST550Info(527);

        MeteoStore meteoStore = new MeteoStore();
        meteoStore.save(ms200);
        meteoStore.save(new AdpterST550Info(st550Info));

    }
}
