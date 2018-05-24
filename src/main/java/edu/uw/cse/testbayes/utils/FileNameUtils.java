package edu.uw.cse.testbayes.utils;

import java.io.File;

/**
 * Provides static methods for file and directory names
 */
public class FileNameUtils {

    /**
     * Generates the name of the log file
     * @param className name of the test class
     * @return String with the name of the log file
     */
    public static String createFileName(String className) {
        long timestamp = System.currentTimeMillis();
        String filename = "log-data" + File.separator + timestamp + "-" + className + "-" +
                System.getProperty("user.name") + ".txt";
        return filename;
    }

    /**
     * Gets the name of the directory in which log files are stored
     * @return String with the name of the directory
     */
    public static String getDirectoryName() {
        return "log-data" + File.separator;
    }
}
