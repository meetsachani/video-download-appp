package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;

/* loaded from: assets/audience_network/classes2.dex */
public class IN implements Parcelable.Creator<MotionPhotoMetadata> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final MotionPhotoMetadata createFromParcel(Parcel parcel) {
        return new MotionPhotoMetadata(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final MotionPhotoMetadata[] newArray(int i) {
        return new MotionPhotoMetadata[i];
    }
}
