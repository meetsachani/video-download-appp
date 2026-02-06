package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterTocFrame;

/* loaded from: assets/audience_network/classes2.dex */
public class IB implements Parcelable.Creator<ChapterTocFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final ChapterTocFrame createFromParcel(Parcel parcel) {
        return new ChapterTocFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final ChapterTocFrame[] newArray(int i) {
        return new ChapterTocFrame[i];
    }
}
