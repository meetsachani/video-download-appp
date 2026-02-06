package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import o.C6562gT0;
import o.C7330jf;
import o.InterfaceC7058iW0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public interface Dns {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    @InterfaceC7058iW0
    @NotNull
    public static final Dns SYSTEM = new Companion.DnsSystem();

    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* loaded from: classes4.dex */
        public static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            @NotNull
            public List<InetAddress> lookup(@NotNull String str) {
                C6562gT0.p(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    C6562gT0.o(allByName, "getAllByName(hostname)");
                    return C7330jf.Uy(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }
    }

    @NotNull
    List<InetAddress> lookup(@NotNull String str) throws UnknownHostException;
}
