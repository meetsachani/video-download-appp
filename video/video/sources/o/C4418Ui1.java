package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@InterfaceC11123z82
/* renamed from: o.Ui1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4418Ui1 implements InterfaceC9562sk {
    public static final String d = "BackendRegistry";
    public static final String e = "backend:";
    public final a a;
    public final C6055eR b;
    public final Map<String, InterfaceC3682Mt2> c;

    /* renamed from: o.Ui1$a */
    /* loaded from: classes2.dex */
    public static class a {
        public final Context a;
        public Map<String, String> b = null;

        public a(Context context) {
            this.a = context;
        }

        public static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(C4418Ui1.d, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w(C4418Ui1.d, "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(C4418Ui1.d, "Application info not found.");
                return null;
            }
        }

        public final Map<String, String> a(Context context) {
            Bundle d = d(context);
            if (d == null) {
                Log.w(C4418Ui1.d, "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.EMPTY_MAP;
            }
            HashMap hashMap = new HashMap();
            for (String str : d.keySet()) {
                Object obj = d.get(str);
                if ((obj instanceof String) && str.startsWith(C4418Ui1.e)) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        @InterfaceC11300zs1
        public InterfaceC9319rk b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC9319rk) Class.forName(str2).asSubclass(InterfaceC9319rk.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e) {
                Log.w(C4418Ui1.d, String.format("Class %s is not found.", str2), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w(C4418Ui1.d, String.format("Could not instantiate %s.", str2), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w(C4418Ui1.d, String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w(C4418Ui1.d, String.format("Could not instantiate %s", str2), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w(C4418Ui1.d, String.format("Could not instantiate %s", str2), e5);
                return null;
            }
        }

        public final Map<String, String> c() {
            if (this.b == null) {
                this.b = a(this.a);
            }
            return this.b;
        }
    }

    @RP0
    public C4418Ui1(Context context, C6055eR c6055eR) {
        this(new a(context), c6055eR);
    }

    @Override // o.InterfaceC9562sk
    @InterfaceC11300zs1
    public synchronized InterfaceC3682Mt2 m(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        InterfaceC9319rk b = this.a.b(str);
        if (b == null) {
            return null;
        }
        InterfaceC3682Mt2 create = b.create(this.b.a(str));
        this.c.put(str, create);
        return create;
    }

    public C4418Ui1(a aVar, C6055eR c6055eR) {
        this.c = new HashMap();
        this.a = aVar;
        this.b = c6055eR;
    }
}
