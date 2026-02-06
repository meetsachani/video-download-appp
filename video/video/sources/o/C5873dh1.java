package o;

import android.content.Context;
import o.C5630ch1;

/* renamed from: o.dh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5873dh1 extends C7340jh1 {
    public C5873dh1(Context context) {
        super(context);
        this.a = context;
    }

    @Override // o.C7340jh1, o.C5630ch1.a
    public boolean a(C5630ch1.c cVar) {
        if (!d(cVar) && !super.a(cVar)) {
            return false;
        }
        return true;
    }

    public final boolean d(C5630ch1.c cVar) {
        if (getContext().checkPermission(C7340jh1.f, cVar.b(), cVar.a()) == 0) {
            return true;
        }
        return false;
    }
}
