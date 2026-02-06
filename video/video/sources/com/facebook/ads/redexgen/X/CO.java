package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements;

/* loaded from: assets/audience_network/classes2.dex */
public class CO implements Parcelable.Creator<Requirements> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final Requirements createFromParcel(Parcel parcel) {
        return new Requirements(parcel.readInt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final Requirements[] newArray(int i) {
        return new Requirements[i];
    }
}
