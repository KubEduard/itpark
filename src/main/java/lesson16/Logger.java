package lesson16;

import lombok.SneakyThrows;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Logger implements Runnable {

    private static final String FORMAT_TEXT = "%s %s %s %s\n";
    private static final DateTimeFormatter FULL_DATE = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss");
    private int counter = 1;
    private final LogLevel level;
    private final String fileName;
    private final long currentTime = System.currentTimeMillis();

    public Logger(LogLevel level, String fileName) {
        this.level = level;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.printf("Начал работу поток %s\n", Thread.currentThread().getName());
        while (System.currentTimeMillis() <= currentTime + 60 * 1000) {
            try(FileWriter fw = new FileWriter(fileName, true)) {
                fw.write(generateString());
                Thread.sleep(new Random().nextInt(5_000));
            }catch (IOException | InterruptedException exception) {
                exception.printStackTrace();
                break;
            }
        }
    }

    private String generateString() {
        LocalDateTime now = LocalDateTime.now();
        return String.format(FORMAT_TEXT, FULL_DATE.format(now), level,
                Thread.currentThread().getName(), "Сообщение под номером " + counter++);
    }
}
