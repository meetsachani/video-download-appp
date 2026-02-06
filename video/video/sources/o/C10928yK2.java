package o;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10928yK2;
import o.C7284jS;

@Deprecated
/* renamed from: o.yK2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10928yK2 {
    public static final int A = 2;
    public static final float B = 0.5f;
    public static final String C = "WebvttCueParser";
    public static final Map<String, Integer> D;
    public static final Map<String, Integer> E;
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final Pattern f = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern g = Pattern.compile("(\\S+?):(\\S+)");
    public static final char h = '<';
    public static final char i = '>';
    public static final char j = '/';
    public static final char k = '&';
    public static final char l = ';';
    public static final char m = ' ';
    public static final String n = "lt";

    /* renamed from: o  reason: collision with root package name */
    public static final String f915o = "gt";
    public static final String p = "amp";
    public static final String q = "nbsp";
    public static final String r = "b";
    public static final String s = "c";
    public static final String t = "i";
    public static final String u = "lang";
    public static final String v = "ruby";
    public static final String w = "rt";
    public static final String x = "u";
    public static final String y = "v";
    public static final int z = 1;

    /* renamed from: o.yK2$b */
    /* loaded from: classes2.dex */
    public static class b {
        public static final Comparator<b> c = new Comparator() { // from class: o.zK2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Integer.compare(((C10928yK2.b) obj).a.b, ((C10928yK2.b) obj2).a.b);
                return compare;
            }
        };
        public final c a;
        public final int b;

        public b(c cVar, int i) {
            this.a = cVar;
            this.b = i;
        }
    }

    /* renamed from: o.yK2$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public final String a;
        public final int b;
        public final String c;
        public final Set<String> d;

        public c(String str, int i, String str2, Set<String> set) {
            this.b = i;
            this.a = str;
            this.c = str2;
            this.d = set;
        }

        public static c a(String str, int i) {
            String str2;
            String trim = str.trim();
            C9542sf.a(!trim.isEmpty());
            int indexOf = trim.indexOf(C4500Ve2.b);
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] J1 = TD2.J1(trim, "\\.");
            String str3 = J1[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < J1.length; i2++) {
                hashSet.add(J1[i2]);
            }
            return new c(str3, i, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.EMPTY_SET);
        }
    }

    /* renamed from: o.yK2$d */
    /* loaded from: classes2.dex */
    public static final class d implements Comparable<d> {
        public final int X;
        public final C10442wK2 Y;

        public d(int i, C10442wK2 c10442wK2) {
            this.X = i;
            this.Y = c10442wK2;
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(d dVar) {
            return Integer.compare(this.X, dVar.X);
        }
    }

    /* renamed from: o.yK2$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public CharSequence c;
        public long a = 0;
        public long b = 0;
        public int d = 2;
        public float e = -3.4028235E38f;
        public int f = 1;
        public int g = 0;
        public float h = -3.4028235E38f;
        public int i = Integer.MIN_VALUE;
        public float j = 1.0f;
        public int k = Integer.MIN_VALUE;

        public static float b(float f, int i) {
            int i2 = (f > (-3.4028235E38f) ? 1 : (f == (-3.4028235E38f) ? 0 : -1));
            if (i2 != 0 && i == 0 && (f < 0.0f || f > 1.0f)) {
                return 1.0f;
            }
            if (i2 != 0) {
                return f;
            }
            if (i != 0) {
                return -3.4028235E38f;
            }
            return 1.0f;
        }

        @InterfaceC11300zs1
        public static Layout.Alignment c(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                I31.n(C10928yK2.C, "Unknown textAlignment: " + i);
                                return null;
                            }
                        }
                    }
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public static float d(int i, float f) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return f;
                    }
                    throw new IllegalStateException(String.valueOf(i));
                } else if (f <= 0.5f) {
                    return f * 2.0f;
                } else {
                    return (1.0f - f) * 2.0f;
                }
            }
            return 1.0f - f;
        }

        public static float e(int i) {
            if (i != 4) {
                if (i != 5) {
                    return 0.5f;
                }
                return 1.0f;
            }
            return 0.0f;
        }

        public static int f(int i) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return 1;
                        }
                        return 2;
                    }
                    return 0;
                }
                return 2;
            }
            return 0;
        }

        public C10685xK2 a() {
            return new C10685xK2(g().a(), this.a, this.b);
        }

        public C7284jS.c g() {
            float f = this.h;
            if (f == -3.4028235E38f) {
                f = e(this.d);
            }
            int i = this.i;
            if (i == Integer.MIN_VALUE) {
                i = f(this.d);
            }
            C7284jS.c D = new C7284jS.c().B(c(this.d)).t(b(this.e, this.f), this.f).u(this.g).w(f).x(i).z(Math.min(this.j, d(i, f))).D(this.k);
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                D.A(charSequence);
            }
            return D;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        D = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        E = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i2, int i3) {
        for (String str : set) {
            Map<String, Integer> map = D;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i2, i3, 33);
            } else {
                Map<String, Integer> map2 = E;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i2, i3, 33);
                }
            }
        }
    }

    public static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals(f915o)) {
                    c2 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals(n)) {
                    c2 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals(p)) {
                    c2 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals(q)) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                I31.n(C, "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, @InterfaceC11300zs1 String str, c cVar, List<b> list, List<C10442wK2> list2) {
        int i2 = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.c);
        int i3 = cVar.b;
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            if (w.equals(((b) arrayList.get(i5)).a.a)) {
                b bVar = (b) arrayList.get(i5);
                int g2 = g(i(list2, str, bVar.a), i2, 1);
                int i6 = bVar.a.b - i4;
                int i7 = bVar.b - i4;
                CharSequence subSequence = spannableStringBuilder.subSequence(i6, i7);
                spannableStringBuilder.delete(i6, i7);
                spannableStringBuilder.setSpan(new C7300jW1(subSequence.toString(), g2), i3, i6, 33);
                i4 += subSequence.length();
                i3 = i6;
            }
        }
    }

    public static void d(@InterfaceC11300zs1 String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<C10442wK2> list2) {
        int i2 = cVar.b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.a;
        str2.getClass();
        char c2 = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c2 = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals("b")) {
                    c2 = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals("c")) {
                    c2 = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals("i")) {
                    c2 = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals("u")) {
                    c2 = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals("v")) {
                    c2 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals(u)) {
                    c2 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c2 = 7;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case 2:
                a(spannableStringBuilder, cVar.d, i2, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case 7:
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<d> h2 = h(list2, str, cVar);
        for (int i3 = 0; i3 < h2.size(); i3++) {
            e(spannableStringBuilder, h2.get(i3).Y, i2, length);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, C10442wK2 c10442wK2, int i2, int i3) {
        if (c10442wK2 != null) {
            if (c10442wK2.i() != -1) {
                C8790pa2.a(spannableStringBuilder, new StyleSpan(c10442wK2.i()), i2, i3, 33);
            }
            if (c10442wK2.l()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, i3, 33);
            }
            if (c10442wK2.m()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
            }
            if (c10442wK2.k()) {
                C8790pa2.a(spannableStringBuilder, new ForegroundColorSpan(c10442wK2.c()), i2, i3, 33);
            }
            if (c10442wK2.j()) {
                C8790pa2.a(spannableStringBuilder, new BackgroundColorSpan(c10442wK2.a()), i2, i3, 33);
            }
            if (c10442wK2.d() != null) {
                C8790pa2.a(spannableStringBuilder, new TypefaceSpan(c10442wK2.d()), i2, i3, 33);
            }
            int f2 = c10442wK2.f();
            if (f2 != 1) {
                if (f2 != 2) {
                    if (f2 == 3) {
                        C8790pa2.a(spannableStringBuilder, new RelativeSizeSpan(c10442wK2.e() / 100.0f), i2, i3, 33);
                    }
                } else {
                    C8790pa2.a(spannableStringBuilder, new RelativeSizeSpan(c10442wK2.e()), i2, i3, 33);
                }
            } else {
                C8790pa2.a(spannableStringBuilder, new AbsoluteSizeSpan((int) c10442wK2.e(), true), i2, i3, 33);
            }
            if (c10442wK2.b()) {
                spannableStringBuilder.setSpan(new C7488kI0(), i2, i3, 33);
            }
        }
    }

    public static int f(String str, int i2) {
        int indexOf = str.indexOf(62, i2);
        if (indexOf == -1) {
            return str.length();
        }
        return indexOf + 1;
    }

    public static int g(int i2, int i3, int i4) {
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        if (i4 != -1) {
            return i4;
        }
        throw new IllegalArgumentException();
    }

    public static List<d> h(List<C10442wK2> list, @InterfaceC11300zs1 String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C10442wK2 c10442wK2 = list.get(i2);
            int h2 = c10442wK2.h(str, cVar.a, cVar.d, cVar.c);
            if (h2 > 0) {
                arrayList.add(new d(h2, c10442wK2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int i(List<C10442wK2> list, @InterfaceC11300zs1 String str, c cVar) {
        List<d> h2 = h(list, str, cVar);
        for (int i2 = 0; i2 < h2.size(); i2++) {
            C10442wK2 c10442wK2 = h2.get(i2).Y;
            if (c10442wK2.g() != -1) {
                return c10442wK2.g();
            }
        }
        return -1;
    }

    public static String j(String str) {
        String trim = str.trim();
        C9542sf.a(!trim.isEmpty());
        return TD2.K1(trim, "[ \\.]")[0];
    }

    public static boolean k(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c2 = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals("c")) {
                    c2 = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c2 = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c2 = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c2 = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals(w)) {
                    c2 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals(u)) {
                    c2 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c2 = 7;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public static C7284jS l(CharSequence charSequence) {
        e eVar = new e();
        eVar.c = charSequence;
        return eVar.g().a();
    }

    @InterfaceC11300zs1
    public static C10685xK2 m(@InterfaceC11300zs1 String str, Matcher matcher, C3012Fy1 c3012Fy1, List<C10442wK2> list) {
        e eVar = new e();
        try {
            eVar.a = CK2.d((String) C9542sf.g(matcher.group(1)));
            eVar.b = CK2.d((String) C9542sf.g(matcher.group(2)));
            p((String) C9542sf.g(matcher.group(3)), eVar);
            StringBuilder sb = new StringBuilder();
            String u2 = c3012Fy1.u();
            while (!TextUtils.isEmpty(u2)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(u2.trim());
                u2 = c3012Fy1.u();
            }
            eVar.c = q(str, sb.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            I31.n(C, "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    @InterfaceC11300zs1
    public static C10685xK2 n(C3012Fy1 c3012Fy1, List<C10442wK2> list) {
        String u2 = c3012Fy1.u();
        if (u2 == null) {
            return null;
        }
        Pattern pattern = f;
        Matcher matcher = pattern.matcher(u2);
        if (matcher.matches()) {
            return m(null, matcher, c3012Fy1, list);
        }
        String u3 = c3012Fy1.u();
        if (u3 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(u3);
        if (!matcher2.matches()) {
            return null;
        }
        return m(u2.trim(), matcher2, c3012Fy1, list);
    }

    public static C7284jS.c o(String str) {
        e eVar = new e();
        p(str, eVar);
        return eVar.g();
    }

    public static void p(String str, e eVar) {
        Matcher matcher = g.matcher(str);
        while (matcher.find()) {
            String str2 = (String) C9542sf.g(matcher.group(1));
            String str3 = (String) C9542sf.g(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.j = CK2.c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.k = w(str3);
                } else {
                    I31.n(C, "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                I31.n(C, "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString q(@InterfaceC11300zs1 String str, String str2, List<C10442wK2> list) {
        boolean z2;
        boolean z3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str2.length()) {
            char charAt = str2.charAt(i2);
            if (charAt != '&') {
                if (charAt != '<') {
                    spannableStringBuilder.append(charAt);
                    i2++;
                } else {
                    int i3 = i2 + 1;
                    if (i3 < str2.length()) {
                        int i4 = 1;
                        if (str2.charAt(i3) == '/') {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        i3 = f(str2, i3);
                        int i5 = i3 - 2;
                        if (str2.charAt(i5) == '/') {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                            i4 = 2;
                        }
                        int i6 = i2 + i4;
                        if (!z3) {
                            i5 = i3 - 1;
                        }
                        String substring = str2.substring(i6, i5);
                        if (!substring.trim().isEmpty()) {
                            String j2 = j(substring);
                            if (k(j2)) {
                                if (z2) {
                                    while (!arrayDeque.isEmpty()) {
                                        c cVar = (c) arrayDeque.pop();
                                        d(str, cVar, arrayList, spannableStringBuilder, list);
                                        if (!arrayDeque.isEmpty()) {
                                            arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                        } else {
                                            arrayList.clear();
                                        }
                                        if (cVar.a.equals(j2)) {
                                            break;
                                        }
                                    }
                                } else if (!z3) {
                                    arrayDeque.push(c.a(substring, spannableStringBuilder.length()));
                                }
                            }
                        }
                    }
                    i2 = i3;
                }
            } else {
                i2++;
                int indexOf = str2.indexOf(59, i2);
                int indexOf2 = str2.indexOf(32, i2);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    b(str2.substring(i2, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) C4500Ve2.b);
                    }
                    i2 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static int r(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(C5445bv2.m0)) {
                    c2 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c2 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c2 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                I31.n(C, "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void s(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.g = r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.e = CK2.c(str);
            eVar.f = 0;
            return;
        }
        eVar.e = Integer.parseInt(str);
        eVar.f = 1;
    }

    public static int t(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals(C5445bv2.m0)) {
                    c2 = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c2 = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c2 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                I31.n(C, "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void u(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.i = t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.h = CK2.c(str);
    }

    public static int v(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(C5445bv2.m0)) {
                    c2 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c2 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c2 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(C5445bv2.n0)) {
                    c2 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                I31.n(C, "Invalid alignment value: " + str);
                return 2;
        }
    }

    public static int w(String str) {
        str.getClass();
        if (!str.equals("lr")) {
            if (!str.equals("rl")) {
                I31.n(C, "Invalid 'vertical' value: " + str);
                return Integer.MIN_VALUE;
            }
            return 1;
        }
        return 2;
    }
}
