package o;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

@Deprecated
/* renamed from: o.cy2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5699cy2 extends AbstractC5887dl {

    /* renamed from: o  reason: collision with root package name */
    public static final int f709o = 2000;
    public static final int p = 8000;
    public static final int q = -1;
    public final int f;
    public final byte[] g;
    public final DatagramPacket h;
    @InterfaceC11300zs1
    public Uri i;
    @InterfaceC11300zs1
    public DatagramSocket j;
    @InterfaceC11300zs1
    public MulticastSocket k;
    @InterfaceC11300zs1
    public InetAddress l;
    public boolean m;
    public int n;

    /* renamed from: o.cy2$a */
    /* loaded from: classes2.dex */
    public static final class a extends LU {
        public a(Throwable th, int i) {
            super(th, i);
        }
    }

    public C5699cy2() {
        this(2000);
    }

    @Override // o.FU
    public long a(OU ou) throws a {
        Uri uri = ou.a;
        this.i = uri;
        String str = (String) C9542sf.g(uri.getHost());
        int port = this.i.getPort();
        A(ou);
        try {
            this.l = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.l, port);
            if (this.l.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.k = multicastSocket;
                multicastSocket.joinGroup(this.l);
                this.j = this.k;
            } else {
                this.j = new DatagramSocket(inetSocketAddress);
            }
            this.j.setSoTimeout(this.f);
            this.m = true;
            B(ou);
            return -1L;
        } catch (IOException e) {
            throw new a(e, 2001);
        } catch (SecurityException e2) {
            throw new a(e2, 2006);
        }
    }

    @Override // o.FU
    public void close() {
        this.i = null;
        MulticastSocket multicastSocket = this.k;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) C9542sf.g(this.l));
            } catch (IOException unused) {
            }
            this.k = null;
        }
        DatagramSocket datagramSocket = this.j;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.j = null;
        }
        this.l = null;
        this.n = 0;
        if (this.m) {
            this.m = false;
            z();
        }
    }

    public int e() {
        DatagramSocket datagramSocket = this.j;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        return this.i;
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        if (this.n == 0) {
            try {
                ((DatagramSocket) C9542sf.g(this.j)).receive(this.h);
                int length = this.h.getLength();
                this.n = length;
                y(length);
            } catch (SocketTimeoutException e) {
                throw new a(e, 2002);
            } catch (IOException e2) {
                throw new a(e2, 2001);
            }
        }
        int length2 = this.h.getLength();
        int i3 = this.n;
        int min = Math.min(i3, i2);
        System.arraycopy(this.g, length2 - i3, bArr, i, min);
        this.n -= min;
        return min;
    }

    public C5699cy2(int i) {
        this(i, 8000);
    }

    public C5699cy2(int i, int i2) {
        super(true);
        this.f = i2;
        byte[] bArr = new byte[i];
        this.g = bArr;
        this.h = new DatagramPacket(bArr, 0, i);
    }
}
