package o;

import android.content.Context;
import android.util.Log;
import o.InterfaceC6027eK;

/* renamed from: o.rY  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9273rY implements InterfaceC6270fK {
    public static final String a = "ConnectivityMonitor";
    public static final String b = "android.permission.ACCESS_NETWORK_STATE";

    @Override // o.InterfaceC6270fK
    public InterfaceC6027eK a(Context context, InterfaceC6027eK.a aVar) {
        boolean z;
        String str;
        if (C10201vM.a(context, b) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z) {
            return new C9024qY(context, aVar);
        }
        return new C5916ds1();
    }
}
