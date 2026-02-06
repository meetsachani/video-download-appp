package o;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.internal.C2379y;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: o.c30  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5475c30 {
    @NotNull
    public static final String c = "device_info";
    @NotNull
    public static final String d = "target_user_id";
    @NotNull
    public static final String e = "device";
    @NotNull
    public static final String f = "model";
    @NotNull
    public static final String g = "fbsdk";
    @NotNull
    public static final String h = "android";
    @NotNull
    public static final String i = "_fb._tcp.";
    @NotNull
    public static final C5475c30 a = new C5475c30();
    public static final String b = C5475c30.class.getCanonicalName();
    @NotNull
    public static final HashMap<String, NsdManager.RegistrationListener> j = new HashMap<>();

    /* renamed from: o.c30$a */
    /* loaded from: classes2.dex */
    public static final class a implements NsdManager.RegistrationListener {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(@NotNull NsdServiceInfo nsdServiceInfo, int i) {
            C6562gT0.p(nsdServiceInfo, "serviceInfo");
            C5475c30 c5475c30 = C5475c30.a;
            C5475c30.a(this.b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(@NotNull NsdServiceInfo nsdServiceInfo) {
            C6562gT0.p(nsdServiceInfo, "NsdServiceInfo");
            if (!C6562gT0.g(this.a, nsdServiceInfo.getServiceName())) {
                C5475c30 c5475c30 = C5475c30.a;
                C5475c30.a(this.b);
            }
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(@NotNull NsdServiceInfo nsdServiceInfo) {
            C6562gT0.p(nsdServiceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(@NotNull NsdServiceInfo nsdServiceInfo, int i) {
            C6562gT0.p(nsdServiceInfo, "serviceInfo");
        }
    }

    @InterfaceC9511sW0
    public static final void a(@Nullable String str) {
        if (SQ.e(C5475c30.class)) {
            return;
        }
        try {
            a.b(str);
        } catch (Throwable th) {
            SQ.c(th, C5475c30.class);
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Bitmap c(@Nullable String str) {
        int i2;
        if (SQ.e(C5475c30.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(EnumC9284rb0.class);
            enumMap.put((EnumMap) EnumC9284rb0.MARGIN, (EnumC9284rb0) 2);
            try {
                C2469An a2 = new C4039Ql1().a(str, EnumC3839Ok.QR_CODE, 200, 200, enumMap);
                int i3 = a2.i();
                int m = a2.m();
                int[] iArr = new int[i3 * m];
                if (i3 > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        int i6 = i4 * m;
                        if (m > 0) {
                            int i7 = 0;
                            while (true) {
                                int i8 = i7 + 1;
                                int i9 = i6 + i7;
                                if (a2.f(i7, i4)) {
                                    i2 = -16777216;
                                } else {
                                    i2 = -1;
                                }
                                iArr[i9] = i2;
                                if (i8 >= m) {
                                    break;
                                }
                                i7 = i8;
                            }
                        }
                        if (i5 >= i3) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                Bitmap createBitmap = Bitmap.createBitmap(m, i3, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.setPixels(iArr, 0, m, 0, 0, m, i3);
                    return createBitmap;
                } catch (PN2 unused) {
                    return createBitmap;
                }
            } catch (PN2 unused2) {
                return null;
            }
        } catch (Throwable th) {
            SQ.c(th, C5475c30.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String d() {
        if (SQ.e(C5475c30.class)) {
            return null;
        }
        try {
            return e(null);
        } catch (Throwable th) {
            SQ.c(th, C5475c30.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String e(@Nullable Map<String, String> map) {
        if (SQ.e(C5475c30.class)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable th) {
                SQ.c(th, C5475c30.class);
                return null;
            }
        }
        String str = Build.DEVICE;
        C6562gT0.o(str, "DEVICE");
        map.put("device", str);
        String str2 = Build.MODEL;
        C6562gT0.o(str2, C8947qD2.g);
        map.put("model", str2);
        String jSONObject = new JSONObject(map).toString();
        C6562gT0.o(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return jSONObject;
    }

    @InterfaceC9511sW0
    public static final boolean f() {
        if (SQ.e(C5475c30.class)) {
            return false;
        }
        try {
            com.facebook.internal.C c2 = com.facebook.internal.C.a;
            com.facebook.M m = com.facebook.M.a;
            C2379y f2 = com.facebook.internal.C.f(com.facebook.M.o());
            if (f2 != null) {
                if (f2.w().contains(com.facebook.internal.d0.Enabled)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            SQ.c(th, C5475c30.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final boolean g(@Nullable String str) {
        if (SQ.e(C5475c30.class)) {
            return false;
        }
        try {
            if (!f()) {
                return false;
            }
            return a.h(str);
        } catch (Throwable th) {
            SQ.c(th, C5475c30.class);
            return false;
        }
    }

    @TargetApi(16)
    public final void b(String str) {
        if (!SQ.e(this)) {
            try {
                NsdManager.RegistrationListener registrationListener = j.get(str);
                if (registrationListener != null) {
                    com.facebook.M m = com.facebook.M.a;
                    Object systemService = com.facebook.M.n().getSystemService("servicediscovery");
                    if (systemService != null) {
                        try {
                            ((NsdManager) systemService).unregisterService(registrationListener);
                        } catch (IllegalArgumentException e2) {
                            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                            com.facebook.internal.l0.l0(b, e2);
                        }
                        j.remove(str);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @TargetApi(16)
    public final boolean h(String str) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> hashMap = j;
            if (hashMap.containsKey(str)) {
                return true;
            }
            com.facebook.M m = com.facebook.M.a;
            String str2 = "fbsdk_" + C6562gT0.C("android-", C9545sf2.y2(com.facebook.M.I(), '.', '|', false, 4, null)) + '_' + ((Object) str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType(i);
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = com.facebook.M.n().getSystemService("servicediscovery");
            if (systemService != null) {
                a aVar = new a(str2, str);
                hashMap.put(str, aVar);
                ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }
}
