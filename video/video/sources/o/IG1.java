package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* loaded from: classes4.dex */
public class IG1 extends N0 implements Serializable {
    private static final long serialVersionUID = 8533897440809599867L;
    public final EnumC10679xJ0 Y0;
    public final String[] Z;

    public IG1(List<String> list) {
        this(list, EnumC10679xJ0.SENSITIVE);
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        return q(accept((File) C11130zA1.U(path, new Function() { // from class: o.HG1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                File file;
                file = ((Path) obj).toFile();
                return file;
            }
        })));
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        return u(file == null ? null : file.getName());
    }

    @Override // o.N0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(C9811tl1.c);
        i(this.Z, sb);
        sb.append(C9811tl1.d);
        return sb.toString();
    }

    public final boolean u(final String str) {
        return Stream.of((Object[]) this.Z).anyMatch(new Predicate() { // from class: o.GG1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean o2;
                o2 = IG1.this.Y0.o(str, (String) obj);
                return o2;
            }
        });
    }

    public IG1(List<String> list, EnumC10679xJ0 enumC10679xJ0) {
        Objects.requireNonNull(list, "prefixes");
        this.Z = (String[]) list.toArray(HJ0.O);
        this.Y0 = EnumC10679xJ0.t(enumC10679xJ0, EnumC10679xJ0.SENSITIVE);
    }

    @Override // o.N0, o.HJ0, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return u(str);
    }

    public IG1(String str) {
        this(str, EnumC10679xJ0.SENSITIVE);
    }

    public IG1(String... strArr) {
        this(strArr, EnumC10679xJ0.SENSITIVE);
    }

    public IG1(String str, EnumC10679xJ0 enumC10679xJ0) {
        Objects.requireNonNull(str, "prefix");
        this.Z = new String[]{str};
        this.Y0 = EnumC10679xJ0.t(enumC10679xJ0, EnumC10679xJ0.SENSITIVE);
    }

    public IG1(String[] strArr, EnumC10679xJ0 enumC10679xJ0) {
        Objects.requireNonNull(strArr, "prefixes");
        this.Z = (String[]) strArr.clone();
        this.Y0 = EnumC10679xJ0.t(enumC10679xJ0, EnumC10679xJ0.SENSITIVE);
    }
}
