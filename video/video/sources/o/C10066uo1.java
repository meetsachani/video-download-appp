package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* renamed from: o.uo1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10066uo1 extends N0 implements Serializable {
    private static final long serialVersionUID = 176844364689077340L;
    public final EnumC10679xJ0 Y0;
    public final String[] Z;

    public C10066uo1(List<String> list) {
        this(list, (EnumC10679xJ0) null);
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        return q(u(C11130zA1.V(path)));
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        return file != null && u(file.getName());
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
        return Stream.of((Object[]) this.Z).anyMatch(new Predicate() { // from class: o.to1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean l;
                l = C10066uo1.this.Y0.l(str, (String) obj);
                return l;
            }
        });
    }

    public final EnumC10679xJ0 v(EnumC10679xJ0 enumC10679xJ0) {
        return EnumC10679xJ0.t(enumC10679xJ0, EnumC10679xJ0.SENSITIVE);
    }

    public C10066uo1(List<String> list, EnumC10679xJ0 enumC10679xJ0) {
        Objects.requireNonNull(list, "names");
        this.Z = (String[]) list.toArray(HJ0.O);
        this.Y0 = v(enumC10679xJ0);
    }

    @Override // o.N0, o.HJ0, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return u(str);
    }

    public C10066uo1(String str) {
        this(str, EnumC10679xJ0.SENSITIVE);
    }

    public C10066uo1(String... strArr) {
        this(strArr, EnumC10679xJ0.SENSITIVE);
    }

    public C10066uo1(String str, EnumC10679xJ0 enumC10679xJ0) {
        Objects.requireNonNull(str, "name");
        this.Z = new String[]{str};
        this.Y0 = v(enumC10679xJ0);
    }

    public C10066uo1(String[] strArr, EnumC10679xJ0 enumC10679xJ0) {
        Objects.requireNonNull(strArr, "names");
        this.Z = (String[]) strArr.clone();
        this.Y0 = v(enumC10679xJ0);
    }
}
