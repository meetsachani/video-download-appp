package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyInfo;

/* loaded from: assets/audience_network/classes2.dex */
public class I6 implements Parcelable.Creator<IcyInfo> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final IcyInfo createFromParcel(Parcel parcel) {
        return new IcyInfo(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final IcyInfo[] newArray(int i) {
        return new IcyInfo[i];
    }
}
