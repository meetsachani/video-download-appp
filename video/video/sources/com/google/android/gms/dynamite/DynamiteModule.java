package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import o.C3827Oh;
import o.C5014a90;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC7980mF0;
import o.UE;
import o.Z80;

@KeepForSdk
/* loaded from: classes2.dex */
public final class DynamiteModule {
    @KeepForSdk
    public static final int b = -1;
    @KeepForSdk
    public static final int c = 1;
    @KeepForSdk
    public static final int d = 0;
    @KeepForSdk
    public static final int e = 0;
    @InterfaceC7980mF0("DynamiteModule.class")
    @InterfaceC11300zs1
    public static Boolean l = null;
    @InterfaceC7980mF0("DynamiteModule.class")
    @InterfaceC11300zs1
    public static String m = null;
    @InterfaceC7980mF0("DynamiteModule.class")
    public static boolean n = false;
    @InterfaceC7980mF0("DynamiteModule.class")

    /* renamed from: o  reason: collision with root package name */
    public static int f195o = -1;
    @InterfaceC7980mF0("DynamiteModule.class")
    @InterfaceC11300zs1
    public static Boolean p;
    @InterfaceC7980mF0("DynamiteModule.class")
    @InterfaceC11300zs1
    public static zzq u;
    @InterfaceC7980mF0("DynamiteModule.class")
    @InterfaceC11300zs1
    public static zzr v;
    public final Context a;
    public static final ThreadLocal q = new ThreadLocal();
    public static final ThreadLocal r = new zzd();
    public static final VersionPolicy.IVersions s = new zze();
    @InterfaceC5670cr1
    @KeepForSdk
    public static final VersionPolicy f = new zzf();
    @InterfaceC5670cr1
    @KeepForSdk
    public static final VersionPolicy g = new zzg();
    @InterfaceC5670cr1
    @KeepForSdk
    public static final VersionPolicy h = new zzh();
    @InterfaceC5670cr1
    @KeepForSdk
    public static final VersionPolicy i = new zzi();
    @InterfaceC5670cr1
    @KeepForSdk
    public static final VersionPolicy j = new zzj();
    @InterfaceC5670cr1
    @KeepForSdk
    public static final VersionPolicy k = new zzk();
    @InterfaceC5670cr1
    public static final VersionPolicy t = new zzl();

    @DynamiteApi
    /* loaded from: classes2.dex */
    public static class DynamiteLoaderClassLoader {
        @InterfaceC7980mF0("DynamiteLoaderClassLoader.class")
        @InterfaceC11300zs1
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    /* loaded from: classes2.dex */
    public interface VersionPolicy {

        @KeepForSdk
        /* loaded from: classes2.dex */
        public interface IVersions {
            int a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str, boolean z) throws LoadingException;

            int b(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str);
        }

        @KeepForSdk
        /* loaded from: classes2.dex */
        public static class SelectionResult {
            @KeepForSdk
            public int a = 0;
            @KeepForSdk
            public int b = 0;
            @KeepForSdk
            public int c = 0;
        }

