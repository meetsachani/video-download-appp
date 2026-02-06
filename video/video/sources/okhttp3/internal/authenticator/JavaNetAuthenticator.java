package okhttp3.internal.authenticator;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import o.AI0;
import o.C10662xF;
import o.C6562gT0;
import o.C9516sY;
import o.C9545sf2;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class JavaNetAuthenticator implements Authenticator {
    @NotNull
    private final Dns defaultDns;

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public JavaNetAuthenticator() {
        this(null, 1, null);
    }

    private final InetAddress connectToInetAddress(Proxy proxy, HttpUrl httpUrl, Dns dns) throws IOException {
        int i;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i == 1) {
            return (InetAddress) C10662xF.E2(dns.lookup(httpUrl.host()));
        }
        SocketAddress address = proxy.address();
        C6562gT0.n(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        C6562gT0.o(address2, "address() as InetSocketAddress).address");
        return address2;
    }

    @Override // okhttp3.Authenticator
    @Nullable
    public Request authenticate(@Nullable Route route, @NotNull Response response) throws IOException {
        boolean z;
        Proxy proxy;
        Dns dns;
        PasswordAuthentication requestPasswordAuthentication;
        String str;
        Address address;
        C6562gT0.p(response, "response");
        List<Challenge> challenges = response.challenges();
        Request request = response.request();
        HttpUrl url = request.url();
        if (response.code() == 407) {
            z = true;
        } else {
            z = false;
        }
        if (route == null || (proxy = route.proxy()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (Challenge challenge : challenges) {
            if (C9545sf2.c2("Basic", challenge.scheme(), true)) {
                if (route == null || (address = route.address()) == null || (dns = address.dns()) == null) {
                    dns = this.defaultDns;
                }
                if (z) {
                    SocketAddress address2 = proxy.address();
                    C6562gT0.n(address2, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address2;
                    String hostName = inetSocketAddress.getHostName();
                    C6562gT0.o(proxy, "proxy");
                    requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName, connectToInetAddress(proxy, url, dns), inetSocketAddress.getPort(), url.scheme(), challenge.realm(), challenge.scheme(), url.url(), Authenticator.RequestorType.PROXY);
                } else {
                    String host = url.host();
                    C6562gT0.o(proxy, "proxy");
                    requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(host, connectToInetAddress(proxy, url, dns), url.port(), url.scheme(), challenge.realm(), challenge.scheme(), url.url(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    if (z) {
                        str = AI0.H;
                    } else {
                        str = "Authorization";
                    }
                    String userName = requestPasswordAuthentication.getUserName();
                    C6562gT0.o(userName, "auth.userName");
                    char[] password = requestPasswordAuthentication.getPassword();
                    C6562gT0.o(password, "auth.password");
                    return request.newBuilder().header(str, Credentials.basic(userName, new String(password), challenge.charset())).build();
                }
            }
        }
        return null;
    }

    public JavaNetAuthenticator(@NotNull Dns dns) {
        C6562gT0.p(dns, "defaultDns");
        this.defaultDns = dns;
    }

    public /* synthetic */ JavaNetAuthenticator(Dns dns, int i, C9516sY c9516sY) {
        this((i & 1) != 0 ? Dns.SYSTEM : dns);
    }
}
