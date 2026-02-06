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

/* renamed from: o.cL2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5549cL2 extends N0 implements Serializable {
    private static final long serialVersionUID = -7426486598995782105L;
    public final EnumC10679xJ0 Y0;
    public final String[] Z;

    /* renamed from: o.cL2$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC10371w3<C5549cL2, b> {
        public String[] a;
        public EnumC10679xJ0 b = EnumC10679xJ0.SENSITIVE;

        @Override // o.XK0
        /* renamed from: f */
        public C5549cL2 get() {
            return new C5549cL2(this);
        }

        public b g(EnumC10679xJ0 enumC10679xJ0) {
            this.b = EnumC10679xJ0.t(enumC10679xJ0, EnumC10679xJ0.SENSITIVE);
            return this;
        }

        public b h(List<String> list) {
            i((String[]) ((List) C5549cL2.x(list)).toArray(HJ0.O));
            return this;
        }

        public b i(String... strArr) {
            this.a = (String[]) C5549cL2.x(strArr);
            return this;
        }
    }

    private boolean u(final String str) {
        return Stream.of((Object[]) this.Z).anyMatch(new Predicate() { // from class: o.bL2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean T;
                T = C4837Yq0.T(str, (String) obj, C5549cL2.this.Y0);
                return T;
            }
        });
    }

    public static b w() {
        return new b();
    }

    public static <T> T x(T t) {
        Objects.requireNonNull(t, "wildcards");
        return t;
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        return q(u(C11130zA1.V(path)));
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        return u(file.getName());
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

    public C5549cL2(b bVar) {
        this(bVar.b, bVar.a);
    }

    @Override // o.N0, o.HJ0, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return u(str);
    }

    public C5549cL2(EnumC10679xJ0 enumC10679xJ0, String... strArr) {
        this.Z = (String[]) ((String[]) x(strArr)).clone();
        this.Y0 = EnumC10679xJ0.t(enumC10679xJ0, EnumC10679xJ0.SENSITIVE);
    }

    @Deprecated
    public C5549cL2(List<String> list) {
        this(list, EnumC10679xJ0.SENSITIVE);
    }

    @Deprecated
    public C5549cL2(List<String> list, EnumC10679xJ0 enumC10679xJ0) {
        this(enumC10679xJ0, (String[]) ((List) x(list)).toArray(HJ0.O));
    }

    @Deprecated
    public C5549cL2(String str) {
        this(EnumC10679xJ0.SENSITIVE, (String) x(str));
    }

    @Deprecated
    public C5549cL2(String... strArr) {
        this(EnumC10679xJ0.SENSITIVE, strArr);
    }

    @Deprecated
    public C5549cL2(String str, EnumC10679xJ0 enumC10679xJ0) {
        this(enumC10679xJ0, str);
    }

    @Deprecated
    public C5549cL2(String[] strArr, EnumC10679xJ0 enumC10679xJ0) {
        this(enumC10679xJ0, strArr);
    }
}
