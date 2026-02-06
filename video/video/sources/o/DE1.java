package o;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class DE1 {
    public final ArrayList<CE1> a = new ArrayList<>();

    public final void a(CE1 ce1) {
        C6562gT0.p(ce1, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.a.add(ce1);
    }

    public final void b() {
        for (int J = C8222nF.J(this.a); -1 < J; J--) {
            this.a.get(J).a();
        }
    }

    public final void c(CE1 ce1) {
        C6562gT0.p(ce1, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.a.remove(ce1);
    }
}
