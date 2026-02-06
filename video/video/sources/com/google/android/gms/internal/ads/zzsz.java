package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import o.ES1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public interface zzsz {
    @InterfaceC11300zs1
    ByteBuffer A(int i);

    @InterfaceC11300zs1
    ByteBuffer S(int i);

    void Z(Bundle bundle);

    int a();

    boolean b(zzsy zzsyVar);

    MediaFormat c();

    void d(int i, int i2, int i3, long j, int i4);

    @ES1(23)
    void e(Surface surface);

    void f(int i, long j);

    void g(int i, int i2, zzhm zzhmVar, long j, int i3);

    void h(int i);

    @ES1(35)
    void i();

    void j();

    void k(int i, boolean z);

    int l(MediaCodec.BufferInfo bufferInfo);

    void m();
}
