package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import o.InterfaceC5297bJ0;

/* renamed from: o.Uc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4393Uc0 implements InterfaceC4296Tc0 {
    public static final String b = "EngagementSigsCallbkRmt";
    public final InterfaceC5297bJ0 a;

    public C4393Uc0(InterfaceC5297bJ0 interfaceC5297bJ0) {
        this.a = interfaceC5297bJ0;
    }

    public static C4393Uc0 a(IBinder iBinder) {
        return new C4393Uc0(InterfaceC5297bJ0.b.O0(iBinder));
    }

    @Override // o.InterfaceC4296Tc0
    public void W0(boolean z, Bundle bundle) {
        try {
            this.a.W0(z, bundle);
        } catch (RemoteException unused) {
            Log.e(b, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // o.InterfaceC4296Tc0
    public void a1(boolean z, Bundle bundle) {
        try {
            this.a.a1(z, bundle);
        } catch (RemoteException unused) {
            Log.e(b, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // o.InterfaceC4296Tc0
    public void j1(int i, Bundle bundle) {
        try {
            this.a.j1(i, bundle);
        } catch (RemoteException unused) {
            Log.e(b, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }
}
