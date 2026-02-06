package o;

import android.content.Context;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: o.vJ2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10192vJ2 {
    public static final String a = AbstractC6949i41.f("WakeLocks");
    public static final WeakHashMap<PowerManager.WakeLock, String> b = new WeakHashMap<>();

    public static void a() {
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC6949i41.c().h(a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    public static PowerManager.WakeLock b(Context context, String tag) {
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, str);
        }
        return newWakeLock;
    }
}
