package o;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

@InterfaceC7797la0
@InterfaceC11149zF0
@InterfaceC4238Sm
/* renamed from: o.So0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4247So0 extends OutputStream {
    public final int X;
    public final boolean Y;
    @MB
    public final File Y0;
    public final AbstractC7625ks Z;
    @InterfaceC7980mF0("this")
    public OutputStream Z0;
    @InterfaceC7980mF0("this")
    @MB
    public c a1;
    @InterfaceC7980mF0("this")
    @MB
    public File b1;

    /* renamed from: o.So0$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC7625ks {
        public a() {
        }

        public void finalize() {
            try {
                C4247So0.this.i();
            } catch (Throwable th) {
                th.printStackTrace(System.err);
            }
        }

        @Override // o.AbstractC7625ks
        public InputStream m() throws IOException {
            return C4247So0.this.h();
        }
    }

    /* renamed from: o.So0$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC7625ks {
        public b() {
        }

        @Override // o.AbstractC7625ks
        public InputStream m() throws IOException {
            return C4247So0.this.h();
        }
    }

    /* renamed from: o.So0$c */
    /* loaded from: classes3.dex */
    public static class c extends ByteArrayOutputStream {
        public c() {
        }

        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public C4247So0(int i) {
        this(i, false);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.Z0.close();
    }

    public AbstractC7625ks d() {
        return this.Z;
    }

    @MB
    @InterfaceC5299bJ2
    public synchronized File f() {
        return this.b1;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        this.Z0.flush();
    }

    public final synchronized InputStream h() throws IOException {
        if (this.b1 != null) {
            return new FileInputStream(this.b1);
        }
        Objects.requireNonNull(this.a1);
        return new ByteArrayInputStream(this.a1.a(), 0, this.a1.getCount());
    }

    public synchronized void i() throws IOException {
        try {
            close();
            c cVar = this.a1;
            if (cVar == null) {
                this.a1 = new c(null);
            } else {
                cVar.reset();
            }
            this.Z0 = this.a1;
            File file = this.b1;
            if (file != null) {
                this.b1 = null;
                if (!file.delete()) {
                    String valueOf = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                    sb.append("Could not delete: ");
                    sb.append(valueOf);
                    throw new IOException(sb.toString());
                }
            }
        } finally {
        }
    }

    @InterfaceC7980mF0("this")
    public final void j(int i) throws IOException {
        c cVar = this.a1;
        if (cVar != null && cVar.getCount() + i > this.X) {
            File createTempFile = File.createTempFile("FileBackedOutputStream", null, this.Y0);
            if (this.Y) {
                createTempFile.deleteOnExit();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                fileOutputStream.write(this.a1.a(), 0, this.a1.getCount());
                fileOutputStream.flush();
                this.Z0 = fileOutputStream;
                this.b1 = createTempFile;
                this.a1 = null;
            } catch (IOException e) {
                createTempFile.delete();
                throw e;
            }
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) throws IOException {
        j(1);
        this.Z0.write(i);
    }

    public C4247So0(int i, boolean z) {
        this(i, z, null);
    }

    public C4247So0(int i, boolean z, @MB File file) {
        this.X = i;
        this.Y = z;
        this.Y0 = file;
        c cVar = new c(null);
        this.a1 = cVar;
        this.Z0 = cVar;
        if (z) {
            this.Z = new a();
        } else {
            this.Z = new b();
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        j(i2);
        this.Z0.write(bArr, i, i2);
    }
}
