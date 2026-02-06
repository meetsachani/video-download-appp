package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zzgxx extends zzgxb {
    public static final Logger b = Logger.getLogger(zzgxx.class.getName());
    public static final boolean c = zzhbp.a();
    public static final /* synthetic */ int d = 0;
    public zzgxy a;

    private zzgxx() {
        throw null;
    }

    @Deprecated
    public static int D(int i, zzhad zzhadVar, zzhaw zzhawVar) {
        int e = e(i << 3);
        return e + e + ((zzgwt) zzhadVar).E0(zzhawVar);
    }

    public static int E(zzhad zzhadVar) {
        int O0 = zzhadVar.O0();
        return e(O0) + O0;
    }

    public static int b(zzhad zzhadVar, zzhaw zzhawVar) {
        int E0 = ((zzgwt) zzhadVar).E0(zzhawVar);
        return e(E0) + E0;
    }

    public static int c(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int d(String str) {
        int length;
        try {
            length = zzhbu.e(str);
        } catch (zzhbt unused) {
            length = str.getBytes(zzgzf.a).length;
        }
        return e(length) + length;
    }

    public static int e(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int f(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public abstract void A(int i) throws IOException;

    public abstract void B(int i, long j) throws IOException;

    public abstract void C(long j) throws IOException;

    @Override // com.google.android.gms.internal.ads.zzgxb
    public abstract void a(byte[] bArr, int i, int i2) throws IOException;

    public final void g() {
        if (n() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final void h(String str, zzhbt zzhbtVar) throws IOException {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhbtVar);
        byte[] bytes = str.getBytes(zzgzf.a);
        try {
            int length = bytes.length;
            A(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgxu(e);
        }
    }

    public abstract void j() throws IOException;

    public abstract void k(byte b2) throws IOException;

    public abstract void l(int i, boolean z) throws IOException;

    public abstract void m(int i, zzgxk zzgxkVar) throws IOException;

    public abstract int n();

    public abstract void o(int i, int i2) throws IOException;

    public abstract void p(int i) throws IOException;

    public abstract void q(int i, long j) throws IOException;

    public abstract void r(long j) throws IOException;

    public abstract void s(int i, int i2) throws IOException;

    public abstract void t(int i) throws IOException;

    public abstract void u(int i, zzhad zzhadVar, zzhaw zzhawVar) throws IOException;

    public abstract void v(int i, zzhad zzhadVar) throws IOException;

    public abstract void w(int i, zzgxk zzgxkVar) throws IOException;

    public abstract void x(int i, String str) throws IOException;

    public abstract void y(int i, int i2) throws IOException;

    public abstract void z(int i, int i2) throws IOException;

    public /* synthetic */ zzgxx(zzgxw zzgxwVar) {
    }
}
