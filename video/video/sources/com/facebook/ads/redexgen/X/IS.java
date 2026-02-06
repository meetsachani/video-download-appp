package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;

/* loaded from: assets/audience_network/classes2.dex */
public class IS implements Parcelable.Creator<SmtaMetadataEntry> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final SmtaMetadataEntry createFromParcel(Parcel parcel) {
        return new SmtaMetadataEntry(parcel, (IS) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final SmtaMetadataEntry[] newArray(int i) {
        return new SmtaMetadataEntry[i];
    }
}
