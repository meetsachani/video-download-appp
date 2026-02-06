package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import o.C10323vs;
import o.C4500Ve2;
import o.C5445bv2;
import o.C5929dv2;
import o.InterfaceC11300zs1;
import o.VI0;

/* loaded from: classes2.dex */
final class zzali {
    @InterfaceC11300zs1
    public final String a;
    @InterfaceC11300zs1
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    @InterfaceC11300zs1
    public final zzalo f;
    @InterfaceC11300zs1
    public final String[] g;
    public final String h;
    @InterfaceC11300zs1
    public final String i;
    @InterfaceC11300zs1
    public final zzali j;
    public final HashMap k;
    public final HashMap l;
    public List m;

    public zzali(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, long j, long j2, @InterfaceC11300zs1 zzalo zzaloVar, @InterfaceC11300zs1 String[] strArr, String str3, @InterfaceC11300zs1 String str4, @InterfaceC11300zs1 zzali zzaliVar) {
        boolean z;
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = zzaloVar;
        this.g = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = zzaliVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static zzali b(@InterfaceC11300zs1 String str, long j, long j2, @InterfaceC11300zs1 zzalo zzaloVar, @InterfaceC11300zs1 String[] strArr, String str2, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 zzali zzaliVar) {
        return new zzali(str, null, j, j2, zzaloVar, strArr, str2, str3, zzaliVar);
    }

    public static zzali c(String str) {
        return new zzali(null, str.replaceAll(VI0.D, "\n").replaceAll(" *\n *", "\n").replaceAll("\n", C4500Ve2.b).replaceAll("[ \t\\x0B\f\r]+", C4500Ve2.b), C10323vs.b, C10323vs.b, null, null, "", null, null);
    }

    public static SpannableStringBuilder i(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcs zzcsVar = new zzcs();
            zzcsVar.l(new SpannableStringBuilder());
            map.put(str, zzcsVar);
        }
        CharSequence q = ((zzcs) map.get(str)).q();
        q.getClass();
        return (SpannableStringBuilder) q;
    }

