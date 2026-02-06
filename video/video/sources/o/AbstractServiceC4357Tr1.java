package o;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import o.InterfaceC6024eJ0;

/* renamed from: o.Tr1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC4357Tr1 extends Service {

    /* renamed from: o.Tr1$a */
    /* loaded from: classes.dex */
    public class a extends InterfaceC6024eJ0.b {
        public a() {
        }

        @Override // o.InterfaceC6024eJ0
        public void D7(String str, int i, String str2, Notification notification) throws RemoteException {
            AbstractServiceC4357Tr1.this.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                AbstractServiceC4357Tr1.this.d(str, i, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // o.InterfaceC6024eJ0
        public void m3(String str, int i, String str2) throws RemoteException {
            AbstractServiceC4357Tr1.this.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                AbstractServiceC4357Tr1.this.a(str, i, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // o.InterfaceC6024eJ0
        public void y5(String str) {
            AbstractServiceC4357Tr1.this.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                AbstractServiceC4357Tr1.this.b(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public abstract void a(String str, int i, String str2);

    public abstract void b(String str);

    public void c(int i, String str) {
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i + " is not authorized for package " + str);
    }

    public abstract void d(String str, int i, String str2, Notification notification);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getAction().equals(C4551Vr1.g);
        return null;
    }
}
