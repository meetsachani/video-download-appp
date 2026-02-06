package com.google.firebase.crashlytics.internal.metadata;

import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.internal.H;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.C6566gU0;
import o.FN1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class QueueFile implements Closeable {
    public static final Logger b1 = Logger.getLogger(QueueFile.class.getName());
    public static final int c1 = 4096;
    public static final int d1 = 16;
    public final RandomAccessFile X;
    public int Y;
    public Element Y0;
    public int Z;
    public Element Z0;
    public final byte[] a1;

    /* loaded from: classes3.dex */
    public static class Element {
        public static final int c = 4;
        public static final Element d = new Element(0, 0);
        public final int a;
        public final int b;

        public Element(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.a + ", length = " + this.b + C6566gU0.g;
        }
    }

    /* loaded from: classes3.dex */
    public final class ElementInputStream extends InputStream {
        public int X;
        public int Y;

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            QueueFile.q(bArr, H.a.b);
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                int i3 = this.Y;
                if (i3 > 0) {
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    QueueFile.this.A(this.X, bArr, i, i2);
                    this.X = QueueFile.this.H(this.X + i2);
                    this.Y -= i2;
                    return i2;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        public ElementInputStream(Element element) {
            this.X = QueueFile.this.H(element.a + 4);
            this.Y = element.b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.Y == 0) {
                return -1;
            }
            QueueFile.this.X.seek(this.X);
            int read = QueueFile.this.X.read();
            this.X = QueueFile.this.H(this.X + 1);
            this.Y--;
            return read;
        }
    }

    /* loaded from: classes3.dex */
    public interface ElementReader {
        void a(InputStream inputStream, int i) throws IOException;
    }

    public QueueFile(File file) throws IOException {
        this.a1 = new byte[16];
        if (!file.exists()) {
            o(file);
        }
        this.X = r(file);
        v();
    }

    public static void M(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static void N(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            M(bArr, i, i2);
            i += 4;
        }
    }

    public static void o(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile r = r(file2);
        try {
            r.setLength(PlaybackStateCompat.t1);
            r.seek(0L);
            byte[] bArr = new byte[16];
            N(bArr, 4096, 0, 0, 0);
            r.write(bArr);
            r.close();
            if (file2.renameTo(file)) {
                return;
            }
            throw new IOException("Rename failed!");
        } catch (Throwable th) {
            r.close();
            throw th;
        }
    }

    public static <T> T q(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static RandomAccessFile r(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, FN1.d1);
    }

    public static int x(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final void A(int i, byte[] bArr, int i2, int i3) throws IOException {
        int H = H(i);
        int i4 = H + i3;
        int i5 = this.Y;
        if (i4 <= i5) {
            this.X.seek(H);
            this.X.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - H;
        this.X.seek(H);
        this.X.readFully(bArr, i2, i6);
        this.X.seek(16L);
        this.X.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void C(int i, byte[] bArr, int i2, int i3) throws IOException {
        int H = H(i);
        int i4 = H + i3;
        int i5 = this.Y;
        if (i4 <= i5) {
            this.X.seek(H);
            this.X.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - H;
        this.X.seek(H);
        this.X.write(bArr, i2, i6);
        this.X.seek(16L);
        this.X.write(bArr, i2 + i6, i3 - i6);
    }

    public final void E(int i) throws IOException {
        this.X.setLength(i);
        this.X.getChannel().force(true);
    }

    public synchronized int F() {
        return this.Z;
    }

    public int G() {
        if (this.Z == 0) {
            return 16;
        }
        Element element = this.Z0;
        int i = element.a;
        int i2 = this.Y0.a;
        if (i >= i2) {
            return (i - i2) + 4 + element.b + 16;
        }
        return (((i + 4) + element.b) + this.Y) - i2;
    }

    public final int H(int i) {
        int i2 = this.Y;
        if (i < i2) {
            return i;
        }
        return (i + 16) - i2;
    }

    public final void I(int i, int i2, int i3, int i4) throws IOException {
        N(this.a1, i, i2, i3, i4);
        this.X.seek(0L);
        this.X.write(this.a1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.X.close();
    }

    public void i(byte[] bArr) throws IOException {
        j(bArr, 0, bArr.length);
    }

    public synchronized void j(byte[] bArr, int i, int i2) throws IOException {
        int H;
        int i3;
        try {
            q(bArr, H.a.b);
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                l(i2);
                boolean p = p();
                if (p) {
                    H = 16;
                } else {
                    Element element = this.Z0;
                    H = H(element.a + 4 + element.b);
                }
                Element element2 = new Element(H, i2);
                M(this.a1, 0, i2);
                C(element2.a, this.a1, 0, 4);
                C(element2.a + 4, bArr, i, i2);
                if (p) {
                    i3 = element2.a;
                } else {
                    i3 = this.Y0.a;
                }
                I(this.Y, this.Z + 1, i3, element2.a);
                this.Z0 = element2;
                this.Z++;
                if (p) {
                    this.Y0 = element2;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void k() throws IOException {
        try {
            I(4096, 0, 0, 0);
            this.Z = 0;
            Element element = Element.d;
            this.Y0 = element;
            this.Z0 = element;
            if (this.Y > 4096) {
                E(4096);
            }
            this.Y = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l(int i) throws IOException {
        int i2 = i + 4;
        int y = y();
        if (y >= i2) {
            return;
        }
        int i3 = this.Y;
        do {
            y += i3;
            i3 <<= 1;
        } while (y < i2);
        E(i3);
        Element element = this.Z0;
        int H = H(element.a + 4 + element.b);
        if (H < this.Y0.a) {
            FileChannel channel = this.X.getChannel();
            channel.position(this.Y);
            long j = H - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.Z0.a;
        int i5 = this.Y0.a;
        if (i4 < i5) {
            int i6 = (this.Y + i4) - 16;
            I(i3, this.Z, i5, i6);
            this.Z0 = new Element(i6, this.Z0.b);
        } else {
            I(i3, this.Z, i5, i4);
        }
        this.Y = i3;
    }

    public synchronized void m(ElementReader elementReader) throws IOException {
        int i = this.Y0.a;
        for (int i2 = 0; i2 < this.Z; i2++) {
            Element u = u(i);
            elementReader.a(new ElementInputStream(u), u.b);
            i = H(u.a + 4 + u.b);
        }
    }

    public boolean n(int i, int i2) {
        if (G() + 4 + i <= i2) {
            return true;
        }
        return false;
    }

    public synchronized boolean p() {
        boolean z;
        if (this.Z == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized void s(ElementReader elementReader) throws IOException {
        if (this.Z > 0) {
            elementReader.a(new ElementInputStream(this.Y0), this.Y0.b);
        }
    }

    public synchronized byte[] t() throws IOException {
        if (p()) {
            return null;
        }
        Element element = this.Y0;
        int i = element.b;
        byte[] bArr = new byte[i];
        A(element.a + 4, bArr, 0, i);
        return bArr;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.Y);
        sb.append(", size=");
        sb.append(this.Z);
        sb.append(", first=");
        sb.append(this.Y0);
        sb.append(", last=");
        sb.append(this.Z0);
        sb.append(", element lengths=[");
        try {
            m(new ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFile.1
                public boolean a = true;

                @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                public void a(InputStream inputStream, int i) throws IOException {
                    if (this.a) {
                        this.a = false;
                    } else {
                        sb.append(C6566gU0.h);
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e) {
            b1.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final Element u(int i) throws IOException {
        if (i == 0) {
            return Element.d;
        }
        this.X.seek(i);
        return new Element(i, this.X.readInt());
    }

    public final void v() throws IOException {
        this.X.seek(0L);
        this.X.readFully(this.a1);
        int x = x(this.a1, 0);
        this.Y = x;
        if (x <= this.X.length()) {
            this.Z = x(this.a1, 4);
            int x2 = x(this.a1, 8);
            int x3 = x(this.a1, 12);
            this.Y0 = u(x2);
            this.Z0 = u(x3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.Y + ", Actual length: " + this.X.length());
    }

    public final int y() {
        return this.Y - G();
    }

    public synchronized void z() throws IOException {
        try {
            if (!p()) {
                if (this.Z == 1) {
                    k();
                } else {
                    Element element = this.Y0;
                    int H = H(element.a + 4 + element.b);
                    A(H, this.a1, 0, 4);
                    int x = x(this.a1, 0);
                    I(this.Y, this.Z - 1, H, this.Z0.a);
                    this.Z--;
                    this.Y0 = new Element(H, x);
                }
            } else {
                throw new NoSuchElementException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public QueueFile(RandomAccessFile randomAccessFile) throws IOException {
        this.a1 = new byte[16];
        this.X = randomAccessFile;
        v();
    }
}
