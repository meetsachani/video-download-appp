package o;

import android.view.autofill.AutofillId;

/* renamed from: o.Kj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3444Kj {
    public final Object a;

    public C3444Kj(AutofillId autofillId) {
        this.a = autofillId;
    }

    public static C3444Kj b(AutofillId autofillId) {
        return new C3444Kj(autofillId);
    }

    public AutofillId a() {
        return C3346Jj.a(this.a);
    }
}
