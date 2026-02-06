package o;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10504wb2;
import o.C7284jS;

@Deprecated
/* renamed from: o.ub2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10015ub2 extends AbstractC5012a82 {
    public static final String t = "SsaDecoder";
    public static final Pattern u = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public static final String v = "Format:";
    public static final String w = "Style:";
    public static final String x = "Dialogue:";
    public static final float y = 0.05f;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f887o;
    @InterfaceC11300zs1
    public final C10258vb2 p;
    public Map<String, C10504wb2> q;
    public float r;
    public float s;

    public C10015ub2() {
        this(null);
    }

    public static int C(long j, List<Long> list, List<List<C7284jS>> list2) {
        int i;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size >= 0) {
                if (list.get(size).longValue() == j) {
                    return size;
                }
                if (list.get(size).longValue() < j) {
                    i = size + 1;
                    break;
                }
                size--;
            } else {
                i = 0;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    public static float D(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return 0.95f;
            }
            return 0.5f;
        }
        return 0.05f;
    }

    public static C7284jS E(String str, @InterfaceC11300zs1 C10504wb2 c10504wb2, C10504wb2.b bVar, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        C7284jS.c A = new C7284jS.c().A(spannableString);
        if (c10504wb2 != null) {
            if (c10504wb2.c != null) {
                spannableString.setSpan(new ForegroundColorSpan(c10504wb2.c.intValue()), 0, spannableString.length(), 33);
            }
            if (c10504wb2.j == 3 && c10504wb2.d != null) {
                spannableString.setSpan(new BackgroundColorSpan(c10504wb2.d.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = c10504wb2.e;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                A.C(f3 / f2, 1);
            }
            boolean z = c10504wb2.f;
            if (z && c10504wb2.g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (c10504wb2.g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (c10504wb2.h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (c10504wb2.i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = bVar.a;
        if (i == -1) {
            if (c10504wb2 != null) {
                i = c10504wb2.b;
            } else {
                i = -1;
            }
        }
        A.B(O(i)).x(N(i)).u(M(i));
        PointF pointF = bVar.b;
        if (pointF != null && f2 != -3.4028235E38f && f != -3.4028235E38f) {
            A.w(pointF.x / f);
            A.t(bVar.b.y / f2, 0);
        } else {
            A.w(D(A.i()));
            A.t(D(A.f()), 0);
        }
        return A.a();
    }

    public static Map<String, C10504wb2> K(C3012Fy1 c3012Fy1, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C10504wb2.a aVar = null;
        while (true) {
            String v2 = c3012Fy1.v(charset);
            if (v2 == null || (c3012Fy1.a() != 0 && c3012Fy1.i(charset) == '[')) {
                break;
            } else if (v2.startsWith(v)) {
                aVar = C10504wb2.a.a(v2);
            } else if (v2.startsWith(w)) {
                if (aVar == null) {
                    I31.n(t, "Skipping 'Style:' line before 'Format:' line: " + v2);
                } else {
                    C10504wb2 b = C10504wb2.b(v2, aVar);
                    if (b != null) {
                        linkedHashMap.put(b.a, b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static long L(String str) {
        Matcher matcher = u.matcher(str.trim());
        if (!matcher.matches()) {
            return C10323vs.b;
        }
        return (Long.parseLong((String) TD2.o(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) TD2.o(matcher.group(2))) * 60000000) + (Long.parseLong((String) TD2.o(matcher.group(3))) * 1000000) + (Long.parseLong((String) TD2.o(matcher.group(4))) * 10000);
    }

    public static int M(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                I31.n(t, "Unknown alignment: " + i);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    public static int N(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                I31.n(t, "Unknown alignment: " + i);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    @InterfaceC11300zs1
    public static Layout.Alignment O(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                I31.n(t, "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // o.AbstractC5012a82
    public InterfaceC4020Qg2 A(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C3012Fy1 c3012Fy1 = new C3012Fy1(bArr, i);
        Charset F = F(c3012Fy1);
        if (!this.f887o) {
            I(c3012Fy1, F);
        }
        H(c3012Fy1, arrayList, arrayList2, F);
        return new C10747xb2(arrayList, arrayList2);
    }

    public final Charset F(C3012Fy1 c3012Fy1) {
        Charset T = c3012Fy1.T();
        if (T != null) {
            return T;
        }
        return KB.c;
    }

    public final void G(String str, C10258vb2 c10258vb2, List<List<C7284jS>> list, List<Long> list2) {
        C10504wb2 c10504wb2;
        int i;
        C9542sf.a(str.startsWith(x));
        String[] split = str.substring(9).split(",", c10258vb2.e);
        if (split.length != c10258vb2.e) {
            I31.n(t, "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long L = L(split[c10258vb2.a]);
        if (L == C10323vs.b) {
            I31.n(t, "Skipping invalid timing: " + str);
            return;
        }
        long L2 = L(split[c10258vb2.b]);
        if (L2 == C10323vs.b) {
            I31.n(t, "Skipping invalid timing: " + str);
            return;
        }
        Map<String, C10504wb2> map = this.q;
        if (map != null && (i = c10258vb2.c) != -1) {
            c10504wb2 = map.get(split[i].trim());
        } else {
            c10504wb2 = null;
        }
        String str2 = split[c10258vb2.d];
        C7284jS E = E(C10504wb2.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), c10504wb2, C10504wb2.b.b(str2), this.r, this.s);
        int C = C(L2, list2, list);
        for (int C2 = C(L, list2, list); C2 < C; C2++) {
            list.get(C2).add(E);
        }
    }

    public final void H(C3012Fy1 c3012Fy1, List<List<C7284jS>> list, List<Long> list2, Charset charset) {
        C10258vb2 c10258vb2;
        if (this.f887o) {
            c10258vb2 = this.p;
        } else {
            c10258vb2 = null;
        }
        while (true) {
            String v2 = c3012Fy1.v(charset);
            if (v2 != null) {
                if (v2.startsWith(v)) {
                    c10258vb2 = C10258vb2.a(v2);
                } else if (v2.startsWith(x)) {
                    if (c10258vb2 == null) {
                        I31.n(t, "Skipping dialogue line before complete format: " + v2);
                    } else {
                        G(v2, c10258vb2, list, list2);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void I(C3012Fy1 c3012Fy1, Charset charset) {
        while (true) {
            String v2 = c3012Fy1.v(charset);
            if (v2 != null) {
                if ("[Script Info]".equalsIgnoreCase(v2)) {
                    J(c3012Fy1, charset);
                } else if ("[V4+ Styles]".equalsIgnoreCase(v2)) {
                    this.q = K(c3012Fy1, charset);
                } else if ("[V4 Styles]".equalsIgnoreCase(v2)) {
                    I31.h(t, "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(v2)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(C3012Fy1 c3012Fy1, Charset charset) {
        while (true) {
            String v2 = c3012Fy1.v(charset);
            if (v2 == null) {
                if (c3012Fy1.a() == 0 || c3012Fy1.i(charset) != '[') {
                    String[] split = v2.split(":");
                    if (split.length == 2) {
                        String g = C8077mf.g(split[0].trim());
                        g.getClass();
                        if (!g.equals("playresx")) {
                            if (g.equals("playresy")) {
                                try {
                                    this.s = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                            String v22 = c3012Fy1.v(charset);
                            if (v22 == null) {
                                return;
                            }
                        } else {
                            this.r = Float.parseFloat(split[1].trim());
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C10015ub2(@InterfaceC11300zs1 List<byte[]> list) {
        super(t);
        this.r = -3.4028235E38f;
        this.s = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.f887o = true;
            String N = TD2.N(list.get(0));
            C9542sf.a(N.startsWith(v));
            this.p = (C10258vb2) C9542sf.g(C10258vb2.a(N));
            I(new C3012Fy1(list.get(1)), KB.c);
            return;
        }
        this.f887o = false;
        this.p = null;
    }
}
