package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import o.C2638Cg0;
import o.C8077mf;

/* loaded from: classes2.dex */
public final class zzrp {
    public static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, C2638Cg0.s7, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, C8077mf.m, -103, 87, 83, 1, C8077mf.r, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public ByteBuffer a = zzcn.a;
    public int c = 0;
    public int b = 2;

    public static final void c(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byte b;
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        if (true != z) {
            b = 0;
        } else {
            b = 2;
        }
        byteBuffer.put(b);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(zzgbi.a(i2));
    }

    public final void a(zzhp zzhpVar, List list) {
        int i;
        ByteBuffer byteBuffer;
        int i2;
        ByteBuffer byteBuffer2 = zzhpVar.d;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - zzhpVar.d.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.b == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = zzhpVar.d;
        int position = byteBuffer3.position();
        int limit = byteBuffer3.limit();
        int i3 = limit - position;
        int i4 = (i3 + 255) / 255;
        int i5 = i4 + 27 + i3;
        if (this.b == 2) {
            if (bArr != null) {
                i = bArr.length + 28;
            } else {
                i = 47;
            }
            i5 += i + 44;
        } else {
            i = 0;
        }
        if (this.a.capacity() < i5) {
            this.a = ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.a.clear();
        }
        ByteBuffer byteBuffer4 = this.a;
        if (this.b == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i2 = 22;
                c(byteBuffer, 0L, 0, 1, true);
                int length = bArr.length;
                byteBuffer.put(zzgbi.a(length));
                byteBuffer.put(bArr);
                int i6 = length + 28;
                byteBuffer.putInt(22, zzeu.A(byteBuffer.array(), byteBuffer.arrayOffset(), i6, 0));
                byteBuffer.position(i6);
            } else {
                byteBuffer = byteBuffer4;
                i2 = 22;
                byteBuffer.put(d);
            }
            byteBuffer.put(e);
        } else {
            byteBuffer = byteBuffer4;
            i2 = 22;
        }
        int c = this.c + zzaei.c(byteBuffer3);
        this.c = c;
        int i7 = i2;
        ByteBuffer byteBuffer5 = byteBuffer;
        c(byteBuffer5, c, this.b, i4, false);
        for (int i8 = 0; i8 < i4; i8++) {
            if (i3 >= 255) {
                byteBuffer5.put((byte) -1);
                i3 -= 255;
            } else {
                byteBuffer5.put((byte) i3);
                i3 = 0;
            }
        }
        while (position < limit) {
            byteBuffer5.put(byteBuffer3.get(position));
            position++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.b == 2) {
            byteBuffer5.putInt(i + 66, zzeu.A(byteBuffer5.array(), byteBuffer5.arrayOffset() + i + 44, byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(i7, zzeu.A(byteBuffer5.array(), byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.b++;
        this.a = byteBuffer5;
        zzhpVar.b();
        zzhpVar.j(this.a.remaining());
        zzhpVar.d.put(this.a);
        zzhpVar.k();
    }

    public final void b() {
        this.a = zzcn.a;
        this.c = 0;
        this.b = 2;
    }
}
