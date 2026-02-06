package o;

import android.net.Uri;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C6848hf1;
import o.V12;

@Deprecated
/* loaded from: classes2.dex */
public final class W12 {
    public static final Pattern a = Pattern.compile("([a-z])=\\s?(.+)");
    public static final Pattern b = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");
    public static final Pattern c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");
    public static final String d = "v";
    public static final String e = "o";
    public static final String f = "s";
    public static final String g = "i";
    public static final String h = "u";
    public static final String i = "e";
    public static final String j = "p";
    public static final String k = "c";
    public static final String l = "b";
    public static final String m = "t";
    public static final String n = "k";

    /* renamed from: o  reason: collision with root package name */
    public static final String f652o = "a";
    public static final String p = "m";
    public static final String q = "r";
    public static final String r = "z";

    public static void a(V12.b bVar, C6848hf1.b bVar2) throws C3989Py1 {
        try {
            bVar.n(bVar2.j());
        } catch (IllegalArgumentException | IllegalStateException e2) {
            throw C3989Py1.c(null, e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01a1, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static V12 b(String str) throws C3989Py1 {
        String[] s;
        char c2;
        boolean z;
        V12.b bVar = new V12.b();
        C6848hf1.b bVar2 = null;
        for (String str2 : com.google.android.exoplayer2.source.rtsp.h.s(str)) {
            if (!"".equals(str2)) {
                Matcher matcher = a.matcher(str2);
                if (matcher.matches()) {
                    String str3 = (String) C9542sf.g(matcher.group(1));
                    String str4 = (String) C9542sf.g(matcher.group(2));
                    switch (str3.hashCode()) {
                        case 97:
                            if (str3.equals("a")) {
                                c2 = 11;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 98:
                            if (str3.equals("b")) {
                                c2 = '\b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 99:
                            if (str3.equals("c")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 100:
                        case 102:
                        case 103:
                        case 104:
                        case 106:
                        case 108:
                        case 110:
                        case 113:
                        case 119:
                        case 120:
                        case 121:
                        default:
                            c2 = 65535;
                            break;
                        case 101:
                            if (str3.equals(i)) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 105:
                            if (str3.equals("i")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 107:
                            if (str3.equals("k")) {
                                c2 = '\n';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 109:
                            if (str3.equals("m")) {
                                c2 = '\f';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 111:
                            if (str3.equals(e)) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 112:
                            if (str3.equals("p")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 114:
                            if (str3.equals("r")) {
                                c2 = C8206nB.d;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 115:
                            if (str3.equals("s")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 116:
                            if (str3.equals("t")) {
                                c2 = '\t';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 117:
                            if (str3.equals("u")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 118:
                            if (str3.equals("v")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 122:
                            if (str3.equals(r)) {
                                c2 = 14;
                                break;
                            }
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            if ("0".equals(str4)) {
                                continue;
                            } else {
                                throw C3989Py1.c(String.format("SDP version %s is not supported.", str4), null);
                            }
                        case 1:
                            bVar.t(str4);
                            continue;
                        case 2:
                            bVar.w(str4);
                            continue;
                        case 3:
                            if (bVar2 == null) {
                                bVar.v(str4);
                                continue;
                            } else {
                                bVar2.p(str4);
                                break;
                            }
                        case 4:
                            bVar.y(Uri.parse(str4));
                            continue;
                        case 5:
                            bVar.r(str4);
                            continue;
                        case 6:
                            bVar.u(str4);
                            continue;
                        case 7:
                            if (bVar2 == null) {
                                bVar.q(str4);
                                continue;
                            } else {
                                bVar2.n(str4);
                                break;
                            }
                        case '\b':
                            String[] J1 = TD2.J1(str4, ":\\s?");
                            if (J1.length == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C9542sf.a(z);
                            int parseInt = Integer.parseInt(J1[1]);
                            if (bVar2 == null) {
                                bVar.p(parseInt * 1000);
                                continue;
                            } else {
                                bVar2.m(parseInt * 1000);
                                break;
                            }
                        case '\t':
                            bVar.x(str4);
                            continue;
                        case '\n':
                            if (bVar2 == null) {
                                bVar.s(str4);
                                continue;
                            } else {
                                bVar2.o(str4);
                                break;
                            }
                        case 11:
                            Matcher matcher2 = b.matcher(str4);
                            if (matcher2.matches()) {
                                String str5 = (String) C9542sf.g(matcher2.group(1));
                                String g2 = C6108ef2.g(matcher2.group(2));
                                if (bVar2 == null) {
                                    bVar.m(str5, g2);
                                    continue;
                                } else {
                                    bVar2.i(str5, g2);
                                    break;
                                }
                            } else {
                                throw C3989Py1.c("Malformed Attribute line: " + str2, null);
                            }
                        case '\f':
                            if (bVar2 != null) {
                                a(bVar, bVar2);
                            }
                            bVar2 = c(str4);
                            continue;
                    }
                } else {
                    throw C3989Py1.c("Malformed SDP line: " + str2, null);
                }
            }
        }
        if (bVar2 != null) {
            a(bVar, bVar2);
        }
        try {
            return bVar.o();
        } catch (IllegalArgumentException | IllegalStateException e2) {
            throw C3989Py1.c(null, e2);
        }
    }

    public static C6848hf1.b c(String str) throws C3989Py1 {
        Matcher matcher = c.matcher(str);
        if (matcher.matches()) {
            String str2 = (String) C9542sf.g(matcher.group(1));
            String str3 = (String) C9542sf.g(matcher.group(2));
            try {
                return new C6848hf1.b(str2, Integer.parseInt(str3), (String) C9542sf.g(matcher.group(3)), Integer.parseInt((String) C9542sf.g(matcher.group(4))));
            } catch (NumberFormatException e2) {
                throw C3989Py1.c("Malformed SDP media description line: " + str, e2);
            }
        }
        throw C3989Py1.c("Malformed SDP media description line: " + str, null);
    }
}
