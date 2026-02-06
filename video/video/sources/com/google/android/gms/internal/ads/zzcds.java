package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcds extends SSLSocketFactory {
    public final SSLSocketFactory a = (SSLSocketFactory) SSLSocketFactory.getDefault();
    public final /* synthetic */ zzcdt b;

    public zzcds(zzcdt zzcdtVar) {
        this.b = zzcdtVar;
    }

    public final Socket a(Socket socket) throws SocketException {
        int i;
        int i2;
        zzcdt zzcdtVar = this.b;
        i = zzcdtVar.s;
        if (i > 0) {
            i2 = zzcdtVar.s;
            socket.setReceiveBufferSize(i2);
        }
        zzcdtVar.t.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.a.createSocket(str, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.a.createSocket(str, i, inetAddress, i2);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.a.createSocket(inetAddress, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.a.createSocket(inetAddress, i, inetAddress2, i2);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.a.createSocket(socket, str, i, z);
        a(createSocket);
        return createSocket;
    }
}
