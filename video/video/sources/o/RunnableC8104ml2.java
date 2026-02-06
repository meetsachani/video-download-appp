package o;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.Duration;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import o.RunnableC8104ml2;

/* renamed from: o.ml2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class RunnableC8104ml2 implements Runnable, AutoCloseable {
    public static final boolean e1 = false;
    public static final int f1 = 1000;
    public static final String g1 = "r";
    public static final Charset h1 = Charset.defaultCharset();
    public final byte[] X;
    public final e Y;
    public final Duration Y0;
    public final Charset Z;
    public final boolean Z0;
    public final InterfaceC8591ol2 a1;
    public final boolean b1;
    public volatile boolean c1;
    public final boolean d1;

    /* renamed from: o.ml2$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<RunnableC8104ml2, b> {
        public static final Duration t;
        public e l;
        public InterfaceC8591ol2 m;

        /* renamed from: o  reason: collision with root package name */
        public boolean f808o;
        public boolean p;
        public Duration n = t;
        public boolean q = true;
        public boolean r = false;
        public ExecutorService s = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: o.nl2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread r0;
                r0 = RunnableC8104ml2.b.r0(runnable);
                return r0;
            }
        });

        static {
            Duration ofMillis;
            ofMillis = Duration.ofMillis(1000L);
            t = ofMillis;
        }

        public static Thread r0(Runnable runnable) {
            Thread thread = new Thread(runnable, "commons-io-tailer");
            thread.setDaemon(true);
            return thread;
        }

        public b A0(InterfaceC8591ol2 interfaceC8591ol2) {
            Objects.requireNonNull(interfaceC8591ol2, "tailerListener");
            this.m = interfaceC8591ol2;
            return this;
        }

        @Override // o.XK0
        /* renamed from: q0 */
        public RunnableC8104ml2 get() {
            RunnableC8104ml2 runnableC8104ml2 = new RunnableC8104ml2(this);
            if (this.q) {
                this.s.submit(runnableC8104ml2);
            }
            return runnableC8104ml2;
        }

        public b s0(Duration duration) {
            if (duration == null) {
                duration = t;
            }
            this.n = duration;
            return this;
        }

        public b t0(ExecutorService executorService) {
            Objects.requireNonNull(executorService, "executorService");
            this.s = executorService;
            return this;
        }

        public b u0(boolean z) {
            this.r = z;
            return this;
        }

        @Override // o.C2
        /* renamed from: v0 */
        public b A(AbstractC11096z2<?, ?> abstractC11096z2) {
            z0(new f(abstractC11096z2.l(), new LinkOption[0]));
            return (b) super.A(abstractC11096z2);
        }

        public b w0(boolean z) {
            this.p = z;
            return this;
        }

        public b x0(boolean z) {
            this.q = z;
            return this;
        }

        public b y0(boolean z) {
            this.f808o = z;
            return this;
        }

        public b z0(e eVar) {
            Objects.requireNonNull(eVar, "tailable");
            this.l = eVar;
            return this;
        }
    }

    /* renamed from: o.ml2$c */
    /* loaded from: classes4.dex */
    public static final class c implements d {
        public final RandomAccessFile X;

        @Override // o.RunnableC8104ml2.d
        public long W3() throws IOException {
            return this.X.getFilePointer();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.X.close();
        }

        @Override // o.RunnableC8104ml2.d
        public int read(byte[] bArr) throws IOException {
            return this.X.read(bArr);
        }

        @Override // o.RunnableC8104ml2.d
        public void seek(long j) throws IOException {
            this.X.seek(j);
        }

        public c(File file, String str) throws FileNotFoundException {
            this.X = new RandomAccessFile(file, str);
        }
    }

    /* renamed from: o.ml2$d */
    /* loaded from: classes4.dex */
    public interface d extends Closeable {
        long W3() throws IOException;

        int read(byte[] bArr) throws IOException;

        void seek(long j) throws IOException;
    }

    /* renamed from: o.ml2$e */
    /* loaded from: classes4.dex */
    public interface e {
        d a(String str) throws FileNotFoundException;

        FileTime b() throws IOException;

        boolean c(FileTime fileTime) throws IOException;

        long size() throws IOException;
    }

    /* renamed from: o.ml2$f */
    /* loaded from: classes4.dex */
    public static final class f implements e {
        public final Path a;
        public final LinkOption[] b;

        @Override // o.RunnableC8104ml2.e
        public d a(String str) throws FileNotFoundException {
            File file;
            file = this.a.toFile();
            return new c(file, str);
        }

        @Override // o.RunnableC8104ml2.e
        public FileTime b() throws IOException {
            FileTime lastModifiedTime;
            lastModifiedTime = Files.getLastModifiedTime(this.a, this.b);
            return lastModifiedTime;
        }

        @Override // o.RunnableC8104ml2.e
        public boolean c(FileTime fileTime) throws IOException {
            return C11130zA1.m0(this.a, fileTime, this.b);
        }

        public Path d() {
            return this.a;
        }

        @Override // o.RunnableC8104ml2.e
        public long size() throws IOException {
            long size;
            size = Files.size(this.a);
            return size;
        }

        public String toString() {
            return "TailablePath [file=" + this.a + ", linkOptions=" + Arrays.toString(this.b) + C6566gU0.g;
        }

        public f(Path path, LinkOption... linkOptionArr) {
            Objects.requireNonNull(path, "path");
            this.a = N30.a(path);
            this.b = linkOptionArr;
        }
    }

    public static b a() {
        return new b();
    }

    @Deprecated
    public static RunnableC8104ml2 d(File file, Charset charset, InterfaceC8591ol2 interfaceC8591ol2, long j, boolean z, boolean z2, int i) {
        Duration ofMillis;
        ofMillis = Duration.ofMillis(j);
        return ((b) a().x(file)).A0(interfaceC8591ol2).f0(charset).s0(ofMillis).y0(z).w0(z2).Z(i).get();
    }

    @Deprecated
    public static RunnableC8104ml2 f(File file, InterfaceC8591ol2 interfaceC8591ol2) {
        return ((b) a().x(file)).A0(interfaceC8591ol2).get();
    }

    @Deprecated
    public static RunnableC8104ml2 h(File file, InterfaceC8591ol2 interfaceC8591ol2, long j) {
        Duration ofMillis;
        b A0 = ((b) a().x(file)).A0(interfaceC8591ol2);
        ofMillis = Duration.ofMillis(j);
        return A0.s0(ofMillis).get();
    }

    @Deprecated
    public static RunnableC8104ml2 i(File file, InterfaceC8591ol2 interfaceC8591ol2, long j, boolean z) {
        Duration ofMillis;
        b A0 = ((b) a().x(file)).A0(interfaceC8591ol2);
        ofMillis = Duration.ofMillis(j);
        return A0.s0(ofMillis).y0(z).get();
    }

    @Deprecated
    public static RunnableC8104ml2 j(File file, InterfaceC8591ol2 interfaceC8591ol2, long j, boolean z, int i) {
        Duration ofMillis;
        b A0 = ((b) a().x(file)).A0(interfaceC8591ol2);
        ofMillis = Duration.ofMillis(j);
        return A0.s0(ofMillis).y0(z).Z(i).get();
    }

    @Deprecated
    public static RunnableC8104ml2 k(File file, InterfaceC8591ol2 interfaceC8591ol2, long j, boolean z, boolean z2) {
        Duration ofMillis;
        b A0 = ((b) a().x(file)).A0(interfaceC8591ol2);
        ofMillis = Duration.ofMillis(j);
        return A0.s0(ofMillis).y0(z).w0(z2).get();
    }

    @Deprecated
    public static RunnableC8104ml2 l(File file, InterfaceC8591ol2 interfaceC8591ol2, long j, boolean z, boolean z2, int i) {
        Duration ofMillis;
        b A0 = ((b) a().x(file)).A0(interfaceC8591ol2);
        ofMillis = Duration.ofMillis(j);
        return A0.s0(ofMillis).y0(z).w0(z2).Z(i).get();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.c1 = false;
    }

    @Deprecated
    public long m() {
        long millis;
        millis = this.Y0.toMillis();
        return millis;
    }

    public Duration n() {
        return this.Y0;
    }

    public File o() {
        File file;
        e eVar = this.Y;
        if (eVar instanceof f) {
            file = ((f) eVar).d().toFile();
            return file;
        }
        throw new IllegalStateException("Cannot extract java.io.File from " + this.Y.getClass().getName());
    }

    public boolean p() {
        return this.c1;
    }

    public e q() {
        return this.Y;
    }

    public final long r(d dVar) throws IOException {
        int read;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        try {
            long W3 = dVar.W3();
            long j = W3;
            boolean z = false;
            while (p() && (read = dVar.read(this.X)) != -1) {
                for (int i = 0; i < read; i++) {
                    byte b2 = this.X[i];
                    if (b2 != 10) {
                        if (b2 != 13) {
                            if (z) {
                                this.a1.a(new String(byteArrayOutputStream.toByteArray(), this.Z));
                                byteArrayOutputStream.reset();
                                W3 = i + j + 1;
                                z = false;
                            }
                            byteArrayOutputStream.write(b2);
                        } else {
                            if (z) {
                                byteArrayOutputStream.write(13);
                            }
                            z = true;
                        }
                    } else {
                        this.a1.a(new String(byteArrayOutputStream.toByteArray(), this.Z));
                        byteArrayOutputStream.reset();
                        W3 = i + j + 1;
                        z = false;
                    }
                }
                j = dVar.W3();
            }
            dVar.seek(W3);
            InterfaceC8591ol2 interfaceC8591ol2 = this.a1;
            if (interfaceC8591ol2 instanceof C8834pl2) {
                ((C8834pl2) interfaceC8591ol2).f();
            }
            byteArrayOutputStream.close();
            return W3;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        d dVar;
        d dVar2 = null;
        try {
            try {
                try {
                    FileTime fileTime = C4639Wp0.d;
                    long j = 0;
                    while (p() && dVar2 == null) {
                        try {
                            dVar2 = this.Y.a("r");
                        } catch (FileNotFoundException unused) {
                            this.a1.c();
                        }
                        if (dVar2 == null) {
                            C5174ao2.b(this.Y0);
                        } else {
                            if (this.Z0) {
                                j = this.Y.size();
                            } else {
                                j = 0;
                            }
                            fileTime = this.Y.b();
                            dVar2.seek(j);
                        }
                    }
                    while (p()) {
                        boolean c2 = this.Y.c(fileTime);
                        int i = (this.Y.size() > j ? 1 : (this.Y.size() == j ? 0 : -1));
                        if (i < 0) {
                            this.a1.d();
                            try {
                                dVar = this.Y.a("r");
                            } catch (Throwable th) {
                                th = th;
                                dVar = dVar2;
                            }
                            try {
                                try {
                                    r(dVar2);
                                } catch (IOException e2) {
                                    this.a1.b(e2);
                                }
                                if (dVar2 != null) {
                                    try {
                                        try {
                                            dVar2.close();
                                        } catch (InterruptedException e3) {
                                            e = e3;
                                            dVar2 = dVar;
                                            Thread.currentThread().interrupt();
                                            this.a1.b(e);
                                            C7743lL0.v(dVar2);
                                            close();
                                        } catch (Exception e4) {
                                            e = e4;
                                            dVar2 = dVar;
                                            this.a1.b(e);
                                            C7743lL0.v(dVar2);
                                            close();
                                        } catch (Throwable th2) {
                                            th = th2;
                                            dVar2 = dVar;
                                            try {
                                                C7743lL0.v(dVar2);
                                            } catch (IOException e5) {
                                                this.a1.b(e5);
                                            }
                                            close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused2) {
                                        j = 0;
                                        dVar2 = dVar;
                                        this.a1.c();
                                        C5174ao2.b(this.Y0);
                                    }
                                }
                                j = 0;
                                dVar2 = dVar;
                            } catch (Throwable th3) {
                                th = th3;
                                if (dVar2 != null) {
                                    try {
                                        dVar2.close();
                                    } catch (Throwable th4) {
                                        try {
                                            th.addSuppressed(th4);
                                        } catch (FileNotFoundException unused3) {
                                            dVar2 = dVar;
                                            this.a1.c();
                                            C5174ao2.b(this.Y0);
                                        }
                                    }
                                }
                                throw th;
                                break;
                            }
                        } else {
                            if (i > 0) {
                                j = r(dVar2);
                                fileTime = this.Y.b();
                            } else if (c2) {
                                if (!this.d1) {
                                    dVar2.seek(0L);
                                    j = r(dVar2);
                                }
                                fileTime = this.Y.b();
                            }
                            if (this.b1 && dVar2 != null) {
                                dVar2.close();
                            }
                            C5174ao2.b(this.Y0);
                            if (p() && this.b1) {
                                dVar2 = this.Y.a("r");
                                dVar2.seek(j);
                            }
                        }
                    }
                    C7743lL0.v(dVar2);
                } catch (InterruptedException e6) {
                    e = e6;
                } catch (Exception e7) {
                    e = e7;
                }
            } catch (IOException e8) {
                this.a1.b(e8);
            }
            close();
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Deprecated
    public void s() {
        close();
    }

    public RunnableC8104ml2(b bVar) {
        this.c1 = true;
        e eVar = bVar.l;
        Objects.requireNonNull(eVar, "tailable");
        this.Y = eVar;
        InterfaceC8591ol2 interfaceC8591ol2 = bVar.m;
        Objects.requireNonNull(interfaceC8591ol2, ServiceSpecificExtraArgs.CastExtraArgs.a);
        InterfaceC8591ol2 interfaceC8591ol22 = interfaceC8591ol2;
        this.a1 = interfaceC8591ol22;
        this.Y0 = bVar.n;
        this.Z0 = bVar.f808o;
        this.X = C7743lL0.l(bVar.L());
        interfaceC8591ol22.e(this);
        this.b1 = bVar.p;
        this.Z = bVar.P();
        this.d1 = bVar.r;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RunnableC8104ml2(File file, Charset charset, InterfaceC8591ol2 interfaceC8591ol2, long j, boolean z, boolean z2, int i) {
        this(r1, charset, interfaceC8591ol2, r4, z, z2, i, false);
        Path path;
        Duration ofMillis;
        path = file.toPath();
        f fVar = new f(path, new LinkOption[0]);
        ofMillis = Duration.ofMillis(j);
    }

    @Deprecated
    public RunnableC8104ml2(File file, InterfaceC8591ol2 interfaceC8591ol2) {
        this(file, interfaceC8591ol2, 1000L);
    }

    @Deprecated
    public RunnableC8104ml2(File file, InterfaceC8591ol2 interfaceC8591ol2, long j) {
        this(file, interfaceC8591ol2, j, false);
    }

    @Deprecated
    public RunnableC8104ml2(File file, InterfaceC8591ol2 interfaceC8591ol2, long j, boolean z) {
        this(file, interfaceC8591ol2, j, z, 8192);
    }

    @Deprecated
    public RunnableC8104ml2(File file, InterfaceC8591ol2 interfaceC8591ol2, long j, boolean z, boolean z2) {
        this(file, interfaceC8591ol2, j, z, z2, 8192);
    }

    @Deprecated
    public RunnableC8104ml2(File file, InterfaceC8591ol2 interfaceC8591ol2, long j, boolean z, boolean z2, int i) {
        this(file, h1, interfaceC8591ol2, j, z, z2, i);
    }

    @Deprecated
    public RunnableC8104ml2(File file, InterfaceC8591ol2 interfaceC8591ol2, long j, boolean z, int i) {
        this(file, interfaceC8591ol2, j, z, false, i);
    }

    public RunnableC8104ml2(e eVar, Charset charset, InterfaceC8591ol2 interfaceC8591ol2, Duration duration, boolean z, boolean z2, int i, boolean z3) {
        this.c1 = true;
        Objects.requireNonNull(eVar, "tailable");
        this.Y = eVar;
        Objects.requireNonNull(interfaceC8591ol2, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.a1 = interfaceC8591ol2;
        this.Y0 = duration;
        this.Z0 = z;
        this.X = C7743lL0.l(i);
        interfaceC8591ol2.e(this);
        this.b1 = z2;
        this.Z = charset;
        this.d1 = z3;
    }
}
