package o;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: o.qM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8980qM {
    public final Set<InterfaceC3783Nu1> a = new CopyOnWriteArraySet();
    public volatile Context b;

    public final void a(InterfaceC3783Nu1 interfaceC3783Nu1) {
        C6562gT0.p(interfaceC3783Nu1, ServiceSpecificExtraArgs.CastExtraArgs.a);
        Context context = this.b;
        if (context != null) {
            interfaceC3783Nu1.a(context);
        }
        this.a.add(interfaceC3783Nu1);
    }

    public final void b() {
        this.b = null;
    }

    public final void c(Context context) {
        C6562gT0.p(context, "context");
        this.b = context;
        for (InterfaceC3783Nu1 interfaceC3783Nu1 : this.a) {
            interfaceC3783Nu1.a(context);
        }
    }

    public final Context d() {
        return this.b;
    }

    public final void e(InterfaceC3783Nu1 interfaceC3783Nu1) {
        C6562gT0.p(interfaceC3783Nu1, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.a.remove(interfaceC3783Nu1);
    }
}
