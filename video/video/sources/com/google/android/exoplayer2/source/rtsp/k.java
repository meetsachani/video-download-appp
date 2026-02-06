package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.a;
import o.SV1;

@Deprecated
/* loaded from: classes2.dex */
public final class k implements a.InterfaceC0095a {
    public static final int b = 2;
    public final long a;

    public k(long j) {
        this.a = j;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a.InterfaceC0095a
    public a a(int i) {
        j jVar = new j(this.a);
        jVar.a(SV1.a(i * 2));
        return jVar;
    }
}
