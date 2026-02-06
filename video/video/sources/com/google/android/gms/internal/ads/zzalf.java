package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C11253zg2;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzalf implements zzakl {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final zzek c = new zzek();

    @InterfaceC5056aJ2(otherwise = 2)
    public static float b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    public static long c(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 3600000;
        } else {
            j = 0;
        }
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong = j + (Long.parseLong(group2) * 60000);
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong2 = parseLong + (Long.parseLong(group3) * 1000);
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzakl
    public final void a(byte[] bArr, int i, int i2, zzakk zzakkVar, zzdk zzdkVar) {
        zzek zzekVar;
        String str;
        char c;
        char c2;
        int i3;
        zzcu p;
        zzalf zzalfVar = this;
        zzek zzekVar2 = zzalfVar.c;
        zzekVar2.j(bArr, i + i2);
        zzekVar2.l(i);
        Charset c3 = zzekVar2.c();
        if (c3 == null) {
            c3 = StandardCharsets.UTF_8;
        }
        while (true) {
            String T = zzekVar2.T(c3);
            if (T != null) {
                if (T.length() != 0) {
                    try {
                        Integer.parseInt(T);
                        zzek zzekVar3 = zzalfVar.c;
                        String T2 = zzekVar3.T(c3);
                        if (T2 == null) {
                            zzdx.f("SubripParser", "Unexpected end");
                            return;
                        }
                        Matcher matcher = d.matcher(T2);
                        if (matcher.matches()) {
                            long c4 = c(matcher, 1);
                            long c5 = c(matcher, 6);
                            StringBuilder sb = zzalfVar.a;
                            int i4 = 0;
                            sb.setLength(0);
                            ArrayList arrayList = zzalfVar.b;
                            arrayList.clear();
                            String T3 = zzekVar3.T(c3);
                            while (!TextUtils.isEmpty(T3)) {
                                if (sb.length() > 0) {
                                    sb.append("<br>");
                                }
                                String trim = T3.trim();
                                StringBuilder sb2 = new StringBuilder(trim);
                                Matcher matcher2 = e.matcher(trim);
                                int i5 = i4;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList.add(group);
                                    int start = matcher2.start() - i5;
                                    int length = group.length();
                                    sb2.replace(start, start + length, "");
                                    i5 += length;
                                    zzekVar2 = zzekVar2;
                                }
                                sb.append(sb2.toString());
                                T3 = zzekVar3.T(c3);
                                i4 = 0;
                            }
                            zzekVar = zzekVar2;
                            Spanned fromHtml = Html.fromHtml(sb.toString());
                            int i6 = 0;
                            while (true) {
                                if (i6 < arrayList.size()) {
                                    str = (String) arrayList.get(i6);
                                    if (!str.matches(C11253zg2.x)) {
                                        i6++;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            zzcs zzcsVar = new zzcs();
                            zzcsVar.l(fromHtml);
                            if (str == null) {
                                p = zzcsVar.p();
                            } else {
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals(C11253zg2.y)) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals(C11253zg2.A)) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals(C11253zg2.B)) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals(C11253zg2.D)) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals(C11253zg2.E)) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals(C11253zg2.G)) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                if (c != 0 && c != 1 && c != 2) {
                                    if (c != 3 && c != 4 && c != 5) {
                                        zzcsVar.i(1);
                                    } else {
                                        zzcsVar.i(2);
                                    }
                                } else {
                                    zzcsVar.i(0);
                                }
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals(C11253zg2.y)) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals(C11253zg2.z)) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals(C11253zg2.A)) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals(C11253zg2.E)) {
                                            c2 = 3;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals(C11253zg2.F)) {
                                            c2 = 4;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals(C11253zg2.G)) {
                                            c2 = 5;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    default:
                                        c2 = 65535;
                                        break;
                                }
                                if (c2 != 0 && c2 != 1) {
                                    if (c2 != 2) {
                                        if (c2 != 3 && c2 != 4 && c2 != 5) {
                                            zzcsVar.f(1);
                                        } else {
                                            zzcsVar.f(0);
                                        }
                                        zzcsVar.h(b(zzcsVar.b()));
                                        zzcsVar.e(b(zzcsVar.a()), 0);
                                        p = zzcsVar.p();
                                    } else {
                                        i3 = 2;
                                    }
                                } else {
                                    i3 = 2;
                                }
                                zzcsVar.f(i3);
                                zzcsVar.h(b(zzcsVar.b()));
                                zzcsVar.e(b(zzcsVar.a()), 0);
                                p = zzcsVar.p();
                            }
                            zzdkVar.b(new zzakd(zzfyc.G(p), c4, c5 - c4));
                        } else {
                            zzekVar = zzekVar2;
                            zzdx.f("SubripParser", "Skipping invalid timing: ".concat(T2));
                        }
                    } catch (NumberFormatException unused) {
                        zzekVar = zzekVar2;
                        zzdx.f("SubripParser", "Skipping invalid index: ".concat(T));
                    }
                } else {
                    zzekVar = zzekVar2;
                }
                zzalfVar = this;
                zzekVar2 = zzekVar;
            } else {
                return;
            }
        }
    }
}
