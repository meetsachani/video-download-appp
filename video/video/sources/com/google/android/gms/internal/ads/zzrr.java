package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzrr extends zzco {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void o(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void d(ByteBuffer byteBuffer) {
        ByteBuffer j;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 != 21) {
            if (i3 != 22) {
                if (i3 != 1342177280) {
                    if (i3 == 1610612736) {
                        j = j(i2);
                        while (position < limit) {
                            o((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), j);
                            position += 4;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    j = j((i2 / 3) * 4);
                    while (position < limit) {
                        o(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), j);
                        position += 3;
                    }
                }
            } else {
                j = j(i2);
                while (position < limit) {
                    o((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), j);
                    position += 4;
                }
            }
        } else {
            j = j((i2 / 3) * 4);
            while (position < limit) {
                o(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), j);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcl i(zzcl zzclVar) throws zzcm {
        int i2 = zzclVar.c;
        String str = zzeu.a;
        if (i2 != 21 && i2 != 1342177280 && i2 != 22 && i2 != 1610612736) {
            if (i2 == 4) {
                return zzcl.e;
            }
            throw new zzcm("Unhandled input format:", zzclVar);
        }
        return new zzcl(zzclVar.a, zzclVar.b, 4);
    }
}
