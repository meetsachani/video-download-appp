package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import o.C10323vs;
import o.C7640kv2;
import o.C8077mf;

/* loaded from: classes2.dex */
public final class zzalq implements zzakl {
    public final zzek a = new zzek();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;

    public zzalq(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.c = bArr[24];
            this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.e = true == C7640kv2.y.equals(zzeu.c(bArr, 43, bArr.length + (-43))) ? C10323vs.n : "sans-serif";
            int i = bArr[25] * C8077mf.x;
            this.g = i;
            boolean z = (bArr[0] & 32) != 0;
            this.b = z;
            if (z) {
                this.f = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
                return;
            } else {
                this.f = 0.85f;
                return;
            }
        }
        this.c = 0;
        this.d = -1;
        this.e = "sans-serif";
        this.b = false;
        this.f = 0.85f;
        this.g = -1;
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                    z = false;
                }
            } else {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
                }
                z = false;
            }
            if ((i & 4) == 0) {
                if (i7 == 0 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
                    return;
                }
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzakl
    public final void a(byte[] bArr, int i, int i2, zzakk zzakkVar, zzdk zzdkVar) {
        boolean z;
        String b;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zzek zzekVar = this.a;
        zzekVar.j(bArr, i + i2);
        zzekVar.l(i);
        int i12 = 1;
        int i13 = 0;
        int i14 = 2;
        if (zzekVar.u() >= 2) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        int K = zzekVar.K();
        if (K == 0) {
            b = "";
        } else {
            int w = zzekVar.w();
            Charset c = zzekVar.c();
            int w2 = zzekVar.w() - w;
            if (c == null) {
                c = StandardCharsets.UTF_8;
            }
            b = zzekVar.b(K - w2, c);
        }
        if (b.isEmpty()) {
            zzdkVar.b(new zzakd(zzfyc.F(), C10323vs.b, C10323vs.b));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b);
        int i15 = this.c;
        c(spannableStringBuilder, i15, 0, 0, spannableStringBuilder.length(), 16711680);
        int i16 = i15;
        int i17 = this.d;
        b(spannableStringBuilder, i17, -1, 0, spannableStringBuilder.length(), 16711680);
        int i18 = i17;
        String str = this.e;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.f;
        while (zzekVar.u() >= 8) {
            int w3 = zzekVar.w();
            int A = zzekVar.A();
            int A2 = zzekVar.A();
            if (A2 == 1937013100) {
                if (zzekVar.u() >= i14) {
                    z3 = i12;
                } else {
                    z3 = i13;
                }
                zzdc.d(z3);
                int K2 = zzekVar.K();
                int i19 = i13;
                while (i19 < K2) {
                    if (zzekVar.u() >= 12) {
                        z4 = i12;
                    } else {
                        z4 = i13;
                    }
                    zzdc.d(z4);
                    int K3 = zzekVar.K();
                    int K4 = zzekVar.K();
                    zzekVar.m(i14);
                    int i20 = K2;
                    int G = zzekVar.G();
                    zzekVar.m(i12);
                    int A3 = zzekVar.A();
                    if (K4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        i6 = i16;
                        StringBuilder sb = new StringBuilder();
                        i7 = i18;
                        sb.append("Truncating styl end (");
                        sb.append(K4);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        zzdx.f("Tx3gParser", sb.toString());
                        K4 = spannableStringBuilder.length();
                    } else {
                        i6 = i16;
                        i7 = i18;
                    }
                    if (K3 >= K4) {
                        zzdx.f("Tx3gParser", "Ignoring styl with start (" + K3 + ") >= end (" + K4 + ").");
                        i10 = i6;
                        i9 = i19;
                        i8 = i20;
                        i11 = i7;
                    } else {
                        i8 = i20;
                        i9 = i19;
                        int i21 = i6;
                        c(spannableStringBuilder, G, i21, K3, K4, 0);
                        i10 = i21;
                        i11 = i7;
                        b(spannableStringBuilder, A3, i11, K3, K4, 0);
                    }
                    K2 = i8;
                    i16 = i10;
                    i18 = i11;
                    i12 = 1;
                    i14 = 2;
                    i19 = i9 + 1;
                    i13 = 0;
                }
                i3 = i16;
                i4 = i18;
                i5 = i14;
            } else {
                i3 = i16;
                i4 = i18;
                if (A2 == 1952608120 && this.b) {
                    i5 = 2;
                    if (zzekVar.u() >= 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zzdc.d(z2);
                    int i22 = this.g;
                    String str2 = zzeu.a;
                    f = Math.max(0.0f, Math.min(zzekVar.K() / i22, 0.95f));
                } else {
                    i5 = 2;
                }
            }
            zzekVar.l(w3 + A);
            i16 = i3;
            i14 = i5;
            i18 = i4;
            i12 = 1;
            i13 = 0;
        }
        zzcs zzcsVar = new zzcs();
        zzcsVar.l(spannableStringBuilder);
        zzcsVar.e(f, 0);
        zzcsVar.f(0);
        zzdkVar.b(new zzakd(zzfyc.G(zzcsVar.p()), C10323vs.b, C10323vs.b));
    }
}
