package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.source.rtsp.g;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.AbstractC5317bO0;
import o.C3989Py1;
import o.C7775lT0;
import o.C9542sf;
import o.InterfaceC11300zs1;
import o.KB;
import o.R11;

@Deprecated
/* loaded from: classes2.dex */
public final class g implements Closeable {
    public static final Charset b1 = KB.c;
    public static final String c1 = "RtspMessageChannel";
    public static final int d1 = 554;
    public final d X;
    public C0098g Y0;
    public Socket Z0;
    public volatile boolean a1;
    public final R11 Y = new R11("ExoPlayer:RtspMessageChannel:ReceiverLoader");
    public final Map<Integer, b> Z = Collections.synchronizedMap(new HashMap());

    /* loaded from: classes2.dex */
    public interface b {
        void m(byte[] bArr);
    }

    /* loaded from: classes2.dex */
    public final class c implements R11.b<f> {
        public c() {
        }

        @Override // o.R11.b
        /* renamed from: a */
        public void M(f fVar, long j, long j2, boolean z) {
        }

        @Override // o.R11.b
        /* renamed from: b */
        public void t(f fVar, long j, long j2) {
        }

        @Override // o.R11.b
        /* renamed from: c */
        public R11.c N(f fVar, long j, long j2, IOException iOException, int i) {
            if (!g.this.a1) {
                g.this.X.a(iOException);
            }
            return R11.k;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        default void a(Exception exc) {
        }

        default void b(List<String> list, Exception exc) {
        }

        void c(List<String> list);
    }

    /* loaded from: classes2.dex */
    public static final class e {
        public static final int d = 1;
        public static final int e = 2;
        public static final int f = 3;
        public final List<String> a = new ArrayList();
        public int b = 1;
        public long c;

        public static byte[] d(byte b, DataInputStream dataInputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                byte readByte = dataInputStream.readByte();
                bArr[1] = readByte;
                byteArrayOutputStream.write(readByte);
            }
        }

        public final AbstractC5317bO0<String> a(byte[] bArr) {
            boolean z;
            String str;
            if (this.b == 3) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            if (bArr.length > 0 && bArr[bArr.length - 1] == 10) {
                if (bArr.length > 1 && bArr[bArr.length - 2] == 13) {
                    str = new String(bArr, 0, bArr.length - 2, g.b1);
                } else {
                    str = new String(bArr, 0, bArr.length - 1, g.b1);
                }
                this.a.add(str);
                AbstractC5317bO0<String> F = AbstractC5317bO0.F(this.a);
                e();
                return F;
            }
            throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
        }

        @InterfaceC11300zs1
        public final AbstractC5317bO0<String> b(byte[] bArr) throws C3989Py1 {
            boolean z;
            if (bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            String str = new String(bArr, 0, bArr.length - 2, g.b1);
            this.a.add(str);
            int i = this.b;
            if (i != 1) {
                if (i == 2) {
                    long g = h.g(str);
                    if (g != -1) {
                        this.c = g;
                    }
                    if (str.isEmpty()) {
                        if (this.c > 0) {
                            this.b = 3;
                            return null;
                        }
                        AbstractC5317bO0<String> F = AbstractC5317bO0.F(this.a);
                        e();
                        return F;
                    }
                    return null;
                }
                throw new IllegalStateException();
            } else if (h.f(str)) {
                this.b = 2;
                return null;
            } else {
                return null;
            }
        }

        public AbstractC5317bO0<String> c(byte b, DataInputStream dataInputStream) throws IOException {
            boolean z;
            AbstractC5317bO0<String> b2 = b(d(b, dataInputStream));
            while (b2 == null) {
                if (this.b == 3) {
                    long j = this.c;
                    if (j > 0) {
                        int d2 = C7775lT0.d(j);
                        if (d2 != -1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C9542sf.i(z);
                        byte[] bArr = new byte[d2];
                        dataInputStream.readFully(bArr, 0, d2);
                        b2 = a(bArr);
                    } else {
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                } else {
                    b2 = b(d(dataInputStream.readByte(), dataInputStream));
                }
            }
            return b2;
        }

        public final void e() {
            this.a.clear();
            this.b = 1;
            this.c = 0L;
        }
    }

    /* loaded from: classes2.dex */
    public final class f implements R11.e {
        public static final byte e = 36;
        public final DataInputStream a;
        public final e b = new e();
        public volatile boolean c;

        public f(InputStream inputStream) {
            this.a = new DataInputStream(inputStream);
        }

        @Override // o.R11.e
        public void a() throws IOException {
            while (!this.c) {
                byte readByte = this.a.readByte();
                if (readByte == 36) {
                    b();
                } else {
                    d(readByte);
                }
            }
        }

        public final void b() throws IOException {
            int readUnsignedByte = this.a.readUnsignedByte();
            int readUnsignedShort = this.a.readUnsignedShort();
            byte[] bArr = new byte[readUnsignedShort];
            this.a.readFully(bArr, 0, readUnsignedShort);
            b bVar = (b) g.this.Z.get(Integer.valueOf(readUnsignedByte));
            if (bVar != null && !g.this.a1) {
                bVar.m(bArr);
            }
        }

        @Override // o.R11.e
        public void c() {
            this.c = true;
        }

        public final void d(byte b) throws IOException {
            if (!g.this.a1) {
                g.this.X.c(this.b.c(b, this.a));
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.rtsp.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0098g implements Closeable {
        public final OutputStream X;
        public final HandlerThread Y;
        public final Handler Z;

        public C0098g(OutputStream outputStream) {
            this.X = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.Y = handlerThread;
            handlerThread.start();
            this.Z = new Handler(handlerThread.getLooper());
        }

        public static /* synthetic */ void a(C0098g c0098g, byte[] bArr, List list) {
            c0098g.getClass();
            try {
                c0098g.X.write(bArr);
            } catch (Exception e) {
                if (!g.this.a1) {
                    g.this.X.b(list, e);
                }
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.Z;
            final HandlerThread handlerThread = this.Y;
            Objects.requireNonNull(handlerThread);
            handler.post(new Runnable() { // from class: o.cW1
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.Y.join();
            } catch (InterruptedException unused) {
                this.Y.interrupt();
            }
        }

        public void d(final List<String> list) {
            final byte[] b = h.b(list);
            this.Z.post(new Runnable() { // from class: o.bW1
                @Override // java.lang.Runnable
                public final void run() {
                    g.C0098g.a(g.C0098g.this, b, list);
                }
            });
        }
    }

    public g(d dVar) {
        this.X = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.a1) {
            return;
        }
        try {
            C0098g c0098g = this.Y0;
            if (c0098g != null) {
                c0098g.close();
            }
            this.Y.l();
            Socket socket = this.Z0;
            if (socket != null) {
                socket.close();
            }
            this.a1 = true;
        } catch (Throwable th) {
            this.a1 = true;
            throw th;
        }
    }

    public void h(Socket socket) throws IOException {
        this.Z0 = socket;
        this.Y0 = new C0098g(socket.getOutputStream());
        this.Y.n(new f(socket.getInputStream()), new c(), 0);
    }

    public void i(int i, b bVar) {
        this.Z.put(Integer.valueOf(i), bVar);
    }

    public void j(List<String> list) {
        C9542sf.k(this.Y0);
        this.Y0.d(list);
    }
}