        @InterfaceC5670cr1
        @KeepForSdk
        SelectionResult a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 IVersions iVersions) throws LoadingException;
    }

    public DynamiteModule(Context context) {
        Preconditions.r(context);
        this.a = context;
    }

    @KeepForSdk
    public static int a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!Objects.b(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    public static int c(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str) {
        return f(context, str, false);
    }

    @ResultIgnorabilityUnspecified
    @InterfaceC5670cr1
    @KeepForSdk
    public static DynamiteModule e(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 VersionPolicy versionPolicy, @InterfaceC5670cr1 String str) throws LoadingException {
        long j2;
        VersionPolicy.SelectionResult a;
        int i2;
        DynamiteModule h2;
        Boolean bool;
        IObjectWrapper B5;
        DynamiteModule dynamiteModule;
        zzr zzrVar;
        boolean z;
        IObjectWrapper r4;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = q;
            zzn zznVar = (zzn) threadLocal.get();
            zzn zznVar2 = new zzn(null);
            threadLocal.set(zznVar2);
            ThreadLocal threadLocal2 = r;
            Long l2 = (Long) threadLocal2.get();
            long longValue = l2.longValue();
            try {
                threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
                a = versionPolicy.a(context, str, s);
                i2 = a.a;
                j2 = 0;
            } catch (Throwable th) {
                th = th;
                j2 = 0;
            }
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + i2 + " and remote module " + str + ":" + a.b);
                int i3 = a.c;
                if (i3 != 0) {
                    if (i3 == -1) {
                        if (a.a != 0) {
                            i3 = -1;
                        }
                    }
                    if (i3 != 1 || a.b != 0) {
                        if (i3 == -1) {
                            h2 = h(applicationContext, str);
                        } else if (i3 == 1) {
                            try {
                                int i4 = a.b;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (k(context)) {
                                            bool = l;
                                        } else {
                                            throw new LoadingException("Remote loading disabled", null);
                                        }
                                    }
                                    if (bool != null) {
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                            synchronized (DynamiteModule.class) {
                                                zzrVar = v;
                                            }
                                            if (zzrVar != null) {
                                                zzn zznVar3 = (zzn) threadLocal.get();
                                                if (zznVar3 != null && zznVar3.a != null) {
                                                    Context applicationContext2 = context.getApplicationContext();
                                                    Cursor cursor = zznVar3.a;
                                                    ObjectWrapper.V3(null);
                                                    synchronized (DynamiteModule.class) {
                                                        if (f195o >= 2) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                    }
                                                    if (z) {
                                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                        r4 = zzrVar.h5(ObjectWrapper.V3(applicationContext2), str, i4, ObjectWrapper.V3(cursor));
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                        r4 = zzrVar.r4(ObjectWrapper.V3(applicationContext2), str, i4, ObjectWrapper.V3(cursor));
                                                    }
                                                    Context context2 = (Context) ObjectWrapper.o1(r4);
                                                    if (context2 != null) {
                                                        dynamiteModule = new DynamiteModule(context2);
                                                    } else {
                                                        throw new LoadingException("Failed to get module context", null);
                                                    }
                                                } else {
                                                    throw new LoadingException("No result cursor", null);
                                                }
                                            } else {
                                                throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                            }
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                            zzq l3 = l(context);
                                            if (l3 != null) {
                                                int d2 = l3.d();
                                                if (d2 >= 3) {
                                                    zzn zznVar4 = (zzn) threadLocal.get();
                                                    if (zznVar4 != null) {
                                                        B5 = l3.s7(ObjectWrapper.V3(context), str, i4, ObjectWrapper.V3(zznVar4.a));
                                                    } else {
                                                        throw new LoadingException("No cached result cursor holder", null);
                                                    }
                                                } else if (d2 == 2) {
                                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                    B5 = l3.S7(ObjectWrapper.V3(context), str, i4);
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                    B5 = l3.B5(ObjectWrapper.V3(context), str, i4);
                                                }
                                                Object o1 = ObjectWrapper.o1(B5);
                                                if (o1 != null) {
                                                    dynamiteModule = new DynamiteModule((Context) o1);
                                                } else {
                                                    throw new LoadingException("Failed to load remote module.", null);
                                                }
                                            } else {
                                                throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                            }
                                        }
                                        h2 = dynamiteModule;
                                    } else {
                                        throw new LoadingException("Failed to determine which loading route to use.", null);
                                    }
                                } catch (RemoteException e2) {
                                    throw new LoadingException("Failed to load remote module.", e2, null);
                                } catch (LoadingException e3) {
                                    throw e3;
                                } catch (Throwable th2) {
                                    CrashUtils.a(context, th2);
                                    throw new LoadingException("Failed to load remote module.", th2, null);
                                }
                            } catch (LoadingException e4) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                                int i5 = a.a;
                                if (i5 != 0 && versionPolicy.a(context, str, new zzo(i5, 0)).c == -1) {
                                    h2 = h(applicationContext, str);
                                } else {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e4, null);
                                }
                            }
                        } else {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i3, null);
                        }
                        if (longValue == 0) {
                            r.remove();
                        } else {
                            r.set(l2);
                        }
                        Cursor cursor2 = zznVar2.a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        q.set(zznVar);
                        return h2;
                    }
                }
                throw new LoadingException("No acceptable module " + str + " found. Local version is " + a.a + " and remote version is " + a.b + UE.h, null);
            } catch (Throwable th3) {
                th = th3;
                if (longValue == j2) {
                    r.remove();
                } else {
                    r.set(l2);
                }
                Cursor cursor3 = zznVar2.a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                q.set(zznVar);
                throw th;
            }
        }
        throw new LoadingException("null application Context", null);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x01c7 -> B:132:0x01cc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x01c9 -> B:132:0x01cc). Please submit an issue!!! */
    public static int f(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = l;
                Cursor cursor2 = null;
                int i2 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String obj = e2.toString();
                        Log.w("DynamiteModule", "Failed to load module via V2: " + obj);
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                i(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else if (!k(context)) {
                            return 0;
                        } else {
                            if (!n) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int g2 = g(context, str, z, true);
                                        String str2 = m;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a = zzb.a();
                                            if (a == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    C5014a90.a();
                                                    String str3 = m;
                                                    Preconditions.r(str3);
                                                    a = Z80.a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = m;
                                                    Preconditions.r(str4);
                                                    a = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            i(a);
                                            declaredField.set(null, a);
                                            l = bool2;
                                            return g2;
                                        }
                                        return g2;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        l = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return g(context, str, z, false);
                    } catch (LoadingException e3) {
                        String message = e3.getMessage();
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message);
                        return 0;
                    }
                }
                zzq l2 = l(context);
                try {
                    if (l2 != null) {
                        try {
                            int d2 = l2.d();
                            if (d2 >= 3) {
                                zzn zznVar = (zzn) q.get();
                                if (zznVar != null && (cursor = zznVar.a) != null) {
                                    i2 = cursor.getInt(0);
                                } else {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.o1(l2.V7(ObjectWrapper.V3(context), str, z, ((Long) r.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i3 = cursor3.getInt(0);
                                                if (i3 <= 0 || !j(cursor3)) {
                                                    cursor2 = cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i2 = i3;
                                            }
                                        } catch (RemoteException e4) {
                                            remoteException = e4;
                                            cursor2 = cursor3;
                                            String message2 = remoteException.getMessage();
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message2);
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            } else if (d2 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i2 = l2.h5(ObjectWrapper.V3(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i2 = l2.r4(ObjectWrapper.V3(context), str, z);
                            }
                        } catch (RemoteException e5) {
                            remoteException = e5;
                        }
                    }
                    return i2;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
        r9.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g(Context context, String str, boolean z, boolean z2) throws LoadingException {
        Throwable th;
        Exception exc;
        ?? r1 = 0;
        try {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                long longValue = ((Long) r.get()).longValue();
                String str2 = "api_force_staging";
                boolean z3 = true;
                if (true != z) {
                    str2 = "api";
                }
                Cursor query = contentResolver.query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(str2).appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(longValue)).build(), null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            boolean z4 = false;
                            int i2 = query.getInt(0);
                            if (i2 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        m = query.getString(2);
                                        int columnIndex = query.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f195o = query.getInt(columnIndex);
                                        }
                                        int columnIndex2 = query.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (query.getInt(columnIndex2) == 0) {
                                                z3 = false;
                                            }
                                            n = z3;
                                            z4 = z3;
                                        }
                                    } finally {
                                    }
                                }
                                if (j(query)) {
                                    query = null;
                                }
                            }
                            if (z2 && z4) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", null);
                            }
                            return i2;
                        }
                    } catch (Exception e2) {
                        exc = e2;
                        if (exc instanceof LoadingException) {
                            throw exc;
                        }
                        throw new LoadingException("V2 version check failed: " + exc.getMessage(), exc, null);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", null);
            } catch (Exception e3) {
                exc = e3;
            } catch (Throwable th2) {
                th = th2;
                if (r1 != 0) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            r1 = context;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    public static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    @InterfaceC7980mF0("DynamiteModule.class")
    public static void i(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzrVar = (zzr) queryLocalInterface;
                } else {
                    zzrVar = new zzr(iBinder);
                }
            }
            v = zzrVar;
        } catch (ClassNotFoundException e2) {
            e = e2;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (IllegalAccessException e3) {
            e = e3;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (InstantiationException e4) {
            e = e4;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (NoSuchMethodException e5) {
            e = e5;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (InvocationTargetException e6) {
            e = e6;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    public static boolean j(Cursor cursor) {
        zzn zznVar = (zzn) q.get();
        if (zznVar != null && zznVar.a == null) {
            zznVar.a = cursor;
            return true;
        }
        return false;
    }

    @InterfaceC7980mF0("DynamiteModule.class")
    public static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(p)) {
            return true;
        }
        boolean z = false;
        if (p == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.i().k(context, C3827Oh.m) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            p = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                n = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    @InterfaceC11300zs1
    public static zzq l(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = u;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof zzq) {
                        zzqVar = (zzq) queryLocalInterface;
                    } else {
                        zzqVar = new zzq(iBinder);
                    }
                }
                if (zzqVar != null) {
                    u = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    @InterfaceC5670cr1
    @KeepForSdk
    public Context b() {
        return this.a;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public IBinder d(@InterfaceC5670cr1 String str) throws LoadingException {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e2, null);
        }
    }
}
