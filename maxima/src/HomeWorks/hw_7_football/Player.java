package HomeWorks.hw_7_football;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }

    public Player() {
        int max = MAX_STAMINA;
        max -= 90;

        stamina =(int) (Math.random() * max) + 90;
        if (countPlayers < 6) {
            countPlayers++;
        } else if (countPlayers >= 6) {
            System.out.println("Мест нет");
        }
        //        this.stamina = (int) ((Math.random() * ++max) + 90);

    }

    /**
     * run() - Игрок бежит при вызове этого метода. Этот метод уменьшает выносливость на 1 при однократном вызове. Когда
     * выносливость достигает 0, игроку нужен отдых и он уходит с поля.
     * <p>
     * info() - выводит сообщение в зависимости от количества игроков на поле. Если игроков меньше 6, то выводит сообщение:
     * “Команды неполные. На поле еще есть ... свободных мест”, иначе: “На поле нет свободных мест”. Грамматикой русского языка
     * пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.
     */


    public void run() {

        if(stamina == MIN_STAMINA){
            System.out.println("Игрок покинул поле");
            countPlayers--;
            return;
        }
        stamina--;
        System.out.println("текущее состояние выносливости игрока: "+stamina);
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else if (countPlayers==0) {
            System.out.println("Поле пустое");
        } else if (countPlayers ==6) {
            System.out.println("Команды полные");
        }
    }
}
