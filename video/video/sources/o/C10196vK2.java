package o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
/* renamed from: o.vK2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10196vK2 {
    public static final String c = "WebvttCssParser";
    public static final String d = "{";
    public static final String e = "}";
    public static final String f = "color";
    public static final String g = "background-color";
    public static final String h = "font-family";
    public static final String i = "font-weight";
    public static final String j = "font-size";
    public static final String k = "ruby-position";
    public static final String l = "over";
    public static final String m = "under";
    public static final String n = "text-combine-upright";

    /* renamed from: o  reason: collision with root package name */
    public static final String f894o = "all";
    public static final String p = "digits";
    public static final String q = "text-decoration";
    public static final String r = "bold";
    public static final String s = "underline";
    public static final String t = "font-style";
    public static final String u = "italic";
    public static final Pattern v = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern w = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final C3012Fy1 a = new C3012Fy1();
    public final StringBuilder b = new StringBuilder();

    public static boolean b(C3012Fy1 c3012Fy1) {
        int f2 = c3012Fy1.f();
        int g2 = c3012Fy1.g();
        byte[] e2 = c3012Fy1.e();
        if (f2 + 2 <= g2) {
            int i2 = f2 + 1;
            if (e2[f2] == 47) {
                int i3 = f2 + 2;
                if (e2[i2] != 42) {
                    return false;
                }
                while (true) {
                    int i4 = i3 + 1;
                    if (i4 < g2) {
                        if (((char) e2[i3]) == '*' && ((char) e2[i4]) == '/') {
                            i3 += 2;
                            g2 = i3;
                        } else {
                            i3 = i4;
                        }
                    } else {
                        c3012Fy1.Z(g2 - c3012Fy1.f());
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean c(C3012Fy1 c3012Fy1) {
        char k2 = k(c3012Fy1, c3012Fy1.f());
        if (k2 != '\t' && k2 != '\n' && k2 != '\f' && k2 != '\r' && k2 != ' ') {
            return false;
        }
        c3012Fy1.Z(1);
        return true;
    }

    public static void e(String str, C10442wK2 c10442wK2) {
        Matcher matcher = w.matcher(C8077mf.g(str));
        if (!matcher.matches()) {
            I31.n(c, "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) C9542sf.g(matcher.group(2));
        str2.getClass();
        char c2 = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals(com.facebook.appevents.Q.k)) {
                    c2 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                c10442wK2.t(3);
                break;
            case 1:
                c10442wK2.t(2);
                break;
            case 2:
                c10442wK2.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        c10442wK2.s(Float.parseFloat((String) C9542sf.g(matcher.group(1))));
    }

    public static String f(C3012Fy1 c3012Fy1, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int f2 = c3012Fy1.f();
        int g2 = c3012Fy1.g();
        while (f2 < g2 && !z) {
            char c2 = (char) c3012Fy1.e()[f2];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && ((c2 < '0' || c2 > '9') && c2 != '#' && c2 != '-' && c2 != '.' && c2 != '_'))) {
                z = true;
            } else {
                f2++;
                sb.append(c2);
            }
        }
        c3012Fy1.Z(f2 - c3012Fy1.f());
        return sb.toString();
    }

    @InterfaceC11300zs1
    public static String g(C3012Fy1 c3012Fy1, StringBuilder sb) {
        n(c3012Fy1);
        if (c3012Fy1.a() == 0) {
            return null;
        }
        String f2 = f(c3012Fy1, sb);
        if (!"".equals(f2)) {
            return f2;
        }
        return "" + ((char) c3012Fy1.L());
    }

    @InterfaceC11300zs1
    public static String h(C3012Fy1 c3012Fy1, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int f2 = c3012Fy1.f();
            String g2 = g(c3012Fy1, sb);
            if (g2 == null) {
                return null;
            }
            if (!"}".equals(g2) && !";".equals(g2)) {
                sb2.append(g2);
            } else {
                c3012Fy1.Y(f2);
                z = true;
            }
        }
        return sb2.toString();
    }

    @InterfaceC11300zs1
    public static String i(C3012Fy1 c3012Fy1, StringBuilder sb) {
        String str;
        n(c3012Fy1);
        if (c3012Fy1.a() < 5 || !"::cue".equals(c3012Fy1.I(5))) {
            return null;
        }
        int f2 = c3012Fy1.f();
        String g2 = g(c3012Fy1, sb);
        if (g2 == null) {
            return null;
        }
        if ("{".equals(g2)) {
            c3012Fy1.Y(f2);
            return "";
        }
        if (C9811tl1.c.equals(g2)) {
            str = l(c3012Fy1);
        } else {
            str = null;
        }
        if (!C9811tl1.d.equals(g(c3012Fy1, sb))) {
            return null;
        }
        return str;
    }

    public static void j(C3012Fy1 c3012Fy1, C10442wK2 c10442wK2, StringBuilder sb) {
        n(c3012Fy1);
        String f2 = f(c3012Fy1, sb);
        if (!"".equals(f2) && ":".equals(g(c3012Fy1, sb))) {
            n(c3012Fy1);
            String h2 = h(c3012Fy1, sb);
            if (h2 != null && !"".equals(h2)) {
                int f3 = c3012Fy1.f();
                String g2 = g(c3012Fy1, sb);
                if (!";".equals(g2)) {
                    if ("}".equals(g2)) {
                        c3012Fy1.Y(f3);
                    } else {
                        return;
                    }
                }
                if ("color".equals(f2)) {
                    c10442wK2.q(C5769dG.b(h2));
                } else if (g.equals(f2)) {
                    c10442wK2.n(C5769dG.b(h2));
                } else {
                    boolean z = true;
                    if (k.equals(f2)) {
                        if (l.equals(h2)) {
                            c10442wK2.w(1);
                        } else if (m.equals(h2)) {
                            c10442wK2.w(2);
                        }
                    } else if (n.equals(f2)) {
                        if (!"all".equals(h2) && !h2.startsWith(p)) {
                            z = false;
                        }
                        c10442wK2.p(z);
                    } else if (q.equals(f2)) {
                        if ("underline".equals(h2)) {
                            c10442wK2.B(true);
                        }
                    } else if (h.equals(f2)) {
                        c10442wK2.r(h2);
                    } else if (i.equals(f2)) {
                        if ("bold".equals(h2)) {
                            c10442wK2.o(true);
                        }
                    } else if (t.equals(f2)) {
                        if ("italic".equals(h2)) {
                            c10442wK2.u(true);
                        }
                    } else if (j.equals(f2)) {
                        e(h2, c10442wK2);
                    }
                }
            }
        }
    }

    public static char k(C3012Fy1 c3012Fy1, int i2) {
        return (char) c3012Fy1.e()[i2];
    }

    public static String l(C3012Fy1 c3012Fy1) {
        int f2 = c3012Fy1.f();
        int g2 = c3012Fy1.g();
        boolean z = false;
        while (f2 < g2 && !z) {
            int i2 = f2 + 1;
            if (((char) c3012Fy1.e()[f2]) == ')') {
                z = true;
            } else {
                z = false;
            }
            f2 = i2;
        }
        return c3012Fy1.I((f2 - 1) - c3012Fy1.f()).trim();
    }

    public static void m(C3012Fy1 c3012Fy1) {
        do {
        } while (!TextUtils.isEmpty(c3012Fy1.u()));
    }

    public static void n(C3012Fy1 c3012Fy1) {
        while (true) {
            for (boolean z = true; c3012Fy1.a() > 0 && z; z = false) {
                if (!c(c3012Fy1) && !b(c3012Fy1)) {
                }
            }
            return;
        }
    }

    public final void a(C10442wK2 c10442wK2, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = v.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    c10442wK2.A((String) C9542sf.g(matcher.group(1)));
                }
                str = str.substring(0, indexOf);
            }
            String[] J1 = TD2.J1(str, "\\.");
            String str2 = J1[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                c10442wK2.z(str2.substring(0, indexOf2));
                c10442wK2.y(str2.substring(indexOf2 + 1));
            } else {
                c10442wK2.z(str2);
            }
            if (J1.length > 1) {
                c10442wK2.x((String[]) TD2.q1(J1, 1, J1.length));
            }
        }
    }

    public List<C10442wK2> d(C3012Fy1 c3012Fy1) {
        boolean z;
        this.b.setLength(0);
        int f2 = c3012Fy1.f();
        m(c3012Fy1);
        this.a.W(c3012Fy1.e(), c3012Fy1.f());
        this.a.Y(f2);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i2 = i(this.a, this.b);
            if (i2 == null || !"{".equals(g(this.a, this.b))) {
                break;
            }
            C10442wK2 c10442wK2 = new C10442wK2();
            a(c10442wK2, i2);
            String str = null;
            boolean z2 = false;
            while (!z2) {
                int f3 = this.a.f();
                String g2 = g(this.a, this.b);
                if (g2 != null && !"}".equals(g2)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    this.a.Y(f3);
                    j(this.a, c10442wK2, this.b);
                }
                str = g2;
                z2 = z;
            }
            if ("}".equals(str)) {
                arrayList.add(c10442wK2);
            }
        }
        return arrayList;
    }
}
