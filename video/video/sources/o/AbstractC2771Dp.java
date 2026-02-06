package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: o.Dp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2771Dp<T> extends TK<T> {
    public static final String h = AbstractC6949i41.f("BrdcstRcvrCnstrntTrckr");
    public final BroadcastReceiver g;

    /* renamed from: o.Dp$a */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                AbstractC2771Dp.this.h(context, intent);
            }
        }
    }

    public AbstractC2771Dp(Context context, InterfaceC3748Nl2 taskExecutor) {
        super(context, taskExecutor);
        this.g = new a();
    }

    @Override // o.TK
    public void e() {
        AbstractC6949i41.c().a(h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.b.registerReceiver(this.g, g());
    }

    @Override // o.TK
    public void f() {
        AbstractC6949i41.c().a(h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.b.unregisterReceiver(this.g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
