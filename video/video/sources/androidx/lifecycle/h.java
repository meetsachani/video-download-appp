package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C3702Na0;
import o.C6562gT0;
import o.InterfaceC9511sW0;

/* loaded from: classes.dex */
public final class h {
    public static final h a = new h();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static final class a extends C3702Na0 {
        @Override // o.C3702Na0, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            o.Y.d(activity);
        }
    }

    @InterfaceC9511sW0
    public static final void a(Context context) {
        C6562gT0.p(context, "context");
        if (b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        C6562gT0.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
