package o;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

/* renamed from: o.Es0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2882Es0 {
    public static BufferedReader A(Path path) {
        return (BufferedReader) C8643oy2.f(new RJ0() { // from class: o.fs0
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return C7137ir0.a((Path) obj);
            }
        }, path);
    }

    public static BufferedReader B(Path path, Charset charset) {
        return (BufferedReader) C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.Tr0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return FA1.a((Path) obj, (Charset) obj2);
            }
        }, path, charset);
    }

    public static BufferedWriter C(Path path, Charset charset, OpenOption... openOptionArr) {
        return (BufferedWriter) C8643oy2.h(new InterfaceC5305bL0() { // from class: o.Zr0
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                return C10853y2.a((Path) obj, (Charset) obj2, (OpenOption[]) obj3);
            }
        }, path, charset, openOptionArr);
    }

    public static BufferedWriter D(Path path, OpenOption... openOptionArr) {
        return (BufferedWriter) C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.Ds0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return C9099qr0.a((Path) obj, (OpenOption[]) obj2);
            }
        }, path, openOptionArr);
    }

    public static SeekableByteChannel E(Path path, Set<? extends OpenOption> set, FileAttribute<?>... fileAttributeArr) {
        return (SeekableByteChannel) C8643oy2.h(new InterfaceC5305bL0() { // from class: o.ps0
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                return C8126mr0.a((Path) obj, (Set) obj2, (FileAttribute[]) obj3);
            }
        }, path, set, fileAttributeArr);
    }

    public static SeekableByteChannel F(Path path, OpenOption... openOptionArr) {
        return (SeekableByteChannel) C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.ns0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                SeekableByteChannel newByteChannel;
                newByteChannel = Files.newByteChannel((Path) obj, (OpenOption[]) obj2);
                return newByteChannel;
            }
        }, path, openOptionArr);
    }

    public static DirectoryStream<Path> G(Path path) {
        return C6734hB1.a(C8643oy2.f(new RJ0() { // from class: o.Bs0
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return C6491gB1.a((Path) obj);
            }
        }, path));
    }

    public static DirectoryStream<Path> H(Path path, String str) {
        return C6734hB1.a(C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.bs0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return HB1.a((Path) obj, (String) obj2);
            }
        }, path, str));
    }

    public static DirectoryStream<Path> I(Path path, DirectoryStream.Filter<? super Path> filter) {
        return C6734hB1.a(C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.Vr0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return C10809xr0.a((Path) obj, (DirectoryStream.Filter) obj2);
            }
        }, path, filter));
    }

    public static InputStream J(Path path, OpenOption... openOptionArr) {
        return (InputStream) C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.ws0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                InputStream newInputStream;
                newInputStream = Files.newInputStream((Path) obj, (OpenOption[]) obj2);
                return newInputStream;
            }
        }, path, openOptionArr);
    }

    public static OutputStream K(Path path, OpenOption... openOptionArr) {
        return (OutputStream) C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.Fr0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                OutputStream newOutputStream;
                newOutputStream = Files.newOutputStream((Path) obj, (OpenOption[]) obj2);
                return newOutputStream;
            }
        }, path, openOptionArr);
    }

    public static String L(Path path) {
        return (String) C8643oy2.f(new RJ0() { // from class: o.ks0
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return C7379jr0.a((Path) obj);
            }
        }, path);
    }

    public static byte[] M(Path path) {
        return (byte[]) C8643oy2.f(new RJ0() { // from class: o.Pr0
            @Override // o.RJ0
            public final Object apply(Object obj) {
                byte[] readAllBytes;
                readAllBytes = Files.readAllBytes((Path) obj);
                return readAllBytes;
            }
        }, path);
    }

    public static List<String> N(Path path) {
        return (List) C8643oy2.f(new RJ0() { // from class: o.Br0
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return C6895hr0.a((Path) obj);
            }
        }, path);
    }

    public static List<String> O(Path path, Charset charset) {
        return (List) C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.is0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return MA1.a((Path) obj, (Charset) obj2);
            }
        }, path, charset);
    }

    public static <A extends BasicFileAttributes> A P(Path path, Class<A> cls, LinkOption... linkOptionArr) {
        return (A) C9916uB1.a(C8643oy2.h(new InterfaceC5305bL0() { // from class: o.Ur0
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                return C3505Kz1.a((Path) obj, (Class) obj2, (LinkOption[]) obj3);
            }
        }, path, cls, linkOptionArr));
    }

    public static Map<String, Object> Q(Path path, String str, LinkOption... linkOptionArr) {
        return (Map) C8643oy2.h(new InterfaceC5305bL0() { // from class: o.Gr0
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                return TB1.a((Path) obj, (String) obj2, (LinkOption[]) obj3);
            }
        }, path, str, linkOptionArr);
    }

    public static Path R(Path path) {
        return N30.a(C8643oy2.f(new RJ0() { // from class: o.hs0
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return KB1.a((Path) obj);
            }
        }, path));
    }

    public static Path S(Path path, String str, Object obj, LinkOption... linkOptionArr) {
        return N30.a(C8643oy2.g(new InterfaceC8243nK0() { // from class: o.gs0
            @Override // o.InterfaceC8243nK0
            public final Object c(Object obj2, Object obj3, Object obj4, Object obj5) {
                return CB1.a((Path) obj2, (String) obj3, obj4, (LinkOption[]) obj5);
            }
        }, path, str, obj, linkOptionArr));
    }

    public static Path T(Path path, FileTime fileTime) {
        return N30.a(C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.cs0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                Path lastModifiedTime;
                lastModifiedTime = Files.setLastModifiedTime((Path) obj, (FileTime) obj2);
                return lastModifiedTime;
            }
        }, path, fileTime));
    }

    public static Path U(Path path, UserPrincipal userPrincipal) {
        return N30.a(C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.Ar0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return NB1.a((Path) obj, (UserPrincipal) obj2);
            }
        }, path, userPrincipal));
    }

    public static Path V(Path path, Set<PosixFilePermission> set) {
        return N30.a(C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.qs0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return EB1.a((Path) obj, (Set) obj2);
            }
        }, path, set));
    }

    public static long W(Path path) {
        return ((Long) C8643oy2.f(new RJ0() { // from class: o.Xr0
            @Override // o.RJ0
            public final Object apply(Object obj) {
                long size;
                size = Files.size((Path) obj);
                return Long.valueOf(size);
            }
        }, path)).longValue();
    }

    public static Stream<Path> X(Path path, int i, FileVisitOption... fileVisitOptionArr) {
        return (Stream) C8643oy2.h(new InterfaceC5305bL0() { // from class: o.Or0
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                return C10320vr0.a((Path) obj, ((Integer) obj2).intValue(), (FileVisitOption[]) obj3);
            }
        }, path, Integer.valueOf(i), fileVisitOptionArr);
    }

    public static Stream<Path> Y(Path path, FileVisitOption... fileVisitOptionArr) {
        return (Stream) C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.xs0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return C8369nr0.a((Path) obj, (FileVisitOption[]) obj2);
            }
        }, path, fileVisitOptionArr);
    }

    public static Path Z(Path path, FileVisitor<? super Path> fileVisitor) {
        return N30.a(C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.Hr0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return C9591sr0.a((Path) obj, (FileVisitor) obj2);
            }
        }, path, fileVisitor));
    }

    public static long a(InputStream inputStream, Path path, CopyOption... copyOptionArr) {
        return ((Long) C8643oy2.h(new InterfaceC5305bL0() { // from class: o.Jr0
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                return Long.valueOf(C9834tr0.a((InputStream) obj, (Path) obj2, (CopyOption[]) obj3));
            }
        }, inputStream, path, copyOptionArr)).longValue();
    }

    public static Path a0(Path path, Set<FileVisitOption> set, int i, FileVisitor<? super Path> fileVisitor) {
        return N30.a(C8643oy2.g(new InterfaceC8243nK0() { // from class: o.vs0
            @Override // o.InterfaceC8243nK0
            public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
                Path walkFileTree;
                walkFileTree = Files.walkFileTree((Path) obj, (Set) obj2, ((Integer) obj3).intValue(), (FileVisitor) obj4);
                return walkFileTree;
            }
        }, path, set, Integer.valueOf(i), fileVisitor));
    }

    public static long b(Path path, OutputStream outputStream) {
        return ((Long) C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.Rr0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return Long.valueOf(C10566wr0.a((Path) obj, (OutputStream) obj2));
            }
        }, path, outputStream)).longValue();
    }

    public static Path b0(Path path, Iterable<? extends CharSequence> iterable, Charset charset, OpenOption... openOptionArr) {
        return N30.a(C8643oy2.g(new InterfaceC8243nK0() { // from class: o.js0
            @Override // o.InterfaceC8243nK0
            public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
                return HA1.a((Path) obj, (Iterable) obj2, (Charset) obj3, (OpenOption[]) obj4);
            }
        }, path, iterable, charset, openOptionArr));
    }

    public static Path c(Path path, Path path2, CopyOption... copyOptionArr) {
        return N30.a(C8643oy2.h(new InterfaceC5305bL0() { // from class: o.Cr0
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                Path copy;
                copy = Files.copy((Path) obj, (Path) obj2, (CopyOption[]) obj3);
                return copy;
            }
        }, path, path2, copyOptionArr));
    }

    public static Path c0(Path path, Iterable<? extends CharSequence> iterable, OpenOption... openOptionArr) {
        return N30.a(C8643oy2.h(new InterfaceC5305bL0() { // from class: o.os0
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                return C7865lr0.a((Path) obj, (Iterable) obj2, (OpenOption[]) obj3);
            }
        }, path, iterable, openOptionArr));
    }

    public static Path d(Path path, FileAttribute<?>... fileAttributeArr) {
        return N30.a(C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.Lr0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return XB1.a((Path) obj, (FileAttribute[]) obj2);
            }
        }, path, fileAttributeArr));
    }

    public static Path d0(Path path, byte[] bArr, OpenOption... openOptionArr) {
        return N30.a(C8643oy2.h(new InterfaceC5305bL0() { // from class: o.Kr0
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                return KA1.a((Path) obj, (byte[]) obj2, (OpenOption[]) obj3);
            }
        }, path, bArr, openOptionArr));
    }

    public static Path e(Path path, FileAttribute<?>... fileAttributeArr) {
        return N30.a(C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.Dr0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return OB1.a((Path) obj, (FileAttribute[]) obj2);
            }
        }, path, fileAttributeArr));
    }

    public static Path f(Path path, FileAttribute<?>... fileAttributeArr) {
        return N30.a(C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.rs0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return ZB1.a((Path) obj, (FileAttribute[]) obj2);
            }
        }, path, fileAttributeArr));
    }

    public static Path g(Path path, Path path2) {
        return N30.a(C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.Mr0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return WB1.a((Path) obj, (Path) obj2);
            }
        }, path, path2));
    }

    public static Path h(Path path, Path path2, FileAttribute<?>... fileAttributeArr) {
        return N30.a(C8643oy2.h(new InterfaceC5305bL0() { // from class: o.ts0
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                return IB1.a((Path) obj, (Path) obj2, (FileAttribute[]) obj3);
            }
        }, path, path2, fileAttributeArr));
    }

    public static Path i(String str, FileAttribute<?>... fileAttributeArr) {
        return N30.a(C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.zs0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return C10159vB1.a((String) obj, (FileAttribute[]) obj2);
            }
        }, str, fileAttributeArr));
    }

    public static Path j(Path path, String str, FileAttribute<?>... fileAttributeArr) {
        return N30.a(C8643oy2.h(new InterfaceC5305bL0() { // from class: o.Ir0
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                return C5270bC1.a((Path) obj, (String) obj2, (FileAttribute[]) obj3);
            }
        }, path, str, fileAttributeArr));
    }

    public static Path k(String str, String str2, FileAttribute<?>... fileAttributeArr) {
        return N30.a(C8643oy2.h(new InterfaceC5305bL0() { // from class: o.Yr0
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                return C11134zB1.a((String) obj, (String) obj2, (FileAttribute[]) obj3);
            }
        }, str, str2, fileAttributeArr));
    }

    public static Path l(Path path, String str, String str2, FileAttribute<?>... fileAttributeArr) {
        return N30.a(C8643oy2.g(new InterfaceC8243nK0() { // from class: o.ls0
            @Override // o.InterfaceC8243nK0
            public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
                return PB1.a((Path) obj, (String) obj2, (String) obj3, (FileAttribute[]) obj4);
            }
        }, path, str, str2, fileAttributeArr));
    }

    public static void m(Path path) {
        C8643oy2.b(new EJ0() { // from class: o.es0
            @Override // o.EJ0
            public final void accept(Object obj) {
                GB1.a((Path) obj);
            }
        }, path);
    }

    public static boolean n(Path path) {
        return ((Boolean) C8643oy2.f(new RJ0() { // from class: o.us0
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return Boolean.valueOf(QA1.a((Path) obj));
            }
        }, path)).booleanValue();
    }

    public static Stream<Path> o(Path path, int i, BiPredicate<Path, BasicFileAttributes> biPredicate, FileVisitOption... fileVisitOptionArr) {
        return (Stream) C8643oy2.g(new InterfaceC8243nK0() { // from class: o.as0
            @Override // o.InterfaceC8243nK0
            public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
                return C11052yr0.a((Path) obj, ((Integer) obj2).intValue(), (BiPredicate) obj3, (FileVisitOption[]) obj4);
            }
        }, path, Integer.valueOf(i), biPredicate, fileVisitOptionArr);
    }

    public static Object p(Path path, String str, LinkOption... linkOptionArr) {
        return C8643oy2.h(new InterfaceC5305bL0() { // from class: o.Qr0
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                return JB1.a((Path) obj, (String) obj2, (LinkOption[]) obj3);
            }
        }, path, str, linkOptionArr);
    }

    public static FileStore q(Path path) {
        return C9348rr0.a(C8643oy2.f(new RJ0() { // from class: o.Er0
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return DB1.a((Path) obj);
            }
        }, path));
    }

    public static FileTime r(Path path, LinkOption... linkOptionArr) {
        return C8856pr0.a(C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.Cs0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                FileTime lastModifiedTime;
                lastModifiedTime = Files.getLastModifiedTime((Path) obj, (LinkOption[]) obj2);
                return lastModifiedTime;
            }
        }, path, linkOptionArr));
    }

    public static UserPrincipal s(Path path, LinkOption... linkOptionArr) {
        return C11295zr0.a(C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.ds0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return C5512cC1.a((Path) obj, (LinkOption[]) obj2);
            }
        }, path, linkOptionArr));
    }

    public static Set<PosixFilePermission> t(Path path, LinkOption... linkOptionArr) {
        return (Set) C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.Wr0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return MB1.a((Path) obj, (LinkOption[]) obj2);
            }
        }, path, linkOptionArr);
    }

    public static boolean u(Path path) {
        return ((Boolean) C8643oy2.f(new RJ0() { // from class: o.ss0
            @Override // o.RJ0
            public final Object apply(Object obj) {
                boolean isHidden;
                isHidden = Files.isHidden((Path) obj);
                return Boolean.valueOf(isHidden);
            }
        }, path)).booleanValue();
    }

    public static boolean v(Path path, Path path2) {
        return ((Boolean) C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.As0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return Boolean.valueOf(C3602Lz1.a((Path) obj, (Path) obj2));
            }
        }, path, path2)).booleanValue();
    }

    public static Stream<String> w(Path path) {
        return (Stream) C8643oy2.f(new RJ0() { // from class: o.ys0
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return C8613or0.a((Path) obj);
            }
        }, path);
    }

    public static Stream<String> x(Path path, Charset charset) {
        return (Stream) C8643oy2.e(new InterfaceC8483oJ0() { // from class: o.ms0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return C7622kr0.a((Path) obj, (Charset) obj2);
            }
        }, path, charset);
    }

    public static Stream<Path> y(Path path) {
        return (Stream) C8643oy2.f(new RJ0() { // from class: o.Nr0
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return C10077ur0.a((Path) obj);
            }
        }, path);
    }

    public static Path z(Path path, Path path2, CopyOption... copyOptionArr) {
        return N30.a(C8643oy2.h(new InterfaceC5305bL0() { // from class: o.Sr0
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                return RB1.a((Path) obj, (Path) obj2, (CopyOption[]) obj3);
            }
        }, path, path2, copyOptionArr));
    }
}
