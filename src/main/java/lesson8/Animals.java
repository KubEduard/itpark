package lesson8;

public class Animals {

    private String animal;
    private String nickname;
    private double run;
    private double swim;
    private String voice;

    public Animals(){}

    public Animals(String animal, String nickname, double run, double swim, String voice) {
        this.animal = animal;
        this.nickname = nickname;
        this.run = run;
        this.swim = swim;
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "Животное : '" + animal + '\'' +
                ", кличка : '" + nickname + '\'' +
                ", может пробежать - " + run +
                ", проплыть - " + swim +
                ", и крикнуть - '" + voice + '\'' +
                '}';
    }

    public String getVoice() {
        return this.voice;
    }
}
