package o;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import o.InterfaceC8136mt2;

/* renamed from: o.nI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8237nI2<R> implements InterfaceC8136mt2<R> {
    public final a a;

    /* renamed from: o.nI2$a */
    /* loaded from: classes.dex */
    public interface a {
        Animation a(Context context);
    }

    public C8237nI2(a aVar) {
        this.a = aVar;
    }

    @Override // o.InterfaceC8136mt2
    public boolean a(R r, InterfaceC8136mt2.a aVar) {
        View a2 = aVar.a();
        if (a2 != null) {
            a2.clearAnimation();
            a2.startAnimation(this.a.a(a2.getContext()));
            return false;
        }
        return false;
    }
}
