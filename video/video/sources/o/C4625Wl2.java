package o;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.InterfaceC5143ah;

@Deprecated
/* renamed from: o.Wl2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4625Wl2 extends AbstractC5402bl {
    public final a i;

    /* renamed from: o.Wl2$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(ByteBuffer byteBuffer);

        void b(int i, int i2, int i3);
    }

    /* renamed from: o.Wl2$b */
    /* loaded from: classes2.dex */
    public static final class b implements a {
        public static final String j = "WaveFileAudioBufferSink";
        public static final int k = 4;
        public static final int l = 40;
        public static final int m = 44;
        public final String a;
        public final byte[] b;
        public final ByteBuffer c;
        public int d;
        public int e;
        public int f;
        @InterfaceC11300zs1
        public RandomAccessFile g;
        public int h;
        public int i;

        public b(String str) {
            this.a = str;
            byte[] bArr = new byte[1024];
            this.b = bArr;
            this.c = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        }

        @Override // o.C4625Wl2.a
        public void a(ByteBuffer byteBuffer) {
            try {
                d();
                f(byteBuffer);
            } catch (IOException e) {
                I31.e(j, "Error writing data", e);
            }
        }

        @Override // o.C4625Wl2.a
        public void b(int i, int i2, int i3) {
            try {
                e();
            } catch (IOException e) {
                I31.e(j, "Error resetting", e);
            }
            this.d = i;
            this.e = i2;
            this.f = i3;
        }

        public final String c() {
            String str = this.a;
            int i = this.h;
            this.h = i + 1;
            return TD2.M("%s-%04d.wav", str, Integer.valueOf(i));
        }

        public final void d() throws IOException {
            if (this.g != null) {
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(c(), FN1.c1);
            g(randomAccessFile);
            this.g = randomAccessFile;
            this.i = 44;
        }

        public final void e() throws IOException {
            RandomAccessFile randomAccessFile = this.g;
            if (randomAccessFile == null) {
                return;
            }
            try {
                this.c.clear();
                this.c.putInt(this.i - 8);
                randomAccessFile.seek(4L);
                randomAccessFile.write(this.b, 0, 4);
                this.c.clear();
                this.c.putInt(this.i - 44);
                randomAccessFile.seek(40L);
                randomAccessFile.write(this.b, 0, 4);
            } catch (IOException e) {
                I31.o(j, "Error updating file size", e);
            }
            try {
                randomAccessFile.close();
            } finally {
                this.g = null;
            }
        }

        public final void f(ByteBuffer byteBuffer) throws IOException {
            RandomAccessFile randomAccessFile = (RandomAccessFile) C9542sf.g(this.g);
            while (byteBuffer.hasRemaining()) {
                int min = Math.min(byteBuffer.remaining(), this.b.length);
                byteBuffer.get(this.b, 0, min);
                randomAccessFile.write(this.b, 0, min);
                this.i += min;
            }
        }

        public final void g(RandomAccessFile randomAccessFile) throws IOException {
            randomAccessFile.writeInt(1380533830);
            randomAccessFile.writeInt(-1);
            randomAccessFile.writeInt(FJ2.b);
            randomAccessFile.writeInt(FJ2.c);
            this.c.clear();
            this.c.putInt(16);
            this.c.putShort((short) FJ2.b(this.f));
            this.c.putShort((short) this.e);
            this.c.putInt(this.d);
            int w0 = TD2.w0(this.f, this.e);
            this.c.putInt(this.d * w0);
            this.c.putShort((short) w0);
            this.c.putShort((short) ((w0 * 8) / this.e));
            randomAccessFile.write(this.b, 0, this.c.position());
            randomAccessFile.writeInt(1684108385);
            randomAccessFile.writeInt(-1);
        }
    }

    public C4625Wl2(a aVar) {
        this.i = (a) C9542sf.g(aVar);
    }

    @Override // o.InterfaceC5143ah
    public void f(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        this.i.a(byteBuffer.asReadOnlyBuffer());
        l(remaining).put(byteBuffer).flip();
    }

    @Override // o.AbstractC5402bl
    public void i() {
        m();
    }

    @Override // o.AbstractC5402bl
    public void j() {
        m();
    }

    @Override // o.AbstractC5402bl
    public void k() {
        m();
    }

    public final void m() {
        if (h()) {
            a aVar = this.i;
            InterfaceC5143ah.a aVar2 = this.b;
            aVar.b(aVar2.a, aVar2.b, aVar2.c);
        }
    }

    @Override // o.AbstractC5402bl
    public InterfaceC5143ah.a b(InterfaceC5143ah.a aVar) {
        return aVar;
    }
}
