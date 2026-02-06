package o;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.time.Duration;
import java.time.Instant;
import java.time.chrono.ChronoZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import o.C11130zA1;
import o.HQ;

/* renamed from: o.zA1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C11130zA1 {
    public static final OpenOption[] a = {C7376jq1.a(), C4089Qz1.a()};
    public static final OpenOption[] b = {C7376jq1.a(), GA1.a()};
    public static final CopyOption[] c = new CopyOption[0];
    public static final Z10[] d = new Z10[0];
    public static final FileAttribute<?>[] e = new FileAttribute[0];
    public static final FileVisitOption[] f = new FileVisitOption[0];
    public static final LinkOption[] g = new LinkOption[0];
    @Deprecated
    public static final LinkOption[] h;
    public static final LinkOption i;
    public static final OpenOption[] j;
    public static final Path[] k;

    /* renamed from: o.zA1$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public final boolean a;
        public final List<Path> b;
        public final List<Path> c;

        public static boolean a(Path path, Path path2) {
            FileSystem a = C10599wz1.a(path);
            FileSystem a2 = C10599wz1.a(path2);
            if (a == a2) {
                return C5747dA1.a(path, path2);
            }
            String a3 = C10842xz1.a(a);
            String a4 = C10842xz1.a(a2);
            String a5 = C4538Vo0.a(path);
            String a6 = C4538Vo0.a(path2);
            if (Objects.equals(a3, a4)) {
                return Objects.equals(a5, a6);
            }
            return c(a3, a5).equals(c(a4, a6));
        }

        public static boolean b(List<Path> list, List<Path> list2) {
            if (list.size() != list2.size()) {
                return false;
            }
            Iterator<Path> it = list.iterator();
            Iterator<Path> it2 = list2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                if (!a(N30.a(it.next()), N30.a(it2.next()))) {
                    return false;
                }
            }
            return true;
        }

        public static String c(String str, String str2) {
            return str2.replaceAll(C11298zs.h + str, ">");
        }

        public b(Path path, Path path2, int i, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
            List<Path> list;
            boolean z = true;
            List<Path> list2 = null;
            if (path == null && path2 == null) {
                this.a = true;
            } else {
                if ((path == null) ^ (path2 == null)) {
                    this.a = false;
                } else {
                    boolean a = YB1.a(path, linkOptionArr);
                    boolean a2 = YB1.a(path2, linkOptionArr);
                    if (!a && !a2) {
                        N4 h = C11130zA1.h(path, i, fileVisitOptionArr);
                        N4 h2 = C11130zA1.h(path2, i, fileVisitOptionArr);
                        if (h.s().size() == h2.s().size() && h.t().size() == h2.t().size()) {
                            if (!b(h.u(path, true, null), h2.u(path2, true, null))) {
                                this.a = false;
                            } else {
                                List<Path> v = h.v(path, true, null);
                                List<Path> v2 = h2.v(path2, true, null);
                                this.a = b(v, v2);
                                list2 = v;
                                list = v2;
                                this.b = list2;
                                this.c = list;
                            }
                        } else {
                            this.a = false;
                        }
                    } else {
                        this.a = (a && a2) ? z : false;
                    }
                }
            }
            list = null;
            this.b = list2;
            this.c = list;
        }
    }

    static {
        LinkOption linkOption;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        h = new LinkOption[]{linkOption};
        i = null;
        j = new OpenOption[0];
        k = new Path[0];
    }

    public static HQ.j A(Path path, LinkOption[] linkOptionArr, Z10... z10Arr) throws IOException {
        return ((C5229b20) f1(new C5229b20(HQ.d(), linkOptionArr, z10Arr, new String[0]), path)).i();
    }

    public static boolean A0(Path path, LinkOption... linkOptionArr) {
        Objects.requireNonNull(path, "path");
        return YB1.a(N30.a(path), linkOptionArr);
    }

    public static HQ.j B(final Path path, final Z10... z10Arr) throws IOException {
        final LinkOption[] z0 = z0();
        return (HQ.j) j1(c0(path), z0, B0(z10Arr), new RJ0() { // from class: o.vA1
            @Override // o.RJ0
            public final Object apply(Object obj) {
                HQ.j i2;
                PosixFileAttributes posixFileAttributes = (PosixFileAttributes) obj;
                i2 = ((C5229b20) C11130zA1.f1(new C5229b20(HQ.d(), z0, z10Arr, new String[0]), path)).i();
                return i2;
            }
        });
    }

    public static boolean B0(Z10... z10Arr) {
        if (z10Arr == null) {
            return false;
        }
        return Stream.of((Object[]) z10Arr).anyMatch(new Predicate() { // from class: o.xA1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C11130zA1.f((Z10) obj);
            }
        });
    }

    public static HQ.j C(Path path) throws IOException {
        return E(path, d);
    }

    public static <A extends BasicFileAttributes> A C0(Path path, Class<A> cls, LinkOption... linkOptionArr) {
        if (path == null) {
            return null;
        }
        try {
            return (A) C3505Kz1.a(path, cls, linkOptionArr);
        } catch (IOException | UnsupportedOperationException unused) {
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:3|(2:5|(14:7|8|9|(2:11|12)|15|16|17|(1:19)|20|(2:22|(1:24))|25|(1:27)|(1:30)|31))|38|8|9|(0)|15|16|17|(0)|20|(0)|25|(0)|(0)|31) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[Catch: AccessDeniedException -> 0x0033, TRY_LEAVE, TryCatch #0 {AccessDeniedException -> 0x0033, blocks: (B:10:0x001e, B:12:0x0024), top: B:37:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, blocks: (B:15:0x0038, B:17:0x003e, B:20:0x0049, B:22:0x004f, B:24:0x0055, B:25:0x0059, B:27:0x005f), top: B:39:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, blocks: (B:15:0x0038, B:17:0x003e, B:20:0x0049, B:22:0x004f, B:24:0x0055, B:25:0x0059, B:27:0x005f), top: B:39:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #1 {all -> 0x0047, blocks: (B:15:0x0038, B:17:0x003e, B:20:0x0049, B:22:0x004f, B:24:0x0055, B:25:0x0059, B:27:0x005f), top: B:39:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HQ.j D(Path path, LinkOption[] linkOptionArr, Z10... z10Arr) throws NoSuchFileException, IOException {
        long j2;
        Path c0;
        PosixFileAttributes posixFileAttributes;
        boolean isSymbolicLink;
        boolean isSymbolicLink2;
        if (!C10002uY.a(path, linkOptionArr)) {
            HQ.j d2 = HQ.d();
            long j3 = 0;
            try {
                if (K(path, linkOptionArr)) {
                    isSymbolicLink2 = Files.isSymbolicLink(path);
                    if (!isSymbolicLink2) {
                        j2 = Files.size(path);
                        if (QA1.a(path)) {
                            d2.c().a();
                            d2.a().add(j2);
                            return d2;
                        }
                        c0 = c0(path);
                        posixFileAttributes = null;
                        if (B0(z10Arr)) {
                            posixFileAttributes = J0(c0, linkOptionArr);
                            T0(path, false, linkOptionArr);
                        }
                        if (K(path, linkOptionArr)) {
                            isSymbolicLink = Files.isSymbolicLink(path);
                            if (!isSymbolicLink) {
                                j3 = Files.size(path);
                            }
                        }
                        if (QA1.a(path)) {
                            d2.c().a();
                            d2.a().add(j3);
                        }
                        if (posixFileAttributes != null) {
                            EB1.a(c0, C3992Pz1.a(posixFileAttributes));
                        }
                        return d2;
                    }
                }
                if (B0(z10Arr)) {
                }
                if (K(path, linkOptionArr)) {
                }
                if (QA1.a(path)) {
                }
                if (posixFileAttributes != null) {
                }
                return d2;
            } catch (Throwable th) {
                if (posixFileAttributes != null) {
                    EB1.a(c0, C3992Pz1.a(posixFileAttributes));
                }
                throw th;
            }
            j2 = 0;
            if (QA1.a(path)) {
            }
            c0 = c0(path);
            posixFileAttributes = null;
        } else {
            C6236fB1.a();
            throw C6730hA1.a(C4538Vo0.a(path));
        }
    }

    public static BasicFileAttributes D0(Path path) throws IOException {
        return C3505Kz1.a(path, C3407Jz1.a(), new LinkOption[0]);
    }

    public static HQ.j E(Path path, Z10... z10Arr) throws IOException {
        return D(path, z0(), z10Arr);
    }

    public static BasicFileAttributes E0(Path path, LinkOption... linkOptionArr) {
        return C0(path, C3407Jz1.a(), linkOptionArr);
    }

    public static void F(Path path) {
        Objects.requireNonNull(path);
        C6150eq0.a(N30.a(path)).deleteOnExit();
    }

    @Deprecated
    public static BasicFileAttributes F0(Path path) {
        return E0(path, g);
    }

    public static boolean G(Path path, Path path2) throws IOException {
        return H(path, path2, g, j, f);
    }

    public static DosFileAttributes G0(Path path, LinkOption... linkOptionArr) {
        return C5019aA1.a(C0(path, C4975Zz1.a(), linkOptionArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean H(Path path, Path path2, LinkOption[] linkOptionArr, OpenOption[] openOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
        int binarySearch;
        if (path == null && path2 == null) {
            return true;
        }
        if (path == null || path2 == null) {
            return false;
        }
        if (A0(path, new LinkOption[0]) && A0(path2, new LinkOption[0])) {
            return true;
        }
        b bVar = new b(path, path2, Integer.MAX_VALUE, linkOptionArr, fileVisitOptionArr);
        if (!bVar.a) {
            return false;
        }
        List<Path> list = bVar.b;
        List<Path> list2 = bVar.c;
        boolean v0 = v0(path, path2);
        for (Path path3 : list) {
            Path a2 = N30.a(path3);
            if (v0) {
                binarySearch = Collections.binarySearch(list2, a2);
            } else {
                binarySearch = Collections.binarySearch(list2, a2, Comparator.comparing(new Function() { // from class: o.wA1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        String c2;
                        c2 = C11130zA1.b.c(C10842xz1.a(C10599wz1.a(r1)), C4538Vo0.a((Path) obj));
                        return c2;
                    }
                }));
            }
            if (binarySearch >= 0) {
                if ((v0 && !M(C11004yf0.a(path, a2), C11004yf0.a(path2, a2), linkOptionArr, openOptionArr)) || !M(C5023aB1.a(path, C4538Vo0.a(a2)), C5023aB1.a(path2, C4538Vo0.a(a2)), linkOptionArr, openOptionArr)) {
                    return false;
                }
                while (r10.hasNext()) {
                }
            } else {
                throw new IllegalStateException("Unexpected mismatch.");
            }
        }
        return true;
    }

    public static Path H0(Path path) throws IOException {
        boolean isSymbolicLink;
        if (path != null) {
            isSymbolicLink = Files.isSymbolicLink(path);
            if (isSymbolicLink) {
                return KB1.a(path);
            }
            return path;
        }
        return null;
    }

    public static boolean I(Path path, Path path2) throws IOException {
        return J(path, path2, Integer.MAX_VALUE, g, f);
    }

    public static BasicFileAttributes I0(Path path, LinkOption... linkOptionArr) {
        PosixFileAttributes J0 = J0(path, linkOptionArr);
        if (J0 != null) {
            return J0;
        }
        return G0(path, linkOptionArr);
    }

    public static boolean J(Path path, Path path2, int i2, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
        return new b(path, path2, i2, linkOptionArr, fileVisitOptionArr).a;
    }

    public static PosixFileAttributes J0(Path path, LinkOption... linkOptionArr) {
        return C7457kA1.a(C0(path, C7214jA1.a(), linkOptionArr));
    }

    public static boolean K(Path path, LinkOption... linkOptionArr) {
        if (path != null) {
            if (linkOptionArr != null) {
                if (C3015Fz1.a(path, linkOptionArr)) {
                    return true;
                }
            } else if (C3015Fz1.a(path, new LinkOption[0])) {
                return true;
            }
        }
        return false;
    }

    public static String K0(Path path, Charset charset) throws IOException {
        byte[] readAllBytes;
        readAllBytes = Files.readAllBytes(path);
        return new String(readAllBytes, IB.g(charset));
    }

    public static boolean L(Path path, Path path2) throws IOException {
        return M(path, path2, g, j);
    }

    public static List<Path> L0(Collection<Path> collection, final Path path, boolean z, Comparator<? super Path> comparator) {
        Stream<Path> stream = collection.stream();
        Objects.requireNonNull(path);
        Stream map = stream.map(new Function() { // from class: o.sA1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Path relativize;
                relativize = path.relativize((Path) obj);
                return relativize;
            }
        });
        if (z) {
            if (comparator == null) {
                map = map.sorted();
            } else {
                map = map.sorted(comparator);
            }
        }
        return (List) map.collect(Collectors.toList());
    }

    public static boolean M(Path path, Path path2, LinkOption[] linkOptionArr, OpenOption[] openOptionArr) throws IOException {
        long size;
        long size2;
        InputStream newInputStream;
        InputStream newInputStream2;
        if (path == null && path2 == null) {
            return true;
        }
        if (path == null || path2 == null) {
            return false;
        }
        Path a2 = C10356vz1.a(path);
        Path a3 = C10356vz1.a(path2);
        boolean K = K(a2, linkOptionArr);
        if (K != K(a3, linkOptionArr)) {
            return false;
        }
        if (!K) {
            return true;
        }
        if (!C10002uY.a(a2, linkOptionArr)) {
            if (!C10002uY.a(a3, linkOptionArr)) {
                size = Files.size(a2);
                size2 = Files.size(a3);
                if (size != size2) {
                    return false;
                }
                if (v0(path, path2) && C5747dA1.a(path, path2)) {
                    return true;
                }
                try {
                    FN1 fn1 = FN1.READ_ONLY;
                    RandomAccessFile l = fn1.l(C7965mB1.a(path, linkOptionArr));
                    RandomAccessFile l2 = fn1.l(C7965mB1.a(path2, linkOptionArr));
                    try {
                        boolean a4 = IN1.a(l, l2);
                        if (l2 != null) {
                            l2.close();
                        }
                        if (l != null) {
                            l.close();
                        }
                        return a4;
                    } catch (Throwable th) {
                        if (l2 != null) {
                            try {
                                l2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (UnsupportedOperationException unused) {
                    newInputStream = Files.newInputStream(a2, openOptionArr);
                    try {
                        newInputStream2 = Files.newInputStream(a3, openOptionArr);
                        boolean O = C7743lL0.O(newInputStream, newInputStream2);
                        if (newInputStream2 != null) {
                            newInputStream2.close();
                        }
                        if (newInputStream != null) {
                            newInputStream.close();
                        }
                        return O;
                    } catch (Throwable th3) {
                        if (newInputStream != null) {
                            try {
                                newInputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
            }
            throw new IOException("Can't compare directories, only files: " + a3);
        }
        throw new IOException("Can't compare directories, only files: " + a2);
    }

    public static Path M0(Path path, String str, LinkOption... linkOptionArr) {
        Objects.requireNonNull(path, str);
        if (K(path, linkOptionArr)) {
            return path;
        }
        throw new IllegalArgumentException("File system element for parameter '" + str + "' does not exist: '" + path + "'");
    }

    public static Path[] N(InterfaceC6430fz1 interfaceC6430fz1, Path... pathArr) {
        Objects.requireNonNull(interfaceC6430fz1, "filter");
        if (pathArr == null) {
            return k;
        }
        return (Path[]) ((List) O(interfaceC6430fz1, Stream.of((Object[]) pathArr), Collectors.toList())).toArray(k);
    }

    public static Path N0(Path path, Path path2) {
        FileSystem a2 = C10599wz1.a(path);
        FileSystem a3 = C10599wz1.a(path2);
        if (a2 == a3) {
            return C11004yf0.a(path, path2);
        }
        String a4 = C10842xz1.a(a3);
        String a5 = C10842xz1.a(a2);
        String a6 = C4538Vo0.a(path2);
        if (!Objects.equals(a4, a5)) {
            a6 = a6.replace(a4, a5);
        }
        return C5023aB1.a(path, a6);
    }

    public static <R, A> R O(final InterfaceC6430fz1 interfaceC6430fz1, Stream<Path> stream, Collector<? super Path, A, R> collector) {
        Objects.requireNonNull(interfaceC6430fz1, "filter");
        Objects.requireNonNull(collector, "collector");
        if (stream == null) {
            return (R) Stream.empty().collect(collector);
        }
        return (R) stream.filter(new Predicate() { // from class: o.uA1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C11130zA1.e(InterfaceC6430fz1.this, (Path) obj);
            }
        }).collect(collector);
    }

    public static boolean O0(Path path, boolean z, LinkOption... linkOptionArr) throws IOException {
        DosFileAttributeView S = S(path, linkOptionArr);
        if (S != null) {
            C4480Uz1.a(S, z);
            return true;
        }
        return false;
    }

    public static List<AclEntry> P(Path path) throws IOException {
        AclFileAttributeView Q = Q(path, new LinkOption[0]);
        if (Q == null) {
            return null;
        }
        return C7961mA1.a(Q);
    }

    public static void P0(Path path, Path path2) throws IOException {
        Objects.requireNonNull(path, "sourceFile");
        LB1.a(path2, b0(path, new LinkOption[0]));
    }

    public static AclFileAttributeView Q(Path path, LinkOption... linkOptionArr) {
        return C6487gA1.a(C10405wB1.a(path, C6232fA1.a(), linkOptionArr));
    }

    public static boolean Q0(Path path, boolean z, LinkOption... linkOptionArr) throws IOException {
        return R0(path, z, Arrays.asList(C4868Yz1.a(), C5262bA1.a()), linkOptionArr);
    }

    public static String R(Path path) {
        Path a2;
        if (path == null || (a2 = C11247zf0.a(path)) == null) {
            return null;
        }
        return C4837Yq0.L(C4538Vo0.a(a2));
    }

    public static boolean R0(Path path, boolean z, List<PosixFilePermission> list, LinkOption... linkOptionArr) throws IOException {
        if (path != null) {
            Set a2 = MB1.a(path, linkOptionArr);
            HashSet hashSet = new HashSet(a2);
            if (z) {
                hashSet.addAll(list);
            } else {
                hashSet.removeAll(list);
            }
            if (!hashSet.equals(a2)) {
                EB1.a(path, hashSet);
                return true;
            }
            return true;
        }
        return false;
    }

    public static DosFileAttributeView S(Path path, LinkOption... linkOptionArr) {
        return C4771Xz1.a(C10405wB1.a(path, C4674Wz1.a(), linkOptionArr));
    }

    public static void S0(Path path, boolean z, LinkOption... linkOptionArr) throws IOException {
        Set a2 = MB1.a(path, linkOptionArr);
        List asList = Arrays.asList(C3798Nz1.a());
        List asList2 = Arrays.asList(C4868Yz1.a());
        if (z) {
            a2.addAll(asList);
            a2.removeAll(asList2);
        } else {
            a2.addAll(asList);
            a2.addAll(asList2);
        }
        EB1.a(path, a2);
    }

    public static String T(Path path) {
        String V = V(path);
        if (V != null) {
            return C4837Yq0.n(V);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
        if (O0(r2, r3, r4) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Path T0(Path path, boolean z, LinkOption... linkOptionArr) throws IOException {
        Path c0 = c0(path);
        if (t0(c0, linkOptionArr)) {
            if (z) {
                S0(path, z, linkOptionArr);
                Q0(c0, false, linkOptionArr);
            } else {
                Q0(c0, true, linkOptionArr);
            }
            return path;
        }
        throw new IOException(String.format("DOS or POSIX file operations not available for '%s', linkOptions %s", path, Arrays.toString(linkOptionArr)));
    }

    public static <R> R U(Path path, Function<Path, R> function) {
        Path path2;
        if (path != null) {
            path2 = C11247zf0.a(path);
        } else {
            path2 = null;
        }
        if (path2 == null) {
            return null;
        }
        return function.apply(path2);
    }

    public static long U0(Path path) throws IOException {
        long size;
        M0(path, "path", new LinkOption[0]);
        if (!C10002uY.a(path, new LinkOption[0])) {
            size = Files.size(path);
            return size;
        }
        return W0(path);
    }

    public static String V(Path path) {
        return (String) U(path, new Function() { // from class: o.rA1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String path2;
                path2 = ((Path) obj).toString();
                return path2;
            }
        });
    }

    public static BigInteger V0(Path path) throws IOException {
        long size;
        M0(path, "path", new LinkOption[0]);
        if (!C10002uY.a(path, new LinkOption[0])) {
            size = Files.size(path);
            return BigInteger.valueOf(size);
        }
        return X0(path);
    }

    public static FileTime W(File file) throws IOException {
        Path path;
        path = file.toPath();
        return Z(path, null, g);
    }

    public static long W0(Path path) throws IOException {
        return r(path).a().s().longValue();
    }

    public static FileTime X(URI uri) throws IOException {
        return Z(C10891yB1.a(uri), null, g);
    }

    public static BigInteger X0(Path path) throws IOException {
        return s(path).a().t();
    }

    public static FileTime Y(URL url) throws IOException, URISyntaxException {
        return X(url.toURI());
    }

    public static Path Y0(Path path) {
        String a2 = C10842xz1.a(C10599wz1.a(path));
        String V = V(path);
        if (V != null && V.endsWith(a2)) {
            return C5989eA1.a(path, V.substring(0, V.length() - 1));
        }
        return path;
    }

    public static FileTime Z(Path path, FileTime fileTime, LinkOption... linkOptionArr) throws IOException {
        if (C3015Fz1.a(path, new LinkOption[0])) {
            return b0(path, linkOptionArr);
        }
        return fileTime;
    }

    public static Set<FileVisitOption> Z0(FileVisitOption... fileVisitOptionArr) {
        if (fileVisitOptionArr == null) {
            return EnumSet.noneOf(C7700lA1.a());
        }
        return (Set) Stream.of((Object[]) fileVisitOptionArr).collect(Collectors.toSet());
    }

    public static FileTime a0(Path path, LinkOption... linkOptionArr) throws IOException {
        return Z(path, null, linkOptionArr);
    }

    public static <T> List<T> a1(Iterable<T> iterable) {
        return (List) StreamSupport.stream(iterable.spliterator(), false).collect(Collectors.toList());
    }

    public static FileTime b0(Path path, LinkOption... linkOptionArr) throws IOException {
        Objects.requireNonNull(path, "path");
        return FB1.a(N30.a(path), linkOptionArr);
    }

    public static List<Path> b1(Iterable<Path> iterable) {
        List<Path> a1 = a1(iterable);
        Collections.sort(a1);
        return a1;
    }

    public static Path c0(Path path) {
        if (path == null) {
            return null;
        }
        return C2438Af0.a(path);
    }

    public static Path c1(Path path) throws IOException {
        Objects.requireNonNull(path, "file");
        if (!C3015Fz1.a(path, new LinkOption[0])) {
            u(path, new FileAttribute[0]);
            ZB1.a(path, new FileAttribute[0]);
            return path;
        }
        C4639Wp0.p(path);
        return path;
    }

    public static /* synthetic */ boolean d(InterfaceC6430fz1 interfaceC6430fz1, boolean z, Path path) {
        BasicFileAttributes basicFileAttributes;
        FileVisitResult fileVisitResult;
        if (z) {
            basicFileAttributes = E0(path, g);
        } else {
            basicFileAttributes = null;
        }
        FileVisitResult a2 = interfaceC6430fz1.a(path, basicFileAttributes);
        fileVisitResult = FileVisitResult.CONTINUE;
        if (a2 == fileVisitResult) {
            return true;
        }
        return false;
    }

    public static Path d0(String str, String str2) {
        Path path;
        if (str != null && !str.isEmpty()) {
            str2 = System.getProperty(str, str2);
        }
        if (str2 != null) {
            path = Paths.get(str2, new String[0]);
            return path;
        }
        return null;
    }

    public static <T extends FileVisitor<? super Path>> T d1(T t, String str, String... strArr) throws IOException {
        Path path;
        path = Paths.get(str, strArr);
        return (T) f1(t, path);
    }

    public static /* synthetic */ boolean e(InterfaceC6430fz1 interfaceC6430fz1, Path path) {
        FileVisitResult fileVisitResult;
        if (path != null) {
            try {
                FileVisitResult a2 = interfaceC6430fz1.a(path, D0(path));
                fileVisitResult = FileVisitResult.CONTINUE;
                if (a2 == fileVisitResult) {
                    return true;
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    public static PosixFileAttributeView e0(Path path, LinkOption... linkOptionArr) {
        return C4383Tz1.a(C10405wB1.a(path, C4286Sz1.a(), linkOptionArr));
    }

    public static <T extends FileVisitor<? super Path>> T e1(T t, URI uri) throws IOException {
        return (T) f1(t, C10891yB1.a(uri));
    }

    public static /* synthetic */ boolean f(Z10 z10) {
        if (z10 == EnumC3317Jb2.OVERRIDE_READ_ONLY) {
            return true;
        }
        return false;
    }

    public static Path f0() {
        Path path;
        path = Paths.get(C3961Pq0.t0(), new String[0]);
        return path;
    }

    public static <T extends FileVisitor<? super Path>> T f1(T t, Path path) throws IOException {
        C9591sr0.a(path, t);
        return t;
    }

    public static boolean g0(Path path, LinkOption... linkOptionArr) {
        if (path != null && C10002uY.a(path, linkOptionArr)) {
            return true;
        }
        return false;
    }

    public static <T extends FileVisitor<? super Path>> T g1(T t, Path path, Set<FileVisitOption> set, int i2) throws IOException {
        P30.a(path, set, i2, t);
        return t;
    }

    public static N4 h(Path path, int i2, FileVisitOption[] fileVisitOptionArr) throws IOException {
        return (N4) g1(N4.r().l(new UnaryOperator() { // from class: o.tA1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Path Y0;
                Y0 = C11130zA1.Y0((Path) obj);
                return Y0;
            }
        }).get(), path, Z0(fileVisitOptionArr), i2);
    }

    public static boolean h0(Path path) throws IOException {
        if (C10002uY.a(path, new LinkOption[0])) {
            return i0(path);
        }
        return j0(path);
    }

    public static boolean h1(Path path, Duration duration, LinkOption... linkOptionArr) {
        Objects.requireNonNull(path, "file");
        Instant a2 = C4536Vn2.a(C9262rU0.a(), duration);
        boolean z = false;
        while (!K(path, linkOptionArr)) {
            try {
                Instant a3 = C9262rU0.a();
                if (C8204nA1.a(a3, a2)) {
                    return false;
                }
                try {
                    C5174ao2.b(C8691pA1.a(Math.min(100L, C6016eH0.a(C8447oA1.a(a2, C6016eH0.a(a3))))));
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Exception unused2) {
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return K(path, linkOptionArr);
    }

    public static HQ.j i(Path path) throws IOException {
        return j(path, d);
    }

    public static boolean i0(Path path) throws IOException {
        DirectoryStream a2 = C6491gB1.a(path);
        try {
            boolean z = !YA1.a(a2).hasNext();
            if (a2 != null) {
                C4577Vz1.a(a2);
            }
            return z;
        } catch (Throwable th) {
            if (a2 != null) {
                try {
                    C4577Vz1.a(a2);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static Stream<Path> i1(Path path, final InterfaceC6430fz1 interfaceC6430fz1, int i2, final boolean z, FileVisitOption... fileVisitOptionArr) throws IOException {
        return C10320vr0.a(path, i2, fileVisitOptionArr).filter(new Predicate() { // from class: o.qA1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C11130zA1.d(InterfaceC6430fz1.this, z, (Path) obj);
            }
        });
    }

    public static HQ.j j(Path path, Z10... z10Arr) throws IOException {
        return ((C9922uD) f1(new C9922uD(HQ.d(), z10Arr, new String[0]), path)).i();
    }

    public static boolean j0(Path path) throws IOException {
        long size;
        size = Files.size(path);
        if (size <= 0) {
            return true;
        }
        return false;
    }

    public static <R> R j1(Path path, LinkOption[] linkOptionArr, boolean z, RJ0<PosixFileAttributes, R> rj0) throws IOException {
        PosixFileAttributes posixFileAttributes;
        if (z) {
            posixFileAttributes = J0(path, linkOptionArr);
        } else {
            posixFileAttributes = null;
        }
        try {
            return rj0.apply(posixFileAttributes);
        } finally {
            if (posixFileAttributes != null && path != null && C3015Fz1.a(path, linkOptionArr)) {
                EB1.a(path, C3992Pz1.a(posixFileAttributes));
            }
        }
    }

    public static int k(Path path, FileTime fileTime, LinkOption... linkOptionArr) throws IOException {
        return C4186Rz1.a(b0(path, linkOptionArr), fileTime);
    }

    public static boolean k0(Path path, long j2, LinkOption... linkOptionArr) throws IOException {
        return m0(path, C3895Oz1.a(j2), linkOptionArr);
    }

    public static Path k1(Path path, CharSequence charSequence, Charset charset, OpenOption... openOptionArr) throws IOException {
        Objects.requireNonNull(path, "path");
        Objects.requireNonNull(charSequence, "charSequence");
        KA1.a(path, String.valueOf(charSequence).getBytes(IB.g(charset)), openOptionArr);
        return path;
    }

    public static boolean l(FileSystem fileSystem, FileSystem fileSystem2) throws IOException {
        if (Objects.equals(fileSystem, fileSystem2)) {
            return true;
        }
        List<Path> b1 = b1(C5504cA1.a(fileSystem));
        List<Path> b12 = b1(C5504cA1.a(fileSystem2));
        if (b1.size() != b12.size()) {
            return false;
        }
        for (int i2 = 0; i2 < b1.size(); i2++) {
            if (!G(N30.a(b1.get(i2)), N30.a(b12.get(i2)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean l0(Path path, Path path2) throws IOException {
        return m0(path, b0(path2, new LinkOption[0]), new LinkOption[0]);
    }

    public static long m(XK0<InputStream> xk0, Path path, CopyOption... copyOptionArr) throws IOException {
        InputStream inputStream = xk0.get();
        try {
            long a2 = C9834tr0.a(inputStream, path, copyOptionArr);
            if (inputStream != null) {
                inputStream.close();
            }
            return a2;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static boolean m0(Path path, FileTime fileTime, LinkOption... linkOptionArr) throws IOException {
        if (A0(path, new LinkOption[0]) || k(path, fileTime, linkOptionArr) <= 0) {
            return false;
        }
        return true;
    }

    public static HQ.j n(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        Path a2 = UB1.a(path);
        return ((MP) f1(new MP(HQ.d(), a2, path2, copyOptionArr), a2)).i();
    }

    public static boolean n0(Path path, Instant instant, LinkOption... linkOptionArr) throws IOException {
        return m0(path, C6973iA1.a(instant), linkOptionArr);
    }

    public static Path o(URL url, Path path, CopyOption... copyOptionArr) throws IOException {
        Objects.requireNonNull(url);
        m(new C2983Fq0(url), path, copyOptionArr);
        return path;
    }

    public static boolean o0(Path path, ChronoZonedDateTime<?> chronoZonedDateTime, LinkOption... linkOptionArr) throws IOException {
        Objects.requireNonNull(chronoZonedDateTime, "czdt");
        return n0(path, C5665cq0.a(chronoZonedDateTime), linkOptionArr);
    }

    public static Path p(URL url, Path path, CopyOption... copyOptionArr) throws IOException {
        Path a2 = C5023aB1.a(path, C4837Yq0.q(url.getFile()));
        m(new C2983Fq0(url), a2, copyOptionArr);
        return a2;
    }

    public static boolean p0(Path path, long j2, LinkOption... linkOptionArr) throws IOException {
        return r0(path, C3895Oz1.a(j2), linkOptionArr);
    }

    public static Path q(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        Path a2 = C11247zf0.a(path);
        Objects.requireNonNull(a2, "source file name");
        return C10491wY.a(path, N0(path2, N30.a(a2)), copyOptionArr);
    }

    public static boolean q0(Path path, Path path2) throws IOException {
        return r0(path, b0(path2, new LinkOption[0]), new LinkOption[0]);
    }

    public static HQ.j r(Path path) throws IOException {
        return ((NQ) f1(NQ.p(), path)).i();
    }

    public static boolean r0(Path path, FileTime fileTime, LinkOption... linkOptionArr) throws IOException {
        if (A0(path, new LinkOption[0]) || k(path, fileTime, linkOptionArr) >= 0) {
            return false;
        }
        return true;
    }

    public static HQ.j s(Path path) throws IOException {
        return ((NQ) f1(NQ.o(), path)).i();
    }

    public static boolean s0(Path path, Instant instant, LinkOption... linkOptionArr) throws IOException {
        return r0(path, C6973iA1.a(instant), linkOptionArr);
    }

    public static Path t(Path path, LinkOption linkOption, FileAttribute<?>... fileAttributeArr) throws IOException {
        LinkOption linkOption2;
        boolean a2;
        Path c0 = c0(path);
        linkOption2 = LinkOption.NOFOLLOW_LINKS;
        if (linkOption != linkOption2) {
            c0 = H0(c0);
        }
        if (c0 == null) {
            return null;
        }
        if (linkOption == null) {
            a2 = C3015Fz1.a(c0, new LinkOption[0]);
        } else {
            a2 = C3015Fz1.a(c0, new LinkOption[]{linkOption});
        }
        if (a2) {
            return c0;
        }
        return XB1.a(c0, fileAttributeArr);
    }

    public static boolean t0(Path path, LinkOption... linkOptionArr) {
        if (K(path, linkOptionArr) && J0(path, linkOptionArr) != null) {
            return true;
        }
        return false;
    }

    public static Path u(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        LinkOption linkOption;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        return t(path, linkOption, fileAttributeArr);
    }

    public static boolean u0(Path path, LinkOption... linkOptionArr) {
        if (path != null && BB1.a(path, linkOptionArr)) {
            return true;
        }
        return false;
    }

    public static Path v() {
        Path path;
        path = Paths.get(UE.h, new String[0]);
        return path;
    }

    public static boolean v0(Path path, Path path2) {
        if (C10599wz1.a(path) == C10599wz1.a(path2)) {
            return true;
        }
        return false;
    }

    public static HQ.j w(Path path) throws IOException {
        return y(path, d);
    }

    public static DirectoryStream<Path> w0(Path path, InterfaceC6430fz1 interfaceC6430fz1) throws IOException {
        return C10809xr0.a(path, new T30(interfaceC6430fz1));
    }

    public static HQ.j x(Path path, LinkOption[] linkOptionArr, Z10... z10Arr) throws IOException {
        if (C10002uY.a(path, linkOptionArr)) {
            return A(path, linkOptionArr, z10Arr);
        }
        return D(path, linkOptionArr, z10Arr);
    }

    public static OutputStream x0(Path path, boolean z) throws IOException {
        OpenOption[] openOptionArr;
        LinkOption[] linkOptionArr = g;
        if (z) {
            openOptionArr = b;
        } else {
            openOptionArr = a;
        }
        return y0(path, linkOptionArr, openOptionArr);
    }

    public static HQ.j y(Path path, Z10... z10Arr) throws IOException {
        LinkOption linkOption;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        if (C10002uY.a(path, new LinkOption[]{linkOption})) {
            return B(path, z10Arr);
        }
        return E(path, z10Arr);
    }

    public static OutputStream y0(Path path, LinkOption[] linkOptionArr, OpenOption... openOptionArr) throws IOException {
        LinkOption linkOption;
        if (!K(path, linkOptionArr)) {
            if (linkOptionArr != null && linkOptionArr.length > 0) {
                linkOption = linkOptionArr[0];
            } else {
                linkOption = i;
            }
            t(path, linkOption, new FileAttribute[0]);
        }
        if (openOptionArr == null) {
            openOptionArr = j;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(openOptionArr));
        if (linkOptionArr == null) {
            linkOptionArr = g;
        }
        arrayList.addAll(Arrays.asList(linkOptionArr));
        return JA1.a(path, (OpenOption[]) arrayList.toArray(j));
    }

    public static HQ.j z(Path path) throws IOException {
        return B(path, d);
    }

    public static LinkOption[] z0() {
        return (LinkOption[]) h.clone();
    }
}
