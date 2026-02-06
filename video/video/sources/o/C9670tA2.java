package o;

import android.util.Log;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.tA2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9670tA2 {
    @NotNull
    public static final C9670tA2 a = new C9670tA2();
    public static final String b = C9670tA2.class.getCanonicalName();
    @NotNull
    public static final String c = "com.unity3d.player.UnityPlayer";
    @NotNull
    public static final String d = "UnitySendMessage";
    @NotNull
    public static final String e = "UnityFacebookSDKPlugin";
    @NotNull
    public static final String f = "CaptureViewHierarchy";
    @NotNull
    public static final String g = "OnReceiveMapping";
    public static Class<?> h;

    @InterfaceC9511sW0
    public static final void a() {
        d(e, f, "");
    }

    @InterfaceC9511sW0
    public static final void c(@Nullable String str) {
        d(e, g, str);
    }

    @InterfaceC9511sW0
    public static final void d(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        try {
            if (h == null) {
                h = a.b();
            }
            Class<?> cls = h;
            if (cls != null) {
                Method method = cls.getMethod(d, String.class, String.class, String.class);
                Class<?> cls2 = h;
                if (cls2 != null) {
                    method.invoke(cls2, str, str2, str3);
                    return;
                } else {
                    C6562gT0.S("unityPlayer");
                    throw null;
                }
            }
            C6562gT0.S("unityPlayer");
            throw null;
        } catch (Exception e2) {
            Log.e(b, "Failed to send message to Unity", e2);
        }
    }

    public final Class<?> b() {
        Class<?> cls = Class.forName(c);
        C6562gT0.o(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }
}
