package o;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class Nx2 extends AbstractC3697My1 {
    public static final Pattern d = Pattern.compile(":/*([^/@]+)@[^/]+");
    public final String b;
    public final String c;

    public Nx2(String str, String str2) {
        super(EnumC3795Ny1.URI);
        this.b = i(str);
        this.c = str2;
    }

    public static boolean g(String str, int i) {
        int i2 = i + 1;
        int indexOf = str.indexOf(47, i2);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return TT1.e(str, i2, indexOf - i2);
    }

    public static String i(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(58);
        if (indexOf >= 0 && !g(trim, indexOf)) {
            return trim;
        }
        return "http://".concat(trim);
    }

    @Override // o.AbstractC3697My1
    public String a() {
        StringBuilder sb = new StringBuilder(30);
        AbstractC3697My1.c(this.c, sb);
        AbstractC3697My1.c(this.b, sb);
        return sb.toString();
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.b;
    }

    public boolean h() {
        return d.matcher(this.b).find();
    }
}
