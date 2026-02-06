package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import o.C2730De2;
import o.C6562gT0;
import o.C6566gU0;
import o.EnumC9879u20;
import o.IR1;
import o.InterfaceC8046mW0;
import o.InterfaceC9150r20;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class Address {
    @Nullable
    private final CertificatePinner certificatePinner;
    @NotNull
    private final List<ConnectionSpec> connectionSpecs;
    @NotNull
    private final Dns dns;
    @Nullable
    private final HostnameVerifier hostnameVerifier;
    @NotNull
    private final List<Protocol> protocols;
    @Nullable
    private final Proxy proxy;
    @NotNull
    private final Authenticator proxyAuthenticator;
    @NotNull
    private final ProxySelector proxySelector;
    @NotNull
    private final SocketFactory socketFactory;
    @Nullable
    private final SSLSocketFactory sslSocketFactory;
    @NotNull
    private final HttpUrl url;

    public Address(@NotNull String str, int i, @NotNull Dns dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable CertificatePinner certificatePinner, @NotNull Authenticator authenticator, @Nullable Proxy proxy, @NotNull List<? extends Protocol> list, @NotNull List<ConnectionSpec> list2, @NotNull ProxySelector proxySelector) {
        C6562gT0.p(str, "uriHost");
        C6562gT0.p(dns, C2730De2.k);
        C6562gT0.p(socketFactory, "socketFactory");
        C6562gT0.p(authenticator, "proxyAuthenticator");
        C6562gT0.p(list, "protocols");
        C6562gT0.p(list2, "connectionSpecs");
        C6562gT0.p(proxySelector, "proxySelector");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = authenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(str).port(i).build();
        this.protocols = Util.toImmutableList(list);
        this.connectionSpecs = Util.toImmutableList(list2);
    }

    @InterfaceC8046mW0(name = "-deprecated_certificatePinner")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "certificatePinner", imports = {}))
    @Nullable
    /* renamed from: -deprecated_certificatePinner  reason: not valid java name */
    public final CertificatePinner m18deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @InterfaceC8046mW0(name = "-deprecated_connectionSpecs")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "connectionSpecs", imports = {}))
    @NotNull
    /* renamed from: -deprecated_connectionSpecs  reason: not valid java name */
    public final List<ConnectionSpec> m19deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @InterfaceC8046mW0(name = "-deprecated_dns")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = C2730De2.k, imports = {}))
    @NotNull
    /* renamed from: -deprecated_dns  reason: not valid java name */
    public final Dns m20deprecated_dns() {
        return this.dns;
    }

    @InterfaceC8046mW0(name = "-deprecated_hostnameVerifier")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "hostnameVerifier", imports = {}))
    @Nullable
    /* renamed from: -deprecated_hostnameVerifier  reason: not valid java name */
    public final HostnameVerifier m21deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @InterfaceC8046mW0(name = "-deprecated_protocols")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "protocols", imports = {}))
    @NotNull
    /* renamed from: -deprecated_protocols  reason: not valid java name */
    public final List<Protocol> m22deprecated_protocols() {
        return this.protocols;
    }

    @InterfaceC8046mW0(name = "-deprecated_proxy")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "proxy", imports = {}))
    @Nullable
    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m23deprecated_proxy() {
        return this.proxy;
    }

    @InterfaceC8046mW0(name = "-deprecated_proxyAuthenticator")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "proxyAuthenticator", imports = {}))
    @NotNull
    /* renamed from: -deprecated_proxyAuthenticator  reason: not valid java name */
    public final Authenticator m24deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @InterfaceC8046mW0(name = "-deprecated_proxySelector")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "proxySelector", imports = {}))
    @NotNull
    /* renamed from: -deprecated_proxySelector  reason: not valid java name */
    public final ProxySelector m25deprecated_proxySelector() {
        return this.proxySelector;
    }

    @InterfaceC8046mW0(name = "-deprecated_socketFactory")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "socketFactory", imports = {}))
    @NotNull
    /* renamed from: -deprecated_socketFactory  reason: not valid java name */
    public final SocketFactory m26deprecated_socketFactory() {
        return this.socketFactory;
    }

    @InterfaceC8046mW0(name = "-deprecated_sslSocketFactory")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "sslSocketFactory", imports = {}))
    @Nullable
    /* renamed from: -deprecated_sslSocketFactory  reason: not valid java name */
    public final SSLSocketFactory m27deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @InterfaceC8046mW0(name = "-deprecated_url")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "url", imports = {}))
    @NotNull
    /* renamed from: -deprecated_url  reason: not valid java name */
    public final HttpUrl m28deprecated_url() {
        return this.url;
    }

    @InterfaceC8046mW0(name = "certificatePinner")
    @Nullable
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @InterfaceC8046mW0(name = "connectionSpecs")
    @NotNull
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @InterfaceC8046mW0(name = C2730De2.k)
    @NotNull
    public final Dns dns() {
        return this.dns;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (C6562gT0.g(this.url, address.url) && equalsNonHost$okhttp(address)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean equalsNonHost$okhttp(@NotNull Address address) {
        C6562gT0.p(address, "that");
        if (C6562gT0.g(this.dns, address.dns) && C6562gT0.g(this.proxyAuthenticator, address.proxyAuthenticator) && C6562gT0.g(this.protocols, address.protocols) && C6562gT0.g(this.connectionSpecs, address.connectionSpecs) && C6562gT0.g(this.proxySelector, address.proxySelector) && C6562gT0.g(this.proxy, address.proxy) && C6562gT0.g(this.sslSocketFactory, address.sslSocketFactory) && C6562gT0.g(this.hostnameVerifier, address.hostnameVerifier) && C6562gT0.g(this.certificatePinner, address.certificatePinner) && this.url.port() == address.url.port()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31) + Objects.hashCode(this.proxy)) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner);
    }

    @InterfaceC8046mW0(name = "hostnameVerifier")
    @Nullable
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @InterfaceC8046mW0(name = "protocols")
    @NotNull
    public final List<Protocol> protocols() {
        return this.protocols;
    }

    @InterfaceC8046mW0(name = "proxy")
    @Nullable
    public final Proxy proxy() {
        return this.proxy;
    }

    @InterfaceC8046mW0(name = "proxyAuthenticator")
    @NotNull
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @InterfaceC8046mW0(name = "proxySelector")
    @NotNull
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    @InterfaceC8046mW0(name = "socketFactory")
    @NotNull
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @InterfaceC8046mW0(name = "sslSocketFactory")
    @Nullable
    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.url.host());
        sb2.append(':');
        sb2.append(this.url.port());
        sb2.append(C6566gU0.h);
        if (this.proxy != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.proxy;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.proxySelector;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }

    @InterfaceC8046mW0(name = "url")
    @NotNull
    public final HttpUrl url() {
        return this.url;
    }
}
