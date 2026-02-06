package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzrq extends zzco {
    public int i;
    public boolean j;
    public int k;
    public long l;
    public byte[] n;
    public byte[] q;
    public int m = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f293o = 0;
    public int p = 0;

    public zzrq() {
        byte[] bArr = zzeu.b;
        this.n = bArr;
        this.q = bArr;
    }

    public static int s(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    public static final boolean v(byte b, byte b2) {
        if (Math.abs(s(b, b2)) > 1024) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void d(ByteBuffer byteBuffer) {
        boolean z;
        int limit;
        int i;
        boolean z2;
        int position;
        while (byteBuffer.hasRemaining() && !n()) {
            boolean z3 = true;
            if (this.k != 0) {
                if (this.f293o < this.n.length) {
                    z = true;
                } else {
                    z = false;
                }
                zzdc.f(z);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 < byteBuffer.limit()) {
                        if (v(byteBuffer.get(position2), byteBuffer.get(position2 - 1))) {
                            int i2 = this.i;
                            limit = i2 * (position2 / i2);
                            break;
                        }
                        position2 += 2;
                    } else {
                        limit = byteBuffer.limit();
                        break;
                    }
                }
                int position3 = limit - byteBuffer.position();
                int i3 = this.f293o;
                int i4 = this.p;
                int i5 = i3 + i4;
                int length = this.n.length;
                if (i5 < length) {
                    i = length - i5;
                } else {
                    i5 = i4 - (length - i3);
                    i = i3 - i5;
                }
                int min = Math.min(position3, i);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.n, i5, min);
                int i6 = this.p + min;
                this.p = i6;
                if (i6 <= this.n.length) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzdc.f(z2);
                if (limit >= limit2 || position3 >= i) {
                    z3 = false;
                }
                t(z3);
                if (z3) {
                    this.k = 0;
                    this.m = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.n.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (v(byteBuffer.get(limit4), byteBuffer.get(limit4 - 1))) {
                            int i7 = this.i;
                            position = ((limit4 / i7) * i7) + i7;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.k = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    j(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco, com.google.android.gms.internal.ads.zzcn
    public final boolean g() {
        if (super.g() && this.j) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcl i(zzcl zzclVar) throws zzcm {
        if (zzclVar.c == 2) {
            if (zzclVar.a == -1) {
                return zzcl.e;
            }
            return zzclVar;
        }
        throw new zzcm("Unhandled input format:", zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void k() {
        if (g()) {
            int i = this.b.b;
            this.i = i + i;
            int i2 = this.i;
            int r = ((r(100000L) / 2) / i2) * i2;
            int i3 = r + r;
            if (this.n.length != i3) {
                this.n = new byte[i3];
                this.q = new byte[i3];
            }
        }
        this.k = 0;
        this.l = 0L;
        this.m = 0;
        this.f293o = 0;
        this.p = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void l() {
        if (this.p > 0) {
            t(true);
            this.m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void m() {
        this.j = false;
        byte[] bArr = zzeu.b;
        this.n = bArr;
        this.q = bArr;
    }

    public final long o() {
        return this.l;
    }

    public final void p(boolean z) {
        this.j = z;
    }

    public final int q(int i) {
        boolean z = true;
        int r = ((r(2000000L) - this.m) * this.i) - (this.n.length >> 1);
        if (r < 0) {
            z = false;
        }
        zzdc.f(z);
        int i2 = this.i;
        return (((int) Math.min((i * 0.2f) + 0.5f, r)) / i2) * i2;
    }

    public final int r(long j) {
        return (int) ((j * this.b.a) / 1000000);
    }

    public final void t(boolean z) {
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4 = this.p;
        int length = this.n.length;
        boolean z4 = true;
        if (i4 != length) {
            if (z) {
                z = true;
            } else {
                return;
            }
        }
        if (this.m == 0) {
            if (z) {
                u(i4, 3);
                i2 = i4;
            } else {
                if (i4 >= (length >> 1)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zzdc.f(z3);
                i2 = this.n.length >> 1;
                u(i2, 0);
            }
            i = i2;
        } else {
            int i5 = length >> 1;
            int i6 = i4 - i5;
            if (z) {
                int q = q(i6) + (this.n.length >> 1);
                u(q, 2);
                int i7 = i5 + i6;
                i = q;
                i2 = i7;
            } else {
                int q2 = q(i6);
                u(q2, 1);
                i = q2;
                i2 = i6;
            }
        }
        if (i2 % this.i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzdc.g(z2, "bytesConsumed is not aligned to frame size: %s" + i2);
        if (i4 < i) {
            z4 = false;
        }
        zzdc.f(z4);
        this.p -= i2;
        int i8 = this.f293o + i2;
        this.f293o = i8;
        this.f293o = i8 % this.n.length;
        this.m = this.m + (i / this.i);
        this.l += (i2 - i) / i3;
    }

    public final void u(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        if (i == 0) {
            return;
        }
        boolean z4 = true;
        if (this.p >= i) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        if (i2 == 2) {
            int i4 = this.f293o;
            int i5 = this.p;
            int i6 = i4 + i5;
            byte[] bArr = this.n;
            int length = bArr.length;
            if (i6 <= length) {
                System.arraycopy(bArr, i6 - i, this.q, 0, i);
            } else {
                int i7 = i5 - (length - i4);
                if (i7 >= i) {
                    System.arraycopy(bArr, i7 - i, this.q, 0, i);
                } else {
                    int i8 = i - i7;
                    System.arraycopy(bArr, length - i8, this.q, 0, i8);
                    System.arraycopy(this.n, 0, this.q, i8, i7);
                }
            }
        } else {
            int i9 = this.f293o;
            int i10 = i9 + i;
            byte[] bArr2 = this.n;
            int length2 = bArr2.length;
            if (i10 <= length2) {
                System.arraycopy(bArr2, i9, this.q, 0, i);
            } else {
                int i11 = length2 - i9;
                System.arraycopy(bArr2, i9, this.q, 0, i11);
                System.arraycopy(this.n, 0, this.q, i11, i - i11);
            }
        }
        if (i % this.i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzdc.e(z2, "sizeToOutput is not aligned to frame size: " + i);
        if (this.f293o < this.n.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzdc.f(z3);
        byte[] bArr3 = this.q;
        String str = "byteOutput size is not aligned to frame size " + i;
        if (i % this.i != 0) {
            z4 = false;
        }
        zzdc.e(z4, str);
        if (i2 != 3) {
            for (int i12 = 0; i12 < i; i12 += 2) {
                int i13 = i12 + 1;
                int s = s(bArr3[i13], bArr3[i12]);
                if (i2 == 0) {
                    i3 = ((((i12 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i12) / (i - 1)) / 1000);
                    }
                }
                int i14 = (s * i3) / 100;
                if (i14 >= 32767) {
                    bArr3[i12] = -1;
                    bArr3[i13] = Byte.MAX_VALUE;
                } else if (i14 <= -32768) {
                    bArr3[i12] = 0;
                    bArr3[i13] = Byte.MIN_VALUE;
                } else {
                    bArr3[i12] = (byte) (i14 & 255);
                    bArr3[i13] = (byte) (i14 >> 8);
                }
            }
        }
        j(i).put(bArr3, 0, i).flip();
    }
}
