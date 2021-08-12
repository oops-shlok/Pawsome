package com.example.deltatask3;

import android.os.Parcel;
import android.os.Parcelable;

public class Height implements Parcelable {
    private String metric;
    private String imperial;

    protected Height(Parcel in) {
        metric = in.readString();
        imperial = in.readString();
    }

    public static final Creator<Height> CREATOR = new Creator<Height>() {
        @Override
        public Height createFromParcel(Parcel in) {
            return new Height(in);
        }

        @Override
        public Height[] newArray(int size) {
            return new Height[size];
        }
    };

    public String getMetric() {
        return metric;
    }
    public String getImperial() {
        return imperial;
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
