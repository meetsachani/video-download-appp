package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzqn extends zzco {
    @InterfaceC11300zs1
    public int[] i;
    @InterfaceC11300zs1
    public int[] j;

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void d(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j = j(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                int F = (zzeu.F(this.b.c) * i) + position;
                int i2 = this.b.c;
                if (i2 != 2) {
                    if (i2 == 4) {
                        j.putFloat(byteBuffer.getFloat(F));
                    } else {
                        throw new IllegalStateException("Unexpected encoding: " + i2);
                    }
                } else {
                    j.putShort(byteBuffer.getShort(F));
                }
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        j.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcl i(zzcl zzclVar) throws zzcm {
        boolean z;
        boolean z2;
        int[] iArr = this.i;
        if (iArr == null) {
            return zzcl.e;
        }
        int i = zzclVar.c;
        if (i != 2 && i != 4) {
            throw new zzcm("Unhandled input format:", zzclVar);
        }
        int i2 = zzclVar.b;
        if (i2 != iArr.length) {
            z = true;
        } else {
            z = false;
        }
        int i3 = 0;
        while (true) {
            int length = iArr.length;
            if (i3 < length) {
                int i4 = iArr[i3];
                if (i4 < i2) {
                    if (i4 != i3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z |= z2;
                    i3++;
                } else {
                    throw new zzcm("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", zzclVar);
                }
            } else if (z) {
                return new zzcl(zzclVar.a, length, i);
            } else {
                return zzcl.e;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void k() {
        this.j = this.i;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void m() {
        this.j = null;
        this.i = null;
    }

    public final void o(@InterfaceC11300zs1 int[] iArr) {
        this.i = iArr;
    }
}
