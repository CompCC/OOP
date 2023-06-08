package Sem2.Sample2;

public interface Runner {
    String getName();

    int getMaxJump();

    int getMaxRun();


    default boolean jump(int height) {
        if (height <= getMaxJump()) {
            System.out.printf("%s перепрыгнул препятствие на %d см\n", getName(), height);
            return true;
        } else {
            System.out.printf("%s не удалось перепрыгнуть препятствие %d см, но он смог прыгнуть на %d см\n", getName(), height, getMaxJump());
            return false;
        }
    }

    default boolean run(int length) {
        if (length <= getMaxRun()) {
            System.out.printf("%s пробежал по беговой дорожке %d метров\n", getName(), length);
            return true;
        } else {
            System.out.printf("%s не удалось пробежать по беговой дорожке %d метров, но он смог пробежать %d метров\n", getName(), length, getMaxRun());
            return false;
        }
    }
}
