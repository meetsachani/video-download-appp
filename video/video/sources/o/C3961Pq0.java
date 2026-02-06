package o;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.math.BigInteger;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import o.HQ;
import o.N4;

/* renamed from: o.Pq0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3961Pq0 {
    public static final String a = "file";
    public static final long b = 1024;
    public static final BigInteger c;
    public static final long d = 1048576;
    public static final BigInteger e;
    public static final long f = 1073741824;
    public static final BigInteger g;
    public static final long h = 1099511627776L;
    public static final BigInteger i;
    public static final long j = 1125899906842624L;
    public static final BigInteger k;
    public static final long l = 1152921504606846976L;
    public static final BigInteger m;
    public static final BigInteger n;

    /* renamed from: o  reason: collision with root package name */
    public static final BigInteger f586o;
    public static final BigInteger p;
    public static final BigInteger q;
    public static final File[] r;

    static {
        BigInteger valueOf = BigInteger.valueOf(1024L);
        c = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        e = multiply;
        BigInteger multiply2 = valueOf.multiply(multiply);
        g = multiply2;
        BigInteger multiply3 = valueOf.multiply(multiply2);
        i = multiply3;
        BigInteger multiply4 = valueOf.multiply(multiply3);
        k = multiply4;
        BigInteger multiply5 = valueOf.multiply(multiply4);
        m = multiply5;
        BigInteger multiply6 = valueOf.multiply(multiply5);
        n = multiply6;
        BigInteger multiply7 = valueOf.multiply(multiply6);
        f586o = multiply7;
        BigInteger multiply8 = valueOf.multiply(multiply7);
        p = multiply8;
        q = valueOf.multiply(multiply8);
        r = new File[0];
    }

    public static File A(File file, String str) {
        if (file.isFile()) {
            return file;
        }
        throw new IllegalArgumentException(String.format("Parameter '%s' is not a file: %s", str, file));
    }

    public static boolean A0(File file, FileTime fileTime) throws IOException {
        Path path;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        return C11130zA1.m0(path, fileTime, new LinkOption[0]);
    }

    public static String A1(File file, String str) throws IOException {
        return B1(file, IB.e(str));
    }

    public static Checksum B(File file, Checksum checksum) throws IOException {
        Path path;
        InputStream newInputStream;
        z(file, "file");
        Objects.requireNonNull(checksum, "checksum");
        path = file.toPath();
        newInputStream = Files.newInputStream(path, new OpenOption[0]);
        CheckedInputStream checkedInputStream = new CheckedInputStream(newInputStream, checksum);
        try {
            C7743lL0.M(checkedInputStream);
            checkedInputStream.close();
            return checksum;
        } catch (Throwable th) {
            try {
                checkedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean B0(final File file, final Instant instant) {
        Objects.requireNonNull(instant, "instant");
        return C8643oy2.l(new InterfaceC9947uJ0() { // from class: o.Kq0
            @Override // o.InterfaceC9947uJ0
            public final boolean getAsBoolean() {
                return C3961Pq0.k(file, instant);
            }
        });
    }

    public static String B1(final File file, Charset charset) throws IOException {
        return C7743lL0.M1(new XK0() { // from class: o.nq0
            @Override // o.XK0
            public final Object get() {
                return C3961Pq0.o(file);
            }
        }, IB.g(charset));
    }

    public static long C(File file) throws IOException {
        return B(file, new CRC32()).getValue();
    }

    public static boolean C0(File file, OffsetDateTime offsetDateTime) {
        Objects.requireNonNull(offsetDateTime, "offsetDateTime");
        return B0(file, C7375jq0.a(offsetDateTime));
    }

    @Deprecated
    public static List<String> C1(File file) throws IOException {
        return E1(file, Charset.defaultCharset());
    }

    public static void D(File file) throws IOException {
        EJ0.f(new EJ0() { // from class: o.Mq0
            @Override // o.EJ0
            public final void accept(Object obj) {
                C3961Pq0.l0((File) obj, false);
            }
        }, l1(file, null));
    }

    public static boolean D0(File file, ChronoLocalDate chronoLocalDate) {
        return E0(file, chronoLocalDate, C6891hq0.a());
    }

    public static List<String> D1(File file, String str) throws IOException {
        return E1(file, IB.e(str));
    }

    public static void E(File file) throws IOException {
        EJ0.f(new EJ0() { // from class: o.Gq0
            @Override // o.EJ0
            public final void accept(Object obj) {
                C3961Pq0.m0((File) obj);
            }
        }, l1(file, null));
    }

    public static boolean E0(File file, ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(localTime, "localTime");
        return G0(file, C7861lq0.a(chronoLocalDate, localTime));
    }

    public static List<String> E1(File file, Charset charset) throws IOException {
        Path path;
        path = file.toPath();
        return MA1.a(path, IB.g(charset));
    }

    public static boolean F(File file, File file2) throws IOException {
        boolean exists;
        Path path;
        Path path2;
        if (file == null && file2 == null) {
            return true;
        }
        if (file == null || file2 == null || (exists = file.exists()) != file2.exists()) {
            return false;
        }
        if (!exists) {
            return true;
        }
        A(file, "file1");
        A(file2, "file2");
        if (file.length() != file2.length()) {
            return false;
        }
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        path = file.toPath();
        path2 = file2.toPath();
        return C11130zA1.L(path, path2);
    }

    public static boolean F0(File file, ChronoLocalDate chronoLocalDate, OffsetTime offsetTime) {
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(offsetTime, "offsetTime");
        return G0(file, C7861lq0.a(chronoLocalDate, C7618kq0.a(offsetTime)));
    }

    public static void F1(File file, String str) throws C7371jp0 {
        if (!file.exists()) {
            return;
        }
        throw new C7371jp0(String.format("File element in parameter '%s' already exists: '%s'", str, file));
    }

    public static boolean G(File file, File file2, String str) throws IOException {
        boolean exists;
        Path path;
        InputStream newInputStream;
        Path path2;
        InputStream newInputStream2;
        if (file == null && file2 == null) {
            return true;
        }
        if (file == null || file2 == null || (exists = file.exists()) != file2.exists()) {
            return false;
        }
        if (!exists) {
            return true;
        }
        z(file, "file1");
        z(file2, "file2");
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        Charset e2 = IB.e(str);
        path = file.toPath();
        newInputStream = Files.newInputStream(path, new OpenOption[0]);
        InputStreamReader inputStreamReader = new InputStreamReader(newInputStream, e2);
        try {
            path2 = file2.toPath();
            newInputStream2 = Files.newInputStream(path2, new OpenOption[0]);
            InputStreamReader inputStreamReader2 = new InputStreamReader(newInputStream2, e2);
            boolean T = C7743lL0.T(inputStreamReader, inputStreamReader2);
            inputStreamReader2.close();
            inputStreamReader.close();
            return T;
        } catch (Throwable th) {
            try {
                inputStreamReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean G0(File file, ChronoLocalDateTime<?> chronoLocalDateTime) {
        return H0(file, chronoLocalDateTime, C6648gq0.a());
    }

    public static void G1(File file, File file2) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.equals(file2.getCanonicalPath())) {
            return;
        }
        throw new IllegalArgumentException(String.format("File canonical paths are equal: '%s' (file1='%s', file2='%s')", canonicalPath, file, file2));
    }

    public static File[] H(Collection<File> collection) {
        return (File[]) collection.toArray(r);
    }

    public static boolean H0(File file, ChronoLocalDateTime<?> chronoLocalDateTime, ZoneId zoneId) {
        Objects.requireNonNull(chronoLocalDateTime, "chronoLocalDateTime");
        Objects.requireNonNull(zoneId, "zoneId");
        return I0(file, C7133iq0.a(chronoLocalDateTime, zoneId));
    }

    public static void H1(File file, String str) throws FileNotFoundException {
        Objects.requireNonNull(file, str);
        if (!file.isDirectory()) {
            if (file.exists()) {
                throw new IllegalArgumentException("Parameter '" + str + "' is not a directory: '" + file + "'");
            }
            throw new FileNotFoundException("Directory '" + file + "' does not exist.");
        }
    }

    public static void I(File file, File file2) throws IOException {
        M(file, file2, true);
    }

    public static boolean I0(final File file, final ChronoZonedDateTime<?> chronoZonedDateTime) {
        Objects.requireNonNull(file, "file");
        Objects.requireNonNull(chronoZonedDateTime, "chronoZonedDateTime");
        return C8643oy2.l(new InterfaceC9947uJ0() { // from class: o.Iq0
            @Override // o.InterfaceC9947uJ0
            public final boolean getAsBoolean() {
                return C3961Pq0.t(file, chronoZonedDateTime);
            }
        });
    }

    public static void I1(File file, String str) {
        Objects.requireNonNull(file, str);
        if (file.exists() && !file.isDirectory()) {
            throw new IllegalArgumentException("Parameter '" + str + "' is not a directory: '" + file + "'");
        }
    }

    public static void J(File file, File file2, FileFilter fileFilter) throws IOException {
        K(file, file2, fileFilter, true);
    }

    public static boolean J0(File file, Date date) {
        Objects.requireNonNull(date, C2730De2.j);
        return y0(file, date.getTime());
    }

    public static boolean J1(File file, File file2) {
        Path path;
        Path path2;
        Objects.requireNonNull(file, "sourceFile");
        Objects.requireNonNull(file2, "targetFile");
        try {
            path = file.toPath();
            BasicFileAttributes a2 = C3505Kz1.a(path, C3407Jz1.a(), new LinkOption[0]);
            path2 = file2.toPath();
            C8122mq0.a(VA1.a(C10405wB1.a(path2, TA1.a(), new LinkOption[0])), C9588sq1.a(a2), C8366nq1.a(a2), C9345rq1.a(a2));
            return true;
        } catch (IOException unused) {
            return file2.setLastModified(file.lastModified());
        }
    }

    public static void K(File file, File file2, FileFilter fileFilter, boolean z) throws IOException {
        LinkOption linkOption;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        L(file, file2, fileFilter, z, PA1.a(), linkOption);
    }

    public static boolean K0(final File file, final long j2) {
        Objects.requireNonNull(file, "file");
        return C8643oy2.l(new InterfaceC9947uJ0() { // from class: o.Lq0
            @Override // o.InterfaceC9947uJ0
            public final boolean getAsBoolean() {
                return C3961Pq0.b(file, j2);
            }
        });
    }

    public static long K1(final File file) {
        return C8643oy2.o(new InterfaceC6028eK0() { // from class: o.oq0
            @Override // o.InterfaceC6028eK0
            public final long getAsLong() {
                return C3961Pq0.f(file);
            }
        });
    }

    public static void L(File file, File file2, FileFilter fileFilter, boolean z, CopyOption... copyOptionArr) throws IOException {
        ArrayList arrayList;
        Objects.requireNonNull(file2, "destination");
        H1(file, "srcDir");
        G1(file, file2);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            File[] l1 = l1(file, fileFilter);
            if (l1.length > 0) {
                arrayList = new ArrayList(l1.length);
                for (File file3 : l1) {
                    arrayList.add(new File(file2, file3.getName()).getCanonicalPath());
                }
                j0(file, file2, fileFilter, arrayList, z, copyOptionArr);
            }
        }
        arrayList = null;
        j0(file, file2, fileFilter, arrayList, z, copyOptionArr);
    }

    public static boolean L0(final File file, final File file2) throws FileNotFoundException {
        return C8643oy2.l(new InterfaceC9947uJ0() { // from class: o.Hq0
            @Override // o.InterfaceC9947uJ0
            public final boolean getAsBoolean() {
                return C3961Pq0.q(file, file2);
            }
        });
    }

    public static BigInteger L1(final File file) {
        return (BigInteger) C8643oy2.j(new XK0() { // from class: o.Jq0
            @Override // o.XK0
            public final Object get() {
                return C3961Pq0.d(file);
            }
        });
    }

    public static void M(File file, File file2, boolean z) throws IOException {
        K(file, file2, null, z);
    }

    public static boolean M0(File file, FileTime fileTime) throws IOException {
        Path path;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        return C11130zA1.r0(path, fileTime, new LinkOption[0]);
    }

    public static long M1(final File file) {
        try {
            H1(file, "directory");
            return C8643oy2.o(new InterfaceC6028eK0() { // from class: o.zq0
                @Override // o.InterfaceC6028eK0
                public final long getAsLong() {
                    return C3961Pq0.i(file);
                }
            });
        } catch (FileNotFoundException e2) {
            throw new UncheckedIOException(e2);
        }
    }

    public static void N(File file, File file2) throws IOException {
        Objects.requireNonNull(file, "sourceDir");
        I1(file2, "destinationDir");
        M(file, new File(file2, file.getName()), true);
    }

    public static boolean N0(final File file, final Instant instant) {
        Objects.requireNonNull(instant, "instant");
        return C8643oy2.l(new InterfaceC9947uJ0() { // from class: o.Eq0
            @Override // o.InterfaceC9947uJ0
            public final boolean getAsBoolean() {
                return C3961Pq0.j(file, instant);
            }
        });
    }

    public static BigInteger N1(final File file) {
        try {
            H1(file, "directory");
            return (BigInteger) C8643oy2.j(new XK0() { // from class: o.vq0
                @Override // o.XK0
                public final Object get() {
                    return C3961Pq0.h(file);
                }
            });
        } catch (FileNotFoundException e2) {
            throw new UncheckedIOException(e2);
        }
    }

    public static long O(File file, OutputStream outputStream) throws IOException {
        Path path;
        InputStream newInputStream;
        path = file.toPath();
        newInputStream = Files.newInputStream(path, new OpenOption[0]);
        try {
            long i0 = C7743lL0.i0(newInputStream, outputStream);
            if (newInputStream != null) {
                newInputStream.close();
            }
            return i0;
        } catch (Throwable th) {
            if (newInputStream != null) {
                try {
                    newInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static boolean O0(File file, OffsetDateTime offsetDateTime) {
        Objects.requireNonNull(offsetDateTime, "offsetDateTime");
        return N0(file, C7375jq0.a(offsetDateTime));
    }

    public static Stream<File> O1(File file, boolean z, String... strArr) throws IOException {
        HJ0 e2;
        Path path;
        FileVisitOption fileVisitOption;
        if (strArr == null) {
            e2 = C7857lp0.Z;
        } else {
            e2 = C7857lp0.Z.e(T1(strArr));
        }
        path = file.toPath();
        int S1 = S1(z);
        fileVisitOption = FileVisitOption.FOLLOW_LINKS;
        return C11130zA1.i1(path, e2, S1, false, fileVisitOption).map(new Function() { // from class: o.Nq0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                File file2;
                file2 = ((Path) obj).toFile();
                return file2;
            }
        });
    }

    public static void P(File file, File file2) throws IOException {
        S(file, file2, PA1.a());
    }

    public static boolean P0(File file, ChronoLocalDate chronoLocalDate) {
        return Q0(file, chronoLocalDate, C6891hq0.a());
    }

    public static File P1(URL url) {
        if (url != null && W0(url)) {
            return new File(d0(url.getFile().replace('/', File.separatorChar)));
        }
        return null;
    }

    public static void Q(File file, File file2, boolean z) throws IOException {
        R(file, file2, z, PA1.a());
    }

    public static boolean Q0(File file, ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(localTime, "localTime");
        return S0(file, C7861lq0.a(chronoLocalDate, localTime));
    }

    public static File[] Q1(URL... urlArr) {
        if (C7743lL0.u0(urlArr) == 0) {
            return r;
        }
        File[] fileArr = new File[urlArr.length];
        for (int i2 = 0; i2 < urlArr.length; i2++) {
            URL url = urlArr[i2];
            if (url != null) {
                if (W0(url)) {
                    fileArr[i2] = P1(url);
                } else {
                    throw new IllegalArgumentException("Can only convert file URL to a File: " + url);
                }
            }
        }
        return fileArr;
    }

    public static void R(File file, File file2, boolean z, CopyOption... copyOptionArr) throws IOException {
        Path path;
        Path path2;
        boolean isSymbolicLink;
        Objects.requireNonNull(file2, "destination");
        z(file, "srcFile");
        G1(file, file2);
        b0(file2);
        if (file2.exists()) {
            z(file2, "destFile");
        }
        path = file.toPath();
        path2 = file2.toPath();
        Files.copy(path, path2, copyOptionArr);
        if (z) {
            isSymbolicLink = Files.isSymbolicLink(path);
            if (!isSymbolicLink && !J1(file, file2)) {
                throw new IOException("Cannot set the file time.");
            }
        }
    }

    public static boolean R0(File file, ChronoLocalDate chronoLocalDate, OffsetTime offsetTime) {
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(offsetTime, "offsetTime");
        return S0(file, C7861lq0.a(chronoLocalDate, C7618kq0.a(offsetTime)));
    }

    public static List<File> R1(Stream<File> stream) {
        return (List) stream.collect(Collectors.toList());
    }

    public static void S(File file, File file2, CopyOption... copyOptionArr) throws IOException {
        R(file, file2, true, copyOptionArr);
    }

    public static boolean S0(File file, ChronoLocalDateTime<?> chronoLocalDateTime) {
        return T0(file, chronoLocalDateTime, C6648gq0.a());
    }

    public static int S1(boolean z) {
        if (z) {
            return Integer.MAX_VALUE;
        }
        return 1;
    }

    public static void T(File file, File file2) throws IOException {
        U(file, file2, true);
    }

    public static boolean T0(File file, ChronoLocalDateTime<?> chronoLocalDateTime, ZoneId zoneId) {
        Objects.requireNonNull(chronoLocalDateTime, "chronoLocalDateTime");
        Objects.requireNonNull(zoneId, "zoneId");
        return U0(file, C7133iq0.a(chronoLocalDateTime, zoneId));
    }

    public static C6116eh2 T1(String... strArr) {
        return new C6116eh2(U1(strArr));
    }

    public static void U(File file, File file2, boolean z) throws IOException {
        Objects.requireNonNull(file, "sourceFile");
        I1(file2, "destinationDir");
        Q(file, new File(file2, file.getName()), z);
    }

    public static boolean U0(File file, ChronoZonedDateTime<?> chronoZonedDateTime) {
        Objects.requireNonNull(chronoZonedDateTime, "chronoZonedDateTime");
        return N0(file, C5665cq0.a(chronoZonedDateTime));
    }

    public static String[] U1(String... strArr) {
        Objects.requireNonNull(strArr, "extensions");
        return (String[]) Stream.of((Object[]) strArr).map(new Function() { // from class: o.Cq0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C3961Pq0.l((String) obj);
            }
        }).toArray(new IntFunction() { // from class: o.Dq0
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return C3961Pq0.m(i2);
            }
        });
    }

    public static void V(InputStream inputStream, File file) throws IOException {
        try {
            Y(inputStream, file);
            if (inputStream != null) {
                inputStream.close();
            }
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

    public static boolean V0(File file, Date date) {
        Objects.requireNonNull(date, C2730De2.j);
        return K0(file, date.getTime());
    }

    public static URL[] V1(File... fileArr) throws IOException {
        Objects.requireNonNull(fileArr, "files");
        int length = fileArr.length;
        URL[] urlArr = new URL[length];
        for (int i2 = 0; i2 < length; i2++) {
            urlArr[i2] = fileArr[i2].toURI().toURL();
        }
        return urlArr;
    }

    public static void W(File file, File file2) throws IOException {
        Objects.requireNonNull(file, "sourceFile");
        if (file.isFile()) {
            T(file, file2);
        } else if (file.isDirectory()) {
            N(file, file2);
        } else {
            throw new FileNotFoundException("The source " + file + " does not exist");
        }
    }

    public static boolean W0(URL url) {
        return "file".equalsIgnoreCase(url.getProtocol());
    }

    public static void W1(File file) throws IOException {
        Path path;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        C11130zA1.c1(path);
    }

    public static void X(Iterable<File> iterable, File file) throws IOException {
        Objects.requireNonNull(iterable, "sourceIterable");
        for (File file2 : iterable) {
            T(file2, file);
        }
    }

    public static boolean X0(File file, LinkOption... linkOptionArr) {
        Path path;
        if (file != null) {
            path = file.toPath();
            if (BB1.a(path, linkOptionArr)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void X1(File file, File file2) throws FileNotFoundException {
        Objects.requireNonNull(file, "source");
        Objects.requireNonNull(file2, "destination");
        if (file.exists()) {
            return;
        }
        throw new FileNotFoundException("Source '" + file + "' does not exist");
    }

    public static void Y(InputStream inputStream, File file) throws IOException {
        OutputStream u1 = u1(file, false);
        try {
            C7743lL0.U(inputStream, u1);
            if (u1 != null) {
                u1.close();
            }
        } catch (Throwable th) {
            if (u1 != null) {
                try {
                    u1.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static boolean Y0(File file) {
        Path path;
        boolean isSymbolicLink;
        if (file != null) {
            path = file.toPath();
            isSymbolicLink = Files.isSymbolicLink(path);
            if (isSymbolicLink) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean Y1(File file, int i2) {
        Path path;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        return C11130zA1.h1(path, C5907dq0.a(i2), C11130zA1.g);
    }

    public static void Z(URL url, File file) throws IOException {
        Path path;
        path = file.toPath();
        C11130zA1.u(path, new FileAttribute[0]);
        Objects.requireNonNull(url);
        C11130zA1.m(new C2983Fq0(url), path, PA1.a());
    }

    public static Iterator<File> Z0(File file, HJ0 hj0, HJ0 hj02) {
        return i1(file, hj0, hj02).iterator();
    }

    @Deprecated
    public static void Z1(File file, CharSequence charSequence) throws IOException {
        d2(file, charSequence, Charset.defaultCharset(), false);
    }

    public static void a0(URL url, File file, int i2, int i3) throws IOException {
        C5276bE d2 = C5276bE.d(url);
        try {
            d2.setConnectTimeout(i2);
            d2.setReadTimeout(i3);
            InputStream inputStream = d2.getInputStream();
            V(inputStream, file);
            if (inputStream != null) {
                inputStream.close();
            }
            d2.close();
        } catch (Throwable th) {
            if (d2 != null) {
                try {
                    d2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static Iterator<File> a1(final File file, final String[] strArr, final boolean z) {
        return C2933Fd2.d((Stream) C8643oy2.j(new XK0() { // from class: o.rq0
            @Override // o.XK0
            public final Object get() {
                Stream O1;
                O1 = C3961Pq0.O1(file, z, strArr);
                return O1;
            }
        }));
    }

    public static void a2(File file, CharSequence charSequence, String str) throws IOException {
        b2(file, charSequence, str, false);
    }

    public static /* synthetic */ boolean b(File file, long j2) {
        Path path;
        path = file.toPath();
        return C11130zA1.p0(path, j2, new LinkOption[0]);
    }

    public static File b0(File file) throws IOException {
        return n1(r0(file));
    }

    public static Iterator<File> b1(File file, HJ0 hj0, HJ0 hj02) {
        return m1(file, hj0, hj02).iterator();
    }

    public static void b2(File file, CharSequence charSequence, String str, boolean z) throws IOException {
        d2(file, charSequence, IB.e(str), z);
    }

    public static /* synthetic */ FileVisitResult c(Path path, IOException iOException) {
        FileVisitResult fileVisitResult;
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public static File c0() {
        return C6150eq0.a(C11130zA1.v());
    }

    public static long c1(File file) throws IOException {
        long millis;
        millis = d1(file).toMillis();
        return millis;
    }

    public static void c2(File file, CharSequence charSequence, Charset charset) throws IOException {
        d2(file, charSequence, charset, false);
    }

    public static /* synthetic */ BigInteger d(File file) {
        Path path;
        path = file.toPath();
        return C11130zA1.V0(path);
    }

    public static String d0(String str) {
        int i2;
        if (str != null && str.indexOf(37) >= 0) {
            int length = str.length();
            StringBuilder sb = new StringBuilder();
            ByteBuffer allocate = ByteBuffer.allocate(length);
            int i3 = 0;
            while (i3 < length) {
                if (str.charAt(i3) == '%') {
                    while (true) {
                        i2 = i3 + 3;
                        try {
                            try {
                                allocate.put((byte) Integer.parseInt(str.substring(i3 + 1, i2), 16));
                                if (i2 >= length) {
                                    break;
                                }
                                try {
                                    if (str.charAt(i2) != '%') {
                                        break;
                                    }
                                    i3 = i2;
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    i3 = i2;
                                    if (allocate.position() > 0) {
                                        allocate.flip();
                                        sb.append(StandardCharsets.UTF_8.decode(allocate).toString());
                                        allocate.clear();
                                    }
                                    sb.append(str.charAt(i3));
                                    i3++;
                                }
                            } finally {
                                if (allocate.position() > 0) {
                                    allocate.flip();
                                    sb.append(StandardCharsets.UTF_8.decode(allocate).toString());
                                    allocate.clear();
                                }
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                        }
                    }
                    i3 = i2;
                }
                sb.append(str.charAt(i3));
                i3++;
            }
            return sb.toString();
        }
        return str;
    }

    public static FileTime d1(File file) throws IOException {
        Path path;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        return FB1.a(path, new LinkOption[0]);
    }

    public static void d2(File file, CharSequence charSequence, Charset charset, boolean z) throws IOException {
        v2(file, Objects.toString(charSequence, null), charset, z);
    }

    public static File e0(File file) throws IOException {
        Path path;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        GB1.a(path);
        return file;
    }

    public static long e1(File file) {
        return ((Long) C8643oy2.f(new RJ0() { // from class: o.Bq0
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return Long.valueOf(C3961Pq0.c1((File) obj));
            }
        }, file)).longValue();
    }

    @Deprecated
    public static void e2(File file, CharSequence charSequence, boolean z) throws IOException {
        d2(file, charSequence, Charset.defaultCharset(), z);
    }

    public static /* synthetic */ long f(File file) {
        Path path;
        path = file.toPath();
        return C11130zA1.U0(path);
    }

    public static void f0(File file) throws IOException {
        Objects.requireNonNull(file, "directory");
        if (!file.exists()) {
            return;
        }
        if (!Y0(file)) {
            D(file);
        }
        e0(file);
    }

    public static VZ0 f1(File file) throws IOException {
        return g1(file, null);
    }

    public static void f2(File file, byte[] bArr) throws IOException {
        i2(file, bArr, false);
    }

    public static /* synthetic */ void g(boolean z, List list, FilenameFilter filenameFilter, File file, List list2, File file2) {
        if (z && file2.isDirectory()) {
            list.add(file2);
        } else if (file2.isFile() && filenameFilter.accept(file, file2.getName())) {
            list2.add(file2);
        }
    }

    public static void g0(File file) throws IOException {
        if (file.exists()) {
            file.deleteOnExit();
            if (!Y0(file)) {
                E(file);
            }
        }
    }

    public static VZ0 g1(File file, String str) throws IOException {
        Path path;
        InputStream inputStream = null;
        try {
            path = file.toPath();
            inputStream = Files.newInputStream(path, new OpenOption[0]);
            return C7743lL0.v0(inputStream, str);
        } catch (IOException | RuntimeException e2) {
            C7743lL0.B(inputStream, new Consumer() { // from class: o.Oq0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    e2.addSuppressed((Exception) obj);
                }
            });
            throw e2;
        }
    }

    public static void g2(File file, byte[] bArr, int i2, int i3) throws IOException {
        h2(file, bArr, i2, i3, false);
    }

    public static /* synthetic */ BigInteger h(File file) {
        Path path;
        path = file.toPath();
        return C11130zA1.X0(path);
    }

    public static boolean h0(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                D(file);
            }
        } catch (Exception unused) {
        }
        try {
            return file.delete();
        } catch (Exception unused2) {
            return false;
        }
    }

    public static N4 h1(File file, HJ0 hj0, HJ0 hj02, FileVisitOption... fileVisitOptionArr) throws IOException {
        boolean z;
        Path path;
        if (hj02 != null) {
            z = true;
        } else {
            z = false;
        }
        HJ0 c7129ip0 = new C7129ip0(file);
        if (z) {
            c7129ip0 = c7129ip0.d(hj02);
        }
        N4 n4 = ((N4.b) ((N4.b) N4.r().n(HQ.f()).m(hj0).k(c7129ip0)).f(new InterfaceC8483oJ0() { // from class: o.Aq0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return C3961Pq0.c((Path) obj, (IOException) obj2);
            }
        })).get();
        HashSet hashSet = new HashSet();
        if (fileVisitOptionArr != null) {
            Collections.addAll(hashSet, fileVisitOptionArr);
        }
        path = file.toPath();
        P30.a(path, hashSet, S1(z), n4);
        return n4;
    }

    public static void h2(File file, byte[] bArr, int i2, int i3, boolean z) throws IOException {
        OutputStream u1 = u1(file, z);
        try {
            u1.write(bArr, i2, i3);
            u1.close();
        } catch (Throwable th) {
            if (u1 != null) {
                try {
                    u1.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static /* synthetic */ long i(File file) {
        Path path;
        path = file.toPath();
        return C11130zA1.W0(path);
    }

    public static boolean i0(File file, File file2) throws IOException {
        H1(file, "directory");
        if (file2 != null && file2.exists()) {
            return C4837Yq0.b(file.getCanonicalPath(), file2.getCanonicalPath());
        }
        return false;
    }

    public static Collection<File> i1(File file, final HJ0 hj0, final HJ0 hj02) {
        return R1(((N4) C8643oy2.f(new RJ0() { // from class: o.pq0
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return C3961Pq0.s(HJ0.this, hj02, (File) obj);
            }
        }, file)).t().stream().map(new Function() { // from class: o.qq0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                File file2;
                file2 = ((Path) obj).toFile();
                return file2;
            }
        }));
    }

    public static void i2(File file, byte[] bArr, boolean z) throws IOException {
        h2(file, bArr, 0, bArr.length, z);
    }

    public static /* synthetic */ boolean j(File file, Instant instant) {
        Path path;
        path = file.toPath();
        return C11130zA1.s0(path, instant, new LinkOption[0]);
    }

    public static void j0(File file, File file2, FileFilter fileFilter, List<String> list, boolean z, CopyOption... copyOptionArr) throws IOException {
        FileFilter fileFilter2;
        List<String> list2;
        boolean z2;
        CopyOption[] copyOptionArr2;
        File[] l1 = l1(file, fileFilter);
        I1(file2, "destDir");
        n1(file2);
        int length = l1.length;
        int i2 = 0;
        while (i2 < length) {
            File file3 = l1[i2];
            File file4 = new File(file2, file3.getName());
            if (list != null && list.contains(file3.getCanonicalPath())) {
                fileFilter2 = fileFilter;
                list2 = list;
                z2 = z;
                copyOptionArr2 = copyOptionArr;
            } else if (file3.isDirectory()) {
                fileFilter2 = fileFilter;
                list2 = list;
                z2 = z;
                copyOptionArr2 = copyOptionArr;
                j0(file3, file4, fileFilter2, list2, z2, copyOptionArr2);
            } else {
                fileFilter2 = fileFilter;
                list2 = list;
                z2 = z;
                copyOptionArr2 = copyOptionArr;
                R(file3, file4, z2, copyOptionArr2);
            }
            i2++;
            fileFilter = fileFilter2;
            list = list2;
            z = z2;
            copyOptionArr = copyOptionArr2;
        }
        if (z) {
            J1(file, file2);
        }
    }

    public static Collection<File> j1(File file, String[] strArr, boolean z) {
        FilenameFilter filenameFilter;
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            filenameFilter = T1(strArr);
        } else {
            filenameFilter = Cu2.Z;
        }
        return k1(file, arrayList, z, filenameFilter);
    }

    public static void j2(File file, String str, Collection<?> collection) throws IOException {
        l2(file, str, collection, null, false);
    }

    public static /* synthetic */ boolean k(File file, Instant instant) {
        Path path;
        path = file.toPath();
        return C11130zA1.n0(path, instant, new LinkOption[0]);
    }

    public static void k0(File file) throws IOException {
        l0(file, true);
    }

    public static List<File> k1(final File file, final List<File> list, final boolean z, final FilenameFilter filenameFilter) {
        ArrayList arrayList;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            if (z) {
                arrayList = new ArrayList();
            } else {
                arrayList = null;
            }
            final ArrayList arrayList2 = arrayList;
            Arrays.stream(listFiles).forEach(new Consumer() { // from class: o.sq0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    C3961Pq0.g(z, arrayList2, filenameFilter, file, list, (File) obj);
                }
            });
            if (!z) {
                return list;
            }
            arrayList2.forEach(new Consumer() { // from class: o.tq0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    C3961Pq0.k1((File) obj, list, true, filenameFilter);
                }
            });
            return list;
        }
        return list;
    }

    public static void k2(File file, String str, Collection<?> collection, String str2) throws IOException {
        l2(file, str, collection, str2, false);
    }

    public static /* synthetic */ String l(String str) {
        if (str.charAt(0) == '.') {
            return str;
        }
        return UE.h + str;
    }

    public static void l0(File file, boolean z) throws IOException {
        Path path;
        y(file, z);
        try {
            path = file.toPath();
            HQ.j x = C11130zA1.x(path, C11130zA1.g, EnumC3317Jb2.OVERRIDE_READ_ONLY);
            if (x.c().get() < 1 && x.b().get() < 1) {
                throw new FileNotFoundException("File does not exist: " + file);
            }
        } catch (NoSuchFileException e2) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Cannot delete file: " + file);
            fileNotFoundException.initCause(e2);
            throw fileNotFoundException;
        } catch (IOException e3) {
            throw new IOException("Cannot delete file: " + file, e3);
        }
    }

    public static File[] l1(File file, FileFilter fileFilter) throws IOException {
        H1(file, "directory");
        File[] listFiles = file.listFiles(fileFilter);
        if (listFiles != null) {
            return listFiles;
        }
        throw new IOException("Unknown I/O error listing contents of directory: " + file);
    }

    public static void l2(File file, String str, Collection<?> collection, String str2, boolean z) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(u1(file, z));
        try {
            C7743lL0.m2(collection, str2, bufferedOutputStream, str);
            bufferedOutputStream.close();
        } catch (Throwable th) {
            try {
                bufferedOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static /* synthetic */ String[] m(int i2) {
        return new String[i2];
    }

    public static void m0(File file) throws IOException {
        Objects.requireNonNull(file, "file");
        if (file.isDirectory()) {
            g0(file);
        } else {
            file.deleteOnExit();
        }
    }

    public static Collection<File> m1(File file, final HJ0 hj0, final HJ0 hj02) {
        N4 n4 = (N4) C8643oy2.f(new RJ0() { // from class: o.wq0
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return C3961Pq0.u(HJ0.this, hj02, (File) obj);
            }
        }, file);
        List<Path> t = n4.t();
        t.addAll(n4.s());
        return R1(t.stream().map(new Function() { // from class: o.xq0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                File file2;
                file2 = ((Path) obj).toFile();
                return file2;
            }
        }));
    }

    public static void m2(File file, String str, Collection<?> collection, boolean z) throws IOException {
        l2(file, str, collection, null, z);
    }

    public static void n0(File file) throws IOException {
        n1(file);
    }

    public static File n1(File file) throws IOException {
        if (file != null && !file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Cannot create directory '" + file + "'.");
        }
        return file;
    }

    public static void n2(File file, Collection<?> collection) throws IOException {
        l2(file, null, collection, null, false);
    }

    public static /* synthetic */ InputStream o(File file) {
        Path path;
        InputStream newInputStream;
        path = file.toPath();
        newInputStream = Files.newInputStream(path, new OpenOption[0]);
        return newInputStream;
    }

    public static void o0(File file) throws IOException {
        Objects.requireNonNull(file, "file");
        n0(r0(file));
    }

    public static void o1(File file, File file2) throws IOException {
        Objects.requireNonNull(file2, "destination");
        H1(file, "srcDir");
        F1(file2, "destDir");
        if (!file.renameTo(file2)) {
            String canonicalPath = file2.getCanonicalPath();
            if (!canonicalPath.startsWith(file.getCanonicalPath() + File.separator)) {
                I(file, file2);
                f0(file);
                if (file.exists()) {
                    throw new IOException("Failed to delete original directory '" + file + "' after copy to '" + file2 + "'");
                }
                return;
            }
            throw new IOException("Cannot move directory: " + file + " to a subdirectory of itself: " + file2);
        }
    }

    public static void o2(File file, Collection<?> collection, String str) throws IOException {
        l2(file, null, collection, str, false);
    }

    public static /* synthetic */ boolean p(File file, long j2) {
        Path path;
        path = file.toPath();
        return C11130zA1.k0(path, j2, new LinkOption[0]);
    }

    public static File p0(File file, String... strArr) {
        Objects.requireNonNull(file, "directory");
        Objects.requireNonNull(strArr, "names");
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            i2++;
            file = new File(file, strArr[i2]);
        }
        return file;
    }

    public static void p1(File file, File file2, boolean z) throws IOException {
        X1(file, file2);
        if (!file2.isDirectory()) {
            if (!file2.exists()) {
                if (z) {
                    n1(file2);
                } else {
                    throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=false" + C6566gU0.g);
                }
            } else {
                throw new IOException("Destination '" + file2 + "' is not a directory");
            }
        }
        o1(file, new File(file2, file.getName()));
    }

    public static void p2(File file, Collection<?> collection, String str, boolean z) throws IOException {
        l2(file, null, collection, str, z);
    }

    public static /* synthetic */ boolean q(File file, File file2) {
        Path path;
        Path path2;
        path = file.toPath();
        path2 = file2.toPath();
        return C11130zA1.q0(path, path2);
    }

    public static File q0(String... strArr) {
        Objects.requireNonNull(strArr, "names");
        File file = null;
        for (String str : strArr) {
            if (file == null) {
                file = new File(str);
            } else {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static void q1(File file, File file2) throws IOException {
        r1(file, file2, C6393fq0.a());
    }

    public static void q2(File file, Collection<?> collection, boolean z) throws IOException {
        l2(file, null, collection, null, z);
    }

    public static /* synthetic */ boolean r(File file, File file2) {
        Path path;
        Path path2;
        path = file.toPath();
        path2 = file2.toPath();
        return C11130zA1.l0(path, path2);
    }

    public static File r0(File file) {
        if (file == null) {
            return null;
        }
        return file.getParentFile();
    }

    public static void r1(File file, File file2, CopyOption... copyOptionArr) throws IOException {
        Objects.requireNonNull(file2, "destFile");
        z(file, "srcFile");
        F1(file2, "destFile");
        if (!file.renameTo(file2)) {
            R(file, file2, false, copyOptionArr);
            if (!file.delete()) {
                h0(file2);
                throw new IOException("Failed to delete original file '" + file + "' after copy to '" + file2 + "'");
            }
        }
    }

    @Deprecated
    public static void r2(File file, String str) throws IOException {
        v2(file, str, Charset.defaultCharset(), false);
    }

    public static /* synthetic */ N4 s(HJ0 hj0, HJ0 hj02, File file) {
        FileVisitOption fileVisitOption;
        HJ0 e2 = C7857lp0.Z.e(hj0);
        fileVisitOption = FileVisitOption.FOLLOW_LINKS;
        return h1(file, e2, hj02, fileVisitOption);
    }

    public static File s0() {
        return new File(t0());
    }

    public static void s1(File file, File file2, boolean z) throws IOException {
        X1(file, file2);
        if (!file2.exists() && z) {
            n1(file2);
        }
        H1(file2, "destDir");
        q1(file, new File(file2, file.getName()));
    }

    public static void s2(File file, String str, String str2) throws IOException {
        t2(file, str, str2, false);
    }

    public static /* synthetic */ boolean t(File file, ChronoZonedDateTime chronoZonedDateTime) {
        Path path;
        path = file.toPath();
        return C11130zA1.o0(path, chronoZonedDateTime, new LinkOption[0]);
    }

    public static String t0() {
        return System.getProperty(C3451Kk2.e);
    }

    public static void t1(File file, File file2, boolean z) throws IOException {
        X1(file, file2);
        if (file.isDirectory()) {
            p1(file, file2, z);
        } else {
            s1(file, file2, z);
        }
    }

    public static void t2(File file, String str, String str2, boolean z) throws IOException {
        v2(file, str, IB.e(str2), z);
    }

    public static /* synthetic */ N4 u(HJ0 hj0, HJ0 hj02, File file) {
        FileVisitOption fileVisitOption;
        fileVisitOption = FileVisitOption.FOLLOW_LINKS;
        return h1(file, hj0, hj02, fileVisitOption);
    }

    public static File u0() {
        return new File(v0());
    }

    public static OutputStream u1(File file, boolean z) throws IOException {
        Path path;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        return C11130zA1.x0(path, z);
    }

    public static void u2(File file, String str, Charset charset) throws IOException {
        v2(file, str, charset, false);
    }

    public static String v(long j2) {
        return x(BigInteger.valueOf(j2));
    }

    public static String v0() {
        return System.getProperty(C3451Kk2.b);
    }

    public static FileInputStream v1(File file) throws IOException {
        Objects.requireNonNull(file, "file");
        return new FileInputStream(file);
    }

    public static void v2(File file, String str, Charset charset, boolean z) throws IOException {
        OutputStream u1 = u1(file, z);
        try {
            C7743lL0.W1(str, u1, charset);
            if (u1 != null) {
                u1.close();
            }
        } catch (Throwable th) {
            if (u1 != null) {
                try {
                    u1.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static String w(Number number) {
        return v(number.longValue());
    }

    public static boolean w0(File file, LinkOption... linkOptionArr) {
        Path path;
        boolean isDirectory;
        if (file != null) {
            path = file.toPath();
            isDirectory = Files.isDirectory(path, linkOptionArr);
            if (isDirectory) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static FileOutputStream w1(File file) throws IOException {
        return x1(file, false);
    }

    @Deprecated
    public static void w2(File file, String str, boolean z) throws IOException {
        v2(file, str, Charset.defaultCharset(), z);
    }

    public static String x(BigInteger bigInteger) {
        Objects.requireNonNull(bigInteger, "size");
        BigInteger bigInteger2 = q;
        BigInteger divide = bigInteger.divide(bigInteger2);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (divide.compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger2) + " QB";
        }
        BigInteger bigInteger4 = p;
        if (bigInteger.divide(bigInteger4).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger4) + " RB";
        }
        BigInteger bigInteger5 = f586o;
        if (bigInteger.divide(bigInteger5).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger5) + " YB";
        }
        BigInteger bigInteger6 = n;
        if (bigInteger.divide(bigInteger6).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger6) + " ZB";
        }
        BigInteger bigInteger7 = m;
        if (bigInteger.divide(bigInteger7).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger7) + " EB";
        }
        BigInteger bigInteger8 = k;
        if (bigInteger.divide(bigInteger8).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger8) + " PB";
        }
        BigInteger bigInteger9 = i;
        if (bigInteger.divide(bigInteger9).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger9) + " TB";
        }
        BigInteger bigInteger10 = g;
        if (bigInteger.divide(bigInteger10).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger10) + " GB";
        }
        BigInteger bigInteger11 = e;
        if (bigInteger.divide(bigInteger11).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger11) + " MB";
        }
        BigInteger bigInteger12 = c;
        if (bigInteger.divide(bigInteger12).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger12) + " KB";
        }
        return bigInteger + " bytes";
    }

    public static boolean x0(File file) throws IOException {
        Path path;
        path = file.toPath();
        return C11130zA1.i0(path);
    }

    public static FileOutputStream x1(File file, boolean z) throws IOException {
        Objects.requireNonNull(file, "file");
        if (file.exists()) {
            A(file, "file");
        } else {
            b0(file);
        }
        return new FileOutputStream(file, z);
    }

    public static void y(File file, boolean z) throws FileNotFoundException {
        Objects.requireNonNull(file, "file");
        if (z && !file.exists() && !Y0(file)) {
            throw new FileNotFoundException(file.toString());
        }
    }

    public static boolean y0(final File file, final long j2) {
        Objects.requireNonNull(file, "file");
        return C8643oy2.l(new InterfaceC9947uJ0() { // from class: o.uq0
            @Override // o.InterfaceC9947uJ0
            public final boolean getAsBoolean() {
                return C3961Pq0.p(file, j2);
            }
        });
    }

    public static byte[] y1(File file) throws IOException {
        Path path;
        byte[] readAllBytes;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        readAllBytes = Files.readAllBytes(path);
        return readAllBytes;
    }

    public static void z(File file, String str) throws FileNotFoundException {
        Path path;
        boolean isSymbolicLink;
        Objects.requireNonNull(file, str);
        if (!file.isFile()) {
            if (!file.exists()) {
                path = file.toPath();
                isSymbolicLink = Files.isSymbolicLink(path);
                if (!isSymbolicLink) {
                    throw new FileNotFoundException("Source '" + file + "' does not exist");
                }
                return;
            }
            throw new IllegalArgumentException("Parameter '" + str + "' is not a file: " + file);
        }
    }

    public static boolean z0(final File file, final File file2) {
        return C8643oy2.l(new InterfaceC9947uJ0() { // from class: o.yq0
            @Override // o.InterfaceC9947uJ0
            public final boolean getAsBoolean() {
                return C3961Pq0.r(file, file2);
            }
        });
    }

    @Deprecated
    public static String z1(File file) throws IOException {
        return B1(file, Charset.defaultCharset());
    }
}
