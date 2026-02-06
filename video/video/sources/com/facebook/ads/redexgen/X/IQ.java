package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData;

/* loaded from: assets/audience_network/classes2.dex */
public class IQ implements Parcelable.Creator<SlowMotionData.Segment> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final SlowMotionData.Segment createFromParcel(Parcel parcel) {
        return new SlowMotionData.Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final SlowMotionData.Segment[] newArray(int i) {
        return new SlowMotionData.Segment[i];
    }
}
