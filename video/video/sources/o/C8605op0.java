package o;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* renamed from: o.op0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8605op0 {
    public static final HJ0 a = E(g(k(), C("CVS")));
    public static final HJ0 b = E(g(k(), C(".svn")));

    public static HJ0 A(HJ0 hj0) {
        if (hj0 == null) {
            return C7857lp0.Z;
        }
        return C7857lp0.Z.e(hj0);
    }

    public static HJ0 B(HJ0 hj0) {
        if (hj0 == null) {
            return b;
        }
        return g(hj0, b);
    }

    public static HJ0 C(String str) {
        return new C10066uo1(str);
    }

    public static HJ0 D(String str, EnumC10679xJ0 enumC10679xJ0) {
        return new C10066uo1(str, enumC10679xJ0);
    }

    public static HJ0 E(HJ0 hj0) {
        return hj0.negate();
    }

    public static HJ0 F(HJ0... hj0Arr) {
        return new C7643kw1(O(hj0Arr));
    }

    @Deprecated
    public static HJ0 G(HJ0 hj0, HJ0 hj02) {
        return new C7643kw1(hj0, hj02);
    }

    public static HJ0 H(String str) {
        return new IG1(str);
    }

    public static HJ0 I(String str, EnumC10679xJ0 enumC10679xJ0) {
        return new IG1(str, enumC10679xJ0);
    }

    public static HJ0 J(long j) {
        return new S82(j);
    }

    public static HJ0 K(long j, boolean z) {
        return new S82(j, z);
    }

    public static HJ0 L(long j, long j2) {
        return new S82(j, true).e(new S82(j2 + 1, false));
    }

    public static HJ0 M(String str) {
        return new C6116eh2(str);
    }

    public static HJ0 N(String str, EnumC10679xJ0 enumC10679xJ0) {
        return new C6116eh2(str, enumC10679xJ0);
    }

    public static List<HJ0> O(HJ0... hj0Arr) {
        Objects.requireNonNull(hj0Arr, "filters");
        return (List) Stream.of((Object[]) hj0Arr).map(new Function() { // from class: o.np0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                HJ0 hj0 = (HJ0) obj;
                Objects.requireNonNull(hj0);
                return hj0;
            }
        }).collect(Collectors.toList());
    }

    public static HJ0 P() {
        return Cu2.Y;
    }

    public static HJ0 a(long j) {
        return new X7(j);
    }

    public static HJ0 b(long j, boolean z) {
        return new X7(j, z);
    }

    public static HJ0 c(File file) {
        return new X7(file);
    }

    public static HJ0 d(File file, boolean z) {
        return new X7(file, z);
    }

    public static HJ0 e(Date date) {
        return new X7(date);
    }

    public static HJ0 f(Date date, boolean z) {
        return new X7(date, z);
    }

    public static HJ0 g(HJ0... hj0Arr) {
        return new O8(O(hj0Arr));
    }

    @Deprecated
    public static HJ0 h(HJ0 hj0, HJ0 hj02) {
        return new O8(hj0, hj02);
    }

    public static HJ0 i(FileFilter fileFilter) {
        return new T10(fileFilter);
    }

    public static HJ0 j(FilenameFilter filenameFilter) {
        return new T10(filenameFilter);
    }

    public static HJ0 k() {
        return S30.Z;
    }

    public static HJ0 l() {
        return C7363jn0.Y;
    }

    public static HJ0 m() {
        return C7857lp0.Z;
    }

    public static File[] n(HJ0 hj0, Iterable<File> iterable) {
        return (File[]) q(hj0, iterable).toArray(C3961Pq0.r);
    }

    public static File[] o(HJ0 hj0, File... fileArr) {
        Objects.requireNonNull(hj0, "filter");
        if (fileArr == null) {
            return C3961Pq0.r;
        }
        return (File[]) ((List) p(hj0, Stream.of((Object[]) fileArr), Collectors.toList())).toArray(C3961Pq0.r);
    }

    public static <R, A> R p(final HJ0 hj0, Stream<File> stream, Collector<? super File, A, R> collector) {
        Objects.requireNonNull(hj0, "filter");
        Objects.requireNonNull(collector, "collector");
        if (stream == null) {
            return (R) Stream.empty().collect(collector);
        }
        return (R) stream.filter(new Predicate() { // from class: o.mp0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return HJ0.this.accept((File) obj);
            }
        }).collect(collector);
    }

    public static List<File> q(HJ0 hj0, Iterable<File> iterable) {
        if (iterable == null) {
            return Collections.EMPTY_LIST;
        }
        return (List) p(hj0, StreamSupport.stream(iterable.spliterator(), false), Collectors.toList());
    }

    public static List<File> r(HJ0 hj0, File... fileArr) {
        return Arrays.asList(o(hj0, fileArr));
    }

    public static Set<File> s(HJ0 hj0, Iterable<File> iterable) {
        if (iterable == null) {
            return Collections.EMPTY_SET;
        }
        return (Set) p(hj0, StreamSupport.stream(iterable.spliterator(), false), Collectors.toSet());
    }

    public static Set<File> t(HJ0 hj0, File... fileArr) {
        return new HashSet(Arrays.asList(o(hj0, fileArr)));
    }

    public static HJ0 u(String str) {
        return new C7931m71(str);
    }

    public static HJ0 v(String str, long j) {
        return new C7931m71(str, j);
    }

    public static HJ0 w(byte[] bArr) {
        return new C7931m71(bArr);
    }

    public static HJ0 x(byte[] bArr, long j) {
        return new C7931m71(bArr, j);
    }

    public static HJ0 y(HJ0 hj0) {
        if (hj0 == null) {
            return a;
        }
        return g(hj0, a);
    }

    public static HJ0 z(HJ0 hj0) {
        if (hj0 == null) {
            return S30.Z;
        }
        return S30.Z.e(hj0);
    }
}
