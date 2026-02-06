package o;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import o.R11;
import o.S9;

@Deprecated
/* loaded from: classes2.dex */
public final class C92 {
    public static final String a = "time.android.com";
    public static final int b = 10000;
    public static final int c = 24;
    public static final int d = 32;
    public static final int e = 40;
    public static final int f = 48;
    public static final int g = 123;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 3;
    public static final int l = 3;
    public static final int m = 0;
    public static final int n = 15;

    /* renamed from: o  reason: collision with root package name */
    public static final long f422o = 2208988800L;
    public static final Object p = new Object();
    public static final Object q = new Object();
    @InterfaceC8710pF0("valueLock")
    public static boolean r = false;
    @InterfaceC8710pF0("valueLock")
    public static long s = 0;
    @InterfaceC8710pF0("valueLock")
    public static String t = "time.android.com";

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b(IOException iOException);
    }

    public static /* synthetic */ long e() throws IOException {
        return l();
    }

    public static void g(byte b2, byte b3, int i2, long j2) throws IOException {
        if (b2 != 3) {
            if (b3 != 4 && b3 != 5) {
                throw new IOException("SNTP: Untrusted mode: " + ((int) b3));
            } else if (i2 != 0 && i2 <= 15) {
                if (j2 != 0) {
                    return;
                }
                throw new IOException("SNTP: Zero transmitTime");
            } else {
                throw new IOException("SNTP: Untrusted stratum: " + i2);
            }
        }
        throw new IOException("SNTP: Unsynchronized server");
    }

    public static long h() {
        long j2;
        synchronized (q) {
            try {
                if (r) {
                    j2 = s;
                } else {
                    j2 = C10323vs.b;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2;
    }

    public static String i() {
        String str;
        synchronized (q) {
            str = t;
        }
        return str;
    }

    public static void j(@InterfaceC11300zs1 R11 r11, @InterfaceC11300zs1 b bVar) {
        if (k()) {
            if (bVar != null) {
                bVar.a();
                return;
            }
            return;
        }
        if (r11 == null) {
            r11 = new R11("SntpClient");
        }
        r11.n(new d(), new c(bVar), 1);
    }

    public static boolean k() {
        boolean z;
        synchronized (q) {
            z = r;
        }
        return z;
    }

    public static long l() throws IOException {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = C8077mf.E;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            p(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j2 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            byte b2 = bArr[0];
            long n2 = n(bArr, 24);
            long n3 = n(bArr, 32);
            long n4 = n(bArr, 40);
            g((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), bArr[1] & 255, n4);
            long j3 = (j2 + (((n3 - n2) + (n4 - j2)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j3;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(byte[] bArr, int i2) {
        int i3 = bArr[i2];
        int i4 = bArr[i2 + 1];
        int i5 = bArr[i2 + 2];
        int i6 = bArr[i2 + 3];
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & 127) + 128;
        }
        return (i3 << 24) + (i4 << 16) + (i5 << 8) + i6;
    }

    public static long n(byte[] bArr, int i2) {
        long m2 = m(bArr, i2);
        long m3 = m(bArr, i2 + 4);
        if (m2 == 0 && m3 == 0) {
            return 0L;
        }
        return ((m2 - f422o) * 1000) + ((m3 * 1000) / S9.c.M);
    }

    public static void o(String str) {
        synchronized (q) {
            try {
                if (!t.equals(str)) {
                    t = str;
                    r = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void p(byte[] bArr, int i2, long j2) {
        if (j2 == 0) {
            Arrays.fill(bArr, i2, i2 + 8, (byte) 0);
            return;
        }
        long j3 = j2 / 1000;
        long j4 = j2 - (j3 * 1000);
        long j5 = j3 + f422o;
        bArr[i2] = (byte) (j5 >> 24);
        bArr[i2 + 1] = (byte) (j5 >> 16);
        bArr[i2 + 2] = (byte) (j5 >> 8);
        bArr[i2 + 3] = (byte) j5;
        long j6 = (j4 * S9.c.M) / 1000;
        bArr[i2 + 4] = (byte) (j6 >> 24);
        bArr[i2 + 5] = (byte) (j6 >> 16);
        bArr[i2 + 6] = (byte) (j6 >> 8);
        bArr[i2 + 7] = (byte) (Math.random() * 255.0d);
    }

    /* loaded from: classes2.dex */
    public static final class d implements R11.e {
        public d() {
        }

        @Override // o.R11.e
        public void a() throws IOException {
            synchronized (C92.p) {
                synchronized (C92.q) {
                    if (C92.r) {
                        return;
                    }
                    long e = C92.e();
                    synchronized (C92.q) {
                        long unused = C92.s = e;
                        boolean unused2 = C92.r = true;
                    }
                }
            }
        }

        @Override // o.R11.e
        public void c() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements R11.b<R11.e> {
        @InterfaceC11300zs1
        public final b X;

        public c(@InterfaceC11300zs1 b bVar) {
            this.X = bVar;
        }

        @Override // o.R11.b
        public R11.c N(R11.e eVar, long j, long j2, IOException iOException, int i) {
            b bVar = this.X;
            if (bVar != null) {
                bVar.b(iOException);
            }
            return R11.k;
        }

        @Override // o.R11.b
        public void t(R11.e eVar, long j, long j2) {
            if (this.X != null) {
                if (!C92.k()) {
                    this.X.b(new IOException(new ConcurrentModificationException()));
                } else {
                    this.X.a();
                }
            }
        }

        @Override // o.R11.b
        public void M(R11.e eVar, long j, long j2, boolean z) {
        }
    }
}
