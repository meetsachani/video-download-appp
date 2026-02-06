package com.facebook.ads.androidx.media3.extractor.metadata.vorbis;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0807Ie;

/* loaded from: assets/audience_network/classes2.dex */
public final class VorbisComment extends com.facebook.ads.androidx.media3.extractor.metadata.flac.VorbisComment {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C0807Ie();

    public VorbisComment(Parcel parcel) {
        super(parcel);
    }

    public VorbisComment(String str, String str2) {
        super(str, str2);
    }
}
