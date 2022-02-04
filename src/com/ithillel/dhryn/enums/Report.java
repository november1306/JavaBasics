package com.ithillel.dhryn.enums;

public class Report implements Comparable<Report> {
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
        if (this.seasonDesc.getAvgtemp() > obj.seasonDesc.getAvgtemp())
            return 1;
        if (this.seasonDesc.getAvgtemp() < obj.seasonDesc.getAvgtemp())
            return -1;
        return 0;
    }
}
