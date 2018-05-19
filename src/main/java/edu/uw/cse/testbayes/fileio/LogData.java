package edu.uw.cse.testbayes.fileio;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.util.Map;

/**
 * Stores the data of a single Log File
 */
public class LogData {

    /**
     * The data stored with each test's method signature being the key and it's runtime being the double. The sign of
     * the double signifies whether the test failed or passed
     */
    private Map<String, Double> data;

    /**
     * Whether or not this test was a complete run
     */
    private boolean complete;

    /**
     * Gets the data of the log file
     *
     * @return Map with each test's method signature being the key and it's runtime being the double. The sign of
     * the double signifies whether the test failed or passed
     */
    public Map<String, Double> getData() {
        return data;
    }

    /**
     * Sets the data of the log file
     *
     * @param data Map with each test's method signature being the key and it's runtime being the double. The sign of
     * the double signifies whether the test failed or passed
     */
    public void setData(Map<String, Double> data) {
        this.data = data;
    }

    /**
     * Checks whether this run was a complete run
     *
     * @return true if and only if the test is complete. False otherwise
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * Sets whether this run was a complete run
     *
     * @param complete true if and only if the test is complete. False otherwise
     */
    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogData logData = (LogData) o;
        return complete == logData.complete &&
                Objects.equal(data, logData.data);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(data, complete);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("data", data)
                .add("complete", complete)
                .toString();
    }
}
