package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import o.YI0;

/* renamed from: o.yT  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC10961yT implements ServiceConnection {
    public Context X;

    /* renamed from: o.yT$a */
    /* loaded from: classes.dex */
    public class a extends C9743tT {
        public a(YI0 yi0, ComponentName componentName, Context context) {
            super(yi0, componentName, context);
        }
    }

    public Context a() {
        return this.X;
    }

    public abstract void b(ComponentName componentName, C9743tT c9743tT);

    public void c(Context context) {
        this.X = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.X != null) {
            b(componentName, new a(YI0.b.O0(iBinder), componentName, this.X));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
