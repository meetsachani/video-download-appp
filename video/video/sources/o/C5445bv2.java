package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import o.C7284jS;

@Deprecated
/* renamed from: o.bv2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5445bv2 {
    public static final String A = "data";
    public static final String A0 = "filled";
    public static final String B = "information";
    public static final String B0 = "open";
    public static final String C = "";
    public static final String D = "id";
    public static final String E = "origin";
    public static final String F = "extent";
    public static final String G = "displayAlign";
    public static final String H = "backgroundColor";
    public static final String I = "fontStyle";
    public static final String J = "fontSize";
    public static final String K = "fontFamily";
    public static final String L = "fontWeight";
    public static final String M = "color";
    public static final String N = "ruby";
    public static final String O = "rubyPosition";
    public static final String P = "textDecoration";
    public static final String Q = "textAlign";
    public static final String R = "textCombine";
    public static final String S = "textEmphasis";
    public static final String T = "writingMode";
    public static final String U = "shear";
    public static final String V = "multiRowAlign";
    public static final String W = "container";
    public static final String X = "base";
    public static final String Y = "baseContainer";
    public static final String Z = "text";
    public static final String a0 = "textContainer";
    public static final String b0 = "delimiter";
    public static final String c0 = "before";
    public static final String d0 = "after";
    public static final String e0 = "outside";
    public static final String f0 = "linethrough";
    public static final String g0 = "nolinethrough";
    public static final String h0 = "underline";
    public static final String i0 = "nounderline";
    public static final String j0 = "italic";
    public static final String k0 = "bold";
    public static final String l0 = "left";
    public static final String m0 = "center";
    public static final String n = "tt";
    public static final String n0 = "right";

    /* renamed from: o  reason: collision with root package name */
    public static final String f701o = "head";
    public static final String o0 = "start";
    public static final String p = "body";
    public static final String p0 = "end";
    public static final String q = "div";
    public static final String q0 = "none";
    public static final String r = "p";
    public static final String r0 = "all";
    public static final String s = "span";
    public static final String s0 = "tb";
    public static final String t = "br";
    public static final String t0 = "tblr";
    public static final String u = "style";
    public static final String u0 = "tbrl";
    public static final String v = "styling";
    public static final String v0 = "none";
    public static final String w = "layout";
    public static final String w0 = "auto";
    public static final String x = "region";
    public static final String x0 = "dot";
    public static final String y = "metadata";
    public static final String y0 = "sesame";
    public static final String z = "image";
    public static final String z0 = "circle";
    @InterfaceC11300zs1
    public final String a;
    @InterfaceC11300zs1
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    @InterfaceC11300zs1
    public final C6172ev2 f;
    @InterfaceC11300zs1
    public final String[] g;
    public final String h;
    @InterfaceC11300zs1
    public final String i;
    @InterfaceC11300zs1
    public final C5445bv2 j;
    public final HashMap<String, Integer> k;
    public final HashMap<String, Integer> l;
    public List<C5445bv2> m;

    public C5445bv2(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, long j, long j2, @InterfaceC11300zs1 C6172ev2 c6172ev2, @InterfaceC11300zs1 String[] strArr, String str3, @InterfaceC11300zs1 String str4, @InterfaceC11300zs1 C5445bv2 c5445bv2) {
        boolean z2;
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = c6172ev2;
        this.g = strArr;
        if (str2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.c = z2;
        this.d = j;
        this.e = j2;
        this.h = (String) C9542sf.g(str3);
        this.j = c5445bv2;
        this.k = new HashMap<>();
        this.l = new HashMap<>();
    }

    public static C5445bv2 c(@InterfaceC11300zs1 String str, long j, long j2, @InterfaceC11300zs1 C6172ev2 c6172ev2, @InterfaceC11300zs1 String[] strArr, String str2, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 C5445bv2 c5445bv2) {
        return new C5445bv2(str, null, j, j2, c6172ev2, strArr, str2, str3, c5445bv2);
    }

    public static C5445bv2 d(String str) {
        return new C5445bv2(null, C5929dv2.b(str), C10323vs.b, C10323vs.b, null, null, "", null, null);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder) {
        C4986a20[] c4986a20Arr;
        for (C4986a20 c4986a20 : (C4986a20[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C4986a20.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c4986a20), spannableStringBuilder.getSpanEnd(c4986a20), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    public static SpannableStringBuilder k(String str, Map<String, C7284jS.c> map) {
        if (!map.containsKey(str)) {
            C7284jS.c cVar = new C7284jS.c();
            cVar.A(new SpannableStringBuilder());
            map.put(str, cVar);
        }
        return (SpannableStringBuilder) C9542sf.g(map.get(str).k());
    }

    public void a(C5445bv2 c5445bv2) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(c5445bv2);
    }

    public final void b(Map<String, C6172ev2> map, C7284jS.c cVar, int i, int i2, int i3) {
        C6172ev2 f = C5929dv2.f(this.f, this.g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) cVar.k();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            cVar.A(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f != null) {
            C5929dv2.a(spannableStringBuilder2, i, i2, f, this.j, map, i3);
            if ("p".equals(this.a)) {
                if (f.k() != Float.MAX_VALUE) {
                    cVar.y((f.k() * (-90.0f)) / 100.0f);
                }
                if (f.m() != null) {
                    cVar.B(f.m());
                }
                if (f.h() != null) {
                    cVar.v(f.h());
                }
            }
        }
    }

    public C5445bv2 f(int i) {
        List<C5445bv2> list = this.m;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<C5445bv2> list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<C7284jS> h(long j, Map<String, C6172ev2> map, Map<String, C5687cv2> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j, this.h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j, false, this.h, treeMap);
        o(j, map, map2, this.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C5687cv2 c5687cv2 = (C5687cv2) C9542sf.g(map2.get(pair.first));
                arrayList2.add(new C7284jS.c().r(decodeByteArray).w(c5687cv2.b).x(0).t(c5687cv2.c, 0).u(c5687cv2.e).z(c5687cv2.f).s(c5687cv2.g).D(c5687cv2.j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C5687cv2 c5687cv22 = (C5687cv2) C9542sf.g(map2.get(entry.getKey()));
            C7284jS.c cVar = (C7284jS.c) entry.getValue();
            e((SpannableStringBuilder) C9542sf.g(cVar.k()));
            cVar.t(c5687cv22.c, c5687cv22.d);
            cVar.u(c5687cv22.e);
            cVar.w(c5687cv22.b);
            cVar.z(c5687cv22.f);
            cVar.C(c5687cv22.i, c5687cv22.h);
            cVar.D(c5687cv22.j);
            arrayList2.add(cVar.a());
        }
        return arrayList2;
    }

    public final void i(TreeSet<Long> treeSet, boolean z2) {
        boolean z3;
        boolean equals = "p".equals(this.a);
        boolean equals2 = q.equals(this.a);
        if (z2 || equals || (equals2 && this.i != null)) {
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
                C5445bv2 c5445bv2 = this.m.get(i);
                if (!z2 && !equals) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                c5445bv2.i(treeSet, z3);
            }
        }
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    @InterfaceC11300zs1
    public String[] l() {
        return this.g;
    }

    public boolean m(long j) {
        long j2 = this.d;
        if (j2 != C10323vs.b || this.e != C10323vs.b) {
            if (j2 > j || this.e != C10323vs.b) {
                if (j2 != C10323vs.b || j >= this.e) {
                    if (j2 <= j && j < this.e) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void n(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (m(j) && q.equals(this.a) && this.i != null) {
            list.add(new Pair<>(str, this.i));
            return;
        }
        for (int i = 0; i < g(); i++) {
            f(i).n(j, str, list);
        }
    }

    public final void o(long j, Map<String, C6172ev2> map, Map<String, C5687cv2> map2, String str, Map<String, C7284jS.c> map3) {
        String str2;
        if (m(j)) {
            if ("".equals(this.h)) {
                str2 = str;
            } else {
                str2 = this.h;
            }
            Iterator<Map.Entry<String, Integer>> it = this.l.entrySet().iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                if (this.k.containsKey(key)) {
                    i = this.k.get(key).intValue();
                }
                int intValue = next.getValue().intValue();
                if (i != intValue) {
                    b(map, (C7284jS.c) C9542sf.g(map3.get(key)), i, intValue, ((C5687cv2) C9542sf.g(map2.get(str2))).j);
                }
            }
            for (int i2 = 0; i2 < g(); i2++) {
                f(i2).o(j, map, map2, str2, map3);
            }
        }
    }

    public final void p(long j, boolean z2, String str, Map<String, C7284jS.c> map) {
        boolean z3;
        Map<String, C7284jS.c> map2;
        long j2;
        this.k.clear();
        this.l.clear();
        if (!"metadata".equals(this.a)) {
            if (!"".equals(this.h)) {
                str = this.h;
            }
            String str2 = str;
            if (this.c && z2) {
                k(str2, map).append((CharSequence) C9542sf.g(this.b));
            } else if ("br".equals(this.a) && z2) {
                k(str2, map).append('\n');
            } else if (m(j)) {
                for (Map.Entry<String, C7284jS.c> entry : map.entrySet()) {
                    this.k.put(entry.getKey(), Integer.valueOf(((CharSequence) C9542sf.g(entry.getValue().k())).length()));
                }
                boolean equals = "p".equals(this.a);
                int i = 0;
                while (i < g()) {
                    C5445bv2 f = f(i);
                    if (!z2 && !equals) {
                        z3 = false;
                        j2 = j;
                        map2 = map;
                    } else {
                        z3 = true;
                        map2 = map;
                        j2 = j;
                    }
                    f.p(j2, z3, str2, map2);
                    i++;
                    j = j2;
                    map = map2;
                }
                Map<String, C7284jS.c> map3 = map;
                if (equals) {
                    C5929dv2.c(k(str2, map3));
                }
                for (Map.Entry<String, C7284jS.c> entry2 : map3.entrySet()) {
                    this.l.put(entry2.getKey(), Integer.valueOf(((CharSequence) C9542sf.g(entry2.getValue().k())).length()));
                }
            }
        }
    }
}
