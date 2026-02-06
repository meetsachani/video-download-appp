package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import o.C6562gT0;
import o.EnumC9879u20;
import o.IR1;
import o.InterfaceC8046mW0;
import o.InterfaceC9150r20;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class Route {
    @NotNull
    private final Address address;
    @NotNull
    private final Proxy proxy;
    @NotNull
    private final InetSocketAddress socketAddress;

    public Route(@NotNull Address address, @NotNull Proxy proxy, @NotNull InetSocketAddress inetSocketAddress) {
        C6562gT0.p(address, "address");
        C6562gT0.p(proxy, "proxy");
        C6562gT0.p(inetSocketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
    }

    @InterfaceC8046mW0(name = "-deprecated_address")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "address", imports = {}))
    @NotNull
    /* renamed from: -deprecated_address  reason: not valid java name */
    public final Address m148deprecated_address() {
        return this.address;
    }

    @InterfaceC8046mW0(name = "-deprecated_proxy")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "proxy", imports = {}))
    @NotNull
    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m149deprecated_proxy() {
        return this.proxy;
    }

    @InterfaceC8046mW0(name = "-deprecated_socketAddress")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "socketAddress", imports = {}))
    @NotNull
    /* renamed from: -deprecated_socketAddress  reason: not valid java name */
    public final InetSocketAddress m150deprecated_socketAddress() {
        return this.socketAddress;
    }

    @InterfaceC8046mW0(name = "address")
    @NotNull
    public final Address address() {
        return this.address;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (C6562gT0.g(route.address, this.address) && C6562gT0.g(route.proxy, this.proxy) && C6562gT0.g(route.socketAddress, this.socketAddress)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    @InterfaceC8046mW0(name = "proxy")
    @NotNull
    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        if (this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP) {
            return true;
        }
        return false;
    }

    @InterfaceC8046mW0(name = "socketAddress")
    @NotNull
    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    @NotNull
    public String toString() {
        return "Route{" + this.socketAddress + '}';
    }
}
