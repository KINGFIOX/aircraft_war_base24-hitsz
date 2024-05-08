package config;

public class GameConfig {

    // final 是设置 不可变 变量

    public class Game {
        /**
         * 时间间隔(ms)，控制刷新频率
         */
        public static final int TIME_INTERVAL = 40;

        /**
         * 屏幕上，最多可以有多少敌人
         */
        public static final int ENEMY_MAX_NUMBER = 5;

        /**
         * 游戏周期，多少时间发射一次子弹
         */
        public static final int CYCLE_DURATION = 600;

        /**
         * 没多少分生成一次 boss
         */
        public static final int BOSS_EVERY_SCORE = 1000;

        /**
         *
         */
        public static final int HERO_HP = 1000;


        /**
         * hero 的子弹的威力
         */
        public static final int HERO_BULLET_POWER = 30;

        /**
         *
         */
        public static final int HERO_SHOOT_NUM = 4;

        public static final int HERO_BULLET_SPEED = 10;


    }

    public class Windows {
        /**
         *
         */
        public static final int WINDOW_WIDTH = 512;

        /**
         *
         */
        public static final int WINDOW_HEIGHT = 768;
    }

    public class Aircraft {

        /**
         * boss 掉落的物品数量
         */
        public static final int BOSS_DROP_NUMBER = 3;

        /**
         * boss 一次发送多少子弹
         */
        public static final int BOSS_SHOOT_NUMBER = 20;


        /**
         *
         */
        public static final int ELITE_SHOOT_NUMBER = 1;

        /**
         *
         */
        public static final int ELITE_PLUS_SHOOT_NUMBER = 3;

        /**
         *
         */
        public static final int ENEMY_BULLET_POWER = 10; // FIXME CONFIG

        public static final int MOB_HP = 30;


    }

}
