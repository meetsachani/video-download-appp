package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import o.C3503Kz;
import o.InterfaceC8148mw2;

/* loaded from: classes2.dex */
public final class zzhav extends zzgxk {
    public static final int[] c1 = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, C3503Kz.h0, 233, 377, InterfaceC8148mw2.e.z, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final zzgxk Y0;
    public final int Z;
    public final zzgxk Z0;
    public final int a1;
    public final int b1;

    public static zzgxk d0(zzgxk zzgxkVar, zzgxk zzgxkVar2) {
        if (zzgxkVar2.i() == 0) {
            return zzgxkVar;
        }
        if (zzgxkVar.i() == 0) {
            return zzgxkVar2;
        }
        int i = zzgxkVar.i() + zzgxkVar2.i();
        if (i < 128) {
            return e0(zzgxkVar, zzgxkVar2);
        }
        if (zzgxkVar instanceof zzhav) {
            zzhav zzhavVar = (zzhav) zzgxkVar;
            zzgxk zzgxkVar3 = zzhavVar.Z0;
            if (zzgxkVar3.i() + zzgxkVar2.i() < 128) {
                return new zzhav(zzhavVar.Y0, e0(zzgxkVar3, zzgxkVar2));
            }
            zzgxk zzgxkVar4 = zzhavVar.Y0;
            if (zzgxkVar4.k() > zzgxkVar3.k() && zzhavVar.b1 > zzgxkVar2.k()) {
                return new zzhav(zzgxkVar4, new zzhav(zzgxkVar3, zzgxkVar2));
            }
        }
        if (i >= f0(Math.max(zzgxkVar.k(), zzgxkVar2.k()) + 1)) {
            return new zzhav(zzgxkVar, zzgxkVar2);
        }
        return zzhas.a(new zzhas(null), zzgxkVar, zzgxkVar2);
    }

    public static zzgxk e0(zzgxk zzgxkVar, zzgxk zzgxkVar2) {
        int i = zzgxkVar.i();
        int i2 = zzgxkVar2.i();
        byte[] bArr = new byte[i + i2];
        zzgxkVar.a0(bArr, 0, 0, i);
        zzgxkVar2.a0(bArr, 0, i, i2);
        return new zzgxh(bArr);
    }

    public static int f0(int i) {
        int[] iArr = c1;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final zzgxq B() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        zzhat zzhatVar = new zzhat(this, null);
        while (zzhatVar.hasNext()) {
            arrayList.add(zzhatVar.next().F());
        }
        int i = zzgxq.e;
        boolean z = false;
        int i2 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z |= true;
            } else if (byteBuffer.isDirect()) {
                z |= true;
            } else {
                z |= true;
            }
        }
        if (z) {
            return new zzgxm(arrayList, i2, true, null);
        }
        return zzgxq.f(new zzgzi(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final String D(Charset charset) {
        return new String(d(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final ByteBuffer F() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final void G(zzgxb zzgxbVar) throws IOException {
        this.Y0.G(zzgxbVar);
        this.Z0.G(zzgxbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final boolean H() {
        zzgxk zzgxkVar = this.Y0;
        zzgxk zzgxkVar2 = this.Z0;
        if (zzgxkVar2.r(zzgxkVar.r(0, 0, this.a1), 0, zzgxkVar2.i()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final zzgxf L() {
        return new zzhar(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final byte e(int i) {
        zzgxk.Y(i, this.Z);
        return f(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final boolean equals(Object obj) {
        boolean b0;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgxk)) {
            return false;
        }
        zzgxk zzgxkVar = (zzgxk) obj;
        int i = this.Z;
        if (i != zzgxkVar.i()) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int K = K();
        int K2 = zzgxkVar.K();
        if (K != 0 && K2 != 0 && K != K2) {
            return false;
        }
        zzhat zzhatVar = new zzhat(this, null);
        zzgxg next = zzhatVar.next();
        zzhat zzhatVar2 = new zzhat(zzgxkVar, null);
        zzgxg next2 = zzhatVar2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = next.i() - i2;
            int i6 = next2.i() - i3;
            int min = Math.min(i5, i6);
            if (i2 == 0) {
                b0 = next.b0(next2, i3, min);
            } else {
                b0 = next2.b0(next, i2, min);
            }
            if (!b0) {
                return false;
            }
            i4 += min;
            if (i4 >= i) {
                if (i4 == i) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == i5) {
                next = zzhatVar.next();
                i2 = 0;
            } else {
                i2 += min;
            }
            if (min == i6) {
                next2 = zzhatVar2.next();
                i3 = 0;
            } else {
                i3 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final byte f(int i) {
        int i2 = this.a1;
        if (i < i2) {
            return this.Y0.f(i);
        }
        return this.Z0.f(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final int i() {
        return this.Z;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzhar(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final void j(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.a1;
        if (i4 <= i5) {
            this.Y0.j(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.Z0.j(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.Y0.j(bArr, i, i2, i6);
            this.Z0.j(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final int k() {
        return this.b1;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final boolean l() {
        if (this.Z >= f0(this.b1)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final int p(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.a1;
        if (i4 <= i5) {
            return this.Y0.p(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.Z0.p(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.Z0.p(this.Y0.p(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final int r(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.a1;
        if (i4 <= i5) {
            return this.Y0.r(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.Z0.r(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.Z0.r(this.Y0.r(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final zzgxk w(int i, int i2) {
        int i3 = this.Z;
        int J = zzgxk.J(i, i2, i3);
        if (J == 0) {
            return zzgxk.Y;
        }
        if (J == i3) {
            return this;
        }
        int i4 = this.a1;
        if (i2 <= i4) {
            return this.Y0.w(i, i2);
        }
        int i5 = i2 - i4;
        if (i >= i4) {
            return this.Z0.w(i - i4, i5);
        }
        zzgxk zzgxkVar = this.Y0;
        return new zzhav(zzgxkVar.w(i, zzgxkVar.i()), this.Z0.w(0, i5));
    }

    public zzhav(zzgxk zzgxkVar, zzgxk zzgxkVar2) {
        this.Y0 = zzgxkVar;
        this.Z0 = zzgxkVar2;
        int i = zzgxkVar.i();
        this.a1 = i;
        this.Z = i + zzgxkVar2.i();
        this.b1 = Math.max(zzgxkVar.k(), zzgxkVar2.k()) + 1;
    }
}
