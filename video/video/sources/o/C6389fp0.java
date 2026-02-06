package o;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: o.fp0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6389fp0 implements InterfaceC6146ep0 {
    public final BufferedOutputStream a;
    public final FileDescriptor b;
    public final RandomAccessFile c;

    public C6389fp0(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, FN1.c1);
        this.c = randomAccessFile;
        this.b = randomAccessFile.getFD();
        this.a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    public static InterfaceC6146ep0 c(File file) throws IOException {
        return new C6389fp0(file);
    }

    @Override // o.InterfaceC6146ep0
    public void a(long j) throws IOException {
        this.c.setLength(j);
    }

    @Override // o.InterfaceC6146ep0
    public void b() throws IOException {
        this.a.flush();
        this.b.sync();
    }

    @Override // o.InterfaceC6146ep0
    public void close() throws IOException {
        this.a.close();
        this.c.close();
    }

    @Override // o.InterfaceC6146ep0
    public void seek(long j) throws IOException {
        this.c.seek(j);
    }

    @Override // o.InterfaceC6146ep0
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }
}
