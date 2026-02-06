package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.TimeSignalCommand;

/* renamed from: com.facebook.ads.redexgen.X.Ic  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0805Ic implements Parcelable.Creator<TimeSignalCommand> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final TimeSignalCommand createFromParcel(Parcel parcel) {
        return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final TimeSignalCommand[] newArray(int i) {
        return new TimeSignalCommand[i];
    }
}
