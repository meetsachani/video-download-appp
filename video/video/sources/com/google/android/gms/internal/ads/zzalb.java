package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10015ub2;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzalb implements zzakl {
    public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    @InterfaceC11300zs1
    public final zzala b;
    public final zzek c;
    public Map d;
    public float e;
    public float f;

    public zzalb() {
        this(null);
    }

    private static float b(int i) {
        if (i != 0) {
            if (i != 1) {
                return i != 2 ? -3.4028235E38f : 0.95f;
            }
            return 0.5f;
        }
        return 0.05f;
    }

    public static int c(long j, List list, List list2) {
        int i;
        ArrayList arrayList;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) list.get(size)).longValue() == j) {
                    return size;
                }
                if (((Long) list.get(size)).longValue() < j) {
                    i = size + 1;
                    break;
                }
            } else {
                i = 0;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList((Collection) list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    public static long d(String str) {
        Matcher matcher = g.matcher(str.trim());
        if (!matcher.matches()) {
            return C10323vs.b;
        }
        String group = matcher.group(1);
        String str2 = zzeu.a;
        return (Long.parseLong(group) * 3600000000L) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void a(byte[] bArr, int i, int i2, zzakk zzakkVar, zzdk zzdkVar) {
        zzala zzalaVar;
        Charset charset;
        zzala zzalaVar2;
        zzek zzekVar;
        zzale zzaleVar;
        float f;
        int i3;
        Layout.Alignment alignment;
        int i4;
        int i5;
        int i6;
        Integer num;
        int i7;
        zzalb zzalbVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zzek zzekVar2 = zzalbVar.c;
        zzekVar2.j(bArr, i + i2);
        zzekVar2.l(i);
        Charset c = zzekVar2.c();
        if (c == null) {
            c = StandardCharsets.UTF_8;
        }
        if (!zzalbVar.a) {
            zzalbVar.e(zzekVar2, c);
            zzalaVar = null;
        } else {
            zzalaVar = zzalbVar.b;
        }
        while (true) {
            String T = zzekVar2.T(c);
            if (T != null) {
                if (T.startsWith(C10015ub2.v)) {
                    zzalaVar = zzala.a(T);
                } else {
                    if (T.startsWith(C10015ub2.x)) {
                        if (zzalaVar == null) {
                            zzdx.f("SsaParser", "Skipping dialogue line before complete format: ".concat(T));
                        } else {
                            zzdc.d(T.startsWith(C10015ub2.x));
                            String substring = T.substring(9);
                            int i8 = zzalaVar.e;
                            String[] split = substring.split(",", i8);
                            if (split.length != i8) {
                                zzdx.f("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(T));
                            } else {
                                long d = d(split[zzalaVar.a]);
                                if (d == C10323vs.b) {
                                    zzdx.f("SsaParser", "Skipping invalid timing: ".concat(T));
                                } else {
                                    long d2 = d(split[zzalaVar.b]);
                                    if (d2 == C10323vs.b || d2 <= d) {
                                        charset = c;
                                        zzalaVar2 = zzalaVar;
                                        zzekVar = zzekVar2;
                                        zzdx.f("SsaParser", "Skipping invalid timing: ".concat(T));
                                    } else {
                                        Map map = zzalbVar.d;
                                        if (map != null && (i7 = zzalaVar.c) != -1) {
                                            zzaleVar = (zzale) map.get(split[i7].trim());
                                        } else {
                                            zzaleVar = null;
                                        }
                                        String str = split[zzalaVar.d];
                                        zzald a = zzald.a(str);
                                        String replace = zzald.b(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f2 = zzalbVar.e;
                                        float f3 = zzalbVar.f;
                                        SpannableString spannableString = new SpannableString(replace);
                                        zzcs zzcsVar = new zzcs();
                                        zzcsVar.l(spannableString);
                                        charset = c;
                                        if (zzaleVar != null) {
                                            Integer num2 = zzaleVar.c;
                                            if (num2 != null) {
                                                zzalaVar2 = zzalaVar;
                                                zzekVar = zzekVar2;
                                                f = f2;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                zzalaVar2 = zzalaVar;
                                                zzekVar = zzekVar2;
                                                f = f2;
                                            }
                                            if (zzaleVar.j == 3 && (num = zzaleVar.d) != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f4 = zzaleVar.e;
                                            if (f4 != -3.4028235E38f && f3 != -3.4028235E38f) {
                                                zzcsVar.n(f4 / f3, 1);
                                            }
                                            if (zzaleVar.f) {
                                                if (zzaleVar.g) {
                                                    i5 = 33;
                                                    i6 = 0;
                                                    spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                                } else {
                                                    i5 = 33;
                                                    i6 = 0;
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                }
                                            } else {
                                                i5 = 33;
                                                i6 = 0;
                                                if (zzaleVar.g) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (zzaleVar.h) {
                                                spannableString.setSpan(new UnderlineSpan(), i6, spannableString.length(), i5);
                                            }
                                            if (zzaleVar.i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i6, spannableString.length(), i5);
                                            }
                                        } else {
                                            zzalaVar2 = zzalaVar;
                                            zzekVar = zzekVar2;
                                            f = f2;
                                        }
                                        int i9 = a.a;
                                        if (i9 != -1) {
                                            i3 = i9;
                                        } else if (zzaleVar != null) {
                                            i3 = zzaleVar.b;
                                        } else {
                                            i3 = -1;
                                        }
                                        switch (i3) {
                                            case 0:
                                            default:
                                                zzdx.f("SsaParser", "Unknown alignment: " + i3);
                                            case -1:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        zzcsVar.m(alignment);
                                        int i10 = Integer.MIN_VALUE;
                                        switch (i3) {
                                            case 0:
                                            default:
                                                zzdx.f("SsaParser", "Unknown alignment: " + i3);
                                            case -1:
                                                i4 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i4 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i4 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i4 = 2;
                                                break;
                                        }
                                        zzcsVar.i(i4);
                                        switch (i3) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                zzdx.f("SsaParser", "Unknown alignment: " + i3);
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i10 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i10 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i10 = 0;
                                                break;
                                        }
                                        zzcsVar.f(i10);
                                        PointF pointF = a.b;
                                        if (pointF != null && f3 != -3.4028235E38f && f != -3.4028235E38f) {
                                            zzcsVar.h(pointF.x / f);
                                            zzcsVar.e(pointF.y / f3, 0);
                                        } else {
                                            zzcsVar.h(b(zzcsVar.b()));
                                            zzcsVar.e(b(zzcsVar.a()), 0);
                                        }
                                        zzcu p = zzcsVar.p();
                                        int c2 = c(d2, arrayList2, arrayList);
                                        for (int c3 = c(d, arrayList2, arrayList); c3 < c2; c3++) {
                                            ((List) arrayList.get(c3)).add(p);
                                        }
                                    }
                                    zzalbVar = this;
                                    c = charset;
                                    zzekVar2 = zzekVar;
                                    zzalaVar = zzalaVar2;
                                }
                            }
                        }
                    }
                    charset = c;
                    zzalaVar2 = zzalaVar;
                    zzekVar = zzekVar2;
                    zzalbVar = this;
                    c = charset;
                    zzekVar2 = zzekVar;
                    zzalaVar = zzalaVar2;
                }
            } else {
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    List list = (List) arrayList.get(i11);
                    if (list.isEmpty()) {
                        if (i11 == 0) {
                            i11 = 0;
                        } else {
                            i11++;
                        }
                    }
                    if (i11 != arrayList.size() - 1) {
                        long longValue = ((Long) arrayList2.get(i11)).longValue();
                        zzdkVar.b(new zzakd(list, longValue, ((Long) arrayList2.get(i11 + 1)).longValue() - longValue));
                        i11++;
                    } else {
                        throw new IllegalStateException();
                    }
                }
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r3.equals("playresx") != false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(zzek zzekVar, Charset charset) {
        while (true) {
            String T = zzekVar.T(charset);
            if (T != null) {
                if ("[Script Info]".equalsIgnoreCase(T)) {
                    while (true) {
                        String T2 = zzekVar.T(charset);
                        if (T2 == null && (zzekVar.u() == 0 || zzekVar.y(charset) != 91)) {
                            String[] split = T2.split(":");
                            if (split.length != 2) {
                                char c = 0;
                                String a = zzfui.a(split[0].trim());
                                switch (a.hashCode()) {
                                    case 1879649548:
                                        break;
                                    case 1879649549:
                                        if (a.equals("playresy")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                if (c != 0) {
                                    if (c == 1) {
                                        try {
                                            this.f = Float.parseFloat(split[1].trim());
                                        } catch (NumberFormatException unused) {
                                        }
                                    }
                                    String T22 = zzekVar.T(charset);
                                    if (T22 == null) {
                                        break;
                                    }
                                    String[] split2 = T22.split(":");
                                    if (split2.length != 2) {
                                    }
                                } else {
                                    this.e = Float.parseFloat(split2[1].trim());
                                }
                            }
                        }
                    }
                } else if ("[V4+ Styles]".equalsIgnoreCase(T)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    zzalc zzalcVar = null;
                    while (true) {
                        String T3 = zzekVar.T(charset);
                        if (T3 != null && (zzekVar.u() == 0 || zzekVar.y(charset) != 91)) {
                            if (T3.startsWith(C10015ub2.v)) {
                                zzalcVar = zzalc.a(T3);
                            } else if (T3.startsWith(C10015ub2.w)) {
                                if (zzalcVar == null) {
                                    zzdx.f("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(T3));
                                } else {
                                    zzale b = zzale.b(T3, zzalcVar);
                                    if (b != null) {
                                        linkedHashMap.put(b.a, b);
                                    }
                                }
                            }
                        }
                    }
                    this.d = linkedHashMap;
                } else if ("[V4 Styles]".equalsIgnoreCase(T)) {
                    zzdx.e("SsaParser", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(T)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public zzalb(@InterfaceC11300zs1 List list) {
        this.e = -3.4028235E38f;
        this.f = -3.4028235E38f;
        this.c = new zzek();
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        String b = zzeu.b((byte[]) list.get(0));
        zzdc.d(b.startsWith(C10015ub2.v));
        zzala a = zzala.a(b);
        a.getClass();
        this.b = a;
        e(new zzek((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
