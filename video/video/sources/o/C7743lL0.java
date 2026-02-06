package o;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import o.C7743lL0;
import o.C9090qp;

/* renamed from: o.lL0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7743lL0 {
    public static final int a = 13;
    public static final int b = 8192;
    public static final char d = '/';
    public static final char e = '\\';
    public static final int g = -1;
    public static final int h = 10;
    public static final int l = 2147483639;
    public static final char c = File.separatorChar;
    public static final byte[] f = new byte[0];
    @Deprecated
    public static final String i = System.lineSeparator();
    public static final String j = EnumC3806Ob2.LF.h();
    public static final String k = EnumC3806Ob2.CRLF.h();

    /* renamed from: o.lL0$a */
    /* loaded from: classes4.dex */
    public static final class a implements AutoCloseable {
        public static final ThreadLocal<Object[]> Y = new GD2(new Supplier() { // from class: o.kL0
            @Override // java.util.function.Supplier
            public final Object get() {
                return C7743lL0.a.a();
            }
        });
        public static final a Z = new a(null);
        public final byte[] X;

        public a(byte[] bArr) {
            this.X = bArr;
        }

        public static /* synthetic */ Object[] a() {
            return new Object[]{Boolean.FALSE, C7743lL0.k()};
        }

        public static a h() {
            Object[] objArr = Y.get();
            if (((Boolean) objArr[0]).booleanValue()) {
                return new a(C7743lL0.k());
            }
            objArr[0] = Boolean.TRUE;
            return Z;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.X == null) {
                Object[] objArr = Y.get();
                Arrays.fill((byte[]) objArr[1], (byte) 0);
                objArr[0] = Boolean.FALSE;
            }
        }

        public byte[] f() {
            byte[] bArr = this.X;
            if (bArr != null) {
                return bArr;
            }
            return (byte[]) Y.get()[1];
        }
    }

    /* renamed from: o.lL0$b */
    /* loaded from: classes4.dex */
    public static final class b implements AutoCloseable {
        public static final ThreadLocal<Object[]> Y = new GD2(new Supplier() { // from class: o.mL0
            @Override // java.util.function.Supplier
            public final Object get() {
                return C7743lL0.b.a();
            }
        });
        public static final b Z = new b(null);
        public final char[] X;

        public b(char[] cArr) {
            this.X = cArr;
        }

        public static /* synthetic */ Object[] a() {
            return new Object[]{Boolean.FALSE, C7743lL0.b()};
        }

        public static b h() {
            Object[] objArr = Y.get();
            if (((Boolean) objArr[0]).booleanValue()) {
                return new b(C7743lL0.b());
            }
            objArr[0] = Boolean.TRUE;
            return Z;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.X == null) {
                Object[] objArr = Y.get();
                Arrays.fill((char[]) objArr[1], (char) 0);
                objArr[0] = Boolean.FALSE;
            }
        }

        public char[] f() {
            char[] cArr = this.X;
            if (cArr != null) {
                return cArr;
            }
            return (char[]) Y.get()[1];
        }
    }

    public static void A(Closeable closeable) {
        B(closeable, null);
    }

    public static int A0(Reader reader, char[] cArr) throws IOException {
        return B0(reader, cArr, 0, cArr.length);
    }

    public static InputStream A1(String str, String str2) {
        return new ByteArrayInputStream(str.getBytes(IB.e(str2)));
    }

    public static void B(Closeable closeable, Consumer<Exception> consumer) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                if (consumer != null) {
                    consumer.accept(e2);
                }
            }
        }
    }

    public static int B0(Reader reader, char[] cArr, int i2, int i3) throws IOException {
        r(cArr, i2, i3);
        int i4 = i3;
        while (i4 > 0) {
            int read = reader.read(cArr, (i3 - i4) + i2, i4);
            if (-1 == read) {
                break;
            }
            i4 -= read;
        }
        return i3 - i4;
    }

    public static InputStream B1(String str, Charset charset) {
        return new ByteArrayInputStream(str.getBytes(IB.g(charset)));
    }

    public static void C(InputStream inputStream) {
        z(inputStream);
    }

    public static int C0(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        while (byteBuffer.remaining() > 0 && -1 != readableByteChannel.read(byteBuffer)) {
        }
        return remaining - byteBuffer.remaining();
    }

    @Deprecated
    public static String C1(InputStream inputStream) throws IOException {
        return E1(inputStream, Charset.defaultCharset());
    }

    public static void D(OutputStream outputStream) {
        z(outputStream);
    }

    public static void D0(InputStream inputStream, byte[] bArr) throws IOException {
        E0(inputStream, bArr, 0, bArr.length);
    }

    public static String D1(InputStream inputStream, String str) throws IOException {
        return E1(inputStream, IB.e(str));
    }

    public static void E(Reader reader) {
        z(reader);
    }

    public static void E0(InputStream inputStream, byte[] bArr, int i2, int i3) throws IOException {
        int z0 = z0(inputStream, bArr, i2, i3);
        if (z0 == i3) {
            return;
        }
        throw new EOFException("Length to read: " + i3 + " actual: " + z0);
    }

    public static String E1(InputStream inputStream, Charset charset) throws IOException {
        C8076me2 c8076me2 = new C8076me2();
        try {
            e0(inputStream, c8076me2, charset);
            String c8076me22 = c8076me2.toString();
            c8076me2.close();
            return c8076me22;
        } catch (Throwable th) {
            try {
                c8076me2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void F(Writer writer) {
        z(writer);
    }

    public static void F0(Reader reader, char[] cArr) throws IOException {
        G0(reader, cArr, 0, cArr.length);
    }

    public static String F1(Reader reader) throws IOException {
        C8076me2 c8076me2 = new C8076me2();
        try {
            V(reader, c8076me2);
            String c8076me22 = c8076me2.toString();
            c8076me2.close();
            return c8076me22;
        } catch (Throwable th) {
            try {
                c8076me2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void G(Iterable<Closeable> iterable) {
        if (iterable != null) {
            iterable.forEach(new C6275fL0());
        }
    }

    public static void G0(Reader reader, char[] cArr, int i2, int i3) throws IOException {
        int B0 = B0(reader, cArr, i2, i3);
        if (B0 == i3) {
            return;
        }
        throw new EOFException("Length to read: " + i3 + " actual: " + B0);
    }

    @Deprecated
    public static String G1(URI uri) throws IOException {
        return I1(uri, Charset.defaultCharset());
    }

    public static void H(ServerSocket serverSocket) {
        z(serverSocket);
    }

    public static void H0(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        int C0 = C0(readableByteChannel, byteBuffer);
        if (C0 == remaining) {
            return;
        }
        throw new EOFException("Length to read: " + remaining + " actual: " + C0);
    }

    public static String H1(URI uri, String str) throws IOException {
        return I1(uri, IB.e(str));
    }

    public static void I(Socket socket) {
        z(socket);
    }

    @Deprecated
    public static byte[] I0(InputStream inputStream, int i2) throws IOException {
        return h1(inputStream, i2);
    }

    public static String I1(URI uri, Charset charset) throws IOException {
        return L1(uri.toURL(), IB.g(charset));
    }

    public static void J(Selector selector) {
        z(selector);
    }

    @Deprecated
    public static List<String> J0(InputStream inputStream) throws UncheckedIOException {
        return L0(inputStream, Charset.defaultCharset());
    }

    @Deprecated
    public static String J1(URL url) throws IOException {
        return L1(url, Charset.defaultCharset());
    }

    public static void K(Stream<Closeable> stream) {
        if (stream != null) {
            stream.forEach(new C6275fL0());
        }
    }

    public static List<String> K0(InputStream inputStream, String str) throws UncheckedIOException {
        return L0(inputStream, IB.e(str));
    }

    public static String K1(URL url, String str) throws IOException {
        return L1(url, IB.e(str));
    }

    public static void L(Closeable... closeableArr) {
        if (closeableArr != null) {
            K(Arrays.stream(closeableArr));
        }
    }

    public static List<String> L0(InputStream inputStream, Charset charset) throws UncheckedIOException {
        return M0(new InputStreamReader(inputStream, IB.g(charset)));
    }

    public static String L1(URL url, Charset charset) throws IOException {
        Objects.requireNonNull(url);
        return M1(new C2983Fq0(url), charset);
    }

    public static long M(InputStream inputStream) throws IOException {
        return i0(inputStream, C8374ns1.X);
    }

    public static List<String> M0(Reader reader) throws UncheckedIOException {
        return (List) e1(reader).lines().collect(Collectors.toList());
    }

    public static String M1(XK0<InputStream> xk0, Charset charset) throws IOException {
        return N1(xk0, charset, new XK0() { // from class: o.iL0
            @Override // o.XK0
            public final Object get() {
                return C7743lL0.a();
            }
        });
    }

    public static long N(Reader reader) throws IOException {
        return m0(reader, C10328vs1.X);
    }

    public static List<String> N0(CharSequence charSequence) throws UncheckedIOException {
        C5506cB c5506cB = new C5506cB(charSequence);
        try {
            List<String> M0 = M0(c5506cB);
            c5506cB.close();
            return M0;
        } catch (Throwable th) {
            try {
                c5506cB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String N1(XK0<InputStream> xk0, Charset charset, XK0<String> xk02) throws IOException {
        String str;
        if (xk0 == null) {
            return xk02.get();
        }
        InputStream inputStream = xk0.get();
        try {
            if (inputStream != null) {
                str = E1(inputStream, charset);
            } else {
                str = xk02.get();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            return str;
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

    public static boolean O(InputStream inputStream, InputStream inputStream2) throws IOException {
        if (inputStream == inputStream2) {
            return true;
        }
        if (inputStream != null && inputStream2 != null) {
            return C4344To0.b(Channels.newChannel(inputStream), Channels.newChannel(inputStream2), 8192);
        }
        return false;
    }

    public static byte[] O0(String str) throws IOException {
        return P0(str, null);
    }

    @Deprecated
    public static String O1(byte[] bArr) {
        return new String(bArr, Charset.defaultCharset());
    }

    public static boolean P(Reader reader, Reader reader2) throws IOException {
        int read;
        int read2;
        boolean z = true;
        if (reader == reader2) {
            return true;
        }
        if (reader == null || reader2 == null) {
            return false;
        }
        b h2 = b.h();
        try {
            char[] f2 = h2.f();
            char[] m = m();
            while (true) {
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < 8192; i4++) {
                    if (i2 == i4) {
                        do {
                            read2 = reader.read(f2, i2, 8192 - i2);
                        } while (read2 == 0);
                        if (read2 == -1) {
                            z = (i3 == i4 && reader2.read() == -1) ? false : false;
                            h2.close();
                            return z;
                        }
                        i2 += read2;
                    }
                    if (i3 == i4) {
                        do {
                            read = reader2.read(m, i3, 8192 - i3);
                        } while (read == 0);
                        if (read == -1) {
                            z = (i2 == i4 && reader.read() == -1) ? false : false;
                            h2.close();
                            return z;
                        }
                        i3 += read;
                    }
                    if (f2[i4] != m[i4]) {
                        h2.close();
                        return false;
                    }
                }
            }
        } catch (Throwable th) {
            if (h2 != null) {
                try {
                    h2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static byte[] P0(String str, ClassLoader classLoader) throws IOException {
        return p1(T0(str, classLoader));
    }

    public static String P1(byte[] bArr, String str) {
        return new String(bArr, IB.e(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean Q(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
            while (it.hasNext()) {
            }
        }
        return !it2.hasNext();
    }

    public static String Q0(String str, Charset charset) throws IOException {
        return R0(str, charset, null);
    }

    @Deprecated
    public static void Q1(CharSequence charSequence, OutputStream outputStream) throws IOException {
        S1(charSequence, outputStream, Charset.defaultCharset());
    }

    public static boolean R(Stream<?> stream, Stream<?> stream2) {
        if (stream == stream2) {
            return true;
        }
        if (stream != null && stream2 != null) {
            return Q(stream.iterator(), stream2.iterator());
        }
        return false;
    }

    public static String R0(String str, Charset charset, ClassLoader classLoader) throws IOException {
        return L1(T0(str, classLoader), charset);
    }

    public static void R1(CharSequence charSequence, OutputStream outputStream, String str) throws IOException {
        S1(charSequence, outputStream, IB.e(str));
    }

    public static boolean S(BufferedReader bufferedReader, BufferedReader bufferedReader2) {
        if (bufferedReader == bufferedReader2) {
            return true;
        }
        if (bufferedReader != null && bufferedReader2 != null) {
            return R(bufferedReader.lines(), bufferedReader2.lines());
        }
        return false;
    }

    public static URL S0(String str) throws IOException {
        return T0(str, null);
    }

    public static void S1(CharSequence charSequence, OutputStream outputStream, Charset charset) throws IOException {
        if (charSequence != null) {
            W1(charSequence.toString(), outputStream, charset);
        }
    }

    public static boolean T(Reader reader, Reader reader2) throws UncheckedIOException {
        if (reader == reader2) {
            return true;
        }
        if (reader != null && reader2 != null) {
            return S(e1(reader), e1(reader2));
        }
        return false;
    }

    public static URL T0(String str, ClassLoader classLoader) throws IOException {
        URL resource;
        if (classLoader == null) {
            resource = C7743lL0.class.getResource(str);
        } else {
            resource = classLoader.getResource(str);
        }
        if (resource != null) {
            return resource;
        }
        throw new IOException("Resource not found: " + str);
    }

    public static void T1(CharSequence charSequence, Writer writer) throws IOException {
        if (charSequence != null) {
            X1(charSequence.toString(), writer);
        }
    }

    public static int U(InputStream inputStream, OutputStream outputStream) throws IOException {
        long i0 = i0(inputStream, outputStream);
        if (i0 > 2147483647L) {
            return -1;
        }
        return (int) i0;
    }

    public static long U0(InputStream inputStream, long j2) throws IOException {
        final a h2 = a.h();
        try {
            Objects.requireNonNull(h2);
            long V0 = V0(inputStream, j2, new Supplier() { // from class: o.hL0
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C7743lL0.a.this.f();
                }
            });
            h2.close();
            return V0;
        } catch (Throwable th) {
            if (h2 != null) {
                try {
                    h2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Deprecated
    public static void U1(String str, OutputStream outputStream) throws IOException {
        W1(str, outputStream, Charset.defaultCharset());
    }

    public static int V(Reader reader, Writer writer) throws IOException {
        long m0 = m0(reader, writer);
        if (m0 > 2147483647L) {
            return -1;
        }
        return (int) m0;
    }

    public static long V0(InputStream inputStream, long j2, Supplier<byte[]> supplier) throws IOException {
        byte[] bArr;
        if (j2 >= 0) {
            long j3 = j2;
            while (j3 > 0) {
                long read = inputStream.read(supplier.get(), 0, (int) Math.min(j3, bArr.length));
                if (read < 0) {
                    break;
                }
                j3 -= read;
            }
            return j2 - j3;
        }
        throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j2);
    }

    public static void V1(String str, OutputStream outputStream, String str2) throws IOException {
        W1(str, outputStream, IB.e(str2));
    }

    public static long W(InputStream inputStream, OutputStream outputStream, int i2) throws IOException {
        return l0(inputStream, outputStream, l(i2));
    }

    public static long W0(Reader reader, long j2) throws IOException {
        if (j2 >= 0) {
            b h2 = b.h();
            try {
                char[] f2 = h2.f();
                long j3 = j2;
                while (j3 > 0) {
                    long read = reader.read(f2, 0, (int) Math.min(j3, f2.length));
                    if (read < 0) {
                        break;
                    }
                    j3 -= read;
                }
                h2.close();
                return j2 - j3;
            } catch (Throwable th) {
                if (h2 != null) {
                    try {
                        h2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j2);
    }

    public static void W1(String str, OutputStream outputStream, Charset charset) throws IOException {
        if (str != null) {
            Channels.newChannel(outputStream).write(IB.g(charset).encode(str));
        }
    }

    public static long X(Reader reader, Appendable appendable) throws IOException {
        return Y(reader, appendable, CharBuffer.allocate(8192));
    }

    public static long X0(ReadableByteChannel readableByteChannel, long j2) throws IOException {
        if (j2 >= 0) {
            ByteBuffer allocate = ByteBuffer.allocate((int) Math.min(j2, 8192L));
            long j3 = j2;
            while (j3 > 0) {
                allocate.position(0);
                allocate.limit((int) Math.min(j3, 8192L));
                int read = readableByteChannel.read(allocate);
                if (read == -1) {
                    break;
                }
                j3 -= read;
            }
            return j2 - j3;
        }
        throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j2);
    }

    public static void X1(String str, Writer writer) throws IOException {
        if (str != null) {
            writer.write(str);
        }
    }

    public static long Y(Reader reader, Appendable appendable, CharBuffer charBuffer) throws IOException {
        long j2 = 0;
        while (true) {
            int read = reader.read(charBuffer);
            if (-1 != read) {
                charBuffer.flip();
                appendable.append(charBuffer, 0, read);
                j2 += read;
            } else {
                return j2;
            }
        }
    }

    public static void Y0(InputStream inputStream, long j2) throws IOException {
        long U0 = U0(inputStream, j2);
        if (U0 == j2) {
            return;
        }
        throw new EOFException("Bytes to skip: " + j2 + " actual: " + U0);
    }

    @Deprecated
    public static void Y1(StringBuffer stringBuffer, OutputStream outputStream) throws IOException {
        Z1(stringBuffer, outputStream, null);
    }

    public static long Z(URL url, File file) throws IOException {
        Path path;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        OutputStream a2 = JA1.a(path, new OpenOption[0]);
        try {
            long a0 = a0(url, a2);
            if (a2 != null) {
                a2.close();
            }
            return a0;
        } catch (Throwable th) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void Z0(InputStream inputStream, long j2, Supplier<byte[]> supplier) throws IOException {
        if (j2 >= 0) {
            long V0 = V0(inputStream, j2, supplier);
            if (V0 == j2) {
                return;
            }
            throw new EOFException("Bytes to skip: " + j2 + " actual: " + V0);
        }
        throw new IllegalArgumentException("Bytes to skip must not be negative: " + j2);
    }

    @Deprecated
    public static void Z1(StringBuffer stringBuffer, OutputStream outputStream, String str) throws IOException {
        if (stringBuffer != null) {
            W1(stringBuffer.toString(), outputStream, IB.e(str));
        }
    }

    public static /* synthetic */ String a() {
        throw new NullPointerException("input");
    }

    public static long a0(URL url, OutputStream outputStream) throws IOException {
        Objects.requireNonNull(url, "url");
        InputStream openStream = url.openStream();
        try {
            long i0 = i0(openStream, outputStream);
            if (openStream != null) {
                openStream.close();
            }
            return i0;
        } catch (Throwable th) {
            if (openStream != null) {
                try {
                    openStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void a1(Reader reader, long j2) throws IOException {
        long W0 = W0(reader, j2);
        if (W0 == j2) {
            return;
        }
        throw new EOFException("Chars to skip: " + j2 + " actual: " + W0);
    }

    @Deprecated
    public static void a2(StringBuffer stringBuffer, Writer writer) throws IOException {
        if (stringBuffer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    public static /* synthetic */ char[] b() {
        return m();
    }

    public static C9713tL1 b0(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        Objects.requireNonNull(byteArrayOutputStream, "outputStream");
        C9713tL1 c9713tL1 = new C9713tL1();
        byteArrayOutputStream.writeTo(c9713tL1.h());
        return c9713tL1;
    }

    public static void b1(ReadableByteChannel readableByteChannel, long j2) throws IOException {
        if (j2 >= 0) {
            long X0 = X0(readableByteChannel, j2);
            if (X0 == j2) {
                return;
            }
            throw new EOFException("Bytes to skip: " + j2 + " actual: " + X0);
        }
        throw new IllegalArgumentException("Bytes to skip must not be negative: " + j2);
    }

    public static void b2(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public static BufferedInputStream c(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputStream");
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream);
    }

    @Deprecated
    public static void c0(InputStream inputStream, Writer writer) throws IOException {
        e0(inputStream, writer, Charset.defaultCharset());
    }

    public static InputStream c1(InputStream inputStream) throws IOException {
        return C2986Fr.x(inputStream);
    }

    @Deprecated
    public static void c2(byte[] bArr, Writer writer) throws IOException {
        e2(bArr, writer, Charset.defaultCharset());
    }

    public static BufferedInputStream d(InputStream inputStream, int i2) {
        Objects.requireNonNull(inputStream, "inputStream");
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream, i2);
    }

    public static void d0(InputStream inputStream, Writer writer, String str) throws IOException {
        e0(inputStream, writer, IB.e(str));
    }

    public static InputStream d1(InputStream inputStream, int i2) throws IOException {
        return C2986Fr.y(inputStream, i2);
    }

    public static void d2(byte[] bArr, Writer writer, String str) throws IOException {
        e2(bArr, writer, IB.e(str));
    }

    public static BufferedOutputStream e(OutputStream outputStream) {
        Objects.requireNonNull(outputStream, "outputStream");
        if (outputStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStream;
        }
        return new BufferedOutputStream(outputStream);
    }

    public static void e0(InputStream inputStream, Writer writer, Charset charset) throws IOException {
        V(new InputStreamReader(inputStream, IB.g(charset)), writer);
    }

    public static BufferedReader e1(Reader reader) {
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader);
    }

    public static void e2(byte[] bArr, Writer writer, Charset charset) throws IOException {
        if (bArr != null) {
            writer.write(new String(bArr, IB.g(charset)));
        }
    }

    public static BufferedOutputStream f(OutputStream outputStream, int i2) {
        Objects.requireNonNull(outputStream, "outputStream");
        if (outputStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStream;
        }
        return new BufferedOutputStream(outputStream, i2);
    }

    @Deprecated
    public static void f0(Reader reader, OutputStream outputStream) throws IOException {
        h0(reader, outputStream, Charset.defaultCharset());
    }

    public static BufferedReader f1(Reader reader, int i2) {
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader, i2);
    }

    @Deprecated
    public static void f2(char[] cArr, OutputStream outputStream) throws IOException {
        h2(cArr, outputStream, Charset.defaultCharset());
    }

    public static BufferedReader g(Reader reader) {
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader);
    }

    public static void g0(Reader reader, OutputStream outputStream, String str) throws IOException {
        h0(reader, outputStream, IB.e(str));
    }

    public static byte[] g1(InputStream inputStream) throws IOException {
        C7223jC2 q0 = q0(inputStream, 2147483640L, 8192);
        if (q0.i() <= 2147483639) {
            return q0.j();
        }
        throw new IOException(String.format("Cannot read more than %,d into a byte array", 2147483639));
    }

    public static void g2(char[] cArr, OutputStream outputStream, String str) throws IOException {
        h2(cArr, outputStream, IB.e(str));
    }

    public static BufferedReader h(Reader reader, int i2) {
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader, i2);
    }

    public static void h0(Reader reader, OutputStream outputStream, Charset charset) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, IB.g(charset));
        V(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static byte[] h1(InputStream inputStream, int i2) throws IOException {
        Objects.requireNonNull(inputStream, "input");
        return r1(new C7257jL0(inputStream), i2);
    }

    public static void h2(char[] cArr, OutputStream outputStream, Charset charset) throws IOException {
        if (cArr != null) {
            W1(new String(cArr), outputStream, charset);
        }
    }

    public static BufferedWriter i(Writer writer) {
        if (writer instanceof BufferedWriter) {
            return (BufferedWriter) writer;
        }
        return new BufferedWriter(writer);
    }

    public static long i0(InputStream inputStream, OutputStream outputStream) throws IOException {
        return W(inputStream, outputStream, 8192);
    }

    public static byte[] i1(InputStream inputStream, int i2, int i3) throws IOException {
        Objects.requireNonNull(inputStream, "input");
        if (i3 > 0) {
            if (i2 <= i3) {
                return r1(new C7257jL0(inputStream), i2);
            }
            C7223jC2 q0 = q0(inputStream, i2, i3);
            int i4 = q0.i();
            if (i4 == i2) {
                return q0.j();
            }
            throw new EOFException(String.format("Expected read size: %,d, actual: %,d", Integer.valueOf(i2), Integer.valueOf(i4)));
        }
        throw new IllegalArgumentException(String.format("chunkSize <= 0, chunkSize = %,d", Integer.valueOf(i3)));
    }

    public static void i2(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            writer.write(cArr);
        }
    }

    public static BufferedWriter j(Writer writer, int i2) {
        if (writer instanceof BufferedWriter) {
            return (BufferedWriter) writer;
        }
        return new BufferedWriter(writer, i2);
    }

    public static long j0(InputStream inputStream, OutputStream outputStream, long j2, long j3) throws IOException {
        a h2 = a.h();
        try {
            long k0 = k0(inputStream, outputStream, j2, j3, h2.f());
            h2.close();
            return k0;
        } catch (Throwable th) {
            if (h2 != null) {
                try {
                    h2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static byte[] j1(InputStream inputStream, long j2) throws IOException {
        if (j2 <= 2147483647L) {
            return h1(inputStream, (int) j2);
        }
        throw new IllegalArgumentException(String.format("size > Integer.MAX_VALUE, size = %,d", Long.valueOf(j2)));
    }

    public static void j2(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            int length = bArr.length;
            int i2 = 0;
            while (length > 0) {
                int min = Math.min(length, 8192);
                outputStream.write(bArr, i2, min);
                length -= min;
                i2 += min;
            }
        }
    }

    public static byte[] k() {
        return l(8192);
    }

    public static long k0(InputStream inputStream, OutputStream outputStream, long j2, long j3, byte[] bArr) throws IOException {
        int i2;
        long j4 = 0;
        if (j2 > 0) {
            Y0(inputStream, j2);
        }
        int i3 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i3 == 0) {
            return 0L;
        }
        int length = bArr.length;
        if (i3 > 0 && j3 < length) {
            i2 = (int) j3;
        } else {
            i2 = length;
        }
        while (i2 > 0) {
            int read = inputStream.read(bArr, 0, i2);
            if (-1 == read) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j4 += read;
            if (i3 > 0) {
                i2 = (int) Math.min(j3 - j4, length);
            }
        }
        return j4;
    }

    @Deprecated
    public static byte[] k1(Reader reader) throws IOException {
        return m1(reader, Charset.defaultCharset());
    }

    public static void k2(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            int length = cArr.length;
            int i2 = 0;
            while (length > 0) {
                int min = Math.min(length, 8192);
                writer.write(cArr, i2, min);
                length -= min;
                i2 += min;
            }
        }
    }

    public static byte[] l(int i2) {
        return new byte[i2];
    }

    public static long l0(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        Objects.requireNonNull(inputStream, "inputStream");
        Objects.requireNonNull(outputStream, "outputStream");
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                outputStream.write(bArr, 0, read);
                j2 += read;
            } else {
                return j2;
            }
        }
    }

    public static byte[] l1(Reader reader, String str) throws IOException {
        return m1(reader, IB.e(str));
    }

    @Deprecated
    public static void l2(Collection<?> collection, String str, OutputStream outputStream) throws IOException {
        n2(collection, str, outputStream, Charset.defaultCharset());
    }

    public static char[] m() {
        return n(8192);
    }

    public static long m0(Reader reader, Writer writer) throws IOException {
        b h2 = b.h();
        try {
            long p0 = p0(reader, writer, h2.f());
            h2.close();
            return p0;
        } catch (Throwable th) {
            if (h2 != null) {
                try {
                    h2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static byte[] m1(Reader reader, Charset charset) throws IOException {
        C2986Fr c2986Fr = new C2986Fr();
        try {
            h0(reader, c2986Fr, charset);
            byte[] j2 = c2986Fr.j();
            c2986Fr.close();
            return j2;
        } catch (Throwable th) {
            try {
                c2986Fr.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void m2(Collection<?> collection, String str, OutputStream outputStream, String str2) throws IOException {
        n2(collection, str, outputStream, IB.e(str2));
    }

    public static char[] n(int i2) {
        return new char[i2];
    }

    public static long n0(Reader reader, Writer writer, long j2, long j3) throws IOException {
        b h2 = b.h();
        try {
            long o0 = o0(reader, writer, j2, j3, h2.f());
            h2.close();
            return o0;
        } catch (Throwable th) {
            if (h2 != null) {
                try {
                    h2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Deprecated
    public static byte[] n1(String str) {
        return str.getBytes(Charset.defaultCharset());
    }

    public static void n2(Collection<?> collection, String str, OutputStream outputStream, Charset charset) throws IOException {
        if (collection != null) {
            if (str == null) {
                str = System.lineSeparator();
            }
            if (StandardCharsets.UTF_16.equals(charset)) {
                charset = StandardCharsets.UTF_16BE;
            }
            byte[] bytes = str.getBytes(charset);
            for (Object obj : collection) {
                if (obj != null) {
                    W1(obj.toString(), outputStream, charset);
                }
                outputStream.write(bytes);
            }
        }
    }

    public static void o(int i2, int i3, int i4) {
        if ((i2 | i3 | i4) >= 0 && i4 - i3 >= i2) {
            return;
        }
        throw new IndexOutOfBoundsException(String.format("Range [%s, %<s + %s) out of bounds for length %s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    public static long o0(Reader reader, Writer writer, long j2, long j3, char[] cArr) throws IOException {
        long j4 = 0;
        if (j2 > 0) {
            a1(reader, j2);
        }
        int i2 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i2 == 0) {
            return 0L;
        }
        int length = cArr.length;
        if (i2 > 0 && j3 < cArr.length) {
            length = (int) j3;
        }
        while (length > 0) {
            int read = reader.read(cArr, 0, length);
            if (-1 == read) {
                break;
            }
            writer.write(cArr, 0, read);
            j4 += read;
            if (i2 > 0) {
                length = (int) Math.min(j3 - j4, cArr.length);
            }
        }
        return j4;
    }

    public static byte[] o1(URI uri) throws IOException {
        return p1(uri.toURL());
    }

    public static void o2(Collection<?> collection, String str, Writer writer) throws IOException {
        if (collection != null) {
            if (str == null) {
                str = System.lineSeparator();
            }
            for (Object obj : collection) {
                if (obj != null) {
                    writer.write(obj.toString());
                }
                writer.write(str);
            }
        }
    }

    public static void p(String str, int i2, int i3) {
        Objects.requireNonNull(str, "str");
        o(i2, i3, str.length());
    }

    public static long p0(Reader reader, Writer writer, char[] cArr) throws IOException {
        long j2 = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 != read) {
                writer.write(cArr, 0, read);
                j2 += read;
            } else {
                return j2;
            }
        }
    }

    public static byte[] p1(URL url) throws IOException {
        C5276bE d2 = C5276bE.d(url);
        try {
            byte[] q1 = q1(d2);
            if (d2 != null) {
                d2.close();
            }
            return q1;
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

    public static Writer p2(Appendable appendable) {
        Objects.requireNonNull(appendable, "appendable");
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        if (appendable instanceof StringBuilder) {
            return new C8076me2((StringBuilder) appendable);
        }
        return new C3126Hd(appendable);
    }

    public static void q(byte[] bArr, int i2, int i3) {
        Objects.requireNonNull(bArr, "byte array");
        o(i2, i3, bArr.length);
    }

    public static C7223jC2 q0(InputStream inputStream, long j2, int i2) throws IOException {
        C7223jC2 c7223jC2 = C7223jC2.z().Z(i2).get();
        try {
            C9090qp c9090qp = ((C9090qp.c) ((C9090qp.c) ((C9090qp.c) C9090qp.k().q0(j2)).s0(false)).z(inputStream)).get();
            c7223jC2.p(c9090qp);
            if (c9090qp != null) {
                c9090qp.close();
            }
            c7223jC2.close();
            return c7223jC2;
        } catch (Throwable th) {
            if (c7223jC2 != null) {
                try {
                    c7223jC2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static byte[] q1(URLConnection uRLConnection) throws IOException {
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            byte[] g1 = g1(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return g1;
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

    public static void r(char[] cArr, int i2, int i3) {
        Objects.requireNonNull(cArr, "char array");
        o(i2, i3, cArr.length);
    }

    public static int r0(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static byte[] r1(InterfaceC5305bL0<byte[], Integer, Integer, Integer> interfaceC5305bL0, int i2) throws IOException {
        if (i2 >= 0) {
            if (i2 == 0) {
                return f;
            }
            byte[] l2 = l(i2);
            int i3 = 0;
            while (i3 < i2) {
                int intValue = interfaceC5305bL0.b(l2, Integer.valueOf(i3), Integer.valueOf(i2 - i3)).intValue();
                if (intValue == -1) {
                    break;
                }
                i3 += intValue;
            }
            if (i3 == i2) {
                return l2;
            }
            throw new EOFException(String.format("Expected read size: %,d, actual: %,d", Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        throw new IllegalArgumentException(String.format("size < 0, size = %,d", Integer.valueOf(i2)));
    }

    public static void s(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 >= i2 && i4 >= i3) {
            return;
        }
        throw new IndexOutOfBoundsException(String.format("Range [%s, %s) out of bounds for length %s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    public static int s0(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    @Deprecated
    public static char[] s1(InputStream inputStream) throws IOException {
        return u1(inputStream, Charset.defaultCharset());
    }

    public static void t(CharSequence charSequence, int i2, int i3) {
        int i4;
        if (charSequence != null) {
            i4 = charSequence.length();
        } else {
            i4 = 4;
        }
        s(i2, i3, i4);
    }

    public static int t0(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        return cArr.length;
    }

    public static char[] t1(InputStream inputStream, String str) throws IOException {
        return u1(inputStream, IB.e(str));
    }

    public static void u() {
        a.Y.remove();
        b.Y.remove();
    }

    public static int u0(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public static char[] u1(InputStream inputStream, Charset charset) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        e0(inputStream, charArrayWriter, charset);
        return charArrayWriter.toCharArray();
    }

    public static void v(Closeable closeable) throws IOException {
        if (closeable != null) {
            closeable.close();
        }
    }

    public static VZ0 v0(InputStream inputStream, String str) {
        return w0(inputStream, IB.e(str));
    }

    public static char[] v1(Reader reader) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        V(reader, charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static void w(Closeable closeable, EJ0<IOException> ej0) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                if (ej0 != null) {
                    ej0.accept(e2);
                }
            } catch (Exception e3) {
                if (ej0 != null) {
                    ej0.accept(new IOException(e3));
                }
            }
        }
    }

    public static VZ0 w0(InputStream inputStream, Charset charset) {
        return new VZ0(new InputStreamReader(inputStream, IB.g(charset)));
    }

    @Deprecated
    public static InputStream w1(CharSequence charSequence) {
        return y1(charSequence, Charset.defaultCharset());
    }

    public static void x(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static VZ0 x0(Reader reader) {
        return new VZ0(reader);
    }

    public static InputStream x1(CharSequence charSequence, String str) {
        return y1(charSequence, IB.e(str));
    }

    public static void y(Closeable... closeableArr) throws FJ0 {
        EJ0.f(new EJ0() { // from class: o.gL0
            @Override // o.EJ0
            public final void accept(Object obj) {
                C7743lL0.v((Closeable) obj);
            }
        }, closeableArr);
    }

    public static int y0(InputStream inputStream, byte[] bArr) throws IOException {
        return z0(inputStream, bArr, 0, bArr.length);
    }

    public static InputStream y1(CharSequence charSequence, Charset charset) {
        return B1(charSequence.toString(), charset);
    }

    public static void z(Closeable closeable) {
        B(closeable, null);
    }

    public static int z0(InputStream inputStream, byte[] bArr, int i2, int i3) throws IOException {
        q(bArr, i2, i3);
        int i4 = i3;
        while (i4 > 0) {
            int read = inputStream.read(bArr, (i3 - i4) + i2, i4);
            if (-1 == read) {
                break;
            }
            i4 -= read;
        }
        return i3 - i4;
    }

    @Deprecated
    public static InputStream z1(String str) {
        return B1(str, Charset.defaultCharset());
    }
}
