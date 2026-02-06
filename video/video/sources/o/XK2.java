package o;

import android.content.Context;
import android.net.wifi.WifiManager;

@Deprecated
/* loaded from: classes2.dex */
public final class XK2 {
    public static final String e = "WifiLockManager";
    public static final String f = "ExoPlayer:WifiLockManager";
    @InterfaceC11300zs1
    public final WifiManager a;
    @InterfaceC11300zs1
    public WifiManager.WifiLock b;
    public boolean c;
    public boolean d;

    public XK2(Context context) {
        this.a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public void a(boolean z) {
        if (z && this.b == null) {
            WifiManager wifiManager = this.a;
            if (wifiManager == null) {
                I31.n(e, "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, f);
            this.b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.c = z;
        c();
    }

    public void b(boolean z) {
        this.d = z;
        c();
    }

    public final void c() {
        WifiManager.WifiLock wifiLock = this.b;
        if (wifiLock == null) {
            return;
        }
        if (this.c && this.d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
