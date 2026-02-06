package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import o.ES1;

@ES1(24)
/* loaded from: classes2.dex */
final class zzhk {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* bridge */ /* synthetic */ void a(zzhk zzhkVar, int i, int i2) {
        MediaCodec.CryptoInfo.Pattern pattern = zzhkVar.b;
        pattern.set(i, i2);
        zzhkVar.a.setPattern(pattern);
    }
}
