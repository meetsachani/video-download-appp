package o;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
/* loaded from: classes2.dex */
public final class K72 extends C8376nt {
    public static final String b1 = ".exo";
    public static final String c1 = ".v3.exo";
    public static final Pattern d1 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern e1 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern f1 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public K72(String str, long j, long j2, long j3, @InterfaceC11300zs1 File file) {
        super(str, j, j2, j3, file);
    }

    @InterfaceC11300zs1
    public static K72 j(File file, long j, long j2, C9355rt c9355rt) {
        String l;
        long j3;
        String name = file.getName();
        if (!name.endsWith(c1)) {
            file = p(file, c9355rt);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = f1.matcher(name);
        if (!matcher.matches() || (l = c9355rt.l(Integer.parseInt((String) C9542sf.g(matcher.group(1))))) == null) {
            return null;
        }
        if (j == -1) {
            j = file2.length();
        }
        long j4 = j;
        if (j4 == 0) {
            return null;
        }
        long parseLong = Long.parseLong((String) C9542sf.g(matcher.group(2)));
        if (j2 == C10323vs.b) {
            j3 = Long.parseLong((String) C9542sf.g(matcher.group(3)));
        } else {
            j3 = j2;
        }
        return new K72(l, parseLong, j4, j3, file2);
    }

    @InterfaceC11300zs1
    public static K72 l(File file, long j, C9355rt c9355rt) {
        return j(file, j, C10323vs.b, c9355rt);
    }

    public static K72 m(String str, long j, long j2) {
        return new K72(str, j, j2, C10323vs.b, null);
    }

    public static K72 n(String str, long j) {
        return new K72(str, j, -1L, C10323vs.b, null);
    }

    public static File o(File file, int i, long j, long j2) {
        return new File(file, i + UE.h + j + UE.h + j2 + c1);
    }

    @InterfaceC11300zs1
    public static File p(File file, C9355rt c9355rt) {
        String str;
        String name = file.getName();
        Matcher matcher = e1.matcher(name);
        if (matcher.matches()) {
            str = TD2.a2((String) C9542sf.g(matcher.group(1)));
        } else {
            matcher = d1.matcher(name);
            if (matcher.matches()) {
                str = (String) C9542sf.g(matcher.group(1));
            } else {
                str = null;
            }
        }
        if (str == null) {
            return null;
        }
        File o2 = o((File) C9542sf.k(file.getParentFile()), c9355rt.f(str), Long.parseLong((String) C9542sf.g(matcher.group(2))), Long.parseLong((String) C9542sf.g(matcher.group(3))));
        if (!file.renameTo(o2)) {
            return null;
        }
        return o2;
    }

    public K72 i(File file, long j) {
        C9542sf.i(this.Y0);
        return new K72(this.X, this.Y, this.Z, j, file);
    }
}
