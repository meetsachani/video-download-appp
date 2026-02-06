package o;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: o.x31  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10616x31 extends Writer {
    public static final String Z = ".lck";
    public final Writer X;
    public final File Y;

    /* renamed from: o.x31$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<C10616x31, b> {
        public boolean l;
        public AbstractC11096z2<?, ?> m = C2.k(C3961Pq0.t0());

        public b() {
            c0(1024);
            Z(1024);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File m0() {
            return d().i();
        }

        @Override // o.XK0
        /* renamed from: n0 */
        public C10616x31 get() throws IOException {
            return new C10616x31(this);
        }

        public b o0(boolean z) {
            this.l = z;
            return this;
        }

        public b p0(File file) {
            if (file == null) {
                file = C3961Pq0.s0();
            }
            this.m = C2.j(file);
            return this;
        }

        public b q0(String str) {
            if (str == null) {
                str = C3961Pq0.t0();
            }
            this.m = C2.k(str);
            return this;
        }
    }

    public static b d() {
        return new b();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.X.close();
        } finally {
            C3961Pq0.e0(this.Y);
        }
    }

    public final void f() throws IOException {
        synchronized (C10616x31.class) {
            try {
                if (this.Y.createNewFile()) {
                    this.Y.deleteOnExit();
                } else {
                    throw new IOException("Can't write file, lock " + this.Y.getAbsolutePath() + " exists");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.X.flush();
    }

    public final Writer h(File file, Charset charset, boolean z) throws IOException {
        boolean exists = file.exists();
        try {
            return new OutputStreamWriter(new FileOutputStream(file.getAbsolutePath(), z), IB.g(charset));
        } catch (IOException | RuntimeException e) {
            C3961Pq0.h0(this.Y);
            if (!exists) {
                C3961Pq0.h0(file);
            }
            throw e;
        }
    }

    public final void i(File file) throws IOException {
        if (file.exists()) {
            if (file.canWrite()) {
                return;
            }
            throw new IOException("Could not write to lockDir: " + file.getAbsolutePath());
        }
        throw new IOException("Could not find lockDir: " + file.getAbsolutePath());
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        this.X.write(cArr);
    }

    public C10616x31(b bVar) throws IOException {
        this(bVar.m0(), bVar.P(), bVar.l, bVar.m.i().toString());
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        this.X.write(cArr, i, i2);
    }

    @Deprecated
    public C10616x31(File file) throws IOException {
        this(file, false, (String) null);
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        this.X.write(i);
    }

    @Deprecated
    public C10616x31(File file, boolean z) throws IOException {
        this(file, z, (String) null);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        this.X.write(str);
    }

    @Deprecated
    public C10616x31(File file, boolean z, String str) throws IOException {
        this(file, Charset.defaultCharset(), z, str);
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        this.X.write(str, i, i2);
    }

    @Deprecated
    public C10616x31(File file, Charset charset) throws IOException {
        this(file, charset, false, (String) null);
    }

    @Deprecated
    public C10616x31(File file, Charset charset, boolean z, String str) throws IOException {
        Objects.requireNonNull(file, "file");
        File absoluteFile = file.getAbsoluteFile();
        if (absoluteFile.getParentFile() != null) {
            C3961Pq0.n0(absoluteFile.getParentFile());
        }
        if (!absoluteFile.isDirectory()) {
            File file2 = new File(str == null ? C3961Pq0.t0() : str);
            C3961Pq0.n0(file2);
            i(file2);
            this.Y = new File(file2, absoluteFile.getName() + Z);
            f();
            this.X = h(absoluteFile, charset, z);
            return;
        }
        throw new IOException("File specified is a directory");
    }

    @Deprecated
    public C10616x31(File file, String str) throws IOException {
        this(file, str, false, (String) null);
    }

    @Deprecated
    public C10616x31(File file, String str, boolean z, String str2) throws IOException {
        this(file, IB.e(str), z, str2);
    }

    @Deprecated
    public C10616x31(String str) throws IOException {
        this(str, false, (String) null);
    }

    @Deprecated
    public C10616x31(String str, boolean z) throws IOException {
        this(str, z, (String) null);
    }

    @Deprecated
    public C10616x31(String str, boolean z, String str2) throws IOException {
        this(new File(str), z, str2);
    }
}
