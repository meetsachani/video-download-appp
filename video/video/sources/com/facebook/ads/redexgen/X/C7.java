package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;

/* loaded from: assets/audience_network/classes2.dex */
public class C7 implements Parcelable.Creator<DownloadRequest> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final DownloadRequest createFromParcel(Parcel parcel) {
        return new DownloadRequest(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final DownloadRequest[] newArray(int i) {
        return new DownloadRequest[i];
    }
}
