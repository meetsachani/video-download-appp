package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes2.dex */
final class zzts implements zztr {
    private zzts() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final MediaCodecInfo z(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public /* synthetic */ zzts(zztv zztvVar) {
    }
}
