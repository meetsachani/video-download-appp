package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.List;
import o.C3679Mt;
import o.InterfaceC10687xL0;

/* renamed from: o.bK */
/* loaded from: classes.dex */
public class ServiceConnectionC5300bK implements ServiceConnection {
    public static final int b1 = 0;
    public static final int c1 = 1;
    public static final int d1 = 2;
    public static final int e1 = 3;
    public final Runnable X;
    public final a Y;
    public Pu2 Y0;
    public int Z;
    public List<C3679Mt.a<Pu2>> Z0;
    public Exception a1;

    /* renamed from: o.bK$a */
    /* loaded from: classes.dex */
    public static class a {
        public Pu2 a(ComponentName componentName, IBinder iBinder) {
            return new Pu2(InterfaceC10687xL0.b.O0(iBinder), componentName);
        }
    }

    public ServiceConnectionC5300bK(Runnable runnable) {
        this(runnable, new a());
    }

    public static /* synthetic */ Object a(ServiceConnectionC5300bK serviceConnectionC5300bK, C3679Mt.a aVar) {
        int i = serviceConnectionC5300bK.Z;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("Connection state is invalid");
                    }
                    throw serviceConnectionC5300bK.a1;
                }
                throw new IllegalStateException("Service has been disconnected.");
            }
            Pu2 pu2 = serviceConnectionC5300bK.Y0;
            if (pu2 != null) {
                aVar.c(pu2);
            } else {
                throw new IllegalStateException("ConnectionHolder state is incorrect.");
            }
        } else {
            serviceConnectionC5300bK.Z0.add(aVar);
        }
        return "ConnectionHolder, state = " + serviceConnectionC5300bK.Z;
    }

    public void b(Exception exc) {
        for (C3679Mt.a<Pu2> aVar : this.Z0) {
            aVar.f(exc);
        }
        this.Z0.clear();
        this.X.run();
        this.Z = 3;
        this.a1 = exc;
    }

    public InterfaceFutureC8411o11<Pu2> c() {
        return C3679Mt.a(new C3679Mt.c() { // from class: o.aK
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return ServiceConnectionC5300bK.a(ServiceConnectionC5300bK.this, aVar);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.Y0 = this.Y.a(componentName, iBinder);
        for (C3679Mt.a<Pu2> aVar : this.Z0) {
            aVar.c(this.Y0);
        }
        this.Z0.clear();
        this.Z = 1;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.Y0 = null;
        this.X.run();
        this.Z = 2;
    }

    public ServiceConnectionC5300bK(Runnable runnable, a aVar) {
        this.Z = 0;
        this.Z0 = new ArrayList();
        this.X = runnable;
        this.Y = aVar;
    }
}
