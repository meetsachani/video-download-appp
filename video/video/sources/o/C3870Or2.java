package o;

import android.net.TrafficStats;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/* renamed from: o.Or2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3870Or2 {

    /* renamed from: o.Or2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

        public static void b(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }

    @Deprecated
    public static void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    public static int b() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    public static void c(int i) {
        TrafficStats.incrementOperationCount(i);
    }

    @Deprecated
    public static void d(int i, int i2) {
        TrafficStats.incrementOperationCount(i, i2);
    }

    @Deprecated
    public static void e(int i) {
        TrafficStats.setThreadStatsTag(i);
    }

    public static void f(DatagramSocket datagramSocket) throws SocketException {
        a.a(datagramSocket);
    }

    @Deprecated
    public static void g(Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }

    public static void h(DatagramSocket datagramSocket) throws SocketException {
        a.b(datagramSocket);
    }

    @Deprecated
    public static void i(Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }
}
