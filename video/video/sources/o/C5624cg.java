package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
/* renamed from: o.cg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5624cg {
    public static final String c = "AtomicFile";
    public final File a;
    public final File b;

    /* renamed from: o.cg$a */
    /* loaded from: classes2.dex */
    public static final class a extends OutputStream {
        public final FileOutputStream X;
        public boolean Y = false;

        public a(File file) throws FileNotFoundException {
            this.X = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.Y) {
                return;
            }
            this.Y = true;
            flush();
            try {
                this.X.getFD().sync();
            } catch (IOException e) {
                I31.o("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.X.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.X.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.X.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.X.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.X.write(bArr, i, i2);
        }
    }

    public C5624cg(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".bak");
    }

    public void a() {
        this.a.delete();
        this.b.delete();
    }

    public void b(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.b.delete();
    }

    public boolean c() {
        if (!this.a.exists() && !this.b.exists()) {
            return false;
        }
        return true;
    }

    public InputStream d() throws FileNotFoundException {
        e();
        return new FileInputStream(this.a);
    }

    public final void e() {
        if (this.b.exists()) {
            this.a.delete();
            this.b.renameTo(this.a);
        }
    }

    public OutputStream f() throws IOException {
        if (this.a.exists()) {
            if (!this.b.exists()) {
                if (!this.a.renameTo(this.b)) {
                    I31.n("AtomicFile", "Couldn't rename file " + this.a + " to backup file " + this.b);
                }
            } else {
                this.a.delete();
            }
        }
        try {
            return new a(this.a);
        } catch (FileNotFoundException e) {
            File parentFile = this.a.getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    return new a(this.a);
                } catch (FileNotFoundException e2) {
                    throw new IOException("Couldn't create " + this.a, e2);
                }
            }
            throw new IOException("Couldn't create " + this.a, e);
        }
    }
}
