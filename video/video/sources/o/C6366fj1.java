package o;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.fj1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6366fj1 {
    public static final int a = 1164798569;
    public static final int b = 1701669481;
    public static final int c = 1835365473;

    /* renamed from: o.fj1$a */
    /* loaded from: classes.dex */
    public static class a implements d {
        public final ByteBuffer c;

        public a(ByteBuffer byteBuffer) {
            this.c = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // o.C6366fj1.d
        public int a() throws IOException {
            return this.c.getInt();
        }

        @Override // o.C6366fj1.d
        public long b() throws IOException {
            return C6366fj1.e(this.c.getInt());
        }

        @Override // o.C6366fj1.d
        public void c(int i) throws IOException {
            ByteBuffer byteBuffer = this.c;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // o.C6366fj1.d
        public long getPosition() {
            return this.c.position();
        }

        @Override // o.C6366fj1.d
        public int readUnsignedShort() throws IOException {
            return C6366fj1.f(this.c.getShort());
        }
    }

    /* renamed from: o.fj1$b */
    /* loaded from: classes.dex */
    public static class b implements d {
        public final byte[] c;
        public final ByteBuffer d;
        public final InputStream e;
        public long f = 0;

        public b(InputStream inputStream) {
            this.e = inputStream;
            byte[] bArr = new byte[4];
            this.c = bArr;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.d = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // o.C6366fj1.d
        public int a() throws IOException {
            this.d.position(0);
            d(4);
            return this.d.getInt();
        }

        @Override // o.C6366fj1.d
        public long b() throws IOException {
            this.d.position(0);
            d(4);
            return C6366fj1.e(this.d.getInt());
        }

        @Override // o.C6366fj1.d
        public void c(int i) throws IOException {
            while (i > 0) {
                int skip = (int) this.e.skip(i);
                if (skip >= 1) {
                    i -= skip;
                    this.f += skip;
                } else {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
            }
        }

        public final void d(int i) throws IOException {
            if (this.e.read(this.c, 0, i) == i) {
                this.f += i;
                return;
            }
            throw new IOException("read failed");
        }

        @Override // o.C6366fj1.d
        public long getPosition() {
            return this.f;
        }

        @Override // o.C6366fj1.d
        public int readUnsignedShort() throws IOException {
            this.d.position(0);
            d(2);
            return C6366fj1.f(this.d.getShort());
        }
    }

    /* renamed from: o.fj1$c */
    /* loaded from: classes.dex */
    public static class c {
        public final long a;
        public final long b;

        public c(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public long a() {
            return this.b;
        }

        public long b() {
            return this.a;
        }
    }

    /* renamed from: o.fj1$d */
    /* loaded from: classes.dex */
    public interface d {
        public static final int a = 2;
        public static final int b = 4;

        int a() throws IOException;

        long b() throws IOException;

        void c(int i) throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    public static c a(d dVar) throws IOException {
        long j;
        dVar.c(4);
        int readUnsignedShort = dVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            dVar.c(6);
            int i = 0;
            while (true) {
                if (i < readUnsignedShort) {
                    int a2 = dVar.a();
                    dVar.c(4);
                    j = dVar.b();
                    dVar.c(4);
                    if (1835365473 == a2) {
                        break;
                    }
                    i++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                dVar.c((int) (j - dVar.getPosition()));
                dVar.c(12);
                long b2 = dVar.b();
                for (int i2 = 0; i2 < b2; i2++) {
                    int a3 = dVar.a();
                    long b3 = dVar.b();
                    long b4 = dVar.b();
                    if (1164798569 == a3 || 1701669481 == a3) {
                        return new c(b3 + j, b4);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static C6123ej1 b(AssetManager assetManager, String str) throws IOException {
        InputStream open = assetManager.open(str);
        try {
            C6123ej1 c2 = c(open);
            if (open != null) {
                open.close();
            }
            return c2;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static C6123ej1 c(InputStream inputStream) throws IOException {
        b bVar = new b(inputStream);
        c a2 = a(bVar);
        bVar.c((int) (a2.b() - bVar.getPosition()));
        ByteBuffer allocate = ByteBuffer.allocate((int) a2.a());
        int read = inputStream.read(allocate.array());
        if (read == a2.a()) {
            return C6123ej1.G(allocate);
        }
        throw new IOException("Needed " + a2.a() + " bytes, got " + read);
    }

    public static C6123ej1 d(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).b());
        return C6123ej1.G(duplicate);
    }

    public static long e(int i) {
        return i & 4294967295L;
    }

    public static int f(short s) {
        return s & Xx2.Y0;
    }
}
