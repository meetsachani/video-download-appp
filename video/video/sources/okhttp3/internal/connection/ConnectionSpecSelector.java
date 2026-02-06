package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import o.C6562gT0;
import o.W12;
import okhttp3.ConnectionSpec;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class ConnectionSpecSelector {
    @NotNull
    private final List<ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(@NotNull List<ConnectionSpec> list) {
        C6562gT0.p(list, "connectionSpecs");
        this.connectionSpecs = list;
    }

    private final boolean isFallbackPossible(SSLSocket sSLSocket) {
        int size = this.connectionSpecs.size();
        for (int i = this.nextModeIndex; i < size; i++) {
            if (this.connectionSpecs.get(i).isCompatible(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final ConnectionSpec configureSecureSocket(@NotNull SSLSocket sSLSocket) throws IOException {
        ConnectionSpec connectionSpec;
        C6562gT0.p(sSLSocket, "sslSocket");
        int i = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i < size) {
                connectionSpec = this.connectionSpecs.get(i);
                if (connectionSpec.isCompatible(sSLSocket)) {
                    this.nextModeIndex = i + 1;
                    break;
                }
                i++;
            } else {
                connectionSpec = null;
                break;
            }
        }
        if (connectionSpec != null) {
            this.isFallbackPossible = isFallbackPossible(sSLSocket);
            connectionSpec.apply$okhttp(sSLSocket, this.isFallback);
            return connectionSpec;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.isFallback);
        sb.append(", modes=");
        sb.append(this.connectionSpecs);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        C6562gT0.m(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        C6562gT0.o(arrays, "toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean connectionFailed(@NotNull IOException iOException) {
        C6562gT0.p(iOException, W12.i);
        this.isFallback = true;
        if (!this.isFallbackPossible || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException)) {
            return true;
        }
        return false;
    }
}
