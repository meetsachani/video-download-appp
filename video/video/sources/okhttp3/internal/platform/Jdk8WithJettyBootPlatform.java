package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import o.C6562gT0;
import o.C9516sY;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class Jdk8WithJettyBootPlatform extends Platform {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final Class<?> clientProviderClass;
    @NotNull
    private final Method getMethod;
    @NotNull
    private final Method putMethod;
    @NotNull
    private final Method removeMethod;
    @NotNull
    private final Class<?> serverProviderClass;

    /* loaded from: classes4.dex */
    public static final class AlpnProvider implements InvocationHandler {
        @NotNull
        private final List<String> protocols;
        @Nullable
        private String selected;
        private boolean unsupported;

        public AlpnProvider(@NotNull List<String> list) {
            C6562gT0.p(list, "protocols");
            this.protocols = list;
        }

        @Nullable
        public final String getSelected() {
            return this.selected;
        }

        public final boolean getUnsupported() {
            return this.unsupported;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) throws Throwable {
            C6562gT0.p(obj, "proxy");
            C6562gT0.p(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C6562gT0.g(name, "supports") && C6562gT0.g(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (C6562gT0.g(name, "unsupported") && C6562gT0.g(Void.TYPE, returnType)) {
                this.unsupported = true;
                return null;
            } else if (C6562gT0.g(name, "protocols") && objArr.length == 0) {
                return this.protocols;
            } else {
                if ((C6562gT0.g(name, "selectProtocol") || C6562gT0.g(name, "select")) && C6562gT0.g(String.class, returnType) && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        C6562gT0.n(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i = 0;
                            while (true) {
                                Object obj3 = list.get(i);
                                C6562gT0.n(obj3, "null cannot be cast to non-null type kotlin.String");
                                String str = (String) obj3;
                                if (this.protocols.contains(str)) {
                                    this.selected = str;
                                    return str;
                                } else if (i == size) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        String str2 = this.protocols.get(0);
                        this.selected = str2;
                        return str2;
                    }
                }
                if ((C6562gT0.g(name, "protocolSelected") || C6562gT0.g(name, "selected")) && objArr.length == 1) {
                    Object obj4 = objArr[0];
                    C6562gT0.n(obj4, "null cannot be cast to non-null type kotlin.String");
                    this.selected = (String) obj4;
                    return null;
                }
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public final void setSelected(@Nullable String str) {
            this.selected = str;
        }

        public final void setUnsupported(boolean z) {
            this.unsupported = z;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @Nullable
        public final Platform buildIfSupported() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                C6562gT0.o(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                C6562gT0.o(method, "putMethod");
                C6562gT0.o(method2, "getMethod");
                C6562gT0.o(method3, "removeMethod");
                C6562gT0.o(cls3, "clientProviderClass");
                C6562gT0.o(cls4, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public Jdk8WithJettyBootPlatform(@NotNull Method method, @NotNull Method method2, @NotNull Method method3, @NotNull Class<?> cls, @NotNull Class<?> cls2) {
        C6562gT0.p(method, "putMethod");
        C6562gT0.p(method2, "getMethod");
        C6562gT0.p(method3, "removeMethod");
        C6562gT0.p(cls, "clientProviderClass");
        C6562gT0.p(cls2, "serverProviderClass");
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }

    @Override // okhttp3.internal.platform.Platform
    public void afterHandshake(@NotNull SSLSocket sSLSocket) {
        C6562gT0.p(sSLSocket, "sslSocket");
        try {
            this.removeMethod.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends Protocol> list) {
        C6562gT0.p(sSLSocket, "sslSocket");
        C6562gT0.p(list, "protocols");
        try {
            this.putMethod.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new AlpnProvider(Platform.Companion.alpnProtocolNames(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket sSLSocket) {
        C6562gT0.p(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke(null, sSLSocket));
            C6562gT0.n(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            if (!alpnProvider.getUnsupported() && alpnProvider.getSelected() == null) {
                Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            } else if (alpnProvider.getUnsupported()) {
                return null;
            } else {
                return alpnProvider.getSelected();
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
