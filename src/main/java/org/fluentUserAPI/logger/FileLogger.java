package org.fluentUserAPI.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

final class FileLogger implements LoggerInterface {

  private final Path logFilePath;

  public FileLogger(Path logFilePath) { this.logFilePath = logFilePath; }

  @Override
  public void log(String message) {
    try (FileWriter fileWriter = new FileWriter(logFilePath.toFile(), true)) {
      fileWriter.append(message);
      fileWriter.append("\n");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
