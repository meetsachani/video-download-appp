package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzrs extends zzco {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m = zzeu.b;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public long f294o;

    @Override // com.google.android.gms.internal.ads.zzco, com.google.android.gms.internal.ads.zzcn
    public final ByteBuffer b() {
        int i;
        if (super.h() && (i = this.n) > 0) {
            j(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.b();
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.l);
            this.f294o += min / this.b.d;
            this.l -= min;
            byteBuffer.position(position + min);
            if (this.l <= 0) {
                int i2 = i - min;
                int length = (this.n + i2) - this.m.length;
                ByteBuffer j = j(length);
                int i3 = this.n;
                String str = zzeu.a;
                int max = Math.max(0, Math.min(length, i3));
                j.put(this.m, 0, max);
                int max2 = Math.max(0, Math.min(length - max, i2));
                byteBuffer.limit(byteBuffer.position() + max2);
                j.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i2 - max2;
                int i5 = this.n - max;
                this.n = i5;
                byte[] bArr = this.m;
                System.arraycopy(bArr, max, bArr, 0, i5);
                byteBuffer.get(this.m, this.n, i4);
                this.n += i4;
                j.flip();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco, com.google.android.gms.internal.ads.zzcn
    public final boolean h() {
        return super.h() && this.n == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcl i(zzcl zzclVar) throws zzcm {
        int i = zzclVar.c;
        if (i != 2 && i != 4) {
            throw new zzcm("Unhandled input format:", zzclVar);
        }
        this.k = true;
        if (this.i == 0 && this.j == 0) {
            return zzcl.e;
        }
        return zzclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void k() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void l() {
        int i;
        if (this.k) {
            if (this.n > 0) {
                this.f294o += i / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void m() {
        this.m = zzeu.b;
    }

    public final long o() {
        return this.f294o;
    }

    public final void p() {
        this.f294o = 0L;
    }

    public final void q(int i, int i2) {
        this.i = i;
        this.j = i2;
    }
}
