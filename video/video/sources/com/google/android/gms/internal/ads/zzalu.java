package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.appevents.Q;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10196vK2;
import o.C9811tl1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzalu {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final zzek a = new zzek();
    public final StringBuilder b = new StringBuilder();

    @InterfaceC11300zs1
    public static String a(zzek zzekVar, StringBuilder sb) {
        c(zzekVar);
        if (zzekVar.u() == 0) {
            return null;
        }
        String d2 = d(zzekVar, sb);
        if (!"".equals(d2)) {
            return d2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) zzekVar.G());
        return sb2.toString();
    }

    public static void c(zzek zzekVar) {
        while (true) {
            for (boolean z = true; zzekVar.u() > 0 && z; z = false) {
                char c2 = (char) zzekVar.n()[zzekVar.w()];
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    int w = zzekVar.w();
                    int x = zzekVar.x();
                    byte[] n = zzekVar.n();
                    if (w + 2 <= x) {
                        int i = w + 1;
                        if (n[w] == 47) {
                            int i2 = w + 2;
                            if (n[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= x) {
                                        break;
                                    } else if (((char) n[i2]) == '*' && ((char) n[i3]) == '/') {
                                        x = i2 + 2;
                                        i2 = x;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                zzekVar.m(x - zzekVar.w());
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    zzekVar.m(1);
                }
            }
            return;
        }
    }

    public static String d(zzek zzekVar, StringBuilder sb) {
        sb.setLength(0);
        int w = zzekVar.w();
        int x = zzekVar.x();
        loop0: while (true) {
            for (boolean z = false; w < x && !z; z = true) {
                char c2 = (char) zzekVar.n()[w];
                if ((c2 >= 'A' && c2 <= 'Z') || ((c2 >= 'a' && c2 <= 'z') || ((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                    sb.append(c2);
                    w++;
                }
            }
        }
        zzekVar.m(w - zzekVar.w());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0305, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
        if (o.C9811tl1.d.equals(a(r4, r1)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List b(zzek zzekVar) {
        String str;
        int i;
        String sb;
        char c2;
        boolean z;
        StringBuilder sb2 = this.b;
        int i2 = 0;
        sb2.setLength(0);
        int w = zzekVar.w();
        do {
        } while (!TextUtils.isEmpty(zzekVar.T(StandardCharsets.UTF_8)));
        zzek zzekVar2 = this.a;
        zzekVar2.j(zzekVar.n(), zzekVar.w());
        zzekVar2.l(w);
        ArrayList arrayList = new ArrayList();
        while (true) {
            c(zzekVar2);
            if (zzekVar2.u() >= 5 && "::cue".equals(zzekVar2.b(5, StandardCharsets.UTF_8))) {
                int w2 = zzekVar2.w();
                String a = a(zzekVar2, sb2);
                if (a != null) {
                    if ("{".equals(a)) {
                        zzekVar2.l(w2);
                        str = "";
                    } else if (C9811tl1.c.equals(a)) {
                        int w3 = zzekVar2.w();
                        int x = zzekVar2.x();
                        int i3 = i2;
                        while (w3 < x && i3 == 0) {
                            int i4 = w3 + 1;
                            if (((char) zzekVar2.n()[w3]) == ')') {
                                i3 = 1;
                            } else {
                                i3 = i2;
                            }
                            w3 = i4;
                        }
                        str = zzekVar2.b((w3 - 1) - zzekVar2.w(), StandardCharsets.UTF_8).trim();
                    } else {
                        str = null;
                    }
                    if (str == null || !"{".equals(a(zzekVar2, sb2))) {
                        break;
                    }
                    zzalv zzalvVar = new zzalv();
                    if (!"".equals(str)) {
                        int indexOf = str.indexOf(91);
                        if (indexOf != -1) {
                            Matcher matcher = c.matcher(str.substring(indexOf));
                            if (matcher.matches()) {
                                String group = matcher.group(1);
                                group.getClass();
                                zzalvVar.w(group);
                            }
                            str = str.substring(i2, indexOf);
                        }
                        String str2 = zzeu.a;
                        String[] split = str.split("\\.", -1);
                        String str3 = split[i2];
                        int indexOf2 = str3.indexOf(35);
                        if (indexOf2 != -1) {
                            zzalvVar.v(str3.substring(i2, indexOf2));
                            zzalvVar.u(str3.substring(indexOf2 + 1));
                        } else {
                            zzalvVar.v(str3);
                        }
                        int length = split.length;
                        if (length > 1) {
                            zzalvVar.t((String[]) Arrays.copyOfRange(split, 1, length));
                        }
                    }
                    int i5 = i2;
                    String str4 = null;
                    while (i5 == 0) {
                        int w4 = zzekVar2.w();
                        str4 = a(zzekVar2, sb2);
                        if (str4 == null || "}".equals(str4)) {
                            i = 1;
                        } else {
                            i = i2;
                        }
                        if (i == 0) {
                            zzekVar2.l(w4);
                            c(zzekVar2);
                            String d2 = d(zzekVar2, sb2);
                            if (!"".equals(d2) && ":".equals(a(zzekVar2, sb2))) {
                                c(zzekVar2);
                                StringBuilder sb3 = new StringBuilder();
                                int i6 = i2;
                                while (true) {
                                    if (i6 == 0) {
                                        int w5 = zzekVar2.w();
                                        String a2 = a(zzekVar2, sb2);
                                        if (a2 == null) {
                                            sb = null;
                                            break;
                                        } else if (!"}".equals(a2) && !";".equals(a2)) {
                                            sb3.append(a2);
                                        } else {
                                            zzekVar2.l(w5);
                                            i6 = 1;
                                        }
                                    } else {
                                        sb = sb3.toString();
                                        break;
                                    }
                                }
                                if (sb != null && !"".equals(sb)) {
                                    int w6 = zzekVar2.w();
                                    String a3 = a(zzekVar2, sb2);
                                    if (!";".equals(a3)) {
                                        if ("}".equals(a3)) {
                                            zzekVar2.l(w6);
                                        } else {
                                            continue;
                                        }
                                    }
                                    if ("color".equals(d2)) {
                                        zzalvVar.l(zzdi.a(sb));
                                    } else if (C10196vK2.g.equals(d2)) {
                                        zzalvVar.i(zzdi.a(sb));
                                    } else if (C10196vK2.k.equals(d2)) {
                                        if (C10196vK2.l.equals(sb)) {
                                            zzalvVar.q(1);
                                        } else if (C10196vK2.m.equals(sb)) {
                                            zzalvVar.q(2);
                                        }
                                    } else if (C10196vK2.n.equals(d2)) {
                                        if ("all".equals(sb) || sb.startsWith(C10196vK2.p)) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        zzalvVar.k(z);
                                    } else if (C10196vK2.q.equals(d2)) {
                                        if ("underline".equals(sb)) {
                                            zzalvVar.r(true);
                                        }
                                    } else if (C10196vK2.h.equals(d2)) {
                                        zzalvVar.m(sb);
                                    } else if (C10196vK2.i.equals(d2)) {
                                        if ("bold".equals(sb)) {
                                            zzalvVar.j(true);
                                        }
                                    } else if (C10196vK2.t.equals(d2)) {
                                        if ("italic".equals(sb)) {
                                            zzalvVar.p(true);
                                        }
                                    } else if (C10196vK2.j.equals(d2)) {
                                        Matcher matcher2 = d.matcher(zzfui.a(sb));
                                        if (!matcher2.matches()) {
                                            zzdx.f(C10196vK2.c, "Invalid font-size: '" + sb + "'.");
                                        } else {
                                            String group2 = matcher2.group(2);
                                            group2.getClass();
                                            int hashCode = group2.hashCode();
                                            if (hashCode != 37) {
                                                if (hashCode != 3240) {
                                                    if (hashCode == 3592 && group2.equals("px")) {
                                                        c2 = 0;
                                                        if (c2 == 0) {
                                                            if (c2 != 1) {
                                                                if (c2 == 2) {
                                                                    zzalvVar.o(3);
                                                                } else {
                                                                    throw new IllegalStateException();
                                                                }
                                                            } else {
                                                                zzalvVar.o(2);
                                                            }
                                                        } else {
                                                            zzalvVar.o(1);
                                                        }
                                                        String group3 = matcher2.group(1);
                                                        group3.getClass();
                                                        zzalvVar.n(Float.parseFloat(group3));
                                                    }
                                                    c2 = 65535;
                                                    if (c2 == 0) {
                                                    }
                                                    String group32 = matcher2.group(1);
                                                    group32.getClass();
                                                    zzalvVar.n(Float.parseFloat(group32));
                                                } else {
                                                    if (group2.equals(Q.k)) {
                                                        c2 = 1;
                                                        if (c2 == 0) {
                                                        }
                                                        String group322 = matcher2.group(1);
                                                        group322.getClass();
                                                        zzalvVar.n(Float.parseFloat(group322));
                                                    }
                                                    c2 = 65535;
                                                    if (c2 == 0) {
                                                    }
                                                    String group3222 = matcher2.group(1);
                                                    group3222.getClass();
                                                    zzalvVar.n(Float.parseFloat(group3222));
                                                }
                                            } else {
                                                if (group2.equals("%")) {
                                                    c2 = 2;
                                                    if (c2 == 0) {
                                                    }
                                                    String group32222 = matcher2.group(1);
                                                    group32222.getClass();
                                                    zzalvVar.n(Float.parseFloat(group32222));
                                                }
                                                c2 = 65535;
                                                if (c2 == 0) {
                                                }
                                                String group322222 = matcher2.group(1);
                                                group322222.getClass();
                                                zzalvVar.n(Float.parseFloat(group322222));
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        i5 = i;
                        i2 = 0;
                    }
                    if ("}".equals(str4)) {
                        arrayList.add(zzalvVar);
                    }
                    i2 = 0;
                }
            }
            str = null;
            if (str == null) {
                break;
            }
            break;
        }
    }
}
