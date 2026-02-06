package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry;

/* loaded from: assets/audience_network/classes2.dex */
public class IM implements Parcelable.Creator<MdtaMetadataEntry> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final MdtaMetadataEntry createFromParcel(Parcel parcel) {
        return new MdtaMetadataEntry(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final MdtaMetadataEntry[] newArray(int i) {
        return new MdtaMetadataEntry[i];
    }
}
