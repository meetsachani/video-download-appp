package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;
import o.C6566gU0;

/* loaded from: classes2.dex */
public final class zzark extends zzhfe {
    public Date e1;
    public Date f1;
    public long g1;
    public long h1;
    public double i1;
    public float j1;
    public zzhfo k1;
    public long l1;

    public zzark() {
        super("mvhd");
        this.i1 = 1.0d;
        this.j1 = 1.0f;
        this.k1 = zzhfo.j;
    }

    @Override // com.google.android.gms.internal.ads.zzhfc
    public final void c(ByteBuffer byteBuffer) {
        g(byteBuffer);
        if (f() == 1) {
            this.e1 = zzhfj.a(zzarg.f(byteBuffer));
            this.f1 = zzhfj.a(zzarg.f(byteBuffer));
            this.g1 = zzarg.e(byteBuffer);
            this.h1 = zzarg.f(byteBuffer);
        } else {
            this.e1 = zzhfj.a(zzarg.e(byteBuffer));
            this.f1 = zzhfj.a(zzarg.e(byteBuffer));
            this.g1 = zzarg.e(byteBuffer);
            this.h1 = zzarg.e(byteBuffer);
        }
        this.i1 = zzarg.b(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.j1 = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        zzarg.d(byteBuffer);
        zzarg.e(byteBuffer);
        zzarg.e(byteBuffer);
        double b = zzarg.b(byteBuffer);
        double b2 = zzarg.b(byteBuffer);
        double a = zzarg.a(byteBuffer);
        this.k1 = new zzhfo(b, b2, zzarg.b(byteBuffer), zzarg.b(byteBuffer), a, zzarg.a(byteBuffer), zzarg.a(byteBuffer), zzarg.b(byteBuffer), zzarg.b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.l1 = zzarg.e(byteBuffer);
    }

    public final long h() {
        return this.h1;
    }

    public final long i() {
        return this.g1;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.e1 + ";modificationTime=" + this.f1 + ";timescale=" + this.g1 + ";duration=" + this.h1 + ";rate=" + this.i1 + ";volume=" + this.j1 + ";matrix=" + this.k1 + ";nextTrackId=" + this.l1 + C6566gU0.g;
    }
}
