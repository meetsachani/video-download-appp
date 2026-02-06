package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public final class zzb {
    @InterfaceC8710pF0("DynamiteLoaderV2ClassLoader.class")
    @InterfaceC11300zs1
    public static ClassLoader a;
    @InterfaceC8710pF0("DynamiteLoaderV2ClassLoader.class")
    @InterfaceC11300zs1
    public static Thread b;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
        if (r1 == null) goto L13;
     */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        SecurityException e;
        zza zzaVar;
        ThreadGroup threadGroup;
        zza zzaVar2;
        synchronized (zzb.class) {
            if (a == null) {
                zza zzaVar3 = b;
                ClassLoader classLoader2 = null;
                if (zzaVar3 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        zzaVar3 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                int activeGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < activeGroupCount) {
                                        threadGroup = threadGroupArr[i2];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i2++;
                                    } else {
                                        threadGroup = null;
                                        break;
                                    }
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int activeCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[activeCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i < activeCount) {
                                        zzaVar = threadArr[i];
                                        if ("GmsDynamite".equals(zzaVar.getName())) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        zzaVar = null;
                                        break;
                                    }
                                }
                                if (zzaVar == null) {
                                    try {
                                        zzaVar2 = new zza(threadGroup, "GmsDynamite");
                                    } catch (SecurityException e2) {
                                        e = e2;
                                    }
                                    try {
                                        zzaVar2.setContextClassLoader(null);
                                        zzaVar2.start();
                                        zzaVar = zzaVar2;
                                    } catch (SecurityException e3) {
                                        e = e3;
                                        zzaVar = zzaVar2;
                                        Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                                        zzaVar3 = zzaVar;
                                        b = zzaVar3;
                                    }
                                }
                            } catch (SecurityException e4) {
                                e = e4;
                                zzaVar = null;
                            }
                        }
                        zzaVar3 = zzaVar;
                    }
                    b = zzaVar3;
                }
                synchronized (zzaVar3) {
                    try {
                        classLoader2 = b.getContextClassLoader();
                    } catch (SecurityException e5) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e5.getMessage());
                    }
                }
                a = classLoader2;
            }
            classLoader = a;
        }
        return classLoader;
    }
}
