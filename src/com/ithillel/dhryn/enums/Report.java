package com.ithillel.dhryn.enums;

public class Report extends Object implements Comparable<Report> {
    Seasons seasonDesc;
    String reportText;


    public Report(Seasons season, String reportText) {
        this.seasonDesc = season;
        this.reportText = reportText;
    }

    public String toString() {
        return reportText;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Report)) return false;
        Report that = (Report) obj;
        return (this.seasonDesc == that.seasonDesc)
                && (this.reportText.equals(that.reportText));
    }


    @Override
    public int hashCode() {
        return seasonDesc.ordinal() + 11 * reportText.hashCode();
    }


    @Override
    public int compareTo(Report obj) {
        Report that = (Report) obj;

        if (this.seasonDesc.getAvgtemp() > that.seasonDesc.getAvgtemp())
            return 1;
        if (this.seasonDesc.getAvgtemp() < that.seasonDesc.getAvgtemp())
            return -1;
        if (this.seasonDesc.getAvgtemp() == that.seasonDesc.getAvgtemp()) {
            if (this.reportText.hashCode() > that.reportText.hashCode())
                return 1;
            else
                return -1;

        }
        return 0;
    }
}
