package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzb extends com.google.android.gms.internal.common.zzi {
    public final /* synthetic */ BaseGmsClient b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.b = baseGmsClient;
    }

    public static final void a(Message message) {
        zzc zzcVar = (zzc) message.obj;
        zzcVar.b();
        zzcVar.e();
    }

    public static final boolean b(Message message) {
        int i = message.what;
        if (i == 2 || i == 1 || i == 7) {
            return true;
        }
        return false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3;
        ConnectionResult connectionResult4;
        boolean z;
        if (this.b.x1.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i != 1 && i != 7 && ((i != 4 || this.b.A()) && message.what != 5)) || this.b.h()) {
            int i2 = message.what;
            PendingIntent pendingIntent = null;
            if (i2 == 4) {
                this.b.u1 = new ConnectionResult(message.arg2);
                if (BaseGmsClient.o0(this.b)) {
                    BaseGmsClient baseGmsClient = this.b;
                    z = baseGmsClient.v1;
                    if (!z) {
                        baseGmsClient.p0(3, null);
                        return;
                    }
                }
                BaseGmsClient baseGmsClient2 = this.b;
                connectionResult3 = baseGmsClient2.u1;
                if (connectionResult3 != null) {
                    connectionResult4 = baseGmsClient2.u1;
                } else {
                    connectionResult4 = new ConnectionResult(8);
                }
                this.b.k1.a(connectionResult4);
                this.b.T(connectionResult4);
                return;
            } else if (i2 == 5) {
                BaseGmsClient baseGmsClient3 = this.b;
                connectionResult = baseGmsClient3.u1;
                if (connectionResult != null) {
                    connectionResult2 = baseGmsClient3.u1;
                } else {
                    connectionResult2 = new ConnectionResult(8);
                }
                this.b.k1.a(connectionResult2);
                this.b.T(connectionResult2);
                return;
            } else if (i2 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, pendingIntent);
                this.b.k1.a(connectionResult5);
                this.b.T(connectionResult5);
                return;
            } else if (i2 == 6) {
                this.b.p0(5, null);
                BaseGmsClient baseGmsClient4 = this.b;
                baseConnectionCallbacks = baseGmsClient4.p1;
                if (baseConnectionCallbacks != null) {
                    baseConnectionCallbacks2 = baseGmsClient4.p1;
                    baseConnectionCallbacks2.g1(message.arg2);
                }
                this.b.U(message.arg2);
                BaseGmsClient.n0(this.b, 5, 1, null);
                return;
            } else if (i2 == 2 && !this.b.a()) {
                a(message);
                return;
            } else if (b(message)) {
                ((zzc) message.obj).c();
                return;
            } else {
                int i3 = message.what;
                Log.wtf("GmsClient", "Don't know how to handle message: " + i3, new Exception());
                return;
            }
        }
        a(message);
    }
}
