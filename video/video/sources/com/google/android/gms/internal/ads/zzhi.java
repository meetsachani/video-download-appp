package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzhi extends zzfz {
    public final byte[] e;
    public final DatagramPacket f;
    @InterfaceC11300zs1
    public Uri g;
    @InterfaceC11300zs1
    public DatagramSocket h;
    @InterfaceC11300zs1
    public MulticastSocket i;
    @InterfaceC11300zs1
    public InetAddress j;
    public boolean k;
    public int l;

    public zzhi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) throws zzhh {
        if (i2 == 0) {
            return 0;
        }
        if (this.l == 0) {
            try {
                DatagramSocket datagramSocket = this.h;
                if (datagramSocket != null) {
                    DatagramPacket datagramPacket = this.f;
                    datagramSocket.receive(datagramPacket);
                    int length = datagramPacket.getLength();
                    this.l = length;
                    A(length);
                } else {
                    throw null;
                }
            } catch (SocketTimeoutException e) {
                throw new zzhh(e, 2002);
            } catch (IOException e2) {
                throw new zzhh(e2, 2001);
            }
        }
        int length2 = this.f.getLength();
        int i3 = this.l;
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, length2 - i3, bArr, i, min);
        this.l -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long a(zzgl zzglVar) throws zzhh {
        Uri uri = zzglVar.a;
        this.g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.g.getPort();
        h(zzglVar);
        try {
            this.j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.j, port);
            if (this.j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.i = multicastSocket;
                multicastSocket.joinGroup(this.j);
                this.h = this.i;
            } else {
                this.h = new DatagramSocket(inetSocketAddress);
            }
            this.h.setSoTimeout(8000);
            this.k = true;
            i(zzglVar);
            return -1L;
        } catch (IOException e) {
            throw new zzhh(e, 2001);
        } catch (SecurityException e2) {
            throw new zzhh(e2, 2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @InterfaceC11300zs1
    public final Uri c() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void f() {
        InetAddress inetAddress;
        this.g = null;
        MulticastSocket multicastSocket = this.i;
        if (multicastSocket != null) {
            try {
                inetAddress = this.j;
            } catch (IOException unused) {
            }
            if (inetAddress != null) {
                multicastSocket.leaveGroup(inetAddress);
                this.i = null;
            } else {
                throw null;
            }
        }
        DatagramSocket datagramSocket = this.h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.h = null;
        }
        this.j = null;
        this.l = 0;
        if (this.k) {
            this.k = false;
            g();
        }
    }

    public zzhi(int i) {
        super(true);
        byte[] bArr = new byte[2000];
        this.e = bArr;
        this.f = new DatagramPacket(bArr, 0, 2000);
    }
}
