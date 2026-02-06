package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import o.C10323vs;
import o.C4128Rj1;
import o.HS1;

/* loaded from: classes2.dex */
public final class zzafa implements zzadn {
    public static final int[] p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] q = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] r;
    public static final byte[] s;
    public final byte[] a;
    public final zzaet b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public zzadq j;
    public zzaet k;
    public zzaet l;
    public zzaem m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f198o;

    static {
        String str = zzeu.a;
        Charset charset = StandardCharsets.UTF_8;
        r = "#!AMR\n".getBytes(charset);
        s = "#!AMR-WB\n".getBytes(charset);
    }

    public zzafa() {
        throw null;
    }

    public static boolean b(zzado zzadoVar, byte[] bArr) throws IOException {
        zzadoVar.j();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzadoVar.J(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[Catch: EOFException -> 0x00b0, TryCatch #0 {EOFException -> 0x00b0, blocks: (B:5:0x0008, B:7:0x0017, B:21:0x0035, B:23:0x003e, B:22:0x003a, B:40:0x007c, B:41:0x0099, B:42:0x009a, B:43:0x00af), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a A[Catch: EOFException -> 0x00b0, TryCatch #0 {EOFException -> 0x00b0, blocks: (B:5:0x0008, B:7:0x0017, B:21:0x0035, B:23:0x003e, B:22:0x003a, B:40:0x007c, B:41:0x0099, B:42:0x009a, B:43:0x00af), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @HS1({"realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(zzado zzadoVar) throws IOException {
        int i;
        int i2 = this.f;
        if (i2 == 0) {
            try {
                zzadoVar.j();
                byte[] bArr = this.a;
                zzadoVar.J(bArr, 0, 1);
                byte b = bArr[0];
                if ((b & 131) <= 0) {
                    boolean z = this.c;
                    int i3 = (b >> 3) & 15;
                    if (z) {
                        if (i3 >= 10) {
                            if (i3 > 13) {
                            }
                        }
                        if (!z) {
                            i2 = q[i3];
                        } else {
                            i2 = p[i3];
                        }
                        this.e = i2;
                        this.f = i2;
                        i = this.g;
                        if (i == -1) {
                            this.g = i2;
                            i = i2;
                        }
                        if (i == i2) {
                            this.h++;
                        }
                    }
                    if (!z) {
                        if (i3 >= 12 && i3 <= 14) {
                        }
                        if (!z) {
                        }
                        this.e = i2;
                        this.f = i2;
                        i = this.g;
                        if (i == -1) {
                        }
                        if (i == i2) {
                        }
                    }
                    String str = "WB";
                    if (true != z) {
                        str = "NB";
                    }
                    throw zzaz.a("Illegal AMR " + str + " frame type " + i3, null);
                }
                throw zzaz.a("Invalid padding bits for frame header " + ((int) b), null);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int b2 = this.l.b(zzadoVar, i2, true);
        if (b2 == -1) {
            return -1;
        }
        int i4 = this.f - b2;
        this.f = i4;
        if (i4 > 0) {
            return 0;
        }
        this.l.c(this.d, 1, this.e, 0, null);
        this.d += 20000;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    public final boolean d(zzado zzadoVar) throws IOException {
        byte[] bArr = r;
        if (b(zzadoVar, bArr)) {
            this.c = false;
            zzadoVar.G(bArr.length);
            return true;
        }
        byte[] bArr2 = s;
        if (!b(zzadoVar, bArr2)) {
            return false;
        }
        this.c = true;
        zzadoVar.G(bArr2.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void e(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.n = j2;
        this.i = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return zzfyc.F();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean g(zzado zzadoVar) throws IOException {
        return d(zzadoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        this.j = zzadqVar;
        zzaet O = zzadqVar.O(0, 1);
        this.k = O;
        this.l = O;
        zzadqVar.N();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        String str;
        int i;
        int i2;
        zzdc.b(this.k);
        String str2 = zzeu.a;
        if (zzadoVar.e() == 0 && !d(zzadoVar)) {
            throw zzaz.a("Could not find AMR header.", null);
        }
        if (!this.f198o) {
            this.f198o = true;
            boolean z = this.c;
            String str3 = C4128Rj1.d0;
            if (true != z) {
                str = C4128Rj1.b0;
            } else {
                str = C4128Rj1.d0;
            }
            if (true != z) {
                str3 = C4128Rj1.c0;
            }
            if (true != z) {
                i = 8000;
            } else {
                i = 16000;
            }
            if (z) {
                i2 = q[8];
            } else {
                i2 = p[7];
            }
            zzaet zzaetVar = this.k;
            zzx zzxVar = new zzx();
            zzxVar.e(str);
            zzxVar.E(str3);
            zzxVar.t(i2);
            zzxVar.b(1);
            zzxVar.F(i);
            zzaetVar.e(zzxVar.K());
        }
        int a = a(zzadoVar);
        if (this.m == null) {
            zzael zzaelVar = new zzael(C10323vs.b, 0L);
            this.m = zzaelVar;
            this.j.P(zzaelVar);
        }
        if (a == -1) {
            return -1;
        }
        return 0;
    }

    public zzafa(int i) {
        this.a = new byte[1];
        this.g = -1;
        zzadj zzadjVar = new zzadj();
        this.b = zzadjVar;
        this.l = zzadjVar;
    }
}
