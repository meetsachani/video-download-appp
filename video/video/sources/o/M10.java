package o;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Objects;
import java.util.function.Supplier;

/* loaded from: classes4.dex */
public class M10 extends C6885ho2 {
    public C2986Fr b1;
    public OutputStream c1;
    public Path d1;
    public final String e1;
    public final String f1;
    public final Path g1;
    public boolean h1;

    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<M10, b> {
        public int l;
        public Path m;
        public String n;

        /* renamed from: o  reason: collision with root package name */
        public String f538o;
        public Path p;

        public b() {
            c0(1024);
            Z(1024);
        }

        @Override // o.XK0
        /* renamed from: o0 */
        public M10 get() {
            return new M10(this);
        }

        public b p0(File file) {
            this.p = M10.y(file, null);
            return this;
        }

        public b q0(Path path) {
            this.p = M10.z(path, null);
            return this;
        }

        public b r0(File file) {
            this.m = M10.y(file, null);
            return this;
        }

        public b s0(Path path) {
            this.m = M10.z(path, null);
            return this;
        }

        public b t0(String str) {
            this.n = str;
            return this;
        }

        public b u0(String str) {
            this.f538o = str;
            return this;
        }

        public b v0(int i) {
            this.l = i;
            return this;
        }
    }

    public static b q() {
        return new b();
    }

    public static int r(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException("Initial buffer size must be at least 0.");
    }

    public static Path y(File file, Supplier<Path> supplier) {
        Path path;
        if (file != null) {
            path = file.toPath();
            return path;
        } else if (supplier == null) {
            return null;
        } else {
            return N30.a(supplier.get());
        }
    }

    public static Path z(Path path, Supplier<Path> supplier) {
        if (path != null) {
            return path;
        }
        if (supplier == null) {
            return null;
        }
        return N30.a(supplier.get());
    }

    public void A(OutputStream outputStream) throws IOException {
        if (this.h1) {
            if (!v()) {
                Files.copy(this.d1, outputStream);
                return;
            } else {
                this.b1.u(outputStream);
                return;
            }
        }
        throw new IOException("Stream not closed");
    }

    @Override // o.C6885ho2, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.h1 = true;
    }

    @Override // o.C6885ho2
    @Deprecated
    public OutputStream i() throws IOException {
        return this.c1;
    }

    @Override // o.C6885ho2
    public void n() throws IOException {
        OutputStream newOutputStream;
        Path createTempFile;
        String str = this.e1;
        if (str != null) {
            createTempFile = Files.createTempFile(this.g1, str, this.f1, new FileAttribute[0]);
            this.d1 = createTempFile;
        }
        C11130zA1.t(this.d1, null, C11130zA1.e);
        newOutputStream = Files.newOutputStream(this.d1, new OpenOption[0]);
        try {
            this.b1.u(newOutputStream);
            this.c1 = newOutputStream;
            this.b1 = null;
        } catch (IOException e) {
            newOutputStream.close();
            throw e;
        }
    }

    public byte[] s() {
        C2986Fr c2986Fr = this.b1;
        if (c2986Fr != null) {
            return c2986Fr.j();
        }
        return null;
    }

    public File t() {
        File file;
        Path path = this.d1;
        if (path != null) {
            file = path.toFile();
            return file;
        }
        return null;
    }

    public Path u() {
        return this.d1;
    }

    public boolean v() {
        return !k();
    }

    public InputStream x() throws IOException {
        InputStream newInputStream;
        if (this.h1) {
            if (!v()) {
                newInputStream = Files.newInputStream(this.d1, new OpenOption[0]);
                return newInputStream;
            }
            return this.b1.l();
        }
        throw new IOException("Stream not closed");
    }

    public M10(b bVar) {
        super(bVar.l);
        this.d1 = z(bVar.m, null);
        this.e1 = bVar.n;
        this.f1 = bVar.f538o;
        this.g1 = z(bVar.p, new Supplier() { // from class: o.L10
            @Override // java.util.function.Supplier
            public final Object get() {
                return C11130zA1.f0();
            }
        });
        C2986Fr c2986Fr = new C2986Fr(r(bVar.L()));
        this.b1 = c2986Fr;
        this.c1 = c2986Fr;
    }

    @Deprecated
    public M10(int i, File file) {
        this(i, file, null, null, null, 1024);
    }

    public M10(int i, File file, String str, String str2, File file2, int i2) {
        super(i);
        this.d1 = y(file, null);
        this.e1 = str;
        this.f1 = str2;
        this.g1 = y(file2, new Supplier() { // from class: o.L10
            @Override // java.util.function.Supplier
            public final Object get() {
                return C11130zA1.f0();
            }
        });
        C2986Fr c2986Fr = new C2986Fr(r(i2));
        this.b1 = c2986Fr;
        this.c1 = c2986Fr;
    }

    @Deprecated
    public M10(int i, int i2, File file) {
        this(i, file, null, null, null, i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public M10(int i, int i2, String str, String str2, File file) {
        this(i, null, str, str2, file, i2);
        Objects.requireNonNull(str, "prefix");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public M10(int i, String str, String str2, File file) {
        this(i, null, str, str2, file, 1024);
        Objects.requireNonNull(str, "prefix");
    }
}
