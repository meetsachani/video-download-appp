package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import o.InterfaceC11300zs1;
import o.InterfaceC8557od0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zztt implements zztr {
    public final int a;
    @InterfaceC11300zs1
    public MediaCodecInfo[] b;

    public zztt(boolean z, boolean z2, boolean z3) {
        int i = 1;
        if (!z && !z2 && !z3) {
            i = 0;
        }
        this.a = i;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final int a() {
        e();
        return this.b.length;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final boolean d() {
        return true;
    }

    @InterfaceC8557od0({"mediaCodecInfos"})
    public final void e() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final MediaCodecInfo z(int i) {
        e();
        return this.b[i];
    }
}
