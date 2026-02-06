package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import java.util.function.Function;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class BQ1 extends N0 implements Serializable {
    private static final long serialVersionUID = 4269646126155225062L;
    public final transient Function<Path, String> Y0;
    public final Pattern Z;

    public BQ1(Pattern pattern) {
        this(pattern, new AQ1());
    }

    public static Pattern t(String str, int i) {
        Objects.requireNonNull(str, "pattern");
        return Pattern.compile(str, i);
    }

    public static int u(EnumC10679xJ0 enumC10679xJ0) {
        if (EnumC10679xJ0.s(enumC10679xJ0)) {
            return 0;
        }
        return 2;
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        boolean z;
        String apply = this.Y0.apply(path);
        if (apply != null && this.Z.matcher(apply).matches()) {
            z = true;
        } else {
            z = false;
        }
        return q(z);
    }

    @Override // o.N0, o.HJ0, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.Z.matcher(str).matches();
    }

    @Override // o.N0
    public String toString() {
        return "RegexFileFilter [pattern=" + this.Z + C6566gU0.g;
    }

    public BQ1(Pattern pattern, Function<Path, String> function) {
        Objects.requireNonNull(pattern, "pattern");
        this.Z = pattern;
        this.Y0 = function == null ? new Function() { // from class: o.zQ1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Objects.toString((Path) obj);
            }
        } : function;
    }

    public BQ1(String str) {
        this(str, 0);
    }

    public BQ1(String str, int i) {
        this(t(str, i));
    }

    public BQ1(String str, EnumC10679xJ0 enumC10679xJ0) {
        this(t(str, u(enumC10679xJ0)));
    }
}
