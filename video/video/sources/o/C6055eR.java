package o;

import android.content.Context;

/* renamed from: o.eR  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6055eR {
    public final Context a;
    public final ND b;
    public final ND c;

    @RP0
    public C6055eR(Context context, @InterfaceC10438wJ2 ND nd, @InterfaceC3058Gk1 ND nd2) {
        this.a = context;
        this.b = nd;
        this.c = nd2;
    }

    public AbstractC5813dR a(String str) {
        return AbstractC5813dR.b(this.a, this.b, this.c, str);
    }
}
