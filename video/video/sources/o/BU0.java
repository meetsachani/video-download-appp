package o;

import java.io.PrintStream;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class BU0 extends AbstractC9882u3 {
    public static final BU0 c = new BU0();
    public static final String d = "hardware";
    public static final String e = "locale";
    public static final String f = "os";
    public static final String g = "runtime";
    public static final String h = "version";
    public static final String i = "vm";

    public static void n(String[] strArr) {
        System.out.println(BU0.class);
        PrintStream printStream = System.out;
        BU0 bu0 = c;
        printStream.printf("%s = %s%n", "version", bu0.lookup("version"));
        System.out.printf("%s = %s%n", g, bu0.lookup(g));
        System.out.printf("%s = %s%n", i, bu0.lookup(i));
        System.out.printf("%s = %s%n", f, bu0.lookup(f));
        System.out.printf("%s = %s%n", "hardware", bu0.lookup("hardware"));
        System.out.printf("%s = %s%n", "locale", bu0.lookup("locale"));
    }

    public String g() {
        return "processors: " + Runtime.getRuntime().availableProcessors() + ", architecture: " + k("os.arch") + l("-", "sun.arch.data.model") + l(", instruction sets: ", "sun.cpu.isalist");
    }

    public String h() {
        return "default locale: " + Locale.getDefault() + ", platform encoding: " + k("file.encoding");
    }

    public String i() {
        return k("os.name") + C4500Ve2.b + k("os.version") + l(C4500Ve2.b, "sun.os.patch.level") + ", architecture: " + k("os.arch") + l("-", "sun.arch.data.model");
    }

    public String j() {
        return k("java.runtime.name") + " (build " + k("java.runtime.version") + ") from " + k("java.vendor");
    }

    public final String k(String str) {
        return C2730De2.f.lookup(str);
    }

    public final String l(String str, String str2) {
        String k = k(str2);
        if (C4500Ve2.I0(k)) {
            return "";
        }
        return str + k;
    }

    @Override // o.InterfaceC10759xe2
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1097462182:
                if (str.equals("locale")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3556:
                if (str.equals(f)) {
                    c2 = 1;
                    break;
                }
                break;
            case 3767:
                if (str.equals(i)) {
                    c2 = 2;
                    break;
                }
                break;
            case 116909544:
                if (str.equals("hardware")) {
                    c2 = 3;
                    break;
                }
                break;
            case 351608024:
                if (str.equals("version")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1550962648:
                if (str.equals(g)) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return h();
            case 1:
                return i();
            case 2:
                return m();
            case 3:
                return g();
            case 4:
                return "Java version " + k("java.version");
            case 5:
                return j();
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public String m() {
        return k("java.vm.name") + " (build " + k("java.vm.version") + C6566gU0.h + k("java.vm.info") + C9811tl1.d;
    }
}
