package o;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10833xx0;
import o.KZ1;

@Deprecated
/* loaded from: classes2.dex */
public final class BK2 implements InterfaceC4324Tj0 {
    public static final Pattern j = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern k = Pattern.compile("MPEGTS:(-?\\d+)");
    public static final int l = 6;
    public static final int m = 9;
    @InterfaceC11300zs1
    public final String d;
    public final C10071up2 e;
    public InterfaceC4518Vj0 g;
    public int i;
    public final C3012Fy1 f = new C3012Fy1();
    public byte[] h = new byte[1024];

    public BK2(@InterfaceC11300zs1 String str, C10071up2 c10071up2) {
        this.d = str;
        this.e = c10071up2;
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.g = interfaceC4518Vj0;
        interfaceC4518Vj0.p(new KZ1.b(C10323vs.b));
    }

    @HS1({"output"})
    public final InterfaceC10568wr2 c(long j2) {
        InterfaceC10568wr2 b = this.g.b(0, 3);
        b.a(new C10833xx0.b().g0(C4128Rj1.m0).X(this.d).k0(j2).G());
        this.g.n();
        return b;
    }

    @Override // o.InterfaceC4324Tj0
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        interfaceC4421Uj0.h(this.h, 0, 6, false);
        this.f.W(this.h, 6);
        if (CK2.b(this.f)) {
            return true;
        }
        interfaceC4421Uj0.h(this.h, 6, 3, false);
        this.f.W(this.h, 9);
        return CK2.b(this.f);
    }

    @HS1({"output"})
    public final void e() throws C3989Py1 {
        C3012Fy1 c3012Fy1 = new C3012Fy1(this.h);
        CK2.e(c3012Fy1);
        long j2 = 0;
        long j3 = 0;
        for (String u = c3012Fy1.u(); !TextUtils.isEmpty(u); u = c3012Fy1.u()) {
            if (u.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = j.matcher(u);
                if (matcher.find()) {
                    Matcher matcher2 = k.matcher(u);
                    if (matcher2.find()) {
                        j3 = CK2.d((String) C9542sf.g(matcher.group(1)));
                        j2 = C10071up2.g(Long.parseLong((String) C9542sf.g(matcher2.group(1))));
                    } else {
                        throw C3989Py1.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + u, null);
                    }
                } else {
                    throw C3989Py1.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + u, null);
                }
            }
        }
        Matcher a = CK2.a(c3012Fy1);
        if (a == null) {
            c(0L);
            return;
        }
        long d = CK2.d((String) C9542sf.g(a.group(1)));
        long b = this.e.b(C10071up2.k((j2 + d) - j3));
        InterfaceC10568wr2 c = c(b - d);
        this.f.W(this.h, this.i);
        c.e(this.f, this.i);
        c.b(b, 1, this.i, 0, null);
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        int length;
        C9542sf.g(this.g);
        int length2 = (int) interfaceC4421Uj0.getLength();
        int i = this.i;
        byte[] bArr = this.h;
        if (i == bArr.length) {
            if (length2 != -1) {
                length = length2;
            } else {
                length = bArr.length;
            }
            this.h = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.h;
        int i2 = this.i;
        int read = interfaceC4421Uj0.read(bArr2, i2, bArr2.length - i2);
        if (read != -1) {
            int i3 = this.i + read;
            this.i = i3;
            if (length2 == -1 || i3 != length2) {
                return 0;
            }
        }
        e();
        return -1;
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
    }
}
