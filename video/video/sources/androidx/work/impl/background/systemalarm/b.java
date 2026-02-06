package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.d;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC6949i41;
import o.C8501oN2;
import o.NM2;

/* loaded from: classes.dex */
public class b {
    public static final String e = AbstractC6949i41.f("ConstraintsCmdHandler");
    public final Context a;
    public final int b;
    public final d c;
    public final NM2 d;

    public b(Context context, int startId, d dispatcher) {
        this.a = context;
        this.b = startId;
        this.c = dispatcher;
        this.d = new NM2(context, dispatcher.f(), null);
    }

    public void a() {
        List<C8501oN2> e2 = this.c.g().M().L().e();
        ConstraintProxy.a(this.a, e2);
        this.d.d(e2);
        ArrayList<C8501oN2> arrayList = new ArrayList(e2.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (C8501oN2 c8501oN2 : e2) {
            String str = c8501oN2.a;
            if (currentTimeMillis >= c8501oN2.a() && (!c8501oN2.b() || this.d.c(str))) {
                arrayList.add(c8501oN2);
            }
        }
        for (C8501oN2 c8501oN22 : arrayList) {
            String str2 = c8501oN22.a;
            Intent b = a.b(this.a, str2);
            AbstractC6949i41.c().a(e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            d dVar = this.c;
            dVar.k(new d.b(dVar, b, this.b));
        }
        this.d.e();
    }
}
