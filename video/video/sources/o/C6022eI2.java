package o;

import android.view.View;
import o.InterfaceC8136mt2;

/* renamed from: o.eI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6022eI2<R> implements InterfaceC8136mt2<R> {
    public final a a;

    /* renamed from: o.eI2$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(View view);
    }

    public C6022eI2(a aVar) {
        this.a = aVar;
    }

    @Override // o.InterfaceC8136mt2
    public boolean a(R r, InterfaceC8136mt2.a aVar) {
        if (aVar.a() != null) {
            this.a.a(aVar.a());
            return false;
        }
        return false;
    }
}
