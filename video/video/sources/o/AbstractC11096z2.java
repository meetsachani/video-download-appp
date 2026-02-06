package o;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Objects;
import o.AbstractC11096z2;
import o.GN1;
import o.HO1;
import o.QN2;
import o.YA;

/* renamed from: o.z2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC11096z2<T, B extends AbstractC11096z2<T, B>> extends AbstractC10371w3<T, B> {
    public final T a;

    /* renamed from: o.z2$a */
    /* loaded from: classes4.dex */
    public static abstract class a<T extends RandomAccessFile, B extends a<T, B>> extends AbstractC11096z2<T, B> {
        public a(T t) {
            super(t);
        }

        @Override // o.AbstractC11096z2
        public byte[] d() throws IOException {
            long length = ((RandomAccessFile) this.a).length();
            if (length <= 2147483647L) {
                return IN1.c((RandomAccessFile) this.a, 0L, (int) length);
            }
            throw new IllegalStateException("Origin too large.");
        }

        @Override // o.AbstractC11096z2
        public byte[] e(long j, int i) throws IOException {
            return IN1.c((RandomAccessFile) this.a, j, i);
        }

        @Override // o.AbstractC11096z2
        public Channel g(OpenOption... openOptionArr) throws IOException {
            return m(openOptionArr).getChannel();
        }

        @Override // o.AbstractC11096z2
        public CharSequence h(Charset charset) throws IOException {
            return new String(d(), charset);
        }

        @Override // o.AbstractC11096z2
        public InputStream j(OpenOption... openOptionArr) throws IOException {
            return C11290zq.a().l0(((RandomAccessFile) this.a).getChannel()).get();
        }

        @Override // o.AbstractC11096z2
        public OutputStream k(OpenOption... openOptionArr) throws IOException {
            return ((GN1.b) GN1.a().E((RandomAccessFile) this.a)).get();
        }

        @Override // o.AbstractC11096z2
        public T m(OpenOption... openOptionArr) {
            return (T) get();
        }

        @Override // o.AbstractC11096z2
        public Reader n(Charset charset) throws IOException {
            return new InputStreamReader(j(new OpenOption[0]), IB.g(charset));
        }

        @Override // o.AbstractC11096z2
        public Writer p(Charset charset, OpenOption... openOptionArr) throws IOException {
            return new OutputStreamWriter(k(openOptionArr), IB.g(charset));
        }

        @Override // o.AbstractC11096z2
        public long q() throws IOException {
            return ((RandomAccessFile) this.a).length();
        }
    }

    /* renamed from: o.z2$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC11096z2<byte[], b> {
        public b(byte[] bArr) {
            super(bArr);
        }

        @Override // o.AbstractC11096z2
        public byte[] d() {
            return get();
        }

        @Override // o.AbstractC11096z2
        public Channel g(OpenOption... openOptionArr) throws IOException {
            for (OpenOption openOption : openOptionArr) {
                if (openOption == C6892hq1.a()) {
                    throw new UnsupportedOperationException("Only READ is supported for byte[] origins: " + Arrays.toString(openOptionArr));
                }
            }
            return C3378Jr.k(d());
        }

        @Override // o.AbstractC11096z2
        public InputStream j(OpenOption... openOptionArr) throws IOException {
            return new ByteArrayInputStream((byte[]) this.a);
        }

        @Override // o.AbstractC11096z2
        public Reader n(Charset charset) throws IOException {
            return new InputStreamReader(j(new OpenOption[0]), IB.g(charset));
        }

        @Override // o.AbstractC11096z2
        public long q() throws IOException {
            return ((byte[]) this.a).length;
        }
    }

    /* renamed from: o.z2$c */
    /* loaded from: classes4.dex */
    public static class c extends AbstractC11096z2<Channel, c> {
        public c(Channel channel) {
            super(channel);
        }

        @Override // o.AbstractC11096z2
        public byte[] d() throws IOException {
            return C7743lL0.g1(j(new OpenOption[0]));
        }

        @Override // o.AbstractC11096z2
        public Channel g(OpenOption... openOptionArr) throws IOException {
            return get();
        }

        @Override // o.AbstractC11096z2
        public InputStream j(OpenOption... openOptionArr) throws IOException {
            return Channels.newInputStream((ReadableByteChannel) f(ReadableByteChannel.class, openOptionArr));
        }

        @Override // o.AbstractC11096z2
        public OutputStream k(OpenOption... openOptionArr) throws IOException {
            return Channels.newOutputStream((WritableByteChannel) f(WritableByteChannel.class, openOptionArr));
        }

        @Override // o.AbstractC11096z2
        public Reader n(Charset charset) throws IOException {
            return Channels.newReader((ReadableByteChannel) f(ReadableByteChannel.class, new OpenOption[0]), IB.g(charset).newDecoder(), -1);
        }

        @Override // o.AbstractC11096z2
        public Writer p(Charset charset, OpenOption... openOptionArr) throws IOException {
            return Channels.newWriter((WritableByteChannel) f(WritableByteChannel.class, openOptionArr), IB.g(charset).newEncoder(), -1);
        }

        @Override // o.AbstractC11096z2
        public long q() throws IOException {
            T t = this.a;
            if (t instanceof SeekableByteChannel) {
                return ((SeekableByteChannel) t).size();
            }
            throw s("size");
        }
    }

    /* renamed from: o.z2$d */
    /* loaded from: classes4.dex */
    public static class d extends AbstractC11096z2<CharSequence, d> {
        public d(CharSequence charSequence) {
            super(charSequence);
        }

        @Override // o.AbstractC11096z2
        public byte[] d() {
            return ((CharSequence) this.a).toString().getBytes(Charset.defaultCharset());
        }

        @Override // o.AbstractC11096z2
        public Channel g(OpenOption... openOptionArr) throws IOException {
            for (OpenOption openOption : openOptionArr) {
                if (openOption == C6892hq1.a()) {
                    throw new UnsupportedOperationException("Only READ is supported for CharSequence origins: " + Arrays.toString(openOptionArr));
                }
            }
            return C3378Jr.k(d());
        }

        @Override // o.AbstractC11096z2
        public CharSequence h(Charset charset) {
            return get();
        }

        @Override // o.AbstractC11096z2
        public InputStream j(OpenOption... openOptionArr) throws IOException {
            return ((YA.b) YA.f().w(h(Charset.defaultCharset()))).get();
        }

        @Override // o.AbstractC11096z2
        public Reader n(Charset charset) throws IOException {
            return new C5506cB(get());
        }

        @Override // o.AbstractC11096z2
        public long q() throws IOException {
            return ((CharSequence) this.a).length();
        }
    }

    /* renamed from: o.z2$e */
    /* loaded from: classes4.dex */
    public static class e extends AbstractC11096z2<File, e> {
        public e(File file) {
            super(file);
        }

        @Override // o.AbstractC11096z2
        public byte[] e(long j, int i) throws IOException {
            RandomAccessFile i2 = FN1.READ_ONLY.i((File) this.a);
            try {
                byte[] c = IN1.c(i2, j, i);
                if (i2 != null) {
                    i2.close();
                }
                return c;
            } catch (Throwable th) {
                if (i2 != null) {
                    try {
                        i2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // o.AbstractC11096z2
        public Channel g(OpenOption... openOptionArr) throws IOException {
            return A2.a(l(), openOptionArr);
        }

        @Override // o.AbstractC11096z2
        public File i() {
            return get();
        }

        @Override // o.AbstractC11096z2
        public Path l() {
            Path path;
            path = get().toPath();
            return path;
        }
    }

    /* renamed from: o.z2$f */
    /* loaded from: classes4.dex */
    public static class f extends a<C8487oK0, f> {
        public f(C8487oK0 c8487oK0) {
            super(c8487oK0);
        }

        @Override // o.AbstractC11096z2
        public File i() {
            return ((C8487oK0) get()).a();
        }

        @Override // o.AbstractC11096z2
        public Path l() {
            Path path;
            path = i().toPath();
            return path;
        }
    }

    /* renamed from: o.z2$g */
    /* loaded from: classes4.dex */
    public static class g extends AbstractC11096z2<InputStream, g> {
        public g(InputStream inputStream) {
            super(inputStream);
        }

        @Override // o.AbstractC11096z2
        public byte[] d() throws IOException {
            return C7743lL0.g1((InputStream) this.a);
        }

        @Override // o.AbstractC11096z2
        public Channel g(OpenOption... openOptionArr) throws IOException {
            return Channels.newChannel(j(openOptionArr));
        }

        @Override // o.AbstractC11096z2
        public InputStream j(OpenOption... openOptionArr) {
            return get();
        }

        @Override // o.AbstractC11096z2
        public Reader n(Charset charset) throws IOException {
            return new InputStreamReader(j(new OpenOption[0]), IB.g(charset));
        }

        @Override // o.AbstractC11096z2
        public long q() throws IOException {
            T t = this.a;
            if (t instanceof FileInputStream) {
                return ((FileInputStream) t).getChannel().size();
            }
            throw s("size");
        }
    }

    /* renamed from: o.z2$h */
    /* loaded from: classes4.dex */
    public static class h extends AbstractC11096z2<OutputStream, h> {
        public h(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // o.AbstractC11096z2
        public Channel g(OpenOption... openOptionArr) throws IOException {
            return Channels.newChannel(k(openOptionArr));
        }

        @Override // o.AbstractC11096z2
        public OutputStream k(OpenOption... openOptionArr) {
            return get();
        }

        @Override // o.AbstractC11096z2
        public Writer p(Charset charset, OpenOption... openOptionArr) throws IOException {
            return new OutputStreamWriter((OutputStream) this.a, IB.g(charset));
        }
    }

    /* renamed from: o.z2$i */
    /* loaded from: classes4.dex */
    public static class i extends AbstractC11096z2<Path, i> {
        public i(Path path) {
            super(path);
        }

        @Override // o.AbstractC11096z2
        public byte[] e(final long j, final int i) throws IOException {
            return (byte[]) FN1.READ_ONLY.h(N30.a(this.a), new RJ0() { // from class: o.B2
                @Override // o.RJ0
                public final Object apply(Object obj) {
                    byte[] c;
                    c = IN1.c((RandomAccessFile) obj, j, i);
                    return c;
                }
            });
        }

        @Override // o.AbstractC11096z2
        public Channel g(OpenOption... openOptionArr) throws IOException {
            return A2.a(l(), openOptionArr);
        }

        @Override // o.AbstractC11096z2
        public File i() {
            return C6150eq0.a(N30.a(get()));
        }

        @Override // o.AbstractC11096z2
        public Path l() {
            return N30.a(get());
        }
    }

    /* renamed from: o.z2$j */
    /* loaded from: classes4.dex */
    public static class j extends a<RandomAccessFile, j> {
        public j(RandomAccessFile randomAccessFile) {
            super(randomAccessFile);
        }
    }

    /* renamed from: o.z2$k */
    /* loaded from: classes4.dex */
    public static class k extends AbstractC11096z2<Reader, k> {
        public k(Reader reader) {
            super(reader);
        }

        @Override // o.AbstractC11096z2
        public byte[] d() throws IOException {
            return C7743lL0.m1((Reader) this.a, Charset.defaultCharset());
        }

        @Override // o.AbstractC11096z2
        public Channel g(OpenOption... openOptionArr) throws IOException {
            return Channels.newChannel(j(new OpenOption[0]));
        }

        @Override // o.AbstractC11096z2
        public CharSequence h(Charset charset) throws IOException {
            return C7743lL0.F1((Reader) this.a);
        }

        @Override // o.AbstractC11096z2
        public InputStream j(OpenOption... openOptionArr) throws IOException {
            return ((HO1.b) HO1.h().G((Reader) this.a)).f0(Charset.defaultCharset()).get();
        }

        @Override // o.AbstractC11096z2
        public Reader n(Charset charset) throws IOException {
            return get();
        }
    }

    /* renamed from: o.z2$l */
    /* loaded from: classes4.dex */
    public static class l extends AbstractC11096z2<URI, l> {
        public static final String b = "https";
        public static final String c = "http";

        public l(URI uri) {
            super(uri);
        }

        @Override // o.AbstractC11096z2
        public Channel g(OpenOption... openOptionArr) throws IOException {
            URI uri = get();
            String scheme = uri.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                return A2.a(l(), openOptionArr);
            }
            return Channels.newChannel(uri.toURL().openStream());
        }

        @Override // o.AbstractC11096z2
        public File i() {
            return C6150eq0.a(l());
        }

        @Override // o.AbstractC11096z2
        public InputStream j(OpenOption... openOptionArr) throws IOException {
            InputStream newInputStream;
            URI uri = get();
            String scheme = uri.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                newInputStream = Files.newInputStream(l(), openOptionArr);
                return newInputStream;
            }
            return uri.toURL().openStream();
        }

        @Override // o.AbstractC11096z2
        public Path l() {
            return C10891yB1.a(get());
        }
    }

    /* renamed from: o.z2$m */
    /* loaded from: classes4.dex */
    public static class m extends AbstractC11096z2<Writer, m> {
        public m(Writer writer) {
            super(writer);
        }

        @Override // o.AbstractC11096z2
        public Channel g(OpenOption... openOptionArr) throws IOException {
            return Channels.newChannel(k(new OpenOption[0]));
        }

        @Override // o.AbstractC11096z2
        public OutputStream k(OpenOption... openOptionArr) throws IOException {
            return ((QN2.b) QN2.a().I((Writer) this.a)).f0(Charset.defaultCharset()).get();
        }

        @Override // o.AbstractC11096z2
        public Writer p(Charset charset, OpenOption... openOptionArr) throws IOException {
            return get();
        }
    }

    public AbstractC11096z2(T t) {
        Objects.requireNonNull(t, "origin");
        this.a = t;
    }

    public byte[] d() throws IOException {
        byte[] readAllBytes;
        readAllBytes = Files.readAllBytes(l());
        return readAllBytes;
    }

    public byte[] e(long j2, int i2) throws IOException {
        int i3;
        byte[] d2 = d();
        int intExact = Math.toIntExact(j2);
        if (intExact >= 0 && i2 >= 0 && (i3 = intExact + i2) >= 0 && i3 <= d2.length) {
            return Arrays.copyOfRange(d2, intExact, i3);
        }
        throw new IllegalArgumentException("Couldn't read array (start: " + intExact + ", length: " + i2 + ", data length: " + d2.length + ").");
    }

    public final <C extends Channel> C f(Class<C> cls, OpenOption... openOptionArr) throws IOException {
        Objects.requireNonNull(cls, "channelType");
        Channel g2 = g(openOptionArr);
        if (cls.isInstance(g2)) {
            return cls.cast(g2);
        }
        throw r(cls);
    }

    public Channel g(OpenOption... openOptionArr) throws IOException {
        throw s("getChannel");
    }

    @Override // o.XK0
    public T get() {
        return this.a;
    }

    public CharSequence h(Charset charset) throws IOException {
        return new String(d(), charset);
    }

    public File i() {
        throw s("getFile");
    }

    public InputStream j(OpenOption... openOptionArr) throws IOException {
        InputStream newInputStream;
        newInputStream = Files.newInputStream(l(), openOptionArr);
        return newInputStream;
    }

    public OutputStream k(OpenOption... openOptionArr) throws IOException {
        return JA1.a(l(), openOptionArr);
    }

    public Path l() {
        throw s("getPath");
    }

    public RandomAccessFile m(OpenOption... openOptionArr) throws FileNotFoundException {
        return FN1.q(openOptionArr).i(i());
    }

    public Reader n(Charset charset) throws IOException {
        return FA1.a(l(), IB.g(charset));
    }

    public final String o() {
        return getClass().getSimpleName();
    }

    public Writer p(Charset charset, OpenOption... openOptionArr) throws IOException {
        return C10853y2.a(l(), IB.g(charset), openOptionArr);
    }

    public long q() throws IOException {
        long size;
        size = Files.size(l());
        return size;
    }

    public UnsupportedOperationException r(Class<? extends Channel> cls) {
        return new UnsupportedOperationException(String.format("%s#getChannel(%s) for %s origin %s", o(), cls.getSimpleName(), this.a.getClass().getSimpleName(), this.a));
    }

    public UnsupportedOperationException s(String str) {
        return new UnsupportedOperationException(String.format("%s#%s() for %s origin %s", o(), str, this.a.getClass().getSimpleName(), this.a));
    }

    public String toString() {
        return o() + C6566gU0.f + this.a.toString() + C6566gU0.g;
    }
}
