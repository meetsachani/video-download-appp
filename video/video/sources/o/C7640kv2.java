package o;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;
import o.C7284jS;

@Deprecated
/* renamed from: o.kv2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7640kv2 extends AbstractC5012a82 {
    public static final int A = 2;
    public static final int B = 12;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 4;
    public static final int F = 16711680;
    public static final int G = 0;
    public static final int H = 0;
    public static final int I = -1;
    public static final String J = "sans-serif";
    public static final float K = 0.85f;
    public static final String v = "Tx3gDecoder";
    public static final int w = 1937013100;
    public static final int x = 1952608120;
    public static final String y = "Serif";
    public static final int z = 8;

    /* renamed from: o  reason: collision with root package name */
    public final C3012Fy1 f794o;
    public final boolean p;
    public final int q;
    public final int r;
    public final String s;
    public final float t;
    public final int u;

    public C7640kv2(List<byte[]> list) {
        super(v);
        this.f794o = new C3012Fy1();
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.q = bArr[24];
            this.r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.s = y.equals(TD2.O(bArr, 43, bArr.length - 43)) ? C10323vs.n : "sans-serif";
            int i = bArr[25] * C8077mf.x;
            this.u = i;
            boolean z2 = (bArr[0] & 32) != 0;
            this.p = z2;
            if (z2) {
                this.t = TD2.v(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
                return;
            } else {
                this.t = 0.85f;
                return;
            }
        }
        this.q = 0;
        this.r = -1;
        this.s = "sans-serif";
        this.p = false;
        this.t = 0.85f;
        this.u = -1;
    }

    public static void D(boolean z2) throws C4217Sg2 {
        if (z2) {
            return;
        }
        throw new C4217Sg2("Unexpected subtitle format.");
    }

    public static void E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void F(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3;
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z4 = true;
            if ((i & 1) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i & 2) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z4 = false;
            }
            if (z4) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z4 && !z2 && !z3) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    public static void G(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    public static String H(C3012Fy1 c3012Fy1) throws C4217Sg2 {
        boolean z2;
        if (c3012Fy1.a() >= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        D(z2);
        int R = c3012Fy1.R();
        if (R == 0) {
            return "";
        }
        int f = c3012Fy1.f();
        Charset T = c3012Fy1.T();
        int f2 = R - (c3012Fy1.f() - f);
        if (T == null) {
            T = KB.c;
        }
        return c3012Fy1.J(f2, T);
    }

    @Override // o.AbstractC5012a82
    public InterfaceC4020Qg2 A(byte[] bArr, int i, boolean z2) throws C4217Sg2 {
        this.f794o.W(bArr, i);
        String H2 = H(this.f794o);
        if (H2.isEmpty()) {
            return C7883lv2.Y;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(H2);
        F(spannableStringBuilder, this.q, 0, 0, spannableStringBuilder.length(), 16711680);
        E(spannableStringBuilder, this.r, -1, 0, spannableStringBuilder.length(), 16711680);
        G(spannableStringBuilder, this.s, 0, spannableStringBuilder.length());
        float f = this.t;
        while (this.f794o.a() >= 8) {
            int f2 = this.f794o.f();
            int s = this.f794o.s();
            int s2 = this.f794o.s();
            boolean z3 = true;
            if (s2 == 1937013100) {
                if (this.f794o.a() < 2) {
                    z3 = false;
                }
                D(z3);
                int R = this.f794o.R();
                for (int i2 = 0; i2 < R; i2++) {
                    C(this.f794o, spannableStringBuilder);
                }
            } else if (s2 == 1952608120 && this.p) {
                if (this.f794o.a() < 2) {
                    z3 = false;
                }
                D(z3);
                f = TD2.v(this.f794o.R() / this.u, 0.0f, 0.95f);
            }
            this.f794o.Y(f2 + s);
        }
        return new C7883lv2(new C7284jS.c().A(spannableStringBuilder).t(f, 0).u(0).a());
    }

    public final void C(C3012Fy1 c3012Fy1, SpannableStringBuilder spannableStringBuilder) throws C4217Sg2 {
        boolean z2;
        if (c3012Fy1.a() >= 12) {
            z2 = true;
        } else {
            z2 = false;
        }
        D(z2);
        int R = c3012Fy1.R();
        int R2 = c3012Fy1.R();
        c3012Fy1.Z(2);
        int L = c3012Fy1.L();
        c3012Fy1.Z(1);
        int s = c3012Fy1.s();
        if (R2 > spannableStringBuilder.length()) {
            I31.n(v, "Truncating styl end (" + R2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            R2 = spannableStringBuilder.length();
        }
        int i = R2;
        if (R >= i) {
            I31.n(v, "Ignoring styl with start (" + R + ") >= end (" + i + ").");
            return;
        }
        F(spannableStringBuilder, L, this.q, R, i, 0);
        E(spannableStringBuilder, s, this.r, R, i, 0);
    }
}