    public final int a() {
        List list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzali d(int i) {
        List list = this.m;
        if (list != null) {
            return (zzali) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List e(long j, Map map, Map map2, Map map3) {
        zzalg[] zzalgVarArr;
        List arrayList = new ArrayList();
        String str = this.h;
        k(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        m(j, false, str, treeMap);
        l(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] decode = Base64.decode(str2, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                zzalm zzalmVar = (zzalm) map2.get(pair.first);
                zzalmVar.getClass();
                zzcs zzcsVar = new zzcs();
                zzcsVar.c(decodeByteArray);
                zzcsVar.h(zzalmVar.b);
                zzcsVar.i(0);
                zzcsVar.e(zzalmVar.c, 0);
                zzcsVar.f(zzalmVar.e);
                zzcsVar.k(zzalmVar.f);
                zzcsVar.d(zzalmVar.g);
                zzcsVar.o(zzalmVar.j);
                arrayList2.add(zzcsVar.p());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzalm zzalmVar2 = (zzalm) map2.get(entry.getKey());
            zzalmVar2.getClass();
            zzcs zzcsVar2 = (zzcs) entry.getValue();
            CharSequence q = zzcsVar2.q();
            q.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) q;
            for (zzalg zzalgVar : (zzalg[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzalg.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzalgVar), spannableStringBuilder.getSpanEnd(zzalgVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcsVar2.e(zzalmVar2.c, zzalmVar2.d);
            zzcsVar2.f(zzalmVar2.e);
            zzcsVar2.h(zzalmVar2.b);
            zzcsVar2.k(zzalmVar2.f);
            zzcsVar2.n(zzalmVar2.i, zzalmVar2.h);
            zzcsVar2.o(zzalmVar2.j);
            arrayList2.add(zzcsVar2.p());
        }
        return arrayList2;
    }

    public final void f(zzali zzaliVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(zzaliVar);
    }

    public final boolean g(long j) {
        long j2 = this.d;
        if (j2 == C10323vs.b) {
            if (this.e == C10323vs.b) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        if (i > 0 || this.e != C10323vs.b) {
            if (j2 != C10323vs.b || j >= this.e) {
                return i <= 0 && j < this.e;
            }
            return true;
        }
        return true;
    }

    public final long[] h() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        j(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public final void j(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean equals = "p".equals(str);
        boolean equals2 = C5445bv2.q.equals(str);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != C10323vs.b) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != C10323vs.b) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); i++) {
                zzali zzaliVar = (zzali) this.m.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                zzaliVar.j(treeSet, z2);
            }
        }
    }

    public final void k(long j, String str, List list) {
        String str2;
        String str3 = this.h;
        if (true != "".equals(str3)) {
            str = str3;
        }
        if (g(j) && C5445bv2.q.equals(this.a) && (str2 = this.i) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < a(); i++) {
            d(i).k(j, str, list);
        }
    }

    public final void l(long j, Map map, Map map2, String str, Map map3) {
        String str2;
        int i;
        Iterator it;
        zzali zzaliVar;
        int i2;
        zzalo a;
        int i3;
        boolean z;
        int i4;
        int i5;
        Map map4 = map;
        if (g(j)) {
            String str3 = this.h;
            if (true != "".equals(str3)) {
                str2 = str3;
            } else {
                str2 = str;
            }
            Iterator it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap hashMap = this.k;
                if (hashMap.containsKey(str4)) {
                    i = ((Integer) hashMap.get(str4)).intValue();
                } else {
                    i = 0;
                }
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i != intValue) {
                    zzcs zzcsVar = (zzcs) map3.get(str4);
                    zzcsVar.getClass();
                    zzalm zzalmVar = (zzalm) map2.get(str2);
                    zzalmVar.getClass();
                    int i6 = zzalmVar.j;
                    zzalo a2 = zzaln.a(this.f, this.g, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcsVar.q();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcsVar.l(spannableStringBuilder);
                    }
                    if (a2 != null) {
                        zzali zzaliVar2 = this.j;
                        if (a2.v() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(a2.v()), i, intValue, 33);
                        }
                        if (a2.m()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, intValue, 33);
                        }
                        if (a2.n()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i, intValue, 33);
                        }
                        if (a2.l()) {
                            zzcz.b(spannableStringBuilder, new ForegroundColorSpan(a2.r()), i, intValue, 33);
                        }
                        if (a2.k()) {
                            zzcz.b(spannableStringBuilder, new BackgroundColorSpan(a2.q()), i, intValue, 33);
                        }
                        if (a2.g() != null) {
                            zzcz.b(spannableStringBuilder, new TypefaceSpan(a2.g()), i, intValue, 33);
                        }
                        if (a2.y() != null) {
                            zzalh y = a2.y();
                            y.getClass();
                            int i7 = y.a;
                            it = it2;
                            if (i7 == -1) {
                                if (i6 == 2 || i6 == 1) {
                                    i5 = 3;
                                } else {
                                    i5 = 1;
                                }
                                i7 = i5;
                                i4 = 1;
                            } else {
                                i4 = y.b;
                            }
                            int i8 = y.c;
                            if (i8 == -2) {
                                i8 = 1;
                            }
                            zzcz.b(spannableStringBuilder, new zzda(i7, i4, i8), i, intValue, 33);
                        } else {
                            it = it2;
                        }
                        int u = a2.u();
                        if (u != 2) {
                            if (u == 3 || u == 4) {
                                spannableStringBuilder.setSpan(new zzalg(), i, intValue, 33);
                            }
                        } else {
                            while (true) {
                                if (zzaliVar2 != null) {
                                    zzalo a3 = zzaln.a(zzaliVar2.f, zzaliVar2.g, map4);
                                    if (a3 != null && a3.u() == 1) {
                                        break;
                                    }
                                    zzaliVar2 = zzaliVar2.j;
                                } else {
                                    zzaliVar2 = null;
                                    break;
                                }
                            }
                            if (zzaliVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzaliVar2);
                                while (true) {
                                    if (!arrayDeque.isEmpty()) {
                                        zzali zzaliVar3 = (zzali) arrayDeque.pop();
                                        zzalo a4 = zzaln.a(zzaliVar3.f, zzaliVar3.g, map4);
                                        if (a4 != null && a4.u() == 3) {
                                            zzaliVar = zzaliVar3;
                                            break;
                                        }
                                        for (int a5 = zzaliVar3.a() - 1; a5 >= 0; a5--) {
                                            arrayDeque.push(zzaliVar3.d(a5));
                                        }
                                    } else {
                                        zzaliVar = null;
                                        break;
                                    }
                                }
                                if (zzaliVar != null) {
                                    if (zzaliVar.a() == 1 && zzaliVar.d(0).b != null) {
                                        String str5 = zzaliVar.d(0).b;
                                        String str6 = zzeu.a;
                                        zzalo a6 = zzaln.a(zzaliVar.f, zzaliVar.g, map4);
                                        if (a6 != null) {
                                            i2 = a6.t();
                                        } else {
                                            i2 = -1;
                                        }
                                        if (i2 == -1 && (a = zzaln.a(zzaliVar2.f, zzaliVar2.g, map4)) != null) {
                                            i2 = a.t();
                                        }
                                        spannableStringBuilder.setSpan(new zzcy(str5, i2), i, intValue, 33);
                                    } else {
                                        zzdx.e(C5929dv2.a, "Skipping rubyText node without exactly one text child.");
                                    }
                                }
                            }
                        }
                        if (a2.j()) {
                            i3 = 33;
                            zzcz.b(spannableStringBuilder, new zzcx(), i, intValue, 33);
                        } else {
                            i3 = 33;
                        }
                        int s = a2.s();
                        if (s != 1) {
                            if (s != 2) {
                                if (s == 3) {
                                    zzcz.a(spannableStringBuilder, a2.o() / 100.0f, i, intValue, i3);
                                }
                            } else {
                                zzcz.b(spannableStringBuilder, new RelativeSizeSpan(a2.o()), i, intValue, i3);
                            }
                            z = true;
                        } else {
                            z = true;
                            zzcz.b(spannableStringBuilder, new AbsoluteSizeSpan((int) a2.o(), true), i, intValue, i3);
                        }
                        if ("p".equals(this.a)) {
                            if (a2.p() != Float.MAX_VALUE) {
                                zzcsVar.j((a2.p() * (-90.0f)) / 100.0f);
                            }
                            if (a2.x() != null) {
                                zzcsVar.m(a2.x());
                            }
                            if (a2.w() != null) {
                                zzcsVar.g(a2.w());
                            }
                        }
                        it2 = it;
                    }
                }
            }
            int i9 = 0;
            while (i9 < a()) {
                d(i9).l(j, map4, map2, str2, map3);
                i9++;
                map4 = map;
            }
        }
    }

    public final void m(long j, boolean z, String str, Map map) {
        String str2;
        long j2;
        boolean z2;
        HashMap hashMap = this.k;
        hashMap.clear();
        HashMap hashMap2 = this.l;
        hashMap2.clear();
        String str3 = this.a;
        if (!"metadata".equals(str3)) {
            String str4 = this.h;
            if (true != "".equals(str4)) {
                str2 = str4;
            } else {
                str2 = str;
            }
            if (this.c && z) {
                SpannableStringBuilder i = i(str2, map);
                String str5 = this.b;
                str5.getClass();
                i.append((CharSequence) str5);
            } else if ("br".equals(str3) && z) {
                i(str2, map).append('\n');
            } else if (g(j)) {
                for (Map.Entry entry : map.entrySet()) {
                    CharSequence q = ((zzcs) entry.getValue()).q();
                    q.getClass();
                    hashMap.put((String) entry.getKey(), Integer.valueOf(q.length()));
                }
                boolean equals = "p".equals(str3);
                for (int i2 = 0; i2 < a(); i2++) {
                    zzali d = d(i2);
                    if (z || equals) {
                        j2 = j;
                        z2 = true;
                    } else {
                        j2 = j;
                        z2 = false;
                    }
                    d.m(j2, z2, str2, map);
                }
                if (equals) {
                    SpannableStringBuilder i3 = i(str2, map);
                    int length = i3.length();
                    do {
                        length--;
                        if (length < 0) {
                            break;
                        }
                    } while (i3.charAt(length) == ' ');
                    if (length >= 0 && i3.charAt(length) != '\n') {
                        i3.append('\n');
                    }
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    CharSequence q2 = ((zzcs) entry2.getValue()).q();
                    q2.getClass();
                    hashMap2.put((String) entry2.getKey(), Integer.valueOf(q2.length()));
                }
            }
        }
    }
}
