package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame;

/* loaded from: assets/audience_network/classes2.dex */
public class IH implements Parcelable.Creator<MlltFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final MlltFrame createFromParcel(Parcel parcel) {
        return new MlltFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final MlltFrame[] newArray(int i) {
        return new MlltFrame[i];
    }
}
