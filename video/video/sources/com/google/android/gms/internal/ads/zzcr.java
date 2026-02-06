package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzcr extends zzco {
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9 A[LOOP:6: B:38:0x00e9->B:39:0x00eb, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:17:0x003d, B:39:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 21) {
                    if (i3 != 22) {
                        if (i3 != 268435456) {
                            if (i3 != 1342177280) {
                                if (i3 != 1610612736) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                        ByteBuffer j = j(i2);
                        i = this.b.c;
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 21) {
                                    if (i != 22) {
                                        if (i != 268435456) {
                                            if (i != 1342177280) {
                                                if (i == 1610612736) {
                                                    while (position < limit) {
                                                        j.put(byteBuffer.get(position + 1));
                                                        j.put(byteBuffer.get(position));
                                                        position += 4;
                                                    }
                                                } else {
                                                    throw new IllegalStateException();
                                                }
                                            } else {
                                                while (position < limit) {
                                                    j.put(byteBuffer.get(position + 1));
                                                    j.put(byteBuffer.get(position));
                                                    position += 3;
                                                }
                                            }
                                        } else {
                                            while (position < limit) {
                                                j.put(byteBuffer.get(position + 1));
                                                j.put(byteBuffer.get(position));
                                                position += 2;
                                            }
                                        }
                                    } else {
                                        while (position < limit) {
                                            j.put(byteBuffer.get(position + 2));
                                            j.put(byteBuffer.get(position + 3));
                                            position += 4;
                                        }
                                    }
                                } else {
                                    while (position < limit) {
                                        j.put(byteBuffer.get(position + 1));
                                        j.put(byteBuffer.get(position + 2));
                                        position += 3;
                                    }
                                }
                            } else {
                                while (position < limit) {
                                    float f = byteBuffer.getFloat(position);
                                    String str = zzeu.a;
                                    short max = (short) (Math.max(-1.0f, Math.min(f, 1.0f)) * 32767.0f);
                                    j.put((byte) (max & 255));
                                    j.put((byte) ((max >> 8) & 255));
                                    position += 4;
                                }
                            }
                        } else {
                            while (position < limit) {
                                j.put((byte) 0);
                                j.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        j.flip();
                    }
                }
                i2 /= 3;
            }
            i2 /= 2;
            ByteBuffer j2 = j(i2);
            i = this.b.c;
            if (i != 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            j2.flip();
        }
        i2 += i2;
        ByteBuffer j22 = j(i2);
        i = this.b.c;
        if (i != 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        j22.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcl i(zzcl zzclVar) throws zzcm {
        int i = zzclVar.c;
        if (i != 3) {
            if (i != 2) {
                if (i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
                    throw new zzcm("Unhandled input format:", zzclVar);
                }
            } else {
                return zzcl.e;
            }
        }
        return new zzcl(zzclVar.a, zzclVar.b, 2);
    }
}
