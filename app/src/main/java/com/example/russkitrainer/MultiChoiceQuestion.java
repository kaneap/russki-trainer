package com.example.russkitrainer;

import android.os.Parcel;
import android.os.Parcelable;

public class MultiChoiceQuestion implements Parcelable {

    String prompt;
    String[] answers;

    protected MultiChoiceQuestion(Parcel in) {
    }

    public static final Creator<MultiChoiceQuestion> CREATOR = new Creator<MultiChoiceQuestion>() {
        @Override
        public MultiChoiceQuestion createFromParcel(Parcel in) {
            return new MultiChoiceQuestion(in);
        }

        @Override
        public MultiChoiceQuestion[] newArray(int size) {
            return new MultiChoiceQuestion[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
