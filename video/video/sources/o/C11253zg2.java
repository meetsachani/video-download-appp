package o;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C7284jS;

@Deprecated
/* renamed from: o.zg2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11253zg2 extends AbstractC5012a82 {
    public static final String A = "{\\an3}";
    public static final String B = "{\\an4}";
    public static final String C = "{\\an5}";
    public static final String D = "{\\an6}";
    public static final String E = "{\\an7}";
    public static final String F = "{\\an8}";
    public static final String G = "{\\an9}";
    public static final float q = 0.08f;
    public static final float r = 0.92f;
    public static final float s = 0.5f;
    public static final String t = "SubripDecoder";
    public static final String u = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?";
    public static final Pattern v = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern w = Pattern.compile("\\{\\\\.*?\\}");
    public static final String x = "\\{\\\\an[1-9]\\}";
    public static final String y = "{\\an1}";
    public static final String z = "{\\an2}";

    /* renamed from: o  reason: collision with root package name */
    public final StringBuilder f929o;
    public final ArrayList<String> p;

    public C11253zg2() {
        super(t);
        this.f929o = new StringBuilder();
        this.p = new ArrayList<>();
    }

    private Charset D(C3012Fy1 c3012Fy1) {
        Charset T = c3012Fy1.T();
        if (T != null) {
            return T;
        }
        return KB.c;
    }

    public static float E(int i) {
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

    public static long F(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 3600000;
        } else {
            j = 0;
        }
        long parseLong = j + (Long.parseLong((String) C9542sf.g(matcher.group(i + 2))) * 60000) + (Long.parseLong((String) C9542sf.g(matcher.group(i + 3))) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    @Override // o.AbstractC5012a82
    public InterfaceC4020Qg2 A(byte[] bArr, int i, boolean z2) {
        String str;
        ArrayList arrayList = new ArrayList();
        C11106z41 c11106z41 = new C11106z41();
        C3012Fy1 c3012Fy1 = new C3012Fy1(bArr, i);
        Charset D2 = D(c3012Fy1);
        while (true) {
            String v2 = c3012Fy1.v(D2);
            int i2 = 0;
            if (v2 == null) {
                break;
            } else if (v2.length() != 0) {
                try {
                    Integer.parseInt(v2);
                    String v3 = c3012Fy1.v(D2);
                    if (v3 == null) {
                        I31.n(t, "Unexpected end");
                        break;
                    }
                    Matcher matcher = v.matcher(v3);
                    if (matcher.matches()) {
                        c11106z41.a(F(matcher, 1));
                        c11106z41.a(F(matcher, 6));
                        this.f929o.setLength(0);
                        this.p.clear();
                        for (String v4 = c3012Fy1.v(D2); !TextUtils.isEmpty(v4); v4 = c3012Fy1.v(D2)) {
                            if (this.f929o.length() > 0) {
                                this.f929o.append("<br>");
                            }
                            this.f929o.append(G(v4, this.p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f929o.toString());
                        while (true) {
                            if (i2 < this.p.size()) {
                                str = this.p.get(i2);
                                if (str.matches(x)) {
                                    break;
                                }
                                i2++;
                            } else {
                                str = null;
                                break;
                            }
                        }
                        arrayList.add(C(fromHtml, str));
                        arrayList.add(C7284jS.m1);
                    } else {
                        I31.n(t, "Skipping invalid timing: " + v3);
                    }
                } catch (NumberFormatException unused) {
                    I31.n(t, "Skipping invalid index: " + v2);
                }
            }
        }
        return new C2444Ag2((C7284jS[]) arrayList.toArray(new C7284jS[0]), c11106z41.d());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final C7284jS C(Spanned spanned, @InterfaceC11300zs1 String str) {
        char c;
        char c2;
        C7284jS.c A2 = new C7284jS.c().A(spanned);
        if (str == null) {
            return A2.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals(y)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -685620679:
                if (str.equals(z)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -685620648:
                if (str.equals(A)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -685620617:
                if (str.equals(B)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -685620586:
                if (str.equals(C)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -685620555:
                if (str.equals(D)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -685620524:
                if (str.equals(E)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -685620493:
                if (str.equals(F)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -685620462:
                if (str.equals(G)) {
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
                A2.x(1);
            } else {
                A2.x(2);
            }
        } else {
            A2.x(0);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals(y)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -685620679:
                if (str.equals(z)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -685620648:
                if (str.equals(A)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -685620617:
                if (str.equals(B)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -685620586:
                if (str.equals(C)) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -685620555:
                if (str.equals(D)) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -685620524:
                if (str.equals(E)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -685620493:
                if (str.equals(F)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -685620462:
                if (str.equals(G)) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 != 0 && c2 != 1 && c2 != 2) {
            if (c2 != 3 && c2 != 4 && c2 != 5) {
                A2.u(1);
            } else {
                A2.u(0);
            }
        } else {
            A2.u(2);
        }
        return A2.w(E(A2.i())).t(E(A2.f()), 0).a();
    }

    public final String G(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = w.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, "");
            i += length;
        }
        return sb.toString();
    }
}
