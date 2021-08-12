package com.example.deltatask3;

import android.os.Parcel;
import android.os.Parcelable;

public class Weight implements Parcelable {
    private String metric;
    private String imperial;

    protected Weight(Parcel in) {
        metric = in.readString();
        imperial = in.readString();
    }

    public static final Creator<Weight> CREATOR = new Creator<Weight>() {
        @Override
        public Weight createFromParcel(Parcel in) {
            return new Weight(in);
        }

        @Override
        public Weight[] newArray(int size) {
            return new Weight[size];
        }
    };

    public String getMetric() { return metric; }
    public String getImperial() {
        return imperial;
    }

    public Weight(String metric, String imperial) {
        this.metric = metric;
        this.imperial = imperial;
    }

    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(metric);
        dest.writeString(imperial);
    }
}
