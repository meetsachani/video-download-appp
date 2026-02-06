package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzgzi extends InputStream {
    public Iterator X;
    public ByteBuffer Y;
    public int Y0;
    public int Z = 0;
    public int Z0;
    public boolean a1;
    public byte[] b1;
    public int c1;
    public long d1;

    public zzgzi(Iterable iterable) {
        this.X = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.Z++;
        }
        this.Y0 = -1;
        if (!d()) {
            this.Y = zzgzf.c;
            this.Y0 = 0;
            this.Z0 = 0;
            this.d1 = 0L;
        }
    }

    public final void a(int i) {
        int i2 = this.Z0 + i;
        this.Z0 = i2;
        if (i2 == this.Y.limit()) {
            d();
        }
    }

    public final boolean d() {
        ByteBuffer byteBuffer;
        do {
            this.Y0++;
            if (!this.X.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) this.X.next();
            this.Y = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.Z0 = this.Y.position();
        if (this.Y.hasArray()) {
            this.a1 = true;
            this.b1 = this.Y.array();
            this.c1 = this.Y.arrayOffset();
        } else {
            this.a1 = false;
            this.d1 = zzhbp.m(this.Y);
            this.b1 = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.Y0 == this.Z) {
            return -1;
        }
        if (this.a1) {
            int i = this.b1[this.Z0 + this.c1] & 255;
            a(1);
            return i;
        }
        int i2 = zzhbp.i(this.Z0 + this.d1) & 255;
        a(1);
        return i2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.Y0 == this.Z) {
            return -1;
        }
        int limit = this.Y.limit();
        int i3 = this.Z0;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.a1) {
            System.arraycopy(this.b1, i3 + this.c1, bArr, i, i2);
            a(i2);
            return i2;
        }
        int position = this.Y.position();
        this.Y.position(this.Z0);
        this.Y.get(bArr, i, i2);
        this.Y.position(position);
        a(i2);
        return i2;
    }
}
