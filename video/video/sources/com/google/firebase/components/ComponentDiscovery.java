package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.inject.Provider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes3.dex */
public final class ComponentDiscovery<T> {
    public static final String c = "ComponentDiscovery";
    public static final String d = "com.google.firebase.components.ComponentRegistrar";
    public static final String e = "com.google.firebase.components:";
    public final T a;
    public final RegistrarNameRetriever<T> b;

    /* loaded from: classes3.dex */
    public static class MetadataRegistrarNameRetriever implements RegistrarNameRetriever<Context> {
        public final Class<? extends Service> a;

        public final Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(ComponentDiscovery.c, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.a), 128);
                if (serviceInfo == null) {
                    Log.w(ComponentDiscovery.c, this.a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(ComponentDiscovery.c, "Application info not found.");
                return null;
            }
        }

        @Override // com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever
        /* renamed from: c */
        public List<String> a(Context context) {
            Bundle b = b(context);
            if (b == null) {
                Log.w(ComponentDiscovery.c, "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if (ComponentDiscovery.d.equals(b.get(str)) && str.startsWith(ComponentDiscovery.e)) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public MetadataRegistrarNameRetriever(Class<? extends Service> cls) {
            this.a = cls;
        }
    }

    @InterfaceC5056aJ2
    /* loaded from: classes3.dex */
    public interface RegistrarNameRetriever<T> {
        List<String> a(T t);
    }

    @InterfaceC5056aJ2
    public ComponentDiscovery(T t, RegistrarNameRetriever<T> registrarNameRetriever) {
        this.a = t;
        this.b = registrarNameRetriever;
    }

    public static /* synthetic */ ComponentRegistrar a(String str) {
        return e(str);
    }

    public static ComponentDiscovery<Context> d(Context context, Class<? extends Service> cls) {
        return new ComponentDiscovery<>(context, new MetadataRegistrarNameRetriever(cls));
    }

    @InterfaceC11300zs1
    public static ComponentRegistrar e(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, d));
        } catch (ClassNotFoundException unused) {
            Log.w(c, String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
        } catch (InstantiationException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e3);
        } catch (NoSuchMethodException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
        } catch (InvocationTargetException e5) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e5);
        }
    }

    @Deprecated
    public List<ComponentRegistrar> b() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.b.a(this.a)) {
            try {
                ComponentRegistrar e2 = e(str);
                if (e2 != null) {
                    arrayList.add(e2);
                }
            } catch (InvalidRegistrarException e3) {
                Log.w(c, "Invalid component registrar.", e3);
            }
        }
        return arrayList;
    }

    public List<Provider<ComponentRegistrar>> c() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.b.a(this.a)) {
            arrayList.add(new Provider() { // from class: o.AI
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentDiscovery.a(str);
                }
            });
        }
        return arrayList;
    }
}
