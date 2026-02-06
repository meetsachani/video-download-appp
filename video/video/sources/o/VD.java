package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.channels.ByteChannel;
import java.nio.channels.Channel;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.InterruptibleChannel;
import java.nio.channels.NetworkChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes4.dex */
public final class VD implements InvocationHandler {
    public static final Set<Class<? extends Channel>> c;
    public final Channel a;
    public volatile boolean b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(TD.a());
        hashSet.add(ByteChannel.class);
        hashSet.add(Channel.class);
        hashSet.add(GatheringByteChannel.class);
        hashSet.add(InterruptibleChannel.class);
        hashSet.add(NetworkChannel.class);
        hashSet.add(ReadableByteChannel.class);
        hashSet.add(ScatteringByteChannel.class);
        hashSet.add(SeekableByteChannel.class);
        hashSet.add(WritableByteChannel.class);
        c = Collections.unmodifiableSet(hashSet);
    }

    public VD(Channel channel) {
        Objects.requireNonNull(channel, "delegate");
        this.a = channel;
    }

    public static boolean b(Class<?> cls, String str, int i) {
        if (i == 0 && str.equals("supportedOptions") && NetworkChannel.class.equals(cls)) {
            return true;
        }
        return false;
    }

    public static boolean c(Class<?> cls) {
        return c.contains(cls);
    }

    public static boolean d(Class<?> cls, String str, int i) {
        if (SeekableByteChannel.class.equals(cls)) {
            if (i != 1 || (!str.equals("position") && !str.equals("truncate"))) {
                return false;
            }
            return true;
        } else if (!NetworkChannel.class.equals(cls) || ((i != 1 || !str.equals("bind")) && (i != 2 || !str.equals("setOption")))) {
            return false;
        } else {
            return true;
        }
    }

    public final Object a(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        name.getClass();
        char c2 = 65535;
        switch (name.hashCode()) {
            case -1776922004:
                if (name.equals("toString")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1295482945:
                if (name.equals("equals")) {
                    c2 = 1;
                    break;
                }
                break;
            case 147696667:
                if (name.equals("hashCode")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return "CloseShieldChannel(" + this.a + C9811tl1.d;
            case 1:
                Object obj2 = objArr[0];
                if (obj2 == null) {
                    return Boolean.FALSE;
                }
                if (obj == obj2) {
                    return Boolean.TRUE;
                }
                if (Proxy.isProxyClass(obj2.getClass())) {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(obj2);
                    if (invocationHandler instanceof VD) {
                        return Boolean.valueOf(Objects.equals(((VD) invocationHandler).a, this.a));
                    }
                }
                return Boolean.FALSE;
            case 2:
                return Integer.valueOf(Objects.hashCode(this.a));
            default:
                return null;
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Class<?> declaringClass = method.getDeclaringClass();
        String name = method.getName();
        int a = UD.a(method);
        if (declaringClass == Object.class) {
            return a(obj, method, objArr);
        }
        boolean z = true;
        if (a == 0 && name.equals("close")) {
            this.b = true;
            return null;
        } else if (a == 0 && name.equals("isOpen")) {
            return Boolean.valueOf((this.b || !this.a.isOpen()) ? false : false);
        } else if (this.b && !b(declaringClass, name, a)) {
            throw new ClosedChannelException();
        } else {
            try {
                Object invoke = method.invoke(this.a, objArr);
                if (d(declaringClass, name, a)) {
                    return obj;
                }
                return invoke;
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
    }
}
