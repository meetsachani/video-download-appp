package o;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;
import o.InterfaceC4747Xs;

/* renamed from: o.Wp1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4640Wp1 {
    public static final int a = 3000;

    /* renamed from: o.Wp1$b */
    /* loaded from: classes.dex */
    public static class b {
        public final String a;
        public final C6524gJ2 b;

        public b(String str, C6524gJ2 c6524gJ2) {
            this.a = str;
            this.b = c6524gJ2;
        }
    }

    public static void a(AbstractC5091aS1<?> abstractC5091aS1, b bVar) throws C6524gJ2 {
        InterfaceC8528oU1 D = abstractC5091aS1.D();
        int G = abstractC5091aS1.G();
        try {
            D.c(bVar.b);
            abstractC5091aS1.g(String.format("%s-retry [timeout=%s]", bVar.a, Integer.valueOf(G)));
        } catch (C6524gJ2 e) {
            abstractC5091aS1.g(String.format("%s-timeout-giveup [timeout=%s]", bVar.a, Integer.valueOf(G)));
            throw e;
        }
    }

    public static C3470Kp1 b(AbstractC5091aS1<?> abstractC5091aS1, long j, List<MG0> list) {
        InterfaceC4747Xs.a r = abstractC5091aS1.r();
        if (r == null) {
            return new C3470Kp1(304, (byte[]) null, true, j, list);
        }
        return new C3470Kp1(304, r.a, true, j, C11161zI0.a(list, r));
    }

    public static byte[] c(InputStream inputStream, int i, C3084Gr c3084Gr) throws IOException {
        byte[] bArr;
        AE1 ae1 = new AE1(c3084Gr, i);
        try {
            bArr = c3084Gr.a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    ae1.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            C6767hJ2.f("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    c3084Gr.b(bArr);
                    ae1.close();
                    throw th;
                }
            }
            byte[] byteArray = ae1.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                C6767hJ2.f("Error occurred when closing InputStream", new Object[0]);
            }
            c3084Gr.b(bArr);
            ae1.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    public static void d(long j, AbstractC5091aS1<?> abstractC5091aS1, byte[] bArr, int i) {
        Object obj;
        if (!C6767hJ2.b && j <= 3000) {
            return;
        }
        Long valueOf = Long.valueOf(j);
        if (bArr != null) {
            obj = Integer.valueOf(bArr.length);
        } else {
            obj = "null";
        }
        C6767hJ2.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", abstractC5091aS1, valueOf, obj, Integer.valueOf(i), Integer.valueOf(abstractC5091aS1.D().a()));
    }

    public static b e(AbstractC5091aS1<?> abstractC5091aS1, IOException iOException, long j, CI0 ci0, byte[] bArr) throws C6524gJ2 {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new C8850pp2());
        }
        if (!(iOException instanceof MalformedURLException)) {
            if (ci0 != null) {
                int e = ci0.e();
                C6767hJ2.c("Unexpected response code %d for %s", Integer.valueOf(e), abstractC5091aS1.I());
                if (bArr != null) {
                    C3470Kp1 c3470Kp1 = new C3470Kp1(e, bArr, false, SystemClock.elapsedRealtime() - j, ci0.d());
                    if (e != 401 && e != 403) {
                        if (e >= 400 && e <= 499) {
                            throw new FD(c3470Kp1);
                        }
                        if (e >= 500 && e <= 599 && abstractC5091aS1.d0()) {
                            return new b("server", new C12(c3470Kp1));
                        }
                        throw new C12(c3470Kp1);
                    }
                    return new b("auth", new C4118Rh(c3470Kp1));
                }
                return new b("network", new C2980Fp1());
            } else if (abstractC5091aS1.c0()) {
                return new b("connection", new C11292zq1());
            } else {
                throw new C11292zq1(iOException);
            }
        }
        throw new RuntimeException("Bad URL " + abstractC5091aS1.I(), iOException);
    }
}
