package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import com.facebook.a0;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import o.C3599Ly1;
import o.C8077mf;
import o.C9273rY;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
public class CommonUtils {
    public static final String a = "SHA-1";
    public static final String b = "goldfish";
    public static final String c = "ranchu";
    public static final String d = "sdk";
    public static final String e = "com.google.firebase.crashlytics";
    public static final String f = "com.crashlytics.prefs";
    public static final char[] g = {C3599Ly1.j, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final String h = "com.google.firebase.crashlytics.mapping_file_id";
    public static final String i = "com.crashlytics.android.build_id";
    public static final String j = "com.google.firebase.crashlytics.build_ids_lib";
    public static final String k = "com.google.firebase.crashlytics.build_ids_arch";
    public static final String l = "com.google.firebase.crashlytics.build_ids_build_id";
    public static final int m = 1;
    public static final int n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f341o = 4;
    public static final int p = 8;
    public static final int q = 16;
    public static final int r = 32;

    /* loaded from: classes3.dex */
    public enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        public static final Map<String, Architecture> f1;

        static {
            Architecture architecture = X86_32;
            Architecture architecture2 = ARMV6;
            Architecture architecture3 = ARMV7;
            Architecture architecture4 = ARM64;
            HashMap hashMap = new HashMap(4);
            f1 = hashMap;
            hashMap.put("armeabi-v7a", architecture3);
            hashMap.put("armeabi", architecture2);
            hashMap.put("arm64-v8a", architecture4);
            hashMap.put("x86", architecture);
        }

        public static Architecture e() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                Logger.f().k("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            Architecture architecture = f1.get(str.toLowerCase(Locale.US));
            if (architecture == null) {
                return UNKNOWN;
            }
            return architecture;
        }
    }

    public static boolean A(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        return str.equals(str2);
    }

    public static String B(int i2) {
        if (i2 >= 0) {
            return String.format(Locale.US, "%1$10s", Integer.valueOf(i2)).replace(' ', C3599Ly1.j);
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    public static String C(String str) {
        return s(str, "SHA-1");
    }

    public static String D(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(androidx.appcompat.widget.b.r)).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static synchronized long b(Context context) {
        long j2;
        synchronized (CommonUtils.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(androidx.appcompat.widget.b.r)).getMemoryInfo(memoryInfo);
            j2 = memoryInfo.totalMem;
        }
        return j2;
    }

    public static long c(String str) {
        StatFs statFs;
        long blockSize = new StatFs(str).getBlockSize();
        return (statFs.getBlockCount() * blockSize) - (blockSize * statFs.getAvailableBlocks());
    }

    @SuppressLint({"MissingPermission"})
    public static boolean d(Context context) {
        if (!e(context, C9273rY.b)) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            return true;
        }
        return false;
    }

    public static boolean e(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public static void f(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                Logger.f().e(str, e2);
            }
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static String h(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            ArrayList<String> arrayList = new ArrayList();
            for (String str : strArr) {
                if (str != null) {
                    arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
                }
            }
            Collections.sort(arrayList);
            StringBuilder sb = new StringBuilder();
            for (String str2 : arrayList) {
                sb.append(str2);
            }
            String sb2 = sb.toString();
            if (sb2.length() > 0) {
                return C(sb2);
            }
        }
        return null;
    }

    public static boolean i(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int q2 = q(context, str, a0.s);
            if (q2 > 0) {
                return resources.getBoolean(q2);
            }
            int q3 = q(context, str, "string");
            if (q3 > 0) {
                return Boolean.parseBoolean(context.getString(q3));
            }
        }
        return z;
    }

    public static List<BuildIdInfo> j(Context context) {
        ArrayList arrayList = new ArrayList();
        int q2 = q(context, j, "array");
        int q3 = q(context, k, "array");
        int q4 = q(context, l, "array");
        if (q2 != 0 && q3 != 0 && q4 != 0) {
            String[] stringArray = context.getResources().getStringArray(q2);
            String[] stringArray2 = context.getResources().getStringArray(q3);
            String[] stringArray3 = context.getResources().getStringArray(q4);
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                for (int i2 = 0; i2 < stringArray3.length; i2++) {
                    arrayList.add(new BuildIdInfo(stringArray[i2], stringArray2[i2], stringArray3[i2]));
                }
                return arrayList;
            }
            Logger.f().b(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        Logger.f().b(String.format("Could not find resources: %d %d %d", Integer.valueOf(q2), Integer.valueOf(q3), Integer.valueOf(q4)));
        return arrayList;
    }

    public static int k() {
        return Architecture.e().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int l() {
        boolean x = x();
        ?? r0 = x;
        if (z()) {
            r0 = (x ? 1 : 0) | true;
        }
        if (w()) {
            return r0 | 4;
        }
        return r0;
    }

    public static SharedPreferences m(Context context) {
        return context.getSharedPreferences(f, 0);
    }

    public static String n(Context context) {
        int q2 = q(context, h, "string");
        if (q2 == 0) {
            q2 = q(context, i, "string");
        }
        if (q2 != 0) {
            return context.getResources().getString(q2);
        }
        return null;
    }

    public static boolean o(Context context) {
        if (x() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) {
            return false;
        }
        return true;
    }

    public static String p(Context context) {
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i2);
                if ("android".equals(resourcePackageName)) {
                    return context.getPackageName();
                }
                return resourcePackageName;
            } catch (Resources.NotFoundException unused) {
                return context.getPackageName();
            }
        }
        return context.getPackageName();
    }

    public static int q(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, p(context));
    }

    public static SharedPreferences r(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static String s(String str, String str2) {
        return t(str.getBytes(), str2);
    }

    public static String t(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return u(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            Logger f2 = Logger.f();
            f2.e("Could not create hashing algorithm: " + str + ", returning empty string.", e2);
            return "";
        }
    }

    public static String u(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 * 2;
            char[] cArr2 = g;
            cArr[i3] = cArr2[(b2 & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b2 & C8077mf.q];
        }
        return new String(cArr);
    }

    public static boolean v(Context context) {
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean w() {
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            return false;
        }
        return true;
    }

    public static boolean x() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains(b) && !str.contains(c)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Deprecated
    public static boolean y(Context context) {
        return false;
    }

    public static boolean z() {
        boolean x = x();
        String str = Build.TAGS;
        if ((!x && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (!x && file.exists()) {
            return true;
        }
        return false;
    }
}
